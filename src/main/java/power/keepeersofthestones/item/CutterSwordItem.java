
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@PowerModElements.ModElement.Tag
public class CutterSwordItem extends PowerModElements.ModElement {
	@ObjectHolder("power:cutter_sword")
	public static final Item block = null;

	public CutterSwordItem(PowerModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 24f;
			}

			public float getAttackDamage() {
				return 17f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.8f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("cutter_sword"));
	}
}
