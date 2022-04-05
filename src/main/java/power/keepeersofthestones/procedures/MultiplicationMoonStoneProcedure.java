package power.keepeersofthestones.procedures;

import power.keepeersofthestones.block.MoonStonesBlockBlock;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

import java.util.Map;

public class MultiplicationMoonStoneProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure MultiplicationMoonStone!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PowerMod.LOGGER.warn("Failed to load dependency x for procedure MultiplicationMoonStone!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PowerMod.LOGGER.warn("Failed to load dependency y for procedure MultiplicationMoonStone!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PowerMod.LOGGER.warn("Failed to load dependency z for procedure MultiplicationMoonStone!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure MultiplicationMoonStone!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).moon) {
			world.setBlockState(new BlockPos(x, y, z), MoonStonesBlockBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 1, z), MoonStonesBlockBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x + 1, y, z + 1), MoonStonesBlockBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y, z + 1), MoonStonesBlockBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x + 1, y, z), MoonStonesBlockBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x - 1, y, z - 1), MoonStonesBlockBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y, z - 1), MoonStonesBlockBlock.block.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x - 1, y, z), MoonStonesBlockBlock.block.getDefaultState(), 3);
		}
	}
}
