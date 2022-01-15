package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerMod;

import net.minecraft.entity.Entity;

import java.util.Map;

public class EmitateZombieProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure EmitateZombie!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isRemote && _ent.world.getServer() != null) {
				_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
						"playsound minecraft:entity.zombie.ambient hostile @a");
			}
		}
	}
}
