
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.ResetmychoiceProcedureProcedure;
import power.keepeersofthestones.procedures.ResetLevelProcedure;
import power.keepeersofthestones.procedures.GetPowerLevel3Procedure;
import power.keepeersofthestones.procedures.GetPowerLevel2Procedure;
import power.keepeersofthestones.procedures.DetransformKeyPriNazhatiiKlavishiProcedure;

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
public class ConfstoneCommand {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event) {
		event.getDispatcher().register(LiteralArgumentBuilder.<CommandSource>literal("confstone").requires(s -> s.hasPermissionLevel(4))
				.then(Commands.literal("rechoice").executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					ResetmychoiceProcedureProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
									new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})).then(Commands.literal("detransform").executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					DetransformKeyPriNazhatiiKlavishiProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})).then(Commands.literal("level").then(Commands.literal("reset").executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					ResetLevelProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
							(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})).then(Commands.literal("select").then(Commands.literal("2").executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					GetPowerLevel2Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
							(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})).then(Commands.literal("3").executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					GetPowerLevel3Procedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
							(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})))));
	}
}
