
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeAirStoneMobEffect extends MobEffect {
	public RechargeAirStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3342337);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_air_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
