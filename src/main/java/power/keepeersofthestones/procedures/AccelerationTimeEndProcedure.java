package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerMod;

import java.util.Map;

public class AccelerationTimeEndProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure AccelerationTimeEnd!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld && ((World) world).getServer() != null) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, Vector3d.ZERO, Vector2f.ZERO, ((ServerWorld) world).getWorld(), 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					String.format("gamerule %s %d", (GameRules.RANDOM_TICK_SPEED).toString(), (int) 1));
		}
	}
}
