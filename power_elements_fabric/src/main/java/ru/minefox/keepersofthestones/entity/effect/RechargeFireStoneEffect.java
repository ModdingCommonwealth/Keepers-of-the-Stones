
package ru.minefox.keepersofthestones.entity.effect;

import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffect;

public class RechargeFireStoneEffect extends StatusEffect {
	public RechargeFireStoneEffect() {
		super(StatusEffectType.NEUTRAL, -65536);
	}

	@Override
	public boolean isInstant() {
		return false;
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
