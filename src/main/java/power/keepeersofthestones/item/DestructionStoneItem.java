
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.DestructionStoneUseProcedure;
import power.keepeersofthestones.itemgroup.GreatGroupItemGroup;
import power.keepeersofthestones.PowerModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

@PowerModElements.ModElement.Tag
public class DestructionStoneItem extends PowerModElements.ModElement {
	@ObjectHolder("power:destruction_stone")
	public static final Item block = null;

	public DestructionStoneItem(PowerModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(GreatGroupItemGroup.tab).maxDamage(1).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("destruction_stone");
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
		public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
			ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
			ItemStack itemstack = ar.getResult();
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			DestructionStoneUseProcedure.executeProcedure(Stream.of(new AbstractMap.SimpleEntry<>("entity", entity)).collect(HashMap::new,
					(_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
			return ar;
		}
	}
}
