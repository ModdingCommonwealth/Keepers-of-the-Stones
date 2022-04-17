package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Iterator;

public class EnergyStaffUseProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
					.getItem() == PowerModItems.ENERGY_ABSORPTION.get()) {
				if (sourceentity instanceof Player _player)
					_player.getCooldowns().addCooldown(itemstack.getItem(), 800);
				if (!(sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).recharge_spell_energy) {
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.FIRE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.AIR_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.WATER_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.EARTH_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.ICE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.LIGHTNING_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.CRYSTAL_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.LAVA_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.RAIN_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.TORNADO_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.OCEAN_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.GREENERY_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.ANIMALS_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.METAL_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.LIGHT_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.SHADOW_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.SUN_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.MOON_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.CREATION_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.DESTRUCTION_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.FIRE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.FIRE_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.TECHNOLOGY_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.TELEPORTATION_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.EXPLOSION_MASTER.get());
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.AMBER_MASTER.get());
					if (sourceentity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.ENERGY_MASTER.get(), 24000, 0, (false), (false)));
					if (sourceentity instanceof LivingEntity _entity)
						_entity.removeEffect(PowerModMobEffects.RECHARGE_ENERGY_STONE.get());
					if (sourceentity instanceof Player _player) {
						ItemStack _stktoremove = new ItemStack(PowerModItems.ENERGY_STONE.get());
						_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
								_player.inventoryMenu.getCraftSlots());
					}
					if (sourceentity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("power:powerless"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemainingCriteria().iterator();
							while (_iterator.hasNext())
								_player.getAdvancements().award(_adv, (String) _iterator.next());
						}
					}
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(PowerModItems.ENERGY_ABSORPTION.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
				{
					boolean _setval = true;
					sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.recharge_spell_energy = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private LevelAccessor world;

					public void start(LevelAccessor world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						{
							boolean _setval = false;
							sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.recharge_spell_energy = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 800);
			}
		}
	}
}
