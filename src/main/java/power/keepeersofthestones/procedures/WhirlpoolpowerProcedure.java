package power.keepeersofthestones.procedures;

import net.minecraft.world.entity.Entity;

public class WhirlpoolpowerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.isInWater()) {
			entity.setAirSupply(0);
		}
	}
}
