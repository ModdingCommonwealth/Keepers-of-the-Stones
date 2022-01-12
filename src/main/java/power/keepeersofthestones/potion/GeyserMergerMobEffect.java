
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.GeyserMergerEffectsProcedure;
import power.keepeersofthestones.procedures.GeyserMergerEffectStartProcedure;
import power.keepeersofthestones.procedures.GeyserMergerEffectEndProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class GeyserMergerMobEffect extends MobEffect {
	public GeyserMergerMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -16724788);
		setRegistryName("geyser_merger");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.geyser_merger";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GeyserMergerEffectStartProcedure.execute(world, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GeyserMergerEffectsProcedure.execute(entity);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		GeyserMergerEffectEndProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
