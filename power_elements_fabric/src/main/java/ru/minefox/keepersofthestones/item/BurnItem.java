
package ru.minefox.keepersofthestones.item;

import net.minecraft.util.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class BurnItem extends Item {
	public BurnItem() {
		super(new FabricItemSettings().group(null).maxCount(1).fireproof().rarity(Rarity.COMMON));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (0F);
	}

	@Override
	public int getEnchantability() {
		return 0;
	}
}
