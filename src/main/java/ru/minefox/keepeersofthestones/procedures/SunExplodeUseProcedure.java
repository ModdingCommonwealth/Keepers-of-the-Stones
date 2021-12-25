package ru.minefox.keepeersofthestones.procedures;

import ru.minefox.keepeersofthestones.init.PowerModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.core.BlockPos;

public class SunExplodeUseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PowerModBlocks.MOON_STONES_BLOCK) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 16, Explosion.BlockInteraction.DESTROY);
		} else if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == PowerModBlocks.UNMULTIPLICATION_MOON_STONES_BLOCK) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 16, Explosion.BlockInteraction.DESTROY);
		} else {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 8, Explosion.BlockInteraction.DESTROY);
		}
	}
}
