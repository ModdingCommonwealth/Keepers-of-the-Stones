package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.core.BlockPos;

public class CheckpointProcedure {
	public static void execute(double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _serverPlayer)
			_serverPlayer.setRespawnPosition(_serverPlayer.level.dimension(), new BlockPos((int) x, (int) (y + 1), (int) z), _serverPlayer.getYRot(),
					true, false);
		{
			double _setval = (double) (y + 1);
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.spawny = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) x;
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.spawnx = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			double _setval = (double) z;
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.spawnz = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player)
			_player.closeContainer();
	}
}
