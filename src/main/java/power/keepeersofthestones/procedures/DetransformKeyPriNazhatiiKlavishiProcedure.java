package power.keepeersofthestones.procedures;

import net.minecraftforge.eventbus.api.Event;

public class DetransformKeyPriNazhatiiKlavishiProcedure {

	

	public static void executeProcedure(Map<String, Object> dependencies){
			if(dependencies.get("entity") == null) {
				if(!dependencies.containsKey("entity"))
					PowerMod.LOGGER.warn("Failed to load dependency entity for procedure DetransformKeyPriNazhatiiKlavishi!");
				return;
			}

				Entity entity = (Entity) dependencies.get("entity");


		if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(FireMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(AirMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(WaterMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(EarthMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(EnergyMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(IceMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(LightningMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(SoundMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(CrystalMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(LavaMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(RainMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(TornadoMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(OceanMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(GreeneryMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(AnimalsMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(MetalMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(LightMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(ShadowMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(VacuumMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(SunMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(MoonMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(CreationMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(DestructionMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(SpaceMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(BloodMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(TechnologyMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(TimeMasterEffectPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(TeleportationMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(ExplosionMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(AmberMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(BlueFlameMasterPotionEffect.potion);
}if (entity instanceof LivingEntity) {
    ((LivingEntity) entity).removePotionEffect(MagnetMasterPotionEffect.potion);
}
	}

}
