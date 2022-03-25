
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.AmberMasterEffectsProcedure;
import power.keepeersofthestones.procedures.AmberMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.AmberMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AmberMasterMobEffect extends MobEffect {
	public AmberMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -26266);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.amber_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		AmberMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		AmberMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		AmberMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
