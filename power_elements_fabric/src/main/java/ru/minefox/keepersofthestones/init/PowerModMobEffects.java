
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepersofthestones.init;

import ru.minefox.keepersofthestones.potion.RechargeFireStoneMobEffect;
import ru.minefox.keepersofthestones.potion.FireMasterMobEffect;
import ru.minefox.keepersofthestones.PowerMod;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PowerModMobEffects {
	public static MobEffect RECHARGE_FIRE_STONE = new RechargeFireStoneMobEffect();
	public static MobEffect FIRE_MASTER = new FireMasterMobEffect();
	static {
		Registry.register(Registry.MOB_EFFECT, new ResourceLocation(PowerMod.MODID, "recharge_fire_stone"), RECHARGE_FIRE_STONE);
		Registry.register(Registry.MOB_EFFECT, new ResourceLocation(PowerMod.MODID, "fire_master"), FIRE_MASTER);
	}
}
