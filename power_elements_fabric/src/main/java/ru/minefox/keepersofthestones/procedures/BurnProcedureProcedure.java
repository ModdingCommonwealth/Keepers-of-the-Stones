package ru.minefox.keepersofthestones.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

public class BurnProcedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure BurnProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.setOnFireFor((int) 10);
	}
}
