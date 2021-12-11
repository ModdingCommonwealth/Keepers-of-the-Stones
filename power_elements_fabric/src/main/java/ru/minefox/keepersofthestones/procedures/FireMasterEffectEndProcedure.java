package ru.minefox.keepersofthestones.procedures;

import ru.minefox.keepersofthestones.PowerModVariables;
import ru.minefox.keepersofthestones.PowerMod;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class FireMasterEffectEndProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure FireMasterEffectEnd!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(PowerMod.FireStone_ITEM);
			_setstack.setCount((int) 1);
			if (entity.world.isClient()) {
				if (((PlayerEntity) entity).inventory.getEmptySlot() != -1) {
					((PlayerEntity) entity).inventory.main.add(((PlayerEntity) entity).inventory.getEmptySlot(), _setstack);
					((PlayerEntity) entity).inventory.markDirty();
				}
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4), "clear @s power:fire_helmet");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4),
						"clear @s power:fire_chestplate");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4), "clear @s power:fire_leggings");
			}
		}
		{
			Entity _ent = entity;
			if (!_ent.world.isClient()) {
				_ent.world.getServer().getCommandManager().execute(_ent.getCommandSource().withSilent().withLevel(4), "clear @s power:fire_boots");
			}
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity)
					.addStatusEffect(new StatusEffectInstance(PowerMod.RechargeFireStone_STATUS_EFFECT, (int) 6000, (int) 0, (false), (false)));
		PowerModVariables.fire = (boolean) (false);
		PowerModVariables.active = (boolean) (false);
	}
}
