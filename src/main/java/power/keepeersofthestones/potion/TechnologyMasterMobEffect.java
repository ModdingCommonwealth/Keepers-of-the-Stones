
package power.keepeersofthestones.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TechnologyMasterMobEffect extends MobEffect {
	public TechnologyMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16750951);
		setRegistryName("technology_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.technology_master";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
