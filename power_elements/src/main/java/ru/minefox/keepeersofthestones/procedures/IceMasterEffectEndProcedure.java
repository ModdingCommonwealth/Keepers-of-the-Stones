package ru.minefox.keepeersofthestones.procedures;

import ru.minefox.keepeersofthestones.network.PowerModVariables;
import ru.minefox.keepeersofthestones.init.PowerModMobEffects;
import ru.minefox.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class IceMasterEffectEndProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE);
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowerModItems.ICE_BALL);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowerModItems.ICE_SHIELD);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowerModItems.SNOW_GOLEM_CREATOR);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowerModItems.ICE_SHARP);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowerModItems.ICE_SPEAR);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowerModItems.ICE_HELMET);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowerModItems.ICE_CHESTPLATE);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowerModItems.ICE_LEGGINGS);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(PowerModItems.ICE_BOOTS);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
		if (entity instanceof LivingEntity _entity)
			_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_ICE_STONE, 6000, 0, (false), (false)));
		{
			boolean _setval = (boolean) (false);
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ice = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (boolean) (false);
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.active = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
