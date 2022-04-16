package power.keepeersofthestones.procedures;

import power.keepeersofthestones.block.UnmultiplicationMoonStonesBlock;
import power.keepeersofthestones.block.MoonStonesBlockBlock;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

public class MultiplicationMoonstoneBlockToTicksProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure MultiplicationMoonstoneBlockToTicks!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PowerMod.LOGGER.warn("Failed to load dependency x for procedure MultiplicationMoonstoneBlockToTicks!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PowerMod.LOGGER.warn("Failed to load dependency y for procedure MultiplicationMoonstoneBlockToTicks!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PowerMod.LOGGER.warn("Failed to load dependency z for procedure MultiplicationMoonstoneBlockToTicks!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (Math.random() < 0.5) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;

				public void start(IWorld world, int waitTicks) {
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
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MoonStonesBlockBlock.block) {
						world.setBlockState(new BlockPos(x, y, z), MoonStonesBlockBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x, y + 1, z), MoonStonesBlockBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x + 1, y, z + 1), MoonStonesBlockBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x, y, z + 1), MoonStonesBlockBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x + 1, y, z), MoonStonesBlockBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x - 1, y, z - 1), MoonStonesBlockBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x, y, z - 1), MoonStonesBlockBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x - 1, y, z), MoonStonesBlockBlock.block.getDefaultState(), 3);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 400);
		} else if (Math.random() > 0.5) {
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;

				public void start(IWorld world, int waitTicks) {
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
					if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == MoonStonesBlockBlock.block) {
						world.setBlockState(new BlockPos(x, y, z), UnmultiplicationMoonStonesBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x, y + 1, z), UnmultiplicationMoonStonesBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x + 1, y, z + 1), UnmultiplicationMoonStonesBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x, y, z + 1), UnmultiplicationMoonStonesBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x + 1, y, z), UnmultiplicationMoonStonesBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x - 1, y, z - 1), UnmultiplicationMoonStonesBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x, y, z - 1), UnmultiplicationMoonStonesBlock.block.getDefaultState(), 3);
						world.setBlockState(new BlockPos(x - 1, y, z), UnmultiplicationMoonStonesBlock.block.getDefaultState(), 3);
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 400);
		}
	}
}
