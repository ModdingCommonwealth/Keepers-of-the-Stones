package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModMobEffects;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class BloodStoneUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.BLOOD_STONE) {
			if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
				if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.RECHARGE_BLOOD_STONE) : false)) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.BLOOD_MASTER, 12000, 0, (false), (false)));
				}
			}
		}
	}
}
