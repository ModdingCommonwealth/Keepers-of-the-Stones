
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeIceStoneMobEffect extends MobEffect {
	public RechargeIceStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16711681);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_ice_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
