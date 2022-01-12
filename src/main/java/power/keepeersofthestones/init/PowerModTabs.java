
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class PowerModTabs {
	public static CreativeModeTab TAB_MAGICAL_STONE;
	public static CreativeModeTab TAB_MAGICAL_STONE_BOXES;
	public static CreativeModeTab TAB_MISC_KO_S_CATEGORY;
	public static CreativeModeTab TAB_EXPERIMENTAL_STONES;

	public static void load() {
		TAB_MAGICAL_STONE = new CreativeModeTab("tabmagical_stone") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.FIRE_STONE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MAGICAL_STONE_BOXES = new CreativeModeTab("tabmagical_stone_boxes") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModBlocks.GOLD_STONE_BOX);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MISC_KO_S_CATEGORY = new CreativeModeTab("tabmisc_ko_s_category") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.EMPTY_STONE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_EXPERIMENTAL_STONES = new CreativeModeTab("tabexperimental_stones") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(PowerModItems.COSMOS_STONE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
