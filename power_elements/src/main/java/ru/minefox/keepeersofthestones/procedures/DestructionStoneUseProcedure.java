package ru.minefox.keepeersofthestones.procedures;

import ru.minefox.keepeersofthestones.network.PowerModVariables;
import ru.minefox.keepeersofthestones.init.PowerModMobEffects;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

public class DestructionStoneUseProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).active) {
			if (!(entity instanceof LivingEntity _livEnt ? _livEnt.hasEffect(PowerModMobEffects.RECHARGE_DESTRUCTION_STONE) : false)) {
				if (entity instanceof LivingEntity _entity)
					_entity.addEffect(new MobEffectInstance(PowerModMobEffects.DESTRUCTION_MASTER, 12000, 0, (false), (false)));
			}
		}
	}
}
