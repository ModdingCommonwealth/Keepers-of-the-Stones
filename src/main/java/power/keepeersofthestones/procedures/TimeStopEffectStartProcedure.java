package power.keepeersofthestones.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;

public class TimeStopEffectStartProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level)
			_level.getGameRules().getRule(GameRules.RULE_RANDOMTICKING).set(0, _level.getServer());
		if (world instanceof Level _level)
			_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set((false), _level.getServer());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN);
	}
}
