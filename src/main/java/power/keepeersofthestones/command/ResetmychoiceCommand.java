
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.ResetmychoiceProcedureProcedure;

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
import java.util.Arrays;
import java.util.AbstractMap;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.arguments.StringArgumentType;

@Mod.EventBusSubscriber
public class ResetmychoiceCommand {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event) {
		event.getDispatcher().register(LiteralArgumentBuilder.<CommandSource>literal("resetmychoice")

				.then(Commands.argument("arguments", StringArgumentType.greedyString()).executes(cmdargs -> {
					ServerWorld world = cmdargs.getSource().getWorld();
					double x = cmdargs.getSource().getPos().getX();
					double y = cmdargs.getSource().getPos().getY();
					double z = cmdargs.getSource().getPos().getZ();
					Entity entity = cmdargs.getSource().getEntity();
					Direction direction = Objects.requireNonNull(entity).getHorizontalFacing();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);
					HashMap<String, String> cmdparams = new HashMap<>();
					int[] index = {-1};
					Arrays.stream(cmdargs.getInput().split("\\s+")).forEach(param -> {
						if (index[0] >= 0)
							cmdparams.put(Integer.toString(index[0]), param);
						index[0]++;
					});

					ResetmychoiceProcedureProcedure.executeProcedure(Stream
							.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
									new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
									new AbstractMap.SimpleEntry<>("entity", entity))
							.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
					return 0;
				})));
	}
}
