package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.IWorld;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collections;

public class TeleportToBluePortalProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure TeleportToBluePortal!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure TeleportToBluePortal!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (PowerModVariables.MapVariables.get(world).blue_portal) {
			{
				Entity _ent = entity;
				_ent.setPositionAndUpdate(PowerModVariables.MapVariables.get(world).bposx, PowerModVariables.MapVariables.get(world).bposy,
						PowerModVariables.MapVariables.get(world).bposz);
				if (_ent instanceof ServerPlayerEntity) {
					((ServerPlayerEntity) _ent).connection.setPlayerLocation(PowerModVariables.MapVariables.get(world).bposx,
							PowerModVariables.MapVariables.get(world).bposy, PowerModVariables.MapVariables.get(world).bposz, _ent.rotationYaw,
							_ent.rotationPitch, Collections.emptySet());
				}
			}
		}
	}
}
