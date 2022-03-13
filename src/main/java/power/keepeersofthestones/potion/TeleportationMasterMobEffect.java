
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.TeleportationMasterEffectsProcedure;
import power.keepeersofthestones.procedures.TeleportationMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.TeleportationMasterEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TeleportationMasterMobEffect extends MobEffect {
	public TeleportationMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16737793);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.teleportation_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TeleportationMasterEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TeleportationMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TeleportationMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
