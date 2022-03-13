
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeCreationStoneMobEffect extends MobEffect {
	public RechargeCreationStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
		setRegistryName("recharge_creation_stone");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_creation_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
