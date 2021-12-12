
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.WaterMasterEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.WaterEffectsProcedure;
import ru.minefox.keepeersofthestones.procedures.WaterEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WaterMasterMobEffect extends MobEffect {
	public WaterMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16763905);
		setRegistryName("water_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.water_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WaterMasterEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WaterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		WaterEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
