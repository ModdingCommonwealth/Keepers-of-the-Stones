
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.OnVenusUseProcedure;
import power.keepeersofthestones.procedures.OnMoonUseProcedure;
import power.keepeersofthestones.procedures.OnMarsUseProcedure;
import power.keepeersofthestones.procedures.OnEarthUseProcedure;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.common.util.FakePlayerFactory;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;
import net.minecraft.command.Commands;
import net.minecraft.command.CommandSource;

import java.util.stream.Stream;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;

@Mod.EventBusSubscriber
public class PlanetCommand {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event) {
		event.getDispatcher().register(LiteralArgumentBuilder.<CommandSource>literal("planet").requires(s -> s.hasPermissionLevel(4))
				.then(Commands.literal("earth").executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					OnEarthUseProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
							(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})).then(Commands.literal("moon").executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					OnMoonUseProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
							(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})).then(Commands.literal("venus").executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					OnVenusUseProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
							(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})).then(Commands.literal("mars").executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					OnMarsUseProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
							(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})));
	}
}
