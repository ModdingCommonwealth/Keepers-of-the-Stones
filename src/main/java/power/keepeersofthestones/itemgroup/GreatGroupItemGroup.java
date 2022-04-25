
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.SpaceStoneItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class GreatGroupItemGroup extends PowerModElements.ModElement {
	public GreatGroupItemGroup(PowerModElements instance) {
		super(instance, 521);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabgreat_group") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SpaceStoneItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
