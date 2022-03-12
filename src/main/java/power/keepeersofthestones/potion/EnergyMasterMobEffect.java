
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.StartEffectEnergyMasterProcedure;
import power.keepeersofthestones.procedures.EnergyEffectsProcedure;
import power.keepeersofthestones.procedures.EndEffectEnergyMasterProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class EnergyMasterMobEffect extends MobEffect {
	public EnergyMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -52);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.energy_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		StartEffectEnergyMasterProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		EnergyEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		EndEffectEnergyMasterProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
