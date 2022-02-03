package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class RespawnPlayerProcedure {
	@SubscribeEvent
	public static void onPlayerRespawned(PlayerEvent.PlayerRespawnEvent event) {
		execute(event, event.getPlayer());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).fire) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.fire = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_FIRE_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).air) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.air = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_AIR_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).water) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.water = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_WATER_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).earth) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.earth = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_EARTH_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).energy) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.energy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.ENERGY_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_ENERGY_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).ice) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ice = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.ICE_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_ICE_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).lightning) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lightning = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.LIGHTNING_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_LIGHTNING_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).sound) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.sound = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.SOUND_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_SOUND_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).crystal) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.crystal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.CRYSTAL_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_CRYSTAL_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).lava) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.lava = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.LAVA_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_LAVA_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).rain) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.rain = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.RAIN_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_RAIN_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).tornado) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.tornado = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.TORNADO_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_TORNADO_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).ocean) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ocean = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.OCEAN_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_OCEAN_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).greenery) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.greenery = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.GREENERY_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_GREENERY_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).animals) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.animals = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.ANIMALS_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FIRE_MASTER, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).metal) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.metal = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.METAL_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_METAL_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).light) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.light = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.LIGHT_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_LIGHT_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).shadow) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.shadow = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.SHADOW_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_SHADOW_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).vacuum) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.vacuum = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.VACUUM_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_VACUUM_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).moon) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.moon = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.MOON_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_MOON_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).sun) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.sun = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.SUN_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_SUN_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).creation) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.creation = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.CREATION_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_CREATION_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).destruction) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.destruction = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.DESTRUCTION_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_DESTRUCTION_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).inferno_merger) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.inferno_merger = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.AIR_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_FIRE_STONE, 6000, 0, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_AIR_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).geyser_merger) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.geyser_merger = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_FIRE_STONE, 6000, 0, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_WATER_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).cosmos) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cosmos = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.COSMOS_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_COSMOS_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).blood) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.blood = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.BLOOD_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_BLOOD_STONE, 6000, 0, (false), (false)));
		} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new PowerModVariables.PlayerVariables())).coal_merger) {
			{
				boolean _setval = false;
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.coal_merger = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.FIRE_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_FIRE_STONE, 6000, 0, (false), (false)));
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(PowerModMobEffects.RECHARGE_EARTH_STONE, 6000, 0, (false), (false)));
		}
	}
}
