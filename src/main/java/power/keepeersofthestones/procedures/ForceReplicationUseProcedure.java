package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.WaterMasterPotionEffect;
import power.keepeersofthestones.potion.VacuumMasterPotionEffect;
import power.keepeersofthestones.potion.TornadoMasterPotionEffect;
import power.keepeersofthestones.potion.TimeMasterEffectPotionEffect;
import power.keepeersofthestones.potion.TeleportationMasterPotionEffect;
import power.keepeersofthestones.potion.TechnologyMasterPotionEffect;
import power.keepeersofthestones.potion.SunMasterPotionEffect;
import power.keepeersofthestones.potion.SoundMasterPotionEffect;
import power.keepeersofthestones.potion.ShadowMasterPotionEffect;
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
import power.keepeersofthestones.potion.CosmosMasterPotionEffect;
import power.keepeersofthestones.potion.BloodMasterPotionEffect;
import power.keepeersofthestones.potion.AnimalsMasterPotionEffect;
import power.keepeersofthestones.potion.AirMasterPotionEffect;
import power.keepeersofthestones.item.ForcereplicationItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

public class ForceReplicationUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure ForceReplicationUse!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				PowerMod.LOGGER.warn("Failed to load dependency sourceentity for procedure ForceReplicationUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == FireMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(FireMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AirMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(AirMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == WaterMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(WaterMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == EarthMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(EarthMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == EnergyMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(EnergyMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == IceMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(IceMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == LightningMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(LightningMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == SoundMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(SoundMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == CrystalMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(CrystalMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == LavaMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(LavaMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == RainMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(RainMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == TornadoMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(TornadoMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == OceanMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(OceanMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == GreeneryMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(GreeneryMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AnimalsMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(AnimalsMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == MetalMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(MetalMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == LightMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(LightMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == ShadowMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(ShadowMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == VacuumMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(VacuumMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == SunMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(SunMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == MoonMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(MoonMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == CosmosMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(CosmosMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == BloodMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(BloodMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == TechnologyMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(TechnologyMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == TimeMasterEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(TimeMasterEffectPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == TeleportationMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(TeleportationMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == ExplosionMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(ExplosionMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == CreationMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(CreationMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == DestructionMasterPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity)) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity)
						.addPotionEffect(new EffectInstance(DestructionMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
		}
		if (!((sourceentity instanceof PlayerEntity)
				? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(ForcereplicationItem.block))
				: false)) {
			{
				Entity _ent = sourceentity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"give @s power:force_replication{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
				}
			}
			{
				boolean _setval = (true);
				entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.copy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
