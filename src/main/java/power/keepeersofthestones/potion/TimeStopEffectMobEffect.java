
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.TimeStopEffectStartProcedure;
import power.keepeersofthestones.procedures.TimeStopEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TimeStopEffectMobEffect extends MobEffect {
	public TimeStopEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6750208);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.time_stop_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TimeStopEffectStartProcedure.execute(entity.level, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TimeStopEffectEndProcedure.execute(entity.level);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
