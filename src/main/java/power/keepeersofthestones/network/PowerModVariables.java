package power.keepeersofthestones.network;

import power.keepeersofthestones.PowerMod;

import net.minecraftforge.fmllegacy.network.PacketDistributor;
import net.minecraftforge.fmllegacy.network.NetworkEvent;
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

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
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
			clone.inferno_merger = original.inferno_merger;
			clone.geyser_merger = original.geyser_merger;
			clone.coal_merger = original.coal_merger;
			clone.cloud_merger = original.cloud_merger;
			clone.mountain_merger = original.mountain_merger;
			clone.marsh_merger = original.marsh_merger;
			clone.empty = original.empty;
			clone.cosmos = original.cosmos;
			if (!event.isWasDeath()) {
				clone.active = original.active;
			}
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
		public boolean inferno_merger = false;
		public boolean geyser_merger = false;
		public boolean coal_merger = false;
		public boolean cloud_merger = false;
		public boolean mountain_merger = false;
		public boolean marsh_merger = false;
		public boolean empty = false;
		public boolean cosmos = false;

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
			nbt.putBoolean("inferno_merger", inferno_merger);
			nbt.putBoolean("geyser_merger", geyser_merger);
			nbt.putBoolean("coal_merger", coal_merger);
			nbt.putBoolean("cloud_merger", cloud_merger);
			nbt.putBoolean("mountain_merger", mountain_merger);
			nbt.putBoolean("marsh_merger", marsh_merger);
			nbt.putBoolean("empty", empty);
			nbt.putBoolean("cosmos", cosmos);
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
			inferno_merger = nbt.getBoolean("inferno_merger");
			geyser_merger = nbt.getBoolean("geyser_merger");
			coal_merger = nbt.getBoolean("coal_merger");
			cloud_merger = nbt.getBoolean("cloud_merger");
			mountain_merger = nbt.getBoolean("mountain_merger");
			marsh_merger = nbt.getBoolean("marsh_merger");
			empty = nbt.getBoolean("empty");
			cosmos = nbt.getBoolean("cosmos");
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
					variables.inferno_merger = message.data.inferno_merger;
					variables.geyser_merger = message.data.geyser_merger;
					variables.coal_merger = message.data.coal_merger;
					variables.cloud_merger = message.data.cloud_merger;
					variables.mountain_merger = message.data.mountain_merger;
					variables.marsh_merger = message.data.marsh_merger;
					variables.empty = message.data.empty;
					variables.cosmos = message.data.cosmos;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
