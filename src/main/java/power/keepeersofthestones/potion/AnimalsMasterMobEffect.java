
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.AnimalsMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.AnimalsMasterEffectEndProcedure;
import power.keepeersofthestones.procedures.AnimalsEffectsProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AnimalsMasterMobEffect extends MobEffect {
	public AnimalsMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -26266);
		setRegistryName("animals_master");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.animals_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AnimalsMasterEffectStartProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AnimalsEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AnimalsMasterEffectEndProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
