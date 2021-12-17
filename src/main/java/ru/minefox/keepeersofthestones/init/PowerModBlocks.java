
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepeersofthestones.init;

import ru.minefox.keepeersofthestones.block.WoodStoneBoxBlock;
import ru.minefox.keepeersofthestones.block.VacuumWebBlockBlock;
import ru.minefox.keepeersofthestones.block.StoneStoneBoxBlock;
import ru.minefox.keepeersofthestones.block.SoundBarrierBlockBlock;
import ru.minefox.keepeersofthestones.block.MoonStonesBlockBlock;
import ru.minefox.keepeersofthestones.block.IronStoneBoxBlock;
import ru.minefox.keepeersofthestones.block.GoldStoneBoxBlock;
import ru.minefox.keepeersofthestones.block.EnergyBlockBlock;
import ru.minefox.keepeersofthestones.block.CrystalShieldBlockBlock;
import ru.minefox.keepeersofthestones.block.ClusterBlockBlock;
import ru.minefox.keepeersofthestones.block.BlackHoleBlockBlock;
import ru.minefox.keepeersofthestones.block.AndesiteStoneBoxBlock;

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
