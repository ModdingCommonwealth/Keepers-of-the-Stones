package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.IWorld;

import java.util.Map;

public class RemoveBluePortalProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure RemoveBluePortal!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		PowerModVariables.MapVariables.get(world).blue_portal = (false);
		PowerModVariables.MapVariables.get(world).syncData(world);
	}
}
