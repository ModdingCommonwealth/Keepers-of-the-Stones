
package power.keepeersofthestones.item;

import power.keepeersofthestones.PowerModElements;

@PowerModElements.ModElement.Tag
public class TimeBladeItem extends PowerModElements.ModElement {
	@ObjectHolder("power:time_blade")
	public static final Item block = null;

	public TimeBladeItem(PowerModElements instance) {
		super(instance, 502);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(null).isImmuneToFire()) {
		}.setRegistryName("time_blade"));
	}
}
