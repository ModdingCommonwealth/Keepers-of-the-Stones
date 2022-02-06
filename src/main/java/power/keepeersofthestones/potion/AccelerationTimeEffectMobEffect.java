
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.AccelerationTimeTickEffectProcedure;

import net.minecraft.world.level.Level;
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
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AccelerationTimeTickEffectProcedure.execute(world, x, y, z);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
