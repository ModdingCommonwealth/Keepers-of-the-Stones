
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.FireMastereffectstartProcedure;
import power.keepeersofthestones.procedures.FireMasterEffectEndProcedure;
import power.keepeersofthestones.procedures.FireEffectsProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FireMasterMobEffect extends MobEffect {
	public FireMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -1570808);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.fire_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FireMastereffectstartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FireEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		FireMasterEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
