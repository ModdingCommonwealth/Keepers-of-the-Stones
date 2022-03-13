
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeBloodStoneMobEffect extends MobEffect {
	public RechargeBloodStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6750208);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_blood_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
