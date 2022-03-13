
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.TechnologyMasterEffectsProcedure;
import power.keepeersofthestones.procedures.TechnologyMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.TechnologyMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TechnologyMasterMobEffect extends MobEffect {
	public TechnologyMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16750951);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.technology_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TechnologyMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TechnologyMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TechnologyMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
