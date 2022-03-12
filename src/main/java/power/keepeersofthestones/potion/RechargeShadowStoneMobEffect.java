
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeShadowStoneMobEffect extends MobEffect {
	public RechargeShadowStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16777165);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_shadow_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
