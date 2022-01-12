
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.InvincibilityEffectStartProcedure;
import power.keepeersofthestones.procedures.InvincibilityEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class InvincibilityMobEffect extends MobEffect {
	public InvincibilityMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6710887);
		setRegistryName("invincibility");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.invincibility";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		InvincibilityEffectStartProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		InvincibilityEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
