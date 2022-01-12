package power.keepeersofthestones.procedures;

import net.minecraft.world.entity.Entity;

public class BurnProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}
