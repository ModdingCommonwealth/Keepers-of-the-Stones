package ru.minefox.keepersofthestones.procedures;

import ru.minefox.keepersofthestones.PowerModVariables;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class FireMasterEffectStartProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireMasterEffectStart!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"replaceitem entity @s weapon.mainhand air");
			}
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addStatusEffect(new StatusEffectInstance(StatusEffects.GLOWING, (int) 30, (int) 0, (false), (false)));
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"replaceitem entity @s armor.head power:fire_helmet{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"replaceitem entity @s armor.chest power:fire_chestplate{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"replaceitem entity @s armor.legs power:fire_leggings{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"replaceitem entity @s armor.feet power:fire_boots{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"give @s power:lightning_strike{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"give @s power:plasma_ball{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"give @s power:storm{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
			}
		}
		PowerModVariables.active = (boolean) (true);
		PowerModVariables.fire = (boolean) (true);
	}
}
