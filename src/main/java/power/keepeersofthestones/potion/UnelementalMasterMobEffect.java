
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.UnelementalMasterEffectsProcedure;
import power.keepeersofthestones.procedures.UnelementalMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.UnelementalMasterEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class UnelementalMasterMobEffect extends MobEffect {
	public UnelementalMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1);
		setRegistryName("unelemental_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.unelemental_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		UnelementalMasterEffectStartProcedure.execute(entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		UnelementalMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		UnelementalMasterEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}