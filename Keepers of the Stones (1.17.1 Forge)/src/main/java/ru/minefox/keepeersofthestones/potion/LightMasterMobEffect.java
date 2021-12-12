
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.LightMasterEffectsProcedure;
import ru.minefox.keepeersofthestones.procedures.LightMasterEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.LightMasterEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LightMasterMobEffect extends MobEffect {
	public LightMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -205);
		setRegistryName("light_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.light_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LightMasterEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LightMasterEffectsProcedure.execute(world, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LightMasterEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
