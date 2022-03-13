
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.RainStoneEffectsProcedure;
import power.keepeersofthestones.procedures.RainMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.RainMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RainMasterMobEffect extends MobEffect {
	public RainMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6710785);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.rain_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		RainMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		RainStoneEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		RainMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
