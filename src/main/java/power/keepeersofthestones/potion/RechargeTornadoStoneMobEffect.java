
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeTornadoStoneMobEffect extends MobEffect {
	public RechargeTornadoStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10066432);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_tornado_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
