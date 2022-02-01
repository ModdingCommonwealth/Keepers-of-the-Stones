
package power.keepeersofthestones.potion;

import power.keepeersofthestones.procedures.CursedDiamondEffectProcedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class CurseCursedDiamondMobEffect extends MobEffect {
	public CurseCursedDiamondMobEffect() {
		super(MobEffectCategory.HARMFUL, -10092544);
		setRegistryName("curse_cursed_diamond");
	}

	@Override
	public String getDescriptionId() {
		return "effect.power.curse_cursed_diamond";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		CursedDiamondEffectProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
