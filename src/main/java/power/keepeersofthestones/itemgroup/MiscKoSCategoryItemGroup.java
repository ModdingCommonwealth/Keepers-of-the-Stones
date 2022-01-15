
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.EmptyStoneItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class MiscKoSCategoryItemGroup extends PowerModElements.ModElement {
	public MiscKoSCategoryItemGroup(PowerModElements instance) {
		super(instance, 260);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmisc_ko_s_category") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EmptyStoneItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
