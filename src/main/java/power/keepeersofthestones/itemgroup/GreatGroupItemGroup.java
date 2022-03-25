
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.CosmosStoneItem;
import power.keepeersofthestones.PowerModElements;

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
				return new ItemStack(CosmosStoneItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
