
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeLavaStoneMobEffect extends MobEffect {
	public RechargeLavaStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -39424);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_lava_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
