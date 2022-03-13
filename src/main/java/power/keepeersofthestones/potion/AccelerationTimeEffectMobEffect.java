
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.AccelerationTimeTickEffectProcedure;
import power.keepeersofthestones.procedures.AccelerationTimeStartProcedure;
import power.keepeersofthestones.procedures.AccelerationTimeEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AccelerationTimeEffectMobEffect extends MobEffect {
	public AccelerationTimeEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13395712);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.acceleration_time_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		AccelerationTimeStartProcedure.execute(entity.level);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AccelerationTimeTickEffectProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ());
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		AccelerationTimeEndProcedure.execute(entity.level);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
