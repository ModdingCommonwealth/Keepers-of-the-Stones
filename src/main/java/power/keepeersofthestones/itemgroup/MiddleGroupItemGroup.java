
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.GreeneryStoneItem;
import power.keepeersofthestones.PowerModElements;

@PowerModElements.ModElement.Tag
public class MiddleGroupItemGroup extends PowerModElements.ModElement {
	public MiddleGroupItemGroup(PowerModElements instance) {
		super(instance, 520);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmiddle_group") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GreeneryStoneItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
