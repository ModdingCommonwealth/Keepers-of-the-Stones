
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepersofthestones.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public class PowerModTabs {
	public static CreativeModeTab TAB_MAGIC_STONES;

	public static void load() {
		TAB_MAGIC_STONES = FabricItemGroupBuilder.create(new ResourceLocation("power", "magic_stones"))
				.icon(() -> new ItemStack(PowerModItems.FIRE_STONE)).build();
	}
}
