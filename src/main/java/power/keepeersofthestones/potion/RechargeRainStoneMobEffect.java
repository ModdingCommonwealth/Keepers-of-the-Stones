
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeRainStoneMobEffect extends MobEffect {
	public RechargeRainStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -6710785);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_rain_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
