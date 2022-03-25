
package power.keepeersofthestones.command;

import power.keepeersofthestones.procedures.OnMoonUseProcedure;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.AbstractMap;

@Mod.EventBusSubscriber
public class OnmoonCommand {
	@SubscribeEvent
	public static void registerCommands(RegisterCommandsEvent event) {
		event.getDispatcher()
				.register(LiteralArgumentBuilder.<CommandSource>literal("onmoon").requires(s -> s.hasPermissionLevel(1))
						.then(Commands.argument("arguments", StringArgumentType.greedyString()).executes(OnmoonCommand::execute))
						.executes(OnmoonCommand::execute));
	}

	private static int execute(CommandContext<CommandSource> ctx) {
		ServerWorld world = ctx.getSource().getWorld();
		double x = ctx.getSource().getPos().getX();
		double y = ctx.getSource().getPos().getY();
		double z = ctx.getSource().getPos().getZ();
		Entity entity = ctx.getSource().getEntity();
		if (entity == null)
			entity = FakePlayerFactory.getMinecraft(world);
		HashMap<String, String> cmdparams = new HashMap<>();
		int[] index = {-1};
		Arrays.stream(ctx.getInput().split("\\s+")).forEach(param -> {
			if (index[0] >= 0)
				cmdparams.put(Integer.toString(index[0]), param);
			index[0]++;
		});

		OnMoonUseProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
				(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
		return 0;
	}
}
