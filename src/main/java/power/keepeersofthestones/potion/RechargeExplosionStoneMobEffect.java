
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeExplosionStoneMobEffect extends MobEffect {
	public RechargeExplosionStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6737152);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_explosion_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
