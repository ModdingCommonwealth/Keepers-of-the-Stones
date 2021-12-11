package ru.minefox.keepersofthestones.procedures;

import net.minecraft.world.World;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec2f;
import net.minecraft.text.LiteralText;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.command.CommandOutput;

import java.util.Map;

public class BurnBlockProcedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure BurnBlockProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure BurnBlockProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure BurnBlockProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure BurnBlockProcedure!");
			return;
		}
		World world = (World) dependencies.get("world");
		double x = (double) dependencies.get("x");
		double y = (double) dependencies.get("y");
		double z = (double) dependencies.get("z");
		if (!world.isClient()) {
			((ServerWorld) world).getServer().getCommandManager()
					.execute(
							new ServerCommandSource(CommandOutput.DUMMY, new Vec3d(x, y, z), Vec2f.ZERO, (ServerWorld) world, 4, "",
									new LiteralText(""), ((ServerWorld) world).getServer(), null).withSilent(),
							"fill ~ ~1 ~ ~ ~1 ~ fire replace air");
		}
	}
}
