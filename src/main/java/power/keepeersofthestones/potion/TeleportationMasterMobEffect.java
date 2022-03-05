
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.TeleportationMasterEffectsProcedure;
import power.keepeersofthestones.procedures.TeleportationMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.TeleportationMasterEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TeleportationMasterMobEffect extends MobEffect {
	public TeleportationMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16737793);
		setRegistryName("teleportation_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.teleportation_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TeleportationMasterEffectStartProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TeleportationMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TeleportationMasterEffectEndProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
