
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

@PowerModElements.ModElement.Tag
public class CrystalDaggerItem extends PowerModElements.ModElement {
	@ObjectHolder("power:crystal_dagger")
	public static final Item block = null;

	public CrystalDaggerItem(PowerModElements instance) {
		super(instance, 208);
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
				return 5f;
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
		}, 3, -2f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("crystal_dagger"));
	}
}
