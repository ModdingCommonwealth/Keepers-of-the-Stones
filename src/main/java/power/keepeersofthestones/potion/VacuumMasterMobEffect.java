
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.VacuumMasterEffectsProcedure;
import power.keepeersofthestones.procedures.VacuumMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.VacuumMasterEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class VacuumMasterMobEffect extends MobEffect {
	public VacuumMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16751053);
		setRegistryName("vacuum_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.vacuum_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		VacuumMasterEffectStartProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		VacuumMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		VacuumMasterEffectEndProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
