package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class MultiplicationMoonStoneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).moon) {
			world.setBlock(new BlockPos(x, y, z), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y + 1, z), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z + 1), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z + 1), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z - 1), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z - 1), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
		}
	}
}
