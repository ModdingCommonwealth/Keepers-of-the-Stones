package power.keepeersofthestones.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class DestroyRocksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double enchant_levels = 0;
		ItemStack emeralds = ItemStack.EMPTY;
		ItemStack tool = ItemStack.EMPTY;
		if (entity.getXRot() > 40 || entity.getXRot() < -40) {
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z + 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) (z - 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z - 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) (z + 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
		} else if ((entity.getDirection()) == Direction.NORTH || (entity.getDirection()) == Direction.SOUTH) {
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) y, (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) (y + 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) (x - 1), (int) (y + 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) (x - 1), (int) (y + 1), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
		} else if ((entity.getDirection()) == Direction.WEST || (entity.getDirection()) == Direction.EAST) {
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z + 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) (z - 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z + 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) (z - 1))), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) (z - 1)), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y + 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y + 1), (int) z), false);
				}
			}
			if ((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)))
					.getMaterial() == net.minecraft.world.level.material.Material.STONE
					&& !((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.BEDROCK)) {
				if (world instanceof Level) {
					Block.dropResources(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)), (Level) world,
							new BlockPos((int) x, (int) y, (int) z));
					world.destroyBlock(new BlockPos((int) x, (int) (y - 1), (int) z), false);
				}
			}
		}
	}
}
