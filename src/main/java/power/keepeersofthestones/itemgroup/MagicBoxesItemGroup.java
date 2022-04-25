
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.block.WoodMagicBoxBlock;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class MagicBoxesItemGroup extends PowerModElements.ModElement {
	public MagicBoxesItemGroup(PowerModElements instance) {
		super(instance, 748);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmagic_boxes") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(WoodMagicBoxBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
