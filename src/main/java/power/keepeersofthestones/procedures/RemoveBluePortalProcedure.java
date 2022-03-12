package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;

import net.minecraft.world.level.LevelAccessor;

public class RemoveBluePortalProcedure {
	public static void execute(LevelAccessor world) {
		PowerModVariables.MapVariables.get(world).blue_portal = false;
		PowerModVariables.MapVariables.get(world).syncData(world);
	}
}
