
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.LightningMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.LightningMasterEffectEndProcedure;
import power.keepeersofthestones.procedures.LightningEffectsProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LightningMasterMobEffect extends MobEffect {
	public LightningMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -65281);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.lightning_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		LightningMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		LightningEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		LightningMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
