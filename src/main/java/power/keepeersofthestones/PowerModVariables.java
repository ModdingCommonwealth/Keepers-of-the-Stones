package power.keepeersofthestones;

import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.network.NetworkEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.storage.WorldSavedData;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IServerWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Direction;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.INBT;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.function.Supplier;

public class PowerModVariables {
	public PowerModVariables(PowerModElements elements) {
		elements.addNetworkMessage(WorldSavedDataSyncMessage.class, WorldSavedDataSyncMessage::buffer, WorldSavedDataSyncMessage::new,
				WorldSavedDataSyncMessage::handler);
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
	}

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData mapdata = MapVariables.get(event.getPlayer().world);
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (mapdata != null)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(0, mapdata));
			if (worlddata != null)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote()) {
			WorldSavedData worlddata = WorldVariables.get(event.getPlayer().world);
			if (worlddata != null)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) event.getPlayer()),
						new WorldSavedDataSyncMessage(1, worlddata));
		}
	}

	public static class WorldVariables extends WorldSavedData {
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

		public WorldVariables() {
			super(DATA_NAME);
		}

		public WorldVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
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
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
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
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				PowerMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(((World) world)::getDimensionKey),
						new WorldSavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(IWorld world) {
			if (world instanceof ServerWorld) {
				return ((ServerWorld) world).getSavedData().getOrCreate(WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends WorldSavedData {
		public static final String DATA_NAME = "power_mapvars";
		public boolean metal_stone = false;

		public MapVariables() {
			super(DATA_NAME);
		}

		public MapVariables(String s) {
			super(s);
		}

		@Override
		public void read(CompoundNBT nbt) {
			metal_stone = nbt.getBoolean("metal_stone");
		}

		@Override
		public CompoundNBT write(CompoundNBT nbt) {
			nbt.putBoolean("metal_stone", metal_stone);
			return nbt;
		}

		public void syncData(IWorld world) {
			this.markDirty();
			if (world instanceof World && !world.isRemote())
				PowerMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new WorldSavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(IWorld world) {
			if (world instanceof IServerWorld) {
				return ((IServerWorld) world).getWorld().getServer().getWorld(World.OVERWORLD).getSavedData().getOrCreate(MapVariables::new,
						DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class WorldSavedDataSyncMessage {
		public int type;
		public WorldSavedData data;

		public WorldSavedDataSyncMessage(PacketBuffer buffer) {
			this.type = buffer.readInt();
			this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
			this.data.read(buffer.readCompoundTag());
		}

		public WorldSavedDataSyncMessage(int type, WorldSavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(WorldSavedDataSyncMessage message, PacketBuffer buffer) {
			buffer.writeInt(message.type);
			buffer.writeCompoundTag(message.data.write(new CompoundNBT()));
		}

		public static void handler(WorldSavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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

	@CapabilityInject(PlayerVariables.class)
	public static Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = null;

	@SubscribeEvent
	public void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
		if (event.getObject() instanceof PlayerEntity && !(event.getObject() instanceof FakePlayer))
			event.addCapability(new ResourceLocation("power", "player_variables"), new PlayerVariablesProvider());
	}

	private static class PlayerVariablesProvider implements ICapabilitySerializable<INBT> {
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(PLAYER_VARIABLES_CAPABILITY::getDefaultInstance);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public INBT serializeNBT() {
			return PLAYER_VARIABLES_CAPABILITY.getStorage().writeNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new),
					null);
		}

		@Override
		public void deserializeNBT(INBT nbt) {
			PLAYER_VARIABLES_CAPABILITY.getStorage().readNBT(PLAYER_VARIABLES_CAPABILITY, this.instance.orElseThrow(RuntimeException::new), null,
					nbt);
		}
	}

	private static class PlayerVariablesStorage implements Capability.IStorage<PlayerVariables> {
		@Override
		public INBT writeNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side) {
			CompoundNBT nbt = new CompoundNBT();
			nbt.putBoolean("fire", instance.fire);
			nbt.putBoolean("air", instance.air);
			nbt.putBoolean("water", instance.water);
			nbt.putBoolean("earth", instance.earth);
			nbt.putBoolean("energy", instance.energy);
			nbt.putBoolean("ice", instance.ice);
			nbt.putBoolean("lightning", instance.lightning);
			nbt.putBoolean("sound", instance.sound);
			nbt.putBoolean("crystal", instance.crystal);
			nbt.putBoolean("lava", instance.lava);
			nbt.putBoolean("rain", instance.rain);
			nbt.putBoolean("tornado", instance.tornado);
			nbt.putBoolean("ocean", instance.ocean);
			nbt.putBoolean("active", instance.active);
			nbt.putBoolean("greenery", instance.greenery);
			nbt.putBoolean("animals", instance.animals);
			nbt.putBoolean("metal", instance.metal);
			nbt.putBoolean("light", instance.light);
			nbt.putBoolean("shadow", instance.shadow);
			nbt.putBoolean("vacuum", instance.vacuum);
			nbt.putBoolean("moon", instance.moon);
			nbt.putBoolean("sun", instance.sun);
			nbt.putBoolean("creation", instance.creation);
			nbt.putBoolean("destruction", instance.destruction);
			nbt.putBoolean("inferno_merger", instance.inferno_merger);
			nbt.putBoolean("geyser_merger", instance.geyser_merger);
			nbt.putBoolean("coal_merger", instance.coal_merger);
			nbt.putBoolean("cloud_merger", instance.cloud_merger);
			nbt.putBoolean("mountain_merger", instance.mountain_merger);
			nbt.putBoolean("marsh_merger", instance.marsh_merger);
			nbt.putBoolean("cosmos", instance.cosmos);
			nbt.putBoolean("selected", instance.selected);
			return nbt;
		}

		@Override
		public void readNBT(Capability<PlayerVariables> capability, PlayerVariables instance, Direction side, INBT inbt) {
			CompoundNBT nbt = (CompoundNBT) inbt;
			instance.fire = nbt.getBoolean("fire");
			instance.air = nbt.getBoolean("air");
			instance.water = nbt.getBoolean("water");
			instance.earth = nbt.getBoolean("earth");
			instance.energy = nbt.getBoolean("energy");
			instance.ice = nbt.getBoolean("ice");
			instance.lightning = nbt.getBoolean("lightning");
			instance.sound = nbt.getBoolean("sound");
			instance.crystal = nbt.getBoolean("crystal");
			instance.lava = nbt.getBoolean("lava");
			instance.rain = nbt.getBoolean("rain");
			instance.tornado = nbt.getBoolean("tornado");
			instance.ocean = nbt.getBoolean("ocean");
			instance.active = nbt.getBoolean("active");
			instance.greenery = nbt.getBoolean("greenery");
			instance.animals = nbt.getBoolean("animals");
			instance.metal = nbt.getBoolean("metal");
			instance.light = nbt.getBoolean("light");
			instance.shadow = nbt.getBoolean("shadow");
			instance.vacuum = nbt.getBoolean("vacuum");
			instance.moon = nbt.getBoolean("moon");
			instance.sun = nbt.getBoolean("sun");
			instance.creation = nbt.getBoolean("creation");
			instance.destruction = nbt.getBoolean("destruction");
			instance.inferno_merger = nbt.getBoolean("inferno_merger");
			instance.geyser_merger = nbt.getBoolean("geyser_merger");
			instance.coal_merger = nbt.getBoolean("coal_merger");
			instance.cloud_merger = nbt.getBoolean("cloud_merger");
			instance.mountain_merger = nbt.getBoolean("mountain_merger");
			instance.marsh_merger = nbt.getBoolean("marsh_merger");
			instance.cosmos = nbt.getBoolean("cosmos");
			instance.selected = nbt.getBoolean("selected");
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
		public boolean inferno_merger = false;
		public boolean geyser_merger = false;
		public boolean coal_merger = false;
		public boolean cloud_merger = false;
		public boolean mountain_merger = false;
		public boolean marsh_merger = false;
		public boolean cosmos = false;
		public boolean selected = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayerEntity)
				PowerMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) entity), new PlayerVariablesSyncMessage(this));
		}
	}

	@SubscribeEvent
	public void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
		if (!event.getPlayer().world.isRemote())
			((PlayerVariables) event.getPlayer().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()))
					.syncPlayerVariables(event.getPlayer());
	}

	@SubscribeEvent
	public void clonePlayer(PlayerEvent.Clone event) {
		PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PlayerVariables()));
		PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
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
		clone.inferno_merger = original.inferno_merger;
		clone.geyser_merger = original.geyser_merger;
		clone.coal_merger = original.coal_merger;
		clone.cloud_merger = original.cloud_merger;
		clone.mountain_merger = original.mountain_merger;
		clone.marsh_merger = original.marsh_merger;
		clone.cosmos = original.cosmos;
		clone.selected = original.selected;
		if (!event.isWasDeath()) {
			clone.active = original.active;
		}
	}

	public static class PlayerVariablesSyncMessage {
		public PlayerVariables data;

		public PlayerVariablesSyncMessage(PacketBuffer buffer) {
			this.data = new PlayerVariables();
			new PlayerVariablesStorage().readNBT(null, this.data, null, buffer.readCompoundTag());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, PacketBuffer buffer) {
			buffer.writeCompoundTag((CompoundNBT) new PlayerVariablesStorage().writeNBT(null, message.data, null));
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
					variables.inferno_merger = message.data.inferno_merger;
					variables.geyser_merger = message.data.geyser_merger;
					variables.coal_merger = message.data.coal_merger;
					variables.cloud_merger = message.data.cloud_merger;
					variables.mountain_merger = message.data.mountain_merger;
					variables.marsh_merger = message.data.marsh_merger;
					variables.cosmos = message.data.cosmos;
					variables.selected = message.data.selected;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
