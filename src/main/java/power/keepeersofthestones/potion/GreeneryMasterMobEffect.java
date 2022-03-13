
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.GreeneryMasterEffectsProcedure;
import power.keepeersofthestones.procedures.GreeneryMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.GreeneryMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class GreeneryMasterMobEffect extends MobEffect {
	public GreeneryMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -13382656);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.greenery_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		GreeneryMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		GreeneryMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		GreeneryMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
