
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeCrystalStoneMobEffect extends MobEffect {
	public RechargeCrystalStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3407719);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_crystal_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
