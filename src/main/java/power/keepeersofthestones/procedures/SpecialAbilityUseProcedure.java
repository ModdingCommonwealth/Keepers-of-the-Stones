package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.FireFlyingPotionEffect;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import java.util.Map;

public class SpecialAbilityUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure SpecialAbilityUse!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).fire) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(FireFlyingPotionEffect.potion, (int) 20, (int) 1, (false), (false)));
		}
	}
}
