
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.ShadowMasterEffectsProcedure;
import ru.minefox.keepeersofthestones.procedures.ShadowMasterEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.ShadowMasterEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class ShadowMasterMobEffect extends MobEffect {
	public ShadowMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16777165);
		setRegistryName("shadow_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.shadow_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ShadowMasterEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ShadowMasterEffectsProcedure.execute(world, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		ShadowMasterEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
