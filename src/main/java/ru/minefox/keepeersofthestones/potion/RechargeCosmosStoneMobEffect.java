
package ru.minefox.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeCosmosStoneMobEffect extends MobEffect {
	public RechargeCosmosStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13434829);
		setRegistryName("recharge_cosmos_stone");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_cosmos_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
