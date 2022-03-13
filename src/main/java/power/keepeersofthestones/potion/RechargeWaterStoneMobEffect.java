
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeWaterStoneMobEffect extends MobEffect {
	public RechargeWaterStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777012);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_water_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
