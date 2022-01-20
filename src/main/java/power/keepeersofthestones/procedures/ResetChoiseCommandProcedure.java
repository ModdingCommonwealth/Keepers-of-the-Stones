package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.IWorld;
import net.minecraft.entity.Entity;

import java.util.Map;

public class ResetChoiseCommandProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure ResetChoiseCommand!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure ResetChoiseCommand!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		{
			boolean _setval = (false);
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.selected = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		PowerModVariables.WorldVariables.get(world).fire_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).air_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).water_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).earth_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).energy_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).ice_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).lightning_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).sound_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).crystal_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).lava_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).rain_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).tornado_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).ocean_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).greenery_stone = (false);
		PowerModVariables.WorldVariables.get(world).syncData(world);
	}
}
