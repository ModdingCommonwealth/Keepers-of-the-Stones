
package power.keepeersofthestones.itemgroup;

import power.keepeersofthestones.block.GoldStoneBoxBlock;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@PowerModElements.ModElement.Tag
public class MagicalStoneBoxesItemGroup extends PowerModElements.ModElement {
	public MagicalStoneBoxesItemGroup(PowerModElements instance) {
		super(instance, 173);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabmagical_stone_boxes") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(GoldStoneBoxBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
