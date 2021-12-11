package ru.minefox.keepeersofthestones.procedures;

import ru.minefox.keepeersofthestones.init.PowerModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class SetBlockMoonStoneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), PowerModBlocks.MOON_STONES_BLOCK.defaultBlockState(), 3);
	}
}
