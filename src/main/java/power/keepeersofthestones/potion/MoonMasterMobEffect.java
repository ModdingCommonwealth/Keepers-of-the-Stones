
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.MoonMasterEffectsProcedure;
import power.keepeersofthestones.procedures.MoonMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.MoonMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MoonMasterMobEffect extends MobEffect {
	public MoonMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -3355393);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.moon_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MoonMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MoonMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MoonMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
