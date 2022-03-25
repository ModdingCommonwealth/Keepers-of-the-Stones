
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

@PowerModElements.ModElement.Tag
public class OceanSwordItem extends PowerModElements.ModElement {
	@ObjectHolder("power:ocean_sword")
	public static final Item block = null;

	public OceanSwordItem(PowerModElements instance) {
		super(instance, 194);
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
				return 7f;
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
		}, 3, -3f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("ocean_sword"));
	}
}
