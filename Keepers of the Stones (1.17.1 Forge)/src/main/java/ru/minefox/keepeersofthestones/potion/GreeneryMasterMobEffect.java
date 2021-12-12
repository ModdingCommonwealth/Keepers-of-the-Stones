
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.GreeneryMasterEffectsProcedure;
import ru.minefox.keepeersofthestones.procedures.GreeneryMasterEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.GreeneryMasterEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class GreeneryMasterMobEffect extends MobEffect {
	public GreeneryMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13382656);
		setRegistryName("greenery_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.greenery_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GreeneryMasterEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GreeneryMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GreeneryMasterEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
