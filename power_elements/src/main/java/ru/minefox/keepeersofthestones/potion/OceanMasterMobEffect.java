
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.OceanMasterEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.OceanMasterEffectEndProcedure;
import ru.minefox.keepeersofthestones.procedures.OceanEffectsProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class OceanMasterMobEffect extends MobEffect {
	public OceanMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16711783);
		setRegistryName("ocean_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.ocean_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		OceanMasterEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		OceanEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		OceanMasterEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
