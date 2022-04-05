
package power.keepeersofthestones.item;

import power.keepeersofthestones.itemgroup.BatteriesItemGroup;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

@PowerModElements.ModElement.Tag
public class EmptyBatteryItem extends PowerModElements.ModElement {
	@ObjectHolder("power:empty_battery")
	public static final Item block = null;

	public EmptyBatteryItem(PowerModElements instance) {
		super(instance, 50);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(BatteriesItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("empty_battery");
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

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Empty"));
		}
	}
}
