
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.LightningMasterEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.LightningMasterEffectEndProcedure;
import ru.minefox.keepeersofthestones.procedures.LightningEffectsProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LightningMasterMobEffect extends MobEffect {
	public LightningMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -65281);
		setRegistryName("lightning_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.lightning_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LightningMasterEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LightningEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		LightningMasterEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
