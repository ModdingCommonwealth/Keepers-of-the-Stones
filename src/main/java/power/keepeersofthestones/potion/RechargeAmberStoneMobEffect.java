
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeAmberStoneMobEffect extends MobEffect {
	public RechargeAmberStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -26266);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_amber_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
