package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModBlocks;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MultiplicationMoonstoneBlockToTicksProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.5) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PowerModBlocks.MOON_STONES_BLOCK.get()) {
						world.setBlock(new BlockPos(x, y, z), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y + 1, z), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + 1, y, z + 1), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y, z + 1), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + 1, y, z), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x - 1, y, z - 1), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y, z - 1), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x - 1, y, z), PowerModBlocks.MOON_STONES_BLOCK.get().defaultBlockState(), 3);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 400);
		} else if (Math.random() > 0.5) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PowerModBlocks.MOON_STONES_BLOCK.get()) {
						world.setBlock(new BlockPos(x, y, z), PowerModBlocks.UNMULTIPLICATION_MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y + 1, z), PowerModBlocks.UNMULTIPLICATION_MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + 1, y, z + 1), PowerModBlocks.UNMULTIPLICATION_MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y, z + 1), PowerModBlocks.UNMULTIPLICATION_MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x + 1, y, z), PowerModBlocks.UNMULTIPLICATION_MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x - 1, y, z - 1), PowerModBlocks.UNMULTIPLICATION_MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x, y, z - 1), PowerModBlocks.UNMULTIPLICATION_MOON_STONES_BLOCK.get().defaultBlockState(), 3);
						world.setBlock(new BlockPos(x - 1, y, z), PowerModBlocks.UNMULTIPLICATION_MOON_STONES_BLOCK.get().defaultBlockState(), 3);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 400);
		}
	}
}
