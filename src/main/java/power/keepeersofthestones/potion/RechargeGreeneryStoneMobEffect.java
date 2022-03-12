
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeGreeneryStoneMobEffect extends MobEffect {
	public RechargeGreeneryStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10040320);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_greenery_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
