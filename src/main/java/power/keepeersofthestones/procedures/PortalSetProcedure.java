package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class PortalSetProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (PowerModVariables.MapVariables.get(world).orange_portal) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), PowerModBlocks.BLUE_PORTAL.defaultBlockState(), 3);
			PowerModVariables.MapVariables.get(world).bposy = (double) (y + 1);
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposx = (double) x;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposz = (double) z;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).blue_portal = (boolean) (true);
			PowerModVariables.MapVariables.get(world).syncData(world);
		} else if (PowerModVariables.MapVariables.get(world).blue_portal) {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), PowerModBlocks.ORANGE_PORTAL.defaultBlockState(), 3);
			PowerModVariables.MapVariables.get(world).oposy = (double) (y + 1);
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).oposx = (double) x;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).oposz = (double) z;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).orange_portal = (boolean) (true);
			PowerModVariables.MapVariables.get(world).syncData(world);
		} else {
			world.setBlock(new BlockPos((int) x, (int) y, (int) z), PowerModBlocks.BLUE_PORTAL.defaultBlockState(), 3);
			PowerModVariables.MapVariables.get(world).bposy = (double) (y + 1);
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposx = (double) x;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposz = (double) z;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).blue_portal = (boolean) (true);
			PowerModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
