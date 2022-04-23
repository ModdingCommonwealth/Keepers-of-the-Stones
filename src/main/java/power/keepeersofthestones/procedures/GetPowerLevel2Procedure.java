package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;

import net.minecraft.world.entity.Entity;

public class GetPowerLevel2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 2;
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.power_level = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
