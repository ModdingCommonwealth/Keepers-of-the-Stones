
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepersofthestones.init;

import ru.minefox.keepersofthestones.PowerMod;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class PowerModItems {
	public static Item FIRE_STONE;
	public static Item FIRE;
	public static Item BURN;
	public static Item FIRE_SWORD;

	public static void load() {
		FIRE_STONE = Registry.register(Registry.ITEM, new ResourceLocation(PowerMod.MODID, "fire_stone"), new FireStoneItem());
		FIRE = Registry.register(Registry.ITEM, new ResourceLocation(PowerMod.MODID, "fire"), new FireItem());
		BURN = Registry.register(Registry.ITEM, new ResourceLocation(PowerMod.MODID, "burn"), new BurnItem());
		FIRE_SWORD = Registry.register(Registry.ITEM, new ResourceLocation(PowerMod.MODID, "fire_sword"), new FireSwordItem());
	}
}
