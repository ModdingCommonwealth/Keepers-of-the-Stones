package ru.minefox.keepeersofthestones.procedures;

import ru.minefox.keepeersofthestones.network.PowerModVariables;
import ru.minefox.keepeersofthestones.init.PowerModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class FireStoneUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.RECHARGE_FIRE_STONE) : false)) {
			if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.FIRE_MASTER, 12000, 0, (false), (false)));
			} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).active) {
				if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).air) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.INFERNO_MERGER, 12000, 0, (false), (false)));
				} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
						.orElse(new PowerModVariables.PlayerVariables())).water) {
					if (entity instanceof LivingEntity _entity)
						_entity.addEffect(new MobEffectInstance(PowerModMobEffects.GEYSER_MERGER, 12000, 0, (false), (false)));
				}
			}
		}
	}
}
