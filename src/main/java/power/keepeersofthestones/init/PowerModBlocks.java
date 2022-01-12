
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.block.WoodStoneBoxBlock;
import power.keepeersofthestones.block.VacuumWebBlockBlock;
import power.keepeersofthestones.block.UnmultiplicationMoonStonesBlock;
import power.keepeersofthestones.block.StoneStoneBoxBlock;
import power.keepeersofthestones.block.SoundBarrierBlockBlock;
import power.keepeersofthestones.block.MoonStonesBlockBlock;
import power.keepeersofthestones.block.IronStoneBoxBlock;
import power.keepeersofthestones.block.GoldStoneBoxBlock;
import power.keepeersofthestones.block.EnergyBlockBlock;
import power.keepeersofthestones.block.CrystalShieldBlockBlock;
import power.keepeersofthestones.block.ClusterBlockBlock;
import power.keepeersofthestones.block.BlackHoleBlockBlock;
import power.keepeersofthestones.block.AndesiteStoneBoxBlock;

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
	public static final Block WOOD_STONE_BOX = register(new WoodStoneBoxBlock());
	public static final Block STONE_STONE_BOX = register(new StoneStoneBoxBlock());
	public static final Block ANDESITE_STONE_BOX = register(new AndesiteStoneBoxBlock());
	public static final Block IRON_STONE_BOX = register(new IronStoneBoxBlock());
	public static final Block GOLD_STONE_BOX = register(new GoldStoneBoxBlock());
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
			WoodStoneBoxBlock.registerRenderLayer();
			StoneStoneBoxBlock.registerRenderLayer();
			AndesiteStoneBoxBlock.registerRenderLayer();
			IronStoneBoxBlock.registerRenderLayer();
			GoldStoneBoxBlock.registerRenderLayer();
			ClusterBlockBlock.registerRenderLayer();
			VacuumWebBlockBlock.registerRenderLayer();
			BlackHoleBlockBlock.registerRenderLayer();
		}
	}
}
