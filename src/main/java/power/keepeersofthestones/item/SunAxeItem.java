
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

@PowerModElements.ModElement.Tag
public class SunAxeItem extends PowerModElements.ModElement {
	@ObjectHolder("power:sun_axe")
	public static final Item block = null;

	public SunAxeItem(PowerModElements instance) {
		super(instance, 351);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 8f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(null)) {
		}.setRegistryName("sun_axe"));
	}
}
