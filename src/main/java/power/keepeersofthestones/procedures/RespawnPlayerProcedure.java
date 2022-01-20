package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.RechargeWaterStonePotionEffect;
import power.keepeersofthestones.potion.RechargeVacuumStonePotionEffect;
import power.keepeersofthestones.potion.RechargeTornadoStonePotionEffect;
import power.keepeersofthestones.potion.RechargeSunStonePotionEffect;
import power.keepeersofthestones.potion.RechargeSoundStonePotionEffect;
import power.keepeersofthestones.potion.RechargeShadowStonePotionEffect;
import power.keepeersofthestones.potion.RechargeRainStonePotionEffect;
import power.keepeersofthestones.potion.RechargeOceanStonePotionEffect;
import power.keepeersofthestones.potion.RechargeMoonStonePotionEffect;
import power.keepeersofthestones.potion.RechargeMetalStonePotionEffect;
import power.keepeersofthestones.potion.RechargeLightningStonePotionEffect;
import power.keepeersofthestones.potion.RechargeLightStonePotionEffect;
import power.keepeersofthestones.potion.RechargeLavaStonePotionEffect;
import power.keepeersofthestones.potion.RechargeIceStonePotionEffect;
import power.keepeersofthestones.potion.RechargeGreeneryStonePotionEffect;
import power.keepeersofthestones.potion.RechargeFireStonePotionEffect;
import power.keepeersofthestones.potion.RechargeEnergyStonePotionEffect;
import power.keepeersofthestones.potion.RechargeEarthStonePotionEffect;
import power.keepeersofthestones.potion.RechargeDestructionStonePotionEffect;
import power.keepeersofthestones.potion.RechargeCrystalStonePotionEffect;
import power.keepeersofthestones.potion.RechargeCreationStonePotionEffect;
import power.keepeersofthestones.potion.RechargeCosmosStonePotionEffect;
import power.keepeersofthestones.potion.RechargeAirStonePotionEffect;
import power.keepeersofthestones.potion.FireMasterPotionEffect;
import power.keepeersofthestones.item.WaterStoneItem;
import power.keepeersofthestones.item.VacuumStoneItem;
import power.keepeersofthestones.item.TornadoStoneItem;
import power.keepeersofthestones.item.SunStoneItem;
import power.keepeersofthestones.item.SoundStoneItem;
import power.keepeersofthestones.item.ShadowStoneItem;
import power.keepeersofthestones.item.RainStoneItem;
import power.keepeersofthestones.item.OceanStoneItem;
import power.keepeersofthestones.item.MoonStoneItem;
import power.keepeersofthestones.item.MetalStoneItem;
import power.keepeersofthestones.item.LightningStoneItem;
import power.keepeersofthestones.item.LightStoneItem;
import power.keepeersofthestones.item.LavaStoneItem;
import power.keepeersofthestones.item.IceStoneItem;
import power.keepeersofthestones.item.GreeneryStoneItem;
import power.keepeersofthestones.item.FireStoneItem;
import power.keepeersofthestones.item.EnergyStoneItem;
import power.keepeersofthestones.item.EarthStoneItem;
import power.keepeersofthestones.item.DestructionStoneItem;
import power.keepeersofthestones.item.CrystalStoneItem;
import power.keepeersofthestones.item.CreationStoneItem;
import power.keepeersofthestones.item.CosmosStoneItem;
import power.keepeersofthestones.item.AnimalsStoneItem;
import power.keepeersofthestones.item.AirStoneItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameRules;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

public class RespawnPlayerProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
			Entity entity = event.getPlayer();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", entity.getPosX());
			dependencies.put("y", entity.getPosY());
			dependencies.put("z", entity.getPosZ());
			dependencies.put("world", entity.world);
			dependencies.put("entity", entity);
			dependencies.put("endconquered", event.isEndConquered());
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure RespawnPlayer!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure RespawnPlayer!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (!world.getWorldInfo().getGameRulesInstance().getBoolean(GameRules.KEEP_INVENTORY)) {
			if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).fire) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.fire = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(FireStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeFireStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).air) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.air = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(AirStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeAirStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).water) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.water = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(WaterStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeWaterStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).earth) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.earth = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(EarthStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeEarthStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).energy) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.energy = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(EnergyStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeEnergyStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).ice) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ice = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(IceStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeIceStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).lightning) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lightning = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(LightningStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeLightningStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).sound) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.sound = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(SoundStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeSoundStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).crystal) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.crystal = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(CrystalStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeCrystalStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).lava) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.lava = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(LavaStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeLavaStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).rain) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.rain = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(RainStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeRainStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).tornado) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.tornado = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(TornadoStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeTornadoStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).ocean) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ocean = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(OceanStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeOceanStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).greenery) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.greenery = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(GreeneryStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeGreeneryStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).animals) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.animals = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(AnimalsStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity).addPotionEffect(new EffectInstance(FireMasterPotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).metal) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.metal = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(MetalStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeMetalStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).light) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.light = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(LightStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeLightStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).shadow) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.shadow = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(ShadowStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeShadowStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).vacuum) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.vacuum = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(VacuumStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeVacuumStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).moon) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.moon = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(MoonStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeMoonStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).sun) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.sun = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(SunStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeSunStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).creation) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.creation = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(CreationStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeCreationStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).destruction) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.destruction = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(DestructionStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeDestructionStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).inferno_merger) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.inferno_merger = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(FireStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(AirStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeFireStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeAirStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).geyser_merger) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.geyser_merger = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(FireStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(WaterStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeFireStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeWaterStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).cosmos) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.cosmos = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(CosmosStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeCosmosStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).coal_merger) {
				{
					boolean _setval = (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.coal_merger = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(FireStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(EarthStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeFireStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(RechargeEarthStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
			}
		} else if (world.getWorldInfo().getGameRulesInstance().getBoolean(GameRules.KEEP_INVENTORY)) {
			if (world instanceof World) {
				((World) world).getGameRules().get(GameRules.KEEP_INVENTORY).set((false), ((World) world).getServer());
			}
			PowerMod.LOGGER.warn("The \"KeepInventory\" is enabled, the mod's operation may be unstable!");
			PowerMod.LOGGER.warn("The stones will not be returned in the \"KeepInventory\" mode");
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;

				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if (world instanceof World) {
						((World) world).getGameRules().get(GameRules.KEEP_INVENTORY).set((true), ((World) world).getServer());
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 20);
		}
	}
}
