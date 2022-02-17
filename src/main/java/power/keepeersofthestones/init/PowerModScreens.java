
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.client.gui.SpawnAnimalsGUIScreen;
import power.keepeersofthestones.client.gui.SoundEmitateChoiceScreen;
import power.keepeersofthestones.client.gui.CultivationGUIScreen;
import power.keepeersofthestones.client.gui.ChoiseMagicStonesPage2Screen;
import power.keepeersofthestones.client.gui.ChoiseMagicStoneGUIScreen;
import power.keepeersofthestones.client.gui.CheckpointGUIScreen;
import power.keepeersofthestones.client.gui.BatteryCreateGUIScreen;
import power.keepeersofthestones.client.gui.AcceptTpOnVenusScreen;
import power.keepeersofthestones.client.gui.AcceptTpOnMoonScreen;
import power.keepeersofthestones.client.gui.AcceptTpOnMarsScreen;
import power.keepeersofthestones.client.gui.AcceptTpOnEarthScreen;

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
			MenuScreens.register(PowerModMenus.ACCEPT_TP_ON_MOON, AcceptTpOnMoonScreen::new);
			MenuScreens.register(PowerModMenus.ACCEPT_TP_ON_EARTH, AcceptTpOnEarthScreen::new);
			MenuScreens.register(PowerModMenus.ACCEPT_TP_ON_MARS, AcceptTpOnMarsScreen::new);
			MenuScreens.register(PowerModMenus.ACCEPT_TP_ON_VENUS, AcceptTpOnVenusScreen::new);
			MenuScreens.register(PowerModMenus.BATTERY_CREATE_GUI, BatteryCreateGUIScreen::new);
		});
	}
}
