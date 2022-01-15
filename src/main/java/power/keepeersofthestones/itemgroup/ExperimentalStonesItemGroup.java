
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.CosmosStoneItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class ExperimentalStonesItemGroup extends PowerModElements.ModElement {
	public ExperimentalStonesItemGroup(PowerModElements instance) {
		super(instance, 403);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabexperimental_stones") {
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
