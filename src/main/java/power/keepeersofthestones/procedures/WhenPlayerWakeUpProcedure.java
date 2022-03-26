package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModMobEffects;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class WhenPlayerWakeUpProcedure {
	@SubscribeEvent
	public static void onEntityEndSleep(PlayerWakeUpEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_FIRE_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_AIR_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_WATER_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_EARTH_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_ENERGY_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_ICE_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_LIGHTNING_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SOUND_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_CRYSTAL_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_LAVA_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_RAIN_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_TORNADO_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_OCEAN_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_GREENERY_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_ANIMALS_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_METAL_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_LIGHT_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SHADOW_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_VACUUM_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_SUN_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_MOON_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_CREATION_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_DESTRUCTION_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_COSMOS_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_BLOOD_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_TECHNOLOGY_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_TIME_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_TELEPORTATION_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_EXPLOSION_STONE.get());
		if (entity instanceof LivingEntity _entity)
			_entity.removeEffect(PowerModMobEffects.RECHARGE_AMBER_STONE.get());
	}
}
