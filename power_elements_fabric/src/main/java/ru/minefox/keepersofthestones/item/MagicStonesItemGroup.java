
package ru.minefox.keepersofthestones.item;

import ru.minefox.keepersofthestones.PowerMod;

import net.minecraft.util.Identifier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

public final class MagicStonesItemGroup {
	public static ItemGroup get() {
		return ITEM_GROUP;
	}

	private static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.create(new Identifier("power", "magic_stones")).icon(() -> {
		return new ItemStack(PowerMod.FireStone_ITEM);
	}).build();
}
