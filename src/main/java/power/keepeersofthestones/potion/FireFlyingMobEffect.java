
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.FireFlyingTickProcedure;
import power.keepeersofthestones.procedures.FireFlyingEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FireFlyingMobEffect extends MobEffect {
	public FireFlyingMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -26368);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.fire_flying";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FireFlyingTickProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FireFlyingEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
