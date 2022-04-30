
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.VenusOnMeProcedure;
import power.keepeersofthestones.procedures.MoonOnMeProcedure;
import power.keepeersofthestones.procedures.MarsOnMeProcedure;
import power.keepeersofthestones.procedures.EarthOnMeProcedure;

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

					EarthOnMeProcedure.execute(entity);
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

					MoonOnMeProcedure.execute(entity);
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

					VenusOnMeProcedure.execute(entity);
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

					MarsOnMeProcedure.execute(entity);
					return 0;
				})));
	}
}
