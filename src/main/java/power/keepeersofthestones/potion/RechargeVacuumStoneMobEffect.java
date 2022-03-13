
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeVacuumStoneMobEffect extends MobEffect {
	public RechargeVacuumStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16751053);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_vacuum_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
