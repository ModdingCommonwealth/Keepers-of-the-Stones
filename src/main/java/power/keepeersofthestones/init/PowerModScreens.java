
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.client.gui.SpawnAnimalsGUIScreen;
import power.keepeersofthestones.client.gui.SpaceAtlasGUIScreen;
import power.keepeersofthestones.client.gui.SoundEmitateChoiceScreen;
import power.keepeersofthestones.client.gui.RedstoneBundleGUIScreen;
import power.keepeersofthestones.client.gui.PointGUIScreen;
import power.keepeersofthestones.client.gui.EBWaterScreen;
import power.keepeersofthestones.client.gui.EBVacuumScreen;
import power.keepeersofthestones.client.gui.EBTornadoScreen;
import power.keepeersofthestones.client.gui.EBTimeScreen;
import power.keepeersofthestones.client.gui.EBTeleportationScreen;
import power.keepeersofthestones.client.gui.EBTechnologyScreen;
import power.keepeersofthestones.client.gui.EBSunScreen;
import power.keepeersofthestones.client.gui.EBSpaceScreen;
import power.keepeersofthestones.client.gui.EBSoundScreen;
import power.keepeersofthestones.client.gui.EBShadowScreen;
import power.keepeersofthestones.client.gui.EBRainScreen;
import power.keepeersofthestones.client.gui.EBOceanScreen;
import power.keepeersofthestones.client.gui.EBMoonScreen;
import power.keepeersofthestones.client.gui.EBMetalScreen;
import power.keepeersofthestones.client.gui.EBLightningScreen;
import power.keepeersofthestones.client.gui.EBLightScreen;
import power.keepeersofthestones.client.gui.EBLavaScreen;
import power.keepeersofthestones.client.gui.EBIceScreen;
import power.keepeersofthestones.client.gui.EBGreeneryScreen;
import power.keepeersofthestones.client.gui.EBFireScreen;
import power.keepeersofthestones.client.gui.EBExplosionScreen;
import power.keepeersofthestones.client.gui.EBEnergyScreen;
import power.keepeersofthestones.client.gui.EBEarthScreen;
import power.keepeersofthestones.client.gui.EBDestructionScreen;
import power.keepeersofthestones.client.gui.EBCrystalScreen;
import power.keepeersofthestones.client.gui.EBCreationScreen;
import power.keepeersofthestones.client.gui.EBBloodScreen;
import power.keepeersofthestones.client.gui.EBAnimalsScreen;
import power.keepeersofthestones.client.gui.EBAmberScreen;
import power.keepeersofthestones.client.gui.EBAirScreen;
import power.keepeersofthestones.client.gui.CultivationGUIScreen;
import power.keepeersofthestones.client.gui.ChoiseMagicStonesPage3Screen;
import power.keepeersofthestones.client.gui.ChoiseMagicStonesPage2Screen;
import power.keepeersofthestones.client.gui.ChoiseMagicStoneGUIScreen;
import power.keepeersofthestones.client.gui.CheckpointGUIScreen;
import power.keepeersofthestones.client.gui.BuildingGUIScreen;
import power.keepeersofthestones.client.gui.BatteryCreateGUIScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(PowerModMenus.SOUND_EMITATE_CHOICE, SoundEmitateChoiceScreen::new);
			MenuScreens.register(PowerModMenus.CULTIVATION_GUI, CultivationGUIScreen::new);
			MenuScreens.register(PowerModMenus.SPAWN_ANIMALS_GUI, SpawnAnimalsGUIScreen::new);
			MenuScreens.register(PowerModMenus.CHOISE_MAGIC_STONE_GUI, ChoiseMagicStoneGUIScreen::new);
			MenuScreens.register(PowerModMenus.CHOISE_MAGIC_STONES_PAGE_2, ChoiseMagicStonesPage2Screen::new);
			MenuScreens.register(PowerModMenus.CHECKPOINT_GUI, CheckpointGUIScreen::new);
			MenuScreens.register(PowerModMenus.BATTERY_CREATE_GUI, BatteryCreateGUIScreen::new);
			MenuScreens.register(PowerModMenus.REDSTONE_BUNDLE_GUI, RedstoneBundleGUIScreen::new);
			MenuScreens.register(PowerModMenus.BUILDING_GUI, BuildingGUIScreen::new);
			MenuScreens.register(PowerModMenus.EB_FIRE, EBFireScreen::new);
			MenuScreens.register(PowerModMenus.EB_AIR, EBAirScreen::new);
			MenuScreens.register(PowerModMenus.EB_WATER, EBWaterScreen::new);
			MenuScreens.register(PowerModMenus.EB_EARTH, EBEarthScreen::new);
			MenuScreens.register(PowerModMenus.EB_ENERGY, EBEnergyScreen::new);
			MenuScreens.register(PowerModMenus.EB_ICE, EBIceScreen::new);
			MenuScreens.register(PowerModMenus.EB_LIGHTNING, EBLightningScreen::new);
			MenuScreens.register(PowerModMenus.EB_SOUND, EBSoundScreen::new);
			MenuScreens.register(PowerModMenus.EB_CRYSTAL, EBCrystalScreen::new);
			MenuScreens.register(PowerModMenus.EB_LAVA, EBLavaScreen::new);
			MenuScreens.register(PowerModMenus.EB_RAIN, EBRainScreen::new);
			MenuScreens.register(PowerModMenus.EB_TORNADO, EBTornadoScreen::new);
			MenuScreens.register(PowerModMenus.EB_OCEAN, EBOceanScreen::new);
			MenuScreens.register(PowerModMenus.EB_GREENERY, EBGreeneryScreen::new);
			MenuScreens.register(PowerModMenus.EB_ANIMALS, EBAnimalsScreen::new);
			MenuScreens.register(PowerModMenus.EB_METAL, EBMetalScreen::new);
			MenuScreens.register(PowerModMenus.EB_LIGHT, EBLightScreen::new);
			MenuScreens.register(PowerModMenus.EB_SHADOW, EBShadowScreen::new);
			MenuScreens.register(PowerModMenus.EB_VACUUM, EBVacuumScreen::new);
			MenuScreens.register(PowerModMenus.EB_SUN, EBSunScreen::new);
			MenuScreens.register(PowerModMenus.EB_MOON, EBMoonScreen::new);
			MenuScreens.register(PowerModMenus.EB_SPACE, EBSpaceScreen::new);
			MenuScreens.register(PowerModMenus.EB_TIME, EBTimeScreen::new);
			MenuScreens.register(PowerModMenus.EB_CREATION, EBCreationScreen::new);
			MenuScreens.register(PowerModMenus.EB_DESTRUCTION, EBDestructionScreen::new);
			MenuScreens.register(PowerModMenus.EB_BLOOD, EBBloodScreen::new);
			MenuScreens.register(PowerModMenus.EB_TECHNOLOGY, EBTechnologyScreen::new);
			MenuScreens.register(PowerModMenus.EB_TELEPORTATION, EBTeleportationScreen::new);
			MenuScreens.register(PowerModMenus.EB_EXPLOSION, EBExplosionScreen::new);
			MenuScreens.register(PowerModMenus.EB_AMBER, EBAmberScreen::new);
			MenuScreens.register(PowerModMenus.POINT_GUI, PointGUIScreen::new);
			MenuScreens.register(PowerModMenus.CHOISE_MAGIC_STONES_PAGE_3, ChoiseMagicStonesPage3Screen::new);
			MenuScreens.register(PowerModMenus.SPACE_ATLAS_GUI, SpaceAtlasGUIScreen::new);
		});
	}
}
