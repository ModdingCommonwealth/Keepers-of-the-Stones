
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.OnVenusUseProcedure;
import power.keepeersofthestones.procedures.OnMoonUseProcedure;
import power.keepeersofthestones.procedures.OnMarsUseProcedure;
import power.keepeersofthestones.procedures.OnEarthUseProcedure;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.commands.Commands;

import java.util.Objects;

@Mod.EventBusSubscriber
public class PlanetCommand {
	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(Commands.literal("planet").requires(s -> s.hasPermission(4)).then(Commands.literal("earth").executes(cmdargs -> {
					ServerLevel world = cmdargs.getSource().getLevel();
					double x = cmdargs.getSource().getPosition().x();
					double y = cmdargs.getSource().getPosition().y();
					double z = cmdargs.getSource().getPosition().z();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					OnEarthUseProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("moon").executes(cmdargs -> {
					ServerLevel world = cmdargs.getSource().getLevel();
					double x = cmdargs.getSource().getPosition().x();
					double y = cmdargs.getSource().getPosition().y();
					double z = cmdargs.getSource().getPosition().z();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					OnMoonUseProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("venus").executes(cmdargs -> {
					ServerLevel world = cmdargs.getSource().getLevel();
					double x = cmdargs.getSource().getPosition().x();
					double y = cmdargs.getSource().getPosition().y();
					double z = cmdargs.getSource().getPosition().z();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					OnVenusUseProcedure.execute(entity);
					return 0;
				})).then(Commands.literal("mars").executes(cmdargs -> {
					ServerLevel world = cmdargs.getSource().getLevel();
					double x = cmdargs.getSource().getPosition().x();
					double y = cmdargs.getSource().getPosition().y();
					double z = cmdargs.getSource().getPosition().z();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getDirection();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					OnMarsUseProcedure.execute(entity);
					return 0;
				})));
	}
}
