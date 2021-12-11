
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepeersofthestones.init;

import ru.minefox.keepeersofthestones.client.gui.SpawnAnimalsGUIScreen;
import ru.minefox.keepeersofthestones.client.gui.SoundEmitateChoiceScreen;
import ru.minefox.keepeersofthestones.client.gui.MediumStoneBoxGUIScreen;
import ru.minefox.keepeersofthestones.client.gui.GreatStoneBoxGUIScreen;
import ru.minefox.keepeersofthestones.client.gui.CultivationGUIScreen;
import ru.minefox.keepeersofthestones.client.gui.BasicStoneBoxGUIScreen;
import ru.minefox.keepeersofthestones.client.gui.AdditionalAndesiteBoxGUIScreen;
import ru.minefox.keepeersofthestones.client.gui.AdditionStoneBoxGUIScreen;

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
			MenuScreens.register(PowerModMenus.BASIC_STONE_BOX_GUI, BasicStoneBoxGUIScreen::new);
			MenuScreens.register(PowerModMenus.ADDITION_STONE_BOX_GUI, AdditionStoneBoxGUIScreen::new);
			MenuScreens.register(PowerModMenus.SOUND_EMITATE_CHOICE, SoundEmitateChoiceScreen::new);
			MenuScreens.register(PowerModMenus.MEDIUM_STONE_BOX_GUI, MediumStoneBoxGUIScreen::new);
			MenuScreens.register(PowerModMenus.GREAT_STONE_BOX_GUI, GreatStoneBoxGUIScreen::new);
			MenuScreens.register(PowerModMenus.CULTIVATION_GUI, CultivationGUIScreen::new);
			MenuScreens.register(PowerModMenus.SPAWN_ANIMALS_GUI, SpawnAnimalsGUIScreen::new);
			MenuScreens.register(PowerModMenus.ADDITIONAL_ANDESITE_BOX_GUI, AdditionalAndesiteBoxGUIScreen::new);
		});
	}
}
