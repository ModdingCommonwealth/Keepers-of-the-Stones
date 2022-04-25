
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.EmptyBatteryItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class BatteriesItemGroup extends PowerModElements.ModElement {
	public BatteriesItemGroup(PowerModElements instance) {
		super(instance, 564);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbatteries") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(EmptyBatteryItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
