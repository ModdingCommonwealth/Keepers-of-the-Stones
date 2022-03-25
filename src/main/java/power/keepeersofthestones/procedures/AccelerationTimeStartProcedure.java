package power.keepeersofthestones.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;

public class AccelerationTimeStartProcedure {
	public static void execute(LevelAccessor world) {
		if (world instanceof Level _level)
			_level.getGameRules().getRule(GameRules.RULE_RANDOMTICKING).set(100, _level.getServer());
	}
}
