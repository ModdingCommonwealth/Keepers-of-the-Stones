package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerMod;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.GameRules;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import java.util.Map;

public class TimeStopEffectEndProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure TimeStopEffectEnd!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof ServerWorld && ((World) world).getServer() != null) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, Vector3d.ZERO, Vector2f.ZERO, ((ServerWorld) world).getWorld(), 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					String.format("gamerule %s %d", (GameRules.RANDOM_TICK_SPEED).toString(), (int) 1));
		}
		if (world instanceof World) {
			((World) world).getGameRules().get(GameRules.DO_DAYLIGHT_CYCLE).set((true), ((World) world).getServer());
		}
	}
}
