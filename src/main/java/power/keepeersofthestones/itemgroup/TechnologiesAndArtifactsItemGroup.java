
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.item.BookOfElementsItem;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class TechnologiesAndArtifactsItemGroup extends PowerModElements.ModElement {
	public TechnologiesAndArtifactsItemGroup(PowerModElements instance) {
		super(instance, 703);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabtechnologies_and_artifacts") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BookOfElementsItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
