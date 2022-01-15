package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.RechargeMoonStonePotionEffect;
import power.keepeersofthestones.item.MoonWitherItem;
import power.keepeersofthestones.item.MoonStonesItem;
import power.keepeersofthestones.item.MoonStoneItem;
import power.keepeersofthestones.item.MoonAxeItem;
import power.keepeersofthestones.item.EclipseItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class MoonMasterEffectEndProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure MoonMasterEffectEnd!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(MoonStoneItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(MoonAxeItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(MoonStonesItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(EclipseItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(MoonWitherItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(Items.NETHERITE_HELMET);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(Items.NETHERITE_CHESTPLATE);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(Items.NETHERITE_LEGGINGS);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(Items.NETHERITE_BOOTS);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(RechargeMoonStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
		{
			boolean _setval = (false);
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.moon = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			boolean _setval = (false);
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.active = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
