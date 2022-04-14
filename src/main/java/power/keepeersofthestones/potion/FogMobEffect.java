
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.FogStartProcedure;
import power.keepeersofthestones.procedures.FogEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FogMobEffect extends MobEffect {
	public FogMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3355393);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.fog";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FogStartProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FogEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
