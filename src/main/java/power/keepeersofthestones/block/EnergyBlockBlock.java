
package power.keepeersofthestones.block;

import power.keepeersofthestones.PowerModElements;

import net.minecraft.block.material.Material;

import java.util.List;
import java.util.Collections;

@PowerModElements.ModElement.Tag
public class EnergyBlockBlock extends PowerModElements.ModElement {
	@ObjectHolder("power:energy_block")
	public static final Block block = null;

	public EnergyBlockBlock(PowerModElements instance) {
		super(instance, 90);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.GLASS).sound(SoundType.GLASS).hardnessAndResistance(3f, 100f).setLightLevel(s -> 0)
					.slipperiness(0.9f));
			setRegistryName("energy_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 2;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(Blocks.AIR));
		}
	}
}
