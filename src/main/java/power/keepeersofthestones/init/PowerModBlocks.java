
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.block.VacuumWebBlockBlock;
import power.keepeersofthestones.block.TechnobarrierBlockBlock;
import power.keepeersofthestones.block.OrangePortalBlock;
import power.keepeersofthestones.block.MoonStonesBlockBlock;
import power.keepeersofthestones.block.EnergyBlockBlock;
import power.keepeersofthestones.block.DetonatorTNTBlock;
import power.keepeersofthestones.block.ClusterBlockBlock;
import power.keepeersofthestones.block.BluePortalBlock;
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
	public static final RegistryObject<Block> ACUSTICAL_EXPLODE = REGISTRY.register("acustical_explode", () -> new AcusticalExplodeBlock());
	public static final RegistryObject<Block> CRYSTAL_SHARP_ON_BLOCK = REGISTRY.register("crystal_sharp_on_block",
			() -> new CrystalSharpOnBlockBlock());
	public static final RegistryObject<Block> CLUSTER_BLOCK = REGISTRY.register("cluster_block", () -> new ClusterBlockBlock());
	public static final RegistryObject<Block> VACUUM_WEB_BLOCK = REGISTRY.register("vacuum_web_block", () -> new VacuumWebBlockBlock());
	public static final RegistryObject<Block> MOON_STONES_BLOCK = REGISTRY.register("moon_stones_block", () -> new MoonStonesBlockBlock());
	public static final RegistryObject<Block> BLACK_HOLE_BLOCK = REGISTRY.register("black_hole_block", () -> new BlackHoleBlockBlock());
	public static final RegistryObject<Block> GETTINGSTONESWHENENTERINGTHEGAME = REGISTRY.register("gettingStonesWhenEnteringTheGame",
			() -> new GettingStonesWhenEnteringTheGameBlock());
	public static final RegistryObject<Block> TECHNOBARRIER_BLOCK = REGISTRY.register("technobarrier_block", () -> new TechnobarrierBlockBlock());
	public static final RegistryObject<Block> BLUE_PORTAL = REGISTRY.register("blue_portal", () -> new BluePortalBlock());
	public static final RegistryObject<Block> ORANGE_PORTAL = REGISTRY.register("orange_portal", () -> new OrangePortalBlock());
	public static final RegistryObject<Block> DETONATOR_TNT = REGISTRY.register("detonator_tnt", () -> new DetonatorTNTBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			BatteryChargerBlock.registerRenderLayer();
			ClusterBlockBlock.registerRenderLayer();
			VacuumWebBlockBlock.registerRenderLayer();
			BlackHoleBlockBlock.registerRenderLayer();
			TechnobarrierBlockBlock.registerRenderLayer();
			BluePortalBlock.registerRenderLayer();
			OrangePortalBlock.registerRenderLayer();
		}
	}
}
