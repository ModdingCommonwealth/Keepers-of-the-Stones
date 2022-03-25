
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.FireStoneItem;
import power.keepeersofthestones.PowerModElements;

@PowerModElements.ModElement.Tag
public class BasicGroupItemGroup extends PowerModElements.ModElement {
	public BasicGroupItemGroup(PowerModElements instance) {
		super(instance, 518);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbasic_group") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(FireStoneItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
