
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.MagnetismTickProcedure;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MagnetismMobEffect extends MobEffect {
	public MagnetismMobEffect() {
		super(MobEffectCategory.HARMFUL, -3407821);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.magnetism";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MagnetismTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
