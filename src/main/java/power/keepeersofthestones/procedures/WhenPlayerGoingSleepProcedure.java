package power.keepeersofthestones.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenPlayerGoingSleepProcedure {
	@SubscribeEvent
	public static void onPlayerInBed(PlayerSleepInBedEvent event) {
		execute(event, event.getPlayer().level, event.getPlayer());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(world instanceof Level _lvl && _lvl.isDay())) {
			DetransformKeyPriNazhatiiKlavishiProcedure.execute(entity);
		}
	}
}
