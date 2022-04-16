package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.RechargeWaterStonePotionEffect;
import power.keepeersofthestones.potion.RechargeVacuumStonePotionEffect;
import power.keepeersofthestones.potion.RechargeTornadoStonePotionEffect;
import power.keepeersofthestones.potion.RechargeTimeStonePotionEffect;
import power.keepeersofthestones.potion.RechargeTechnologyStonePotionEffect;
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
import power.keepeersofthestones.potion.RechargeBloodStonePotionEffect;
import power.keepeersofthestones.potion.RechargeAnimalsStonePotionEffect;
import power.keepeersofthestones.potion.RechargeAirStonePotionEffect;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;

import net.minecraft.world.World;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

public class WhenPlayerWakeUpProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onEntityEndSleep(PlayerWakeUpEvent event) {
			Entity entity = event.getEntity();
			World world = entity.world;
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("event", event);
			executeProcedure(dependencies);
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure WhenPlayerWakeUp!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeFireStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeAirStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeWaterStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeEarthStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeEnergyStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeIceStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeLightningStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeSoundStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeCrystalStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeLavaStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeRainStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeTornadoStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeOceanStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeGreeneryStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeAnimalsStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeMetalStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeLightStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeShadowStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeVacuumStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeSunStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeMoonStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeCreationStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeDestructionStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeCosmosStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeBloodStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeTechnologyStonePotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RechargeTimeStonePotionEffect.potion);
		}
	}
}
