package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.RechargeEarthStonePotionEffect;
import power.keepeersofthestones.potion.EarthMasterPotionEffect;
import power.keepeersofthestones.potion.CoalMergerPotionEffect;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.Collection;

public class EarthStoneUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure EarthStoneUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == RechargeEarthStonePotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(EarthMasterPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).active) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).fire) {
					if (entity instanceof LivingEntity)
						((LivingEntity) entity)
								.addPotionEffect(new EffectInstance(CoalMergerPotionEffect.potion, (int) 12000, (int) 0, (false), (false)));
				}
			}
		}
	}
}
