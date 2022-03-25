
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.IceStoneItem;
import power.keepeersofthestones.PowerModElements;

@PowerModElements.ModElement.Tag
public class AdditionalGroupItemGroup extends PowerModElements.ModElement {
	public AdditionalGroupItemGroup(PowerModElements instance) {
		super(instance, 519);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabadditional_group") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IceStoneItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
