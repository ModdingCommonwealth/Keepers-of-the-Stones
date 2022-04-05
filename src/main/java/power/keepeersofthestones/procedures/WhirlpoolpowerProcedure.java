package power.keepeersofthestones.procedures;

import power.keepeersofthestones.PowerMod;

import net.minecraft.entity.Entity;

import java.util.Map;

public class WhirlpoolpowerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure Whirlpoolpower!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.isInWater()) {
			entity.setAir((int) 0);
		}
	}
}
