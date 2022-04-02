package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class ClearCopyElementsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.FIRE_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.AIR_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.WATER_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.EARTH_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.ENERGY_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.ICE_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.LIGHTNING_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.SOUND_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.CRYSTAL_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.LAVA_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RAIN_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.TORNADO_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.OCEAN_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.GREENERY_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.ANIMALS_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.METAL_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.LIGHT_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.SHADOW_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.VACUUM_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.SUN_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.MOON_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.CREATION_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.DESTRUCTION_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.COSMOS_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.BLOOD_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.TECHNOLOGY_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.TIME_MASTER_EFFECT.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.TELEPORTATION_MASTER.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.EXPLOSION_MASTER.get());
	}
}
