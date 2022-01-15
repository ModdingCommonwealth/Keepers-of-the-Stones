package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.WaterMasterPotionEffect;
import power.keepeersofthestones.potion.UnelementalMasterPotionEffect;
import power.keepeersofthestones.potion.TornadoMasterPotionEffect;
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
import power.keepeersofthestones.potion.GeyserMergerPotionEffect;
import power.keepeersofthestones.potion.FireMasterPotionEffect;
import power.keepeersofthestones.potion.EnergyMasterPotionEffect;
import power.keepeersofthestones.potion.EarthMasterPotionEffect;
import power.keepeersofthestones.potion.DestructionMasterPotionEffect;
import power.keepeersofthestones.potion.CrystalMasterPotionEffect;
import power.keepeersofthestones.potion.CreationMasterPotionEffect;
import power.keepeersofthestones.potion.CoalMergerPotionEffect;
import power.keepeersofthestones.potion.AnimalsMasterPotionEffect;
import power.keepeersofthestones.potion.AirMasterPotionEffect;
import power.keepeersofthestones.item.EnergyStoneItem;
import power.keepeersofthestones.item.EnergyStaffItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.Map;

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
					.getItem() == EnergyStaffItem.block) {
				if (world.isRemote()) {
					Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
				}
				{
					Entity _ent = sourceentity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
								"item replace entity @s weapon.mainhand with air");
					}
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(UnelementalMasterPotionEffect.potion);
				}
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
					((LivingEntity) entity).removePotionEffect(FireMasterPotionEffect.potion);
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
					((LivingEntity) entity).removePotionEffect(FireMasterPotionEffect.potion);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(GreeneryMasterPotionEffect.potion);
				}
				if (entity instanceof LivingEntity) {
					((LivingEntity) entity).removePotionEffect(GeyserMergerPotionEffect.potion);
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
					((LivingEntity) entity).removePotionEffect(CoalMergerPotionEffect.potion);
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
				if (sourceentity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(EnergyStaffItem.block);
					((PlayerEntity) sourceentity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) sourceentity).container.func_234641_j_());
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
						if ((sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
								.orElse(new PowerModVariables.PlayerVariables())).active) {
							if (!((sourceentity instanceof PlayerEntity)
									? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(EnergyStaffItem.block))
									: false)) {
								{
									Entity _ent = sourceentity;
									if (!_ent.world.isRemote && _ent.world.getServer() != null) {
										_ent.world.getServer().getCommandManager().handleCommand(
												_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
												"give @s power:energy_staff{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
							}
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 400);
			}
		}
	}
}
