
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.CoalMergerEffectsProcedure;
import ru.minefox.keepeersofthestones.procedures.CoalMergerEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.CoalMergerEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CoalMergerMobEffect extends MobEffect {
	public CoalMergerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750208);
		setRegistryName("coal_merger");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.coal_merger";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CoalMergerEffectStartProcedure.execute(world, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CoalMergerEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CoalMergerEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
