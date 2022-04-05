package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.WaterMasterPotionEffect;
import power.keepeersofthestones.potion.VacuumMasterPotionEffect;
import power.keepeersofthestones.potion.TornadoMasterPotionEffect;
import power.keepeersofthestones.potion.TimeMasterEffectPotionEffect;
import power.keepeersofthestones.potion.TeleportationMasterPotionEffect;
import power.keepeersofthestones.potion.TechnologyMasterPotionEffect;
import power.keepeersofthestones.potion.SunMasterPotionEffect;
import power.keepeersofthestones.potion.SoundMasterPotionEffect;
import power.keepeersofthestones.potion.ShadowMasterPotionEffect;
import power.keepeersofthestones.potion.RainMasterPotionEffect;
import power.keepeersofthestones.potion.OceanMasterPotionEffect;
import power.keepeersofthestones.potion.MoonMasterPotionEffect;
import power.keepeersofthestones.potion.MetalMasterPotionEffect;
import power.keepeersofthestones.potion.LightningMasterPotionEffect;
import power.keepeersofthestones.potion.LightMasterPotionEffect;
import power.keepeersofthestones.potion.LavaMasterPotionEffect;
import power.keepeersofthestones.potion.IceMasterPotionEffect;
import power.keepeersofthestones.potion.GreeneryMasterPotionEffect;
import power.keepeersofthestones.potion.FireMasterPotionEffect;
import power.keepeersofthestones.potion.ExplosionMasterPotionEffect;
import power.keepeersofthestones.potion.EnergyMasterPotionEffect;
import power.keepeersofthestones.potion.EarthMasterPotionEffect;
import power.keepeersofthestones.potion.DestructionMasterPotionEffect;
import power.keepeersofthestones.potion.CrystalMasterPotionEffect;
import power.keepeersofthestones.potion.CreationMasterPotionEffect;
import power.keepeersofthestones.potion.CosmosMasterPotionEffect;
import power.keepeersofthestones.potion.BloodMasterPotionEffect;
import power.keepeersofthestones.potion.AnimalsMasterPotionEffect;
import power.keepeersofthestones.potion.AirMasterPotionEffect;
import power.keepeersofthestones.PowerMod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class ClearCopyElementsProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure ClearCopyElements!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(FireMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(AirMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(WaterMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(EarthMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(EnergyMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(IceMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(LightningMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(SoundMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(CrystalMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(LavaMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(RainMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(TornadoMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(OceanMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(GreeneryMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(AnimalsMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(MetalMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(LightMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(ShadowMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(VacuumMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(SunMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(MoonMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(CreationMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(DestructionMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(CosmosMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(BloodMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(TechnologyMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(TimeMasterEffectPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(TeleportationMasterPotionEffect.potion);
		}
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(ExplosionMasterPotionEffect.potion);
		}
	}
}
