package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;

import net.minecraft.world.entity.Entity;

public class ResetLevelProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			double _setval = 0;
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.power_level = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
