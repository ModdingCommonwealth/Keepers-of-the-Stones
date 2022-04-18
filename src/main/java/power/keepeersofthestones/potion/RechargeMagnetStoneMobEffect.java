
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeMagnetStoneMobEffect extends MobEffect {
	public RechargeMagnetStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -39220);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_magnet_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
