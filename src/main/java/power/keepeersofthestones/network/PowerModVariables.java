package power.keepeersofthestones.network;

import power.keepeersofthestones.PowerMod;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new,
				SavedDataSyncMessage::handler);
		PowerMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide())
				((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
						.syncPlayerVariables(event.getPlayer());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PlayerVariables()));
			clone.fire = original.fire;
			clone.air = original.air;
			clone.water = original.water;
			clone.earth = original.earth;
			clone.energy = original.energy;
			clone.ice = original.ice;
			clone.lightning = original.lightning;
			clone.sound = original.sound;
			clone.crystal = original.crystal;
			clone.lava = original.lava;
			clone.rain = original.rain;
			clone.tornado = original.tornado;
			clone.ocean = original.ocean;
			clone.greenery = original.greenery;
			clone.animals = original.animals;
			clone.metal = original.metal;
			clone.light = original.light;
			clone.shadow = original.shadow;
			clone.vacuum = original.vacuum;
			clone.moon = original.moon;
			clone.sun = original.sun;
			clone.creation = original.creation;
			clone.destruction = original.destruction;
			clone.space = original.space;
			clone.selected = original.selected;
			clone.blood = original.blood;
			clone.technology = original.technology;
			clone.time = original.time;
			clone.spawnx = original.spawnx;
			clone.spawny = original.spawny;
			clone.spawnz = original.spawnz;
			clone.battery = original.battery;
			clone.teleportation = original.teleportation;
			clone.explosion = original.explosion;
			clone.amber = original.amber;
			clone.tpX = original.tpX;
			clone.tpZ = original.tpZ;
			clone.tpY = original.tpY;
			clone.blue_flame = original.blue_flame;
			if (!event.isWasDeath()) {
				clone.active = original.active;
				clone.recharge_spell_sun = original.recharge_spell_sun;
				clone.recharge_spell_moon = original.recharge_spell_moon;
				clone.recharge_spell_blood = original.recharge_spell_blood;
				clone.recharge_spell_energy = original.recharge_spell_energy;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getPlayer().level);
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (mapdata != null)
					PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getPlayer().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getPlayer().level);
				if (worlddata != null)
					PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getPlayer()),
							new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "power_worldvars";
		public boolean fire_stone = false;
		public boolean air_stone = false;
		public boolean water_stone = false;
		public boolean earth_stone = false;
		public boolean energy_stone = false;
		public boolean ice_stone = false;
		public boolean lightning_stone = false;
		public boolean sound_stone = false;
		public boolean crystal_stone = false;
		public boolean lava_stone = false;
		public boolean rain_stone = false;
		public boolean tornado_stone = false;
		public boolean ocean_stone = false;
		public boolean greenery_stone = false;
		public boolean animals_stone = false;
		public boolean metal_stone = false;
		public boolean light_stone = false;
		public boolean shadow_stone = false;
		public boolean vacuum_stone = false;
		public boolean sun_stone = false;
		public boolean moon_stone = false;
		public boolean creation_stone = false;
		public boolean destruction_stone = false;
		public boolean space_stone = false;
		public boolean blood_stone = false;
		public boolean time_stone = false;

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			fire_stone = nbt.getBoolean("fire_stone");
			air_stone = nbt.getBoolean("air_stone");
			water_stone = nbt.getBoolean("water_stone");
			earth_stone = nbt.getBoolean("earth_stone");
			energy_stone = nbt.getBoolean("energy_stone");
			ice_stone = nbt.getBoolean("ice_stone");
			lightning_stone = nbt.getBoolean("lightning_stone");
			sound_stone = nbt.getBoolean("sound_stone");
			crystal_stone = nbt.getBoolean("crystal_stone");
			lava_stone = nbt.getBoolean("lava_stone");
			rain_stone = nbt.getBoolean("rain_stone");
			tornado_stone = nbt.getBoolean("tornado_stone");
			ocean_stone = nbt.getBoolean("ocean_stone");
			greenery_stone = nbt.getBoolean("greenery_stone");
			animals_stone = nbt.getBoolean("animals_stone");
			metal_stone = nbt.getBoolean("metal_stone");
			light_stone = nbt.getBoolean("light_stone");
			shadow_stone = nbt.getBoolean("shadow_stone");
			vacuum_stone = nbt.getBoolean("vacuum_stone");
			sun_stone = nbt.getBoolean("sun_stone");
			moon_stone = nbt.getBoolean("moon_stone");
			creation_stone = nbt.getBoolean("creation_stone");
			destruction_stone = nbt.getBoolean("destruction_stone");
			space_stone = nbt.getBoolean("space_stone");
			blood_stone = nbt.getBoolean("blood_stone");
			time_stone = nbt.getBoolean("time_stone");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("fire_stone", fire_stone);
			nbt.putBoolean("air_stone", air_stone);
			nbt.putBoolean("water_stone", water_stone);
			nbt.putBoolean("earth_stone", earth_stone);
			nbt.putBoolean("energy_stone", energy_stone);
			nbt.putBoolean("ice_stone", ice_stone);
			nbt.putBoolean("lightning_stone", lightning_stone);
			nbt.putBoolean("sound_stone", sound_stone);
			nbt.putBoolean("crystal_stone", crystal_stone);
			nbt.putBoolean("lava_stone", lava_stone);
			nbt.putBoolean("rain_stone", rain_stone);
			nbt.putBoolean("tornado_stone", tornado_stone);
			nbt.putBoolean("ocean_stone", ocean_stone);
			nbt.putBoolean("greenery_stone", greenery_stone);
			nbt.putBoolean("animals_stone", animals_stone);
			nbt.putBoolean("metal_stone", metal_stone);
			nbt.putBoolean("light_stone", light_stone);
			nbt.putBoolean("shadow_stone", shadow_stone);
			nbt.putBoolean("vacuum_stone", vacuum_stone);
			nbt.putBoolean("sun_stone", sun_stone);
			nbt.putBoolean("moon_stone", moon_stone);
			nbt.putBoolean("creation_stone", creation_stone);
			nbt.putBoolean("destruction_stone", destruction_stone);
			nbt.putBoolean("space_stone", space_stone);
			nbt.putBoolean("blood_stone", blood_stone);
			nbt.putBoolean("time_stone", time_stone);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				PowerMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "power_mapvars";
		public boolean technology_stone = false;
		public boolean teleportation_stone = false;
		public boolean blue_portal = false;
		public boolean orange_portal = false;
		public double bposx = 0;
		public double bposy = 0;
		public double bposz = 0;
		public double oposx = 0;
		public double oposy = 0;
		public double oposz = 0;
		public boolean explosion_stone = false;
		public boolean amber_stone = false;
		public boolean blue_flame_stone = false;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			technology_stone = nbt.getBoolean("technology_stone");
			teleportation_stone = nbt.getBoolean("teleportation_stone");
			blue_portal = nbt.getBoolean("blue_portal");
			orange_portal = nbt.getBoolean("orange_portal");
			bposx = nbt.getDouble("bposx");
			bposy = nbt.getDouble("bposy");
			bposz = nbt.getDouble("bposz");
			oposx = nbt.getDouble("oposx");
			oposy = nbt.getDouble("oposy");
			oposz = nbt.getDouble("oposz");
			explosion_stone = nbt.getBoolean("explosion_stone");
			amber_stone = nbt.getBoolean("amber_stone");
			blue_flame_stone = nbt.getBoolean("blue_flame_stone");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putBoolean("technology_stone", technology_stone);
			nbt.putBoolean("teleportation_stone", teleportation_stone);
			nbt.putBoolean("blue_portal", blue_portal);
			nbt.putBoolean("orange_portal", orange_portal);
			nbt.putDouble("bposx", bposx);
			nbt.putDouble("bposy", bposy);
			nbt.putDouble("bposz", bposz);
			nbt.putDouble("oposx", oposx);
			nbt.putDouble("oposy", oposy);
			nbt.putDouble("oposz", oposz);
			nbt.putBoolean("explosion_stone", explosion_stone);
			nbt.putBoolean("amber_stone", amber_stone);
			nbt.putBoolean("blue_flame_stone", blue_flame_stone);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				PowerMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e),
						MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		public int type;
		public SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			if (this.data instanceof MapVariables _mapvars)
				_mapvars.read(buffer.readNbt());
			else if (this.data instanceof WorldVariables _worldvars)
				_worldvars.read(buffer.readNbt());
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("power", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean fire = false;
		public boolean air = false;
		public boolean water = false;
		public boolean earth = false;
		public boolean energy = false;
		public boolean ice = false;
		public boolean lightning = false;
		public boolean sound = false;
		public boolean crystal = false;
		public boolean lava = false;
		public boolean rain = false;
		public boolean tornado = false;
		public boolean ocean = false;
		public boolean active = false;
		public boolean greenery = false;
		public boolean animals = false;
		public boolean metal = false;
		public boolean light = false;
		public boolean shadow = false;
		public boolean vacuum = false;
		public boolean moon = false;
		public boolean sun = false;
		public boolean creation = false;
		public boolean destruction = false;
		public boolean space = false;
		public boolean selected = false;
		public boolean blood = false;
		public boolean technology = false;
		public boolean time = false;
		public double spawnx = 0.0;
		public double spawny = 75.0;
		public double spawnz = 0.0;
		public boolean battery = false;
		public boolean recharge_spell_sun = false;
		public boolean recharge_spell_moon = false;
		public boolean recharge_spell_blood = false;
		public boolean recharge_spell_energy = false;
		public boolean teleportation = false;
		public boolean explosion = false;
		public boolean amber = false;
		public double tpX = 0;
		public double tpZ = 0;
		public double tpY = 0;
		public boolean blue_flame = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("fire", fire);
			nbt.putBoolean("air", air);
			nbt.putBoolean("water", water);
			nbt.putBoolean("earth", earth);
			nbt.putBoolean("energy", energy);
			nbt.putBoolean("ice", ice);
			nbt.putBoolean("lightning", lightning);
			nbt.putBoolean("sound", sound);
			nbt.putBoolean("crystal", crystal);
			nbt.putBoolean("lava", lava);
			nbt.putBoolean("rain", rain);
			nbt.putBoolean("tornado", tornado);
			nbt.putBoolean("ocean", ocean);
			nbt.putBoolean("active", active);
			nbt.putBoolean("greenery", greenery);
			nbt.putBoolean("animals", animals);
			nbt.putBoolean("metal", metal);
			nbt.putBoolean("light", light);
			nbt.putBoolean("shadow", shadow);
			nbt.putBoolean("vacuum", vacuum);
			nbt.putBoolean("moon", moon);
			nbt.putBoolean("sun", sun);
			nbt.putBoolean("creation", creation);
			nbt.putBoolean("destruction", destruction);
			nbt.putBoolean("space", space);
			nbt.putBoolean("selected", selected);
			nbt.putBoolean("blood", blood);
			nbt.putBoolean("technology", technology);
			nbt.putBoolean("time", time);
			nbt.putDouble("spawnx", spawnx);
			nbt.putDouble("spawny", spawny);
			nbt.putDouble("spawnz", spawnz);
			nbt.putBoolean("battery", battery);
			nbt.putBoolean("recharge_spell_sun", recharge_spell_sun);
			nbt.putBoolean("recharge_spell_moon", recharge_spell_moon);
			nbt.putBoolean("recharge_spell_blood", recharge_spell_blood);
			nbt.putBoolean("recharge_spell_energy", recharge_spell_energy);
			nbt.putBoolean("teleportation", teleportation);
			nbt.putBoolean("explosion", explosion);
			nbt.putBoolean("amber", amber);
			nbt.putDouble("tpX", tpX);
			nbt.putDouble("tpZ", tpZ);
			nbt.putDouble("tpY", tpY);
			nbt.putBoolean("blue_flame", blue_flame);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			fire = nbt.getBoolean("fire");
			air = nbt.getBoolean("air");
			water = nbt.getBoolean("water");
			earth = nbt.getBoolean("earth");
			energy = nbt.getBoolean("energy");
			ice = nbt.getBoolean("ice");
			lightning = nbt.getBoolean("lightning");
			sound = nbt.getBoolean("sound");
			crystal = nbt.getBoolean("crystal");
			lava = nbt.getBoolean("lava");
			rain = nbt.getBoolean("rain");
			tornado = nbt.getBoolean("tornado");
			ocean = nbt.getBoolean("ocean");
			active = nbt.getBoolean("active");
			greenery = nbt.getBoolean("greenery");
			animals = nbt.getBoolean("animals");
			metal = nbt.getBoolean("metal");
			light = nbt.getBoolean("light");
			shadow = nbt.getBoolean("shadow");
			vacuum = nbt.getBoolean("vacuum");
			moon = nbt.getBoolean("moon");
			sun = nbt.getBoolean("sun");
			creation = nbt.getBoolean("creation");
			destruction = nbt.getBoolean("destruction");
			space = nbt.getBoolean("space");
			selected = nbt.getBoolean("selected");
			blood = nbt.getBoolean("blood");
			technology = nbt.getBoolean("technology");
			time = nbt.getBoolean("time");
			spawnx = nbt.getDouble("spawnx");
			spawny = nbt.getDouble("spawny");
			spawnz = nbt.getDouble("spawnz");
			battery = nbt.getBoolean("battery");
			recharge_spell_sun = nbt.getBoolean("recharge_spell_sun");
			recharge_spell_moon = nbt.getBoolean("recharge_spell_moon");
			recharge_spell_blood = nbt.getBoolean("recharge_spell_blood");
			recharge_spell_energy = nbt.getBoolean("recharge_spell_energy");
			teleportation = nbt.getBoolean("teleportation");
			explosion = nbt.getBoolean("explosion");
			amber = nbt.getBoolean("amber");
			tpX = nbt.getDouble("tpX");
			tpZ = nbt.getDouble("tpZ");
			tpY = nbt.getDouble("tpY");
			blue_flame = nbt.getBoolean("blue_flame");
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PlayerVariables()));
					variables.fire = message.data.fire;
					variables.air = message.data.air;
					variables.water = message.data.water;
					variables.earth = message.data.earth;
					variables.energy = message.data.energy;
					variables.ice = message.data.ice;
					variables.lightning = message.data.lightning;
					variables.sound = message.data.sound;
					variables.crystal = message.data.crystal;
					variables.lava = message.data.lava;
					variables.rain = message.data.rain;
					variables.tornado = message.data.tornado;
					variables.ocean = message.data.ocean;
					variables.active = message.data.active;
					variables.greenery = message.data.greenery;
					variables.animals = message.data.animals;
					variables.metal = message.data.metal;
					variables.light = message.data.light;
					variables.shadow = message.data.shadow;
					variables.vacuum = message.data.vacuum;
					variables.moon = message.data.moon;
					variables.sun = message.data.sun;
					variables.creation = message.data.creation;
					variables.destruction = message.data.destruction;
					variables.space = message.data.space;
					variables.selected = message.data.selected;
					variables.blood = message.data.blood;
					variables.technology = message.data.technology;
					variables.time = message.data.time;
					variables.spawnx = message.data.spawnx;
					variables.spawny = message.data.spawny;
					variables.spawnz = message.data.spawnz;
					variables.battery = message.data.battery;
					variables.recharge_spell_sun = message.data.recharge_spell_sun;
					variables.recharge_spell_moon = message.data.recharge_spell_moon;
					variables.recharge_spell_blood = message.data.recharge_spell_blood;
					variables.recharge_spell_energy = message.data.recharge_spell_energy;
					variables.teleportation = message.data.teleportation;
					variables.explosion = message.data.explosion;
					variables.amber = message.data.amber;
					variables.tpX = message.data.tpX;
					variables.tpZ = message.data.tpZ;
					variables.tpY = message.data.tpY;
					variables.blue_flame = message.data.blue_flame;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
