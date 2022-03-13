
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.TimeMasterEffectsProcedure;
import power.keepeersofthestones.procedures.TimeMasterEffectStartProcedure;
import power.keepeersofthestones.procedures.TimeMasterEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TimeMasterEffectMobEffect extends MobEffect {
	public TimeMasterEffectMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10092544);
		setRegistryName("time_master_effect");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.time_master_effect";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TimeMasterEffectStartProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TimeMasterEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		TimeMasterEffectEndProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
