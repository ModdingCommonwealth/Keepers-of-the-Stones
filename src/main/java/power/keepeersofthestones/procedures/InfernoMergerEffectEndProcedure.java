package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.RechargeFireStonePotionEffect;
import power.keepeersofthestones.potion.RechargeAirStonePotionEffect;
import power.keepeersofthestones.item.WindItem;
import power.keepeersofthestones.item.MagicFireballItem;
import power.keepeersofthestones.item.FireSwordItem;
import power.keepeersofthestones.item.FireStoneItem;
import power.keepeersofthestones.item.FireItem;
import power.keepeersofthestones.item.BurnItem;
import power.keepeersofthestones.item.AirStoneItem;
import power.keepeersofthestones.item.AirFlowItem;
import power.keepeersofthestones.item.AirBladeItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class InfernoMergerEffectEndProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure InfernoMergerEffectEnd!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(AirStoneItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(FireStoneItem.block);
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(BurnItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(MagicFireballItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(AirFlowItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(AirBladeItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(FireSwordItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(FireItem.helmet);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(WindItem.body);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(FireItem.legs);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(WindItem.boots);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
		if (!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false)) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.allowFlying = (false);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		}
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(RechargeFireStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(RechargeAirStonePotionEffect.potion, (int) 6000, (int) 0, (false), (false)));
		{
			boolean _setval = (false);
			entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.inferno_merger = _setval;
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
