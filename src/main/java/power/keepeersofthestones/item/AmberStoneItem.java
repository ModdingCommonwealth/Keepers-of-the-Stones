
package power.keepeersofthestones.item;

import power.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class AmberStoneItem extends Item {
	public AmberStoneItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ADDITIONAL_GROUP).durability(10).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
