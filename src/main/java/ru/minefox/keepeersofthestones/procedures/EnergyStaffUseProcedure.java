package ru.minefox.keepeersofthestones.procedures;

import ru.minefox.keepeersofthestones.init.PowerModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class EnergyStaffUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.UNELEMENTAL_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.FIRE_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.AIR_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.WATER_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.EARTH_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.ICE_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.LIGHTNING_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.FIRE_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.CRYSTAL_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.LAVA_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RAIN_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.TORNADO_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.OCEAN_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.FIRE_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.GREENERY_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.GEYSER_MERGER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.ANIMALS_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.METAL_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.LIGHT_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.SHADOW_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.SUN_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.MOON_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.CREATION_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.DESTRUCTION_MASTER);
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.COAL_MERGER);
	}
}
