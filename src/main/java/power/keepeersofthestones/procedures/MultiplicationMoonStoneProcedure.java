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
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), PowerModBlocks.MOON_STONES_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y + 1), (int) z), PowerModBlocks.MOON_STONES_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), PowerModBlocks.MOON_STONES_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), PowerModBlocks.MOON_STONES_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) (x + 1), (int) y, (int) z), PowerModBlocks.MOON_STONES_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), PowerModBlocks.MOON_STONES_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), PowerModBlocks.MOON_STONES_BLOCK.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) (x - 1), (int) y, (int) z), PowerModBlocks.MOON_STONES_BLOCK.defaultBlockState(), 3);
		}
	}
}
