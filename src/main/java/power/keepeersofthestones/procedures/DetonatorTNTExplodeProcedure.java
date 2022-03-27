package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModBlocks;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.core.BlockPos;

public class DetonatorTNTExplodeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
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
				if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == PowerModBlocks.DETONATOR_TNT.get()) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, 3, Explosion.BlockInteraction.BREAK);
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, 200);
	}
}
