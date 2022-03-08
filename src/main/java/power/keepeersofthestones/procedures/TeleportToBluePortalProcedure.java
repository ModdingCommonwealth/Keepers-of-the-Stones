package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class TeleportToBluePortalProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (PowerModVariables.MapVariables.get(world).blue_portal) {
			{
				Entity _ent = entity;
				_ent.teleportTo(PowerModVariables.MapVariables.get(world).bposx, PowerModVariables.MapVariables.get(world).bposy,
						PowerModVariables.MapVariables.get(world).bposz);
				if (_ent instanceof ServerPlayer _serverPlayer)
					_serverPlayer.connection.teleport(PowerModVariables.MapVariables.get(world).bposx,
							PowerModVariables.MapVariables.get(world).bposy, PowerModVariables.MapVariables.get(world).bposz, _ent.getYRot(),
							_ent.getXRot());
			}
		}
	}
}
