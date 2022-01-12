
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeEmptyStoneMobEffect extends MobEffect {
	public RechargeEmptyStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		setRegistryName("recharge_empty_stone");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_empty_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
