
package ru.minefox.keepeersofthestones.item;

import ru.minefox.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class CosmosStoneItem extends Item {
	public CosmosStoneItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_MAGICAL_STONE).durability(10).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("cosmos_stone");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
