
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeTimeStoneMobEffect extends MobEffect {
	public RechargeTimeStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10092544);
		setRegistryName("recharge_time_stone");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_time_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
