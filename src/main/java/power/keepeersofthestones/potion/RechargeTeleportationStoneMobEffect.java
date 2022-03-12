
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RechargeTeleportationStoneMobEffect extends MobEffect {
	public RechargeTeleportationStoneMobEffect() {
		super(MobEffectCategory.NEUTRAL, -16750849);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.recharge_teleportation_stone";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
