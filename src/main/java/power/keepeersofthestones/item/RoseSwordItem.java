
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

@PowerModElements.ModElement.Tag
public class RoseSwordItem extends PowerModElements.ModElement {
	@ObjectHolder("power:rose_sword")
	public static final Item block = null;

	public RoseSwordItem(PowerModElements instance) {
		super(instance, 225);
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
		}, 3, -2.4f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("rose_sword"));
	}
}
