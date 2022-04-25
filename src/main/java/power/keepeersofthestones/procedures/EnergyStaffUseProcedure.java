package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.WaterMasterPotionEffect;
import power.keepeersofthestones.potion.TornadoMasterPotionEffect;
import power.keepeersofthestones.potion.TeleportationMasterPotionEffect;
import power.keepeersofthestones.potion.TechnologyMasterPotionEffect;
import power.keepeersofthestones.potion.SunMasterPotionEffect;
import power.keepeersofthestones.potion.ShadowMasterPotionEffect;
import power.keepeersofthestones.potion.RechargeEnergyStonePotionEffect;
import power.keepeersofthestones.potion.RainMasterPotionEffect;
import power.keepeersofthestones.potion.OceanMasterPotionEffect;
import power.keepeersofthestones.potion.MoonMasterPotionEffect;
import power.keepeersofthestones.potion.MetalMasterPotionEffect;
import power.keepeersofthestones.potion.LightningMasterPotionEffect;
import power.keepeersofthestones.potion.LightMasterPotionEffect;
import power.keepeersofthestones.potion.LavaMasterPotionEffect;
import power.keepeersofthestones.potion.IceMasterPotionEffect;
import power.keepeersofthestones.potion.GreeneryMasterPotionEffect;
import power.keepeersofthestones.potion.FireMasterPotionEffect;
import power.keepeersofthestones.potion.ExplosionMasterPotionEffect;
import power.keepeersofthestones.potion.EnergyMasterPotionEffect;
import power.keepeersofthestones.potion.EarthMasterPotionEffect;
import power.keepeersofthestones.potion.DestructionMasterPotionEffect;
import power.keepeersofthestones.potion.CrystalMasterPotionEffect;
import power.keepeersofthestones.potion.CreationMasterPotionEffect;
import power.keepeersofthestones.potion.AnimalsMasterPotionEffect;
import power.keepeersofthestones.potion.AmberMasterPotionEffect;
import power.keepeersofthestones.potion.AirMasterPotionEffect;
import power.keepeersofthestones.item.EnergyStoneItem;
import power.keepeersofthestones.item.EnergyAbsorptionItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import java.util.Map;
import java.util.Iterator;

public class EnergyStaffUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure EnergyStaffUse!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure EnergyStaffUse!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				PowerMod.LOGGER.warn("Failed to load dependency sourceentity for procedure EnergyStaffUse!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PowerMod.LOGGER.warn("Failed to load dependency itemstack for procedure EnergyStaffUse!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
			if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == EnergyAbsorptionItem.block) {
				if (sourceentity instanceof PlayerEntity)
					((PlayerEntity) sourceentity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 800);
				if (!(sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).recharge_spell_energy) {
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(FireMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(AirMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(WaterMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(EarthMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(IceMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(LightningMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(CrystalMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(LavaMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(RainMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(TornadoMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(OceanMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(GreeneryMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(AnimalsMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(MetalMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(LightMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(ShadowMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(SunMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(MoonMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(CreationMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(DestructionMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(FireMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(FireMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(TechnologyMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(TeleportationMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(ExplosionMasterPotionEffect.potion);
					}
					if (entity instanceof LivingEntity) {
						((LivingEntity) entity).removePotionEffect(AmberMasterPotionEffect.potion);
					}
					if (sourceentity instanceof LivingEntity)
						((LivingEntity) sourceentity)
								.addPotionEffect(new EffectInstance(EnergyMasterPotionEffect.potion, (int) 24000, (int) 0, (false), (false)));
					if (sourceentity instanceof LivingEntity) {
						((LivingEntity) sourceentity).removePotionEffect(RechargeEnergyStonePotionEffect.potion);
					}
					if (sourceentity instanceof PlayerEntity) {
						ItemStack _stktoremove = new ItemStack(EnergyStoneItem.block);
						((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
								((PlayerEntity) sourceentity).container.func_234641_j_());
					}
					if (sourceentity instanceof ServerPlayerEntity) {
						Advancement _adv = ((MinecraftServer) ((ServerPlayerEntity) sourceentity).server).getAdvancementManager()
								.getAdvancement(new ResourceLocation("power:powerless"));
						AdvancementProgress _ap = ((ServerPlayerEntity) sourceentity).getAdvancements().getProgress(_adv);
						if (!_ap.isDone()) {
							Iterator _iterator = _ap.getRemaningCriteria().iterator();
							while (_iterator.hasNext()) {
								String _criterion = (String) _iterator.next();
								((ServerPlayerEntity) sourceentity).getAdvancements().grantCriterion(_adv, _criterion);
							}
						}
					}
					if (entity instanceof PlayerEntity) {
						ItemStack _setstack = new ItemStack(EnergyAbsorptionItem.block);
						_setstack.setCount((int) 1);
						ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
					}
				}
				{
					boolean _setval = (true);
					sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.recharge_spell_energy = _setval;
						capability.syncPlayerVariables(sourceentity);
					});
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;

					public void start(IWorld world, int waitTicks) {
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
							boolean _setval = (false);
							sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.recharge_spell_energy = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 800);
			}
		}
	}
}
