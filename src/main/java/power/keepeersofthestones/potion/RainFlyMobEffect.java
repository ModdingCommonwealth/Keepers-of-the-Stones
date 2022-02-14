
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.RainFlyTickProcedure;
import power.keepeersofthestones.procedures.RainEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class RainFlyMobEffect extends MobEffect {
	public RainFlyMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3355393);
		setRegistryName("rain_fly");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.rain_fly";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RainFlyTickProcedure.execute(world, x, y, z, entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RainEndProcedure.execute(world, entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
