package power.keepeersofthestones.procedures;

import power.keepeersofthestones.block.MoonStonesBlockBlock;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

public class SetBlockMoonStoneProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure SetBlockMoonStone!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PowerMod.LOGGER.warn("Failed to load dependency x for procedure SetBlockMoonStone!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PowerMod.LOGGER.warn("Failed to load dependency y for procedure SetBlockMoonStone!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PowerMod.LOGGER.warn("Failed to load dependency z for procedure SetBlockMoonStone!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos(x, y - 1, z), MoonStonesBlockBlock.block.getDefaultState(), 3);
	}
}
