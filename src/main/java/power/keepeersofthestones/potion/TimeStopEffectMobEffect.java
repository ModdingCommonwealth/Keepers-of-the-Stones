
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.TimeStopEffectStartProcedure;
import power.keepeersofthestones.procedures.TimeStopEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TimeStopEffectMobEffect extends MobEffect {
	public TimeStopEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6750208);
		setRegistryName("time_stop_effect");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.time_stop_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TimeStopEffectStartProcedure.execute(world, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TimeStopEffectEndProcedure.execute(world);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
