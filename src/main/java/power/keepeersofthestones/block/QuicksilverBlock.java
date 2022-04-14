
package power.keepeersofthestones.block;

import power.keepeersofthestones.init.PowerModFluids;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class QuicksilverBlock extends LiquidBlock {
	public QuicksilverBlock() {
		super(() -> (FlowingFluid) PowerModFluids.QUICKSILVER.get(), BlockBehaviour.Properties.of(Material.WATER, MaterialColor.CLAY).strength(5000f)

		);
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
