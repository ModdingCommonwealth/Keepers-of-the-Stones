package ru.minefox.keepersofthestones.procedures;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class FireMasterEffectsProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireMasterEffects!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, (int) 20, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, (int) 20, (int) 3, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, (int) 20, (int) 1, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, (int) 20, (int) 0, (false), (false)));
	}
}
