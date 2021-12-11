package ru.minefox.keepersofthestones.procedures;

import net.minecraft.entity.Entity;

import java.util.Map;

public class FireStoneUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireStoneUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"effect @s give power:fire_master 1 600");
			}
		}
	}
}
