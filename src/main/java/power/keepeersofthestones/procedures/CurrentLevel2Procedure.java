package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;

import net.minecraft.world.entity.Entity;

public class CurrentLevel2Procedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return (entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).power_level == 2;
	}
}
