
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeAnimalsStoneMobEffect extends MobEffect {
	public RechargeAnimalsStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -26266);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_animals_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
