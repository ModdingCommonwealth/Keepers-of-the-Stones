
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

@PowerModElements.ModElement.Tag
public class FistofEarthItem extends PowerModElements.ModElement {
	@ObjectHolder("power:fistof_earth")
	public static final Item block = null;

	public FistofEarthItem(PowerModElements instance) {
		super(instance, 74);
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
				return 10f;
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
		}, 3, -3.8f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("fistof_earth"));
	}
}
