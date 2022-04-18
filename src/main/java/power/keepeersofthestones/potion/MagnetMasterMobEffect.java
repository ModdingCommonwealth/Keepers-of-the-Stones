
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.MagnetMasterEffectsProcedure;
import power.keepeersofthestones.procedures.MagnetMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.MagnetMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class MagnetMasterMobEffect extends MobEffect {
	public MagnetMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -52378);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.magnet_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		MagnetMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		MagnetMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		MagnetMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
