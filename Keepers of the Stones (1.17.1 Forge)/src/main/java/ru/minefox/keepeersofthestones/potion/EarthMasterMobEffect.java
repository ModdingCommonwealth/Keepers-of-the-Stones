
package ru.minefox.keepeersofthestones.potion;

import ru.minefox.keepeersofthestones.procedures.EarthMasterEffectStartProcedure;
import ru.minefox.keepeersofthestones.procedures.EarthMasterEffectEndProcedure;
import ru.minefox.keepeersofthestones.procedures.EarthEffectsProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EarthMasterMobEffect extends MobEffect {
	public EarthMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10079488);
		setRegistryName("earth_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.earth_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EarthMasterEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EarthEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EarthMasterEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
