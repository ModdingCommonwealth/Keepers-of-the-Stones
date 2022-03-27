package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PortalSetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (PowerModVariables.MapVariables.get(world).orange_portal) {
			if (!PowerModVariables.MapVariables.get(world).blue_portal) {
				world.setBlock(new BlockPos(x, y + 1, z), PowerModBlocks.BLUE_PORTAL.get().defaultBlockState(), 3);
				PowerModVariables.MapVariables.get(world).blue_portal = true;
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).bposy = y + 1;
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).bposx = x;
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).bposz = z;
				PowerModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (PowerModVariables.MapVariables.get(world).blue_portal) {
			if (!PowerModVariables.MapVariables.get(world).orange_portal) {
				world.setBlock(new BlockPos(x, y + 1, z), PowerModBlocks.ORANGE_PORTAL.get().defaultBlockState(), 3);
				PowerModVariables.MapVariables.get(world).orange_portal = true;
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).oposy = y + 1;
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).oposx = x;
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).oposz = z;
				PowerModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (!PowerModVariables.MapVariables.get(world).blue_portal) {
			world.setBlock(new BlockPos(x, y + 1, z), PowerModBlocks.BLUE_PORTAL.get().defaultBlockState(), 3);
			PowerModVariables.MapVariables.get(world).blue_portal = true;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposy = y + 1;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposx = x;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposz = z;
			PowerModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
