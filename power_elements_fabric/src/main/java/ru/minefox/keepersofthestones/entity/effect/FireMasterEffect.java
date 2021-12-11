
package ru.minefox.keepersofthestones.entity.effect;

import ru.minefox.keepersofthestones.procedures.FireMasterEffectsProcedure;
import ru.minefox.keepersofthestones.procedures.FireMasterEffectStartProcedure;
import ru.minefox.keepersofthestones.procedures.FireMasterEffectEndProcedure;

import net.minecraft.world.World;
import net.minecraft.entity.effect.StatusEffectType;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

public class FireMasterEffect extends StatusEffect {
	public FireMasterEffect() {
		super(StatusEffectType.BENEFICIAL, -65536);
	}

	@Override
	public boolean isInstant() {
		return false;
	}

	@Override
	public void onApplied(LivingEntity entity, AttributeContainer attributeMapIn, int amplifier) {
		World world = entity.world;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			FireMasterEffectStartProcedure.executeProcedure($_dependencies);
		}
	}

	@Override
	public void onRemoved(LivingEntity entity, AttributeContainer attributeMapIn, int amplifier) {
		super.onRemoved(entity, attributeMapIn, amplifier);
		World world = entity.world;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			FireMasterEffectEndProcedure.executeProcedure($_dependencies);
		}
	}

	@Override
	public void applyUpdateEffect(LivingEntity entity, int amplifier) {
		World world = entity.world;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			FireMasterEffectsProcedure.executeProcedure($_dependencies);
		}
	}

	@Override
	public boolean canApplyUpdateEffect(int duration, int amplifier) {
		return true;
	}
}
