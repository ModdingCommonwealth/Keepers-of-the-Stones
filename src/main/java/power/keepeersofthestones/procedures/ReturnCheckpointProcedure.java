package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collections;

public class ReturnCheckpointProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure ReturnCheckpoint!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			_ent.setPositionAndUpdate(
					((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).spawnx),
					((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).spawny),
					((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).spawnz));
			if (_ent instanceof ServerPlayerEntity) {
				((ServerPlayerEntity) _ent).connection.setPlayerLocation(
						((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).spawnx),
						((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).spawny),
						((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).spawnz),
						_ent.rotationYaw, _ent.rotationPitch, Collections.emptySet());
			}
		}
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).closeScreen();
		if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
			((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("You have successfully returned to the point of return."), (false));
		}
	}
}
