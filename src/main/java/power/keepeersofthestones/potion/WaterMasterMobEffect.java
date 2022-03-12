
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.WaterMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.WaterEffectsProcedure;
import power.keepeersofthestones.procedures.WaterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class WaterMasterMobEffect extends MobEffect {
	public WaterMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16763905);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.water_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		WaterMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		WaterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		WaterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
