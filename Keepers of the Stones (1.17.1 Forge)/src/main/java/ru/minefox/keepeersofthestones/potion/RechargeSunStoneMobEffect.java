
package ru.minefox.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeSunStoneMobEffect extends MobEffect {
	public RechargeSunStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13312);
		setRegistryName("recharge_sun_stone");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_sun_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
