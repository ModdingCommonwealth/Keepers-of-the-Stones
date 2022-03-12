package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SetBlockMoonStoneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
	}
}
