
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.AccelerationTimeTickEffectProcedure;
import power.keepeersofthestones.procedures.AccelerationTimeStartProcedure;
import power.keepeersofthestones.procedures.AccelerationTimeEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AccelerationTimeEffectMobEffect extends MobEffect {
	public AccelerationTimeEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13395712);
		setRegistryName("acceleration_time_effect");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.acceleration_time_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AccelerationTimeStartProcedure.execute(world);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AccelerationTimeTickEffectProcedure.execute(world, x, y, z);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AccelerationTimeEndProcedure.execute(world);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
