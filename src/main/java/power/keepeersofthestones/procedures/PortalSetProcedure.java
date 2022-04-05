package power.keepeersofthestones.procedures;

import power.keepeersofthestones.block.OrangePortalBlock;
import power.keepeersofthestones.block.BluePortalBlock;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

public class PortalSetProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure PortalSet!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PowerMod.LOGGER.warn("Failed to load dependency x for procedure PortalSet!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PowerMod.LOGGER.warn("Failed to load dependency y for procedure PortalSet!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PowerMod.LOGGER.warn("Failed to load dependency z for procedure PortalSet!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (PowerModVariables.MapVariables.get(world).orange_portal) {
			if (!PowerModVariables.MapVariables.get(world).blue_portal) {
				world.setBlockState(new BlockPos(x, y + 1, z), BluePortalBlock.block.getDefaultState(), 3);
				PowerModVariables.MapVariables.get(world).blue_portal = (true);
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).bposy = (y + 1);
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).bposx = x;
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).bposz = z;
				PowerModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (PowerModVariables.MapVariables.get(world).blue_portal) {
			if (!PowerModVariables.MapVariables.get(world).orange_portal) {
				world.setBlockState(new BlockPos(x, y + 1, z), OrangePortalBlock.block.getDefaultState(), 3);
				PowerModVariables.MapVariables.get(world).orange_portal = (true);
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).oposy = (y + 1);
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).oposx = x;
				PowerModVariables.MapVariables.get(world).syncData(world);
				PowerModVariables.MapVariables.get(world).oposz = z;
				PowerModVariables.MapVariables.get(world).syncData(world);
			}
		} else if (!PowerModVariables.MapVariables.get(world).blue_portal) {
			world.setBlockState(new BlockPos(x, y + 1, z), BluePortalBlock.block.getDefaultState(), 3);
			PowerModVariables.MapVariables.get(world).blue_portal = (true);
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposy = (y + 1);
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposx = x;
			PowerModVariables.MapVariables.get(world).syncData(world);
			PowerModVariables.MapVariables.get(world).bposz = z;
			PowerModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
