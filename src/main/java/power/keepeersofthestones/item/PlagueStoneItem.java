
package power.keepeersofthestones.item;

import power.keepeersofthestones.itemgroup.AdditionalGroupItemGroup;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

@PowerModElements.ModElement.Tag
public class PlagueStoneItem extends PowerModElements.ModElement {
	@ObjectHolder("power:plague_stone")
	public static final Item block = null;

	public PlagueStoneItem(PowerModElements instance) {
		super(instance, 31);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AdditionalGroupItemGroup.tab).maxDamage(10).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("plague_stone");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0F;
		}
	}
}
