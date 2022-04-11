package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

public class PointTPProcedure {
	public static void execute(Entity entity, HashMap guistate) {
		if (entity == null || guistate == null)
			return;
		{
			double _setval = entity.getPersistentData()
					.getDouble((guistate.containsKey("text:tpX") ? ((EditBox) guistate.get("text:tpX")).getValue() : "text:tpX"));
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.tpX = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData()
					.getDouble((guistate.containsKey("text:tpY") ? ((EditBox) guistate.get("text:tpY")).getValue() : "text:tpY"));
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.tpY = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = entity.getPersistentData()
					.getDouble((guistate.containsKey("text:tpZ") ? ((EditBox) guistate.get("text:tpZ")).getValue() : "text:tpZ"));
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.tpZ = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			Entity _ent = entity;
			_ent.teleportTo(
					((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).tpX),
					((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).tpY),
					((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).tpZ));
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(
						((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).tpX),
						((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).tpY),
						((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).tpZ),
						_ent.getYRot(), _ent.getXRot());
		}
	}
}
