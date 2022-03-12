
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.LavaMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.LavaMasterEffectEndProcedure;
import power.keepeersofthestones.procedures.LavaEffectsProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class LavaMasterMobEffect extends MobEffect {
	public LavaMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -39424);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.lava_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		LavaMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		LavaEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		LavaMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
