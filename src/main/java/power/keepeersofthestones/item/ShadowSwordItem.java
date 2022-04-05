
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@PowerModElements.ModElement.Tag
public class ShadowSwordItem extends PowerModElements.ModElement {
	@ObjectHolder("power:shadow_sword")
	public static final Item block = null;

	public ShadowSwordItem(PowerModElements instance) {
		super(instance, 325);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 9f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("shadow_sword"));
	}
}
