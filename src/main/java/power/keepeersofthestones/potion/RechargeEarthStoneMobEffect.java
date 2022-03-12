
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeEarthStoneMobEffect extends MobEffect {
	public RechargeEarthStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10079488);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_earth_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
