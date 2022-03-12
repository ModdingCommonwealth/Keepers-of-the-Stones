
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.CrystalMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.CrystalMasterEffectEndProcedure;
import power.keepeersofthestones.procedures.CrystalEffectsProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CrystalMasterMobEffect extends MobEffect {
	public CrystalMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3407719);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.crystal_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		CrystalMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CrystalEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		CrystalMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
