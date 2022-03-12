
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.BloodMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.BloodMasterEffectEndProcedure;
import power.keepeersofthestones.procedures.BloodEffectsProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BloodMasterMobEffect extends MobEffect {
	public BloodMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750208);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.blood_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		BloodMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		BloodEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		BloodMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
