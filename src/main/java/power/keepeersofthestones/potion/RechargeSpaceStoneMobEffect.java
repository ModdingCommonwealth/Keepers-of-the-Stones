
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeSpaceStoneMobEffect extends MobEffect {
	public RechargeSpaceStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13434829);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_space_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
