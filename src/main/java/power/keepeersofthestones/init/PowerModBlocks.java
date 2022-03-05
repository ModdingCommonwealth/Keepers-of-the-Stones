
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.block.VacuumWebBlockBlock;
import power.keepeersofthestones.block.UnmultiplicationMoonStonesBlock;
import power.keepeersofthestones.block.TechnobarrierBlockBlock;
import power.keepeersofthestones.block.SoundBarrierBlockBlock;
import power.keepeersofthestones.block.MoonStonesBlockBlock;
import power.keepeersofthestones.block.EnergyBlockBlock;
import power.keepeersofthestones.block.CrystalShieldBlockBlock;
import power.keepeersofthestones.block.ClusterBlockBlock;
import power.keepeersofthestones.block.BlackHoleBlockBlock;
import power.keepeersofthestones.block.BatteryChargerBlock;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

public class PowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PowerMod.MODID);
	public static final RegistryObject<Block> BATTERY_CHARGER = REGISTRY.register("battery_charger", () -> new BatteryChargerBlock());
	public static final RegistryObject<Block> ENERGY_BLOCK = REGISTRY.register("energy_block", () -> new EnergyBlockBlock());
	public static final RegistryObject<Block> SOUND_BARRIER_BLOCK = REGISTRY.register("sound_barrier_block", () -> new SoundBarrierBlockBlock());
	public static final RegistryObject<Block> CLUSTER_BLOCK = REGISTRY.register("cluster_block", () -> new ClusterBlockBlock());
	public static final RegistryObject<Block> CRYSTAL_SHIELD_BLOCK = REGISTRY.register("crystal_shield_block", () -> new CrystalShieldBlockBlock());
	public static final RegistryObject<Block> VACUUM_WEB_BLOCK = REGISTRY.register("vacuum_web_block", () -> new VacuumWebBlockBlock());
	public static final RegistryObject<Block> MOON_STONES_BLOCK = REGISTRY.register("moon_stones_block", () -> new MoonStonesBlockBlock());
	public static final RegistryObject<Block> BLACK_HOLE_BLOCK = REGISTRY.register("black_hole_block", () -> new BlackHoleBlockBlock());
	public static final RegistryObject<Block> UNMULTIPLICATION_MOON_STONES_BLOCK = REGISTRY.register("unmultiplication_moon_stones_block",
			() -> new UnmultiplicationMoonStonesBlock());
	public static final RegistryObject<Block> TECHNOBARRIER_BLOCK = REGISTRY.register("technobarrier_block", () -> new TechnobarrierBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BatteryChargerBlock.registerRenderLayer();
			ClusterBlockBlock.registerRenderLayer();
			VacuumWebBlockBlock.registerRenderLayer();
			BlackHoleBlockBlock.registerRenderLayer();
			TechnobarrierBlockBlock.registerRenderLayer();
		}
	}
}
