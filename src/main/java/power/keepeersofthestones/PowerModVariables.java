package power.keepeersofthestones;

import power.keepeersofthestones.network.PowerModVariables;

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
		elements.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new,
				PlayerVariablesSyncMessage::handler);
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::init);
	}

	private void init(FMLCommonSetupEvent event) {
		CapabilityManager.INSTANCE.register(PlayerVariables.class, new PlayerVariablesStorage(), PlayerVariables::new);
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
			nbt.putBoolean("empty", instance.empty);
			nbt.putBoolean("cosmos", instance.cosmos);
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
			instance.empty = nbt.getBoolean("empty");
			instance.cosmos = nbt.getBoolean("cosmos");
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
		clone.empty = original.empty;
		clone.cosmos = original.cosmos;
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
					variables.empty = message.data.empty;
					variables.cosmos = message.data.cosmos;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
