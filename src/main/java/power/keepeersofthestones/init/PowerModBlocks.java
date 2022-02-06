
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.block.VacuumWebBlockBlock;
import power.keepeersofthestones.block.UnmultiplicationMoonStonesBlock;
import power.keepeersofthestones.block.SoundBarrierBlockBlock;
import power.keepeersofthestones.block.MoonStonesBlockBlock;
import power.keepeersofthestones.block.EnergyBlockBlock;
import power.keepeersofthestones.block.CrystalShieldBlockBlock;
import power.keepeersofthestones.block.ClusterBlockBlock;
import power.keepeersofthestones.block.BlackHoleBlockBlock;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block ENERGY_BLOCK = register(new EnergyBlockBlock());
	public static final Block SOUND_BARRIER_BLOCK = register(new SoundBarrierBlockBlock());
	public static final Block CLUSTER_BLOCK = register(new ClusterBlockBlock());
	public static final Block CRYSTAL_SHIELD_BLOCK = register(new CrystalShieldBlockBlock());
	public static final Block VACUUM_WEB_BLOCK = register(new VacuumWebBlockBlock());
	public static final Block MOON_STONES_BLOCK = register(new MoonStonesBlockBlock());
	public static final Block BLACK_HOLE_BLOCK = register(new BlackHoleBlockBlock());
	public static final Block UNMULTIPLICATION_MOON_STONES_BLOCK = register(new UnmultiplicationMoonStonesBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ClusterBlockBlock.registerRenderLayer();
			VacuumWebBlockBlock.registerRenderLayer();
			BlackHoleBlockBlock.registerRenderLayer();
		}
	}
}
