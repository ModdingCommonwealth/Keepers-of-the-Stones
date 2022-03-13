
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.TornadoEffectsProcedure;
import power.keepeersofthestones.procedures.TornadoEffectStartProcedure;
import power.keepeersofthestones.procedures.TornadoEffectEndProcedure;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class TornadoMasterMobEffect extends MobEffect {
	public TornadoMasterMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10066432);
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.tornado_master";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		TornadoEffectStartProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		TornadoEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		TornadoEffectEndProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
