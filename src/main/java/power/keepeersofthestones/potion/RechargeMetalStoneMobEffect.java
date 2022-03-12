
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeMetalStoneMobEffect extends MobEffect {
	public RechargeMetalStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3355444);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_metal_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
