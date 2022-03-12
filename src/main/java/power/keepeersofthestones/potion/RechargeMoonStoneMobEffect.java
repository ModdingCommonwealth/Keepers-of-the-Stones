
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeMoonStoneMobEffect extends MobEffect {
	public RechargeMoonStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3355393);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_moon_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
