
package power.keepeersofthestones.block;

import power.keepeersofthestones.PowerModElements;

import net.minecraft.block.material.Material;

import java.util.List;
import java.util.Collections;

@PowerModElements.ModElement.Tag
public class CrystalShieldBlockBlock extends PowerModElements.ModElement {
	@ObjectHolder("power:crystal_shield_block")
	public static final Block block = null;

	public CrystalShieldBlockBlock(PowerModElements instance) {
		super(instance, 146);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(null)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));
			setRegistryName("crystal_shield_block");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
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
