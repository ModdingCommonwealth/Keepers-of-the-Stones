
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeTechnologyStoneMobEffect extends MobEffect {
	public RechargeTechnologyStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16750951);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_technology_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
