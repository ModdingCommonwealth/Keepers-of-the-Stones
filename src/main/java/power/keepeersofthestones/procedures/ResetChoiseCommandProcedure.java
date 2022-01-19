package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class ResetChoiseCommandProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = false;
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.selected = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		PowerModVariables.WorldVariables.get(world).fire_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).air_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).water_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).earth_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).energy_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).ice_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).lightning_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).sound_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).crystal_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).lava_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).rain_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).tornado_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).ocean_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
		PowerModVariables.WorldVariables.get(world).greenery_stone = false;
		PowerModVariables.WorldVariables.get(world).syncData(world);
	}
}
