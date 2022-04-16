
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.ResetmychoiceProcedureProcedure;
import power.keepeersofthestones.procedures.DetransformKeyPriNazhatiiKlavishiProcedure;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.Commands;

import java.util.Objects;

@Mod.EventBusSubscriber
public class ConfstoneCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("confstone").requires(s -> s.hasPermission(4)).then(Commands.literal("rechoice").executes(cmdargs -> {
					ServerLevel world = cmdargs.getSource().getLevel();
					double x = cmdargs.getSource().getPosition().x();
					double y = cmdargs.getSource().getPosition().y();
					double z = cmdargs.getSource().getPosition().z();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					ResetmychoiceProcedureProcedure.execute(world, x, y, z, entity);
					return 0;
				})).then(Commands.literal("detransform").then(Commands.argument("player", EntityArgument.player()).executes(cmdargs -> {
					ServerLevel world = cmdargs.getSource().getLevel();
					double x = cmdargs.getSource().getPosition().x();
					double y = cmdargs.getSource().getPosition().y();
					double z = cmdargs.getSource().getPosition().z();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					DetransformKeyPriNazhatiiKlavishiProcedure.execute(entity);
					return 0;
				}))).then(Commands.literal("recover")));
	}
}
