
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeBlueFlameStoneMobEffect extends MobEffect {
	public RechargeBlueFlameStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16737793);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_blue_flame_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
