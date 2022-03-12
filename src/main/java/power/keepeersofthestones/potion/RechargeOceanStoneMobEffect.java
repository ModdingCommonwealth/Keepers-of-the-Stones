
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeOceanStoneMobEffect extends MobEffect {
	public RechargeOceanStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16711783);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_ocean_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
