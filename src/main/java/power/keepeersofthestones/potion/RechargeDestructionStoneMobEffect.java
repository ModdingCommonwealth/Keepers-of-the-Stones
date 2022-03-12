
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeDestructionStoneMobEffect extends MobEffect {
	public RechargeDestructionStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13421773);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_destruction_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
