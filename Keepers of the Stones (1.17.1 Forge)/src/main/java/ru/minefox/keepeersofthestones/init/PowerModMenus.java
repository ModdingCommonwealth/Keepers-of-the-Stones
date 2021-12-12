
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepeersofthestones.init;

import ru.minefox.keepeersofthestones.world.inventory.SpawnAnimalsGUIMenu;
import ru.minefox.keepeersofthestones.world.inventory.SoundEmitateChoiceMenu;
import ru.minefox.keepeersofthestones.world.inventory.MediumStoneBoxGUIMenu;
import ru.minefox.keepeersofthestones.world.inventory.GreatStoneBoxGUIMenu;
import ru.minefox.keepeersofthestones.world.inventory.CultivationGUIMenu;
import ru.minefox.keepeersofthestones.world.inventory.BasicStoneBoxGUIMenu;
import ru.minefox.keepeersofthestones.world.inventory.AdditionalAndesiteBoxGUIMenu;
import ru.minefox.keepeersofthestones.world.inventory.AdditionStoneBoxGUIMenu;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<BasicStoneBoxGUIMenu> BASIC_STONE_BOX_GUI = register("basic_stone_box_gui",
			(id, inv, extraData) -> new BasicStoneBoxGUIMenu(id, inv, extraData));
	public static final MenuType<AdditionStoneBoxGUIMenu> ADDITION_STONE_BOX_GUI = register("addition_stone_box_gui",
			(id, inv, extraData) -> new AdditionStoneBoxGUIMenu(id, inv, extraData));
	public static final MenuType<SoundEmitateChoiceMenu> SOUND_EMITATE_CHOICE = register("sound_emitate_choice",
			(id, inv, extraData) -> new SoundEmitateChoiceMenu(id, inv, extraData));
	public static final MenuType<MediumStoneBoxGUIMenu> MEDIUM_STONE_BOX_GUI = register("medium_stone_box_gui",
			(id, inv, extraData) -> new MediumStoneBoxGUIMenu(id, inv, extraData));
	public static final MenuType<GreatStoneBoxGUIMenu> GREAT_STONE_BOX_GUI = register("great_stone_box_gui",
			(id, inv, extraData) -> new GreatStoneBoxGUIMenu(id, inv, extraData));
	public static final MenuType<CultivationGUIMenu> CULTIVATION_GUI = register("cultivation_gui",
			(id, inv, extraData) -> new CultivationGUIMenu(id, inv, extraData));
	public static final MenuType<SpawnAnimalsGUIMenu> SPAWN_ANIMALS_GUI = register("spawn_animals_gui",
			(id, inv, extraData) -> new SpawnAnimalsGUIMenu(id, inv, extraData));
	public static final MenuType<AdditionalAndesiteBoxGUIMenu> ADDITIONAL_ANDESITE_BOX_GUI = register("additional_andesite_box_gui",
			(id, inv, extraData) -> new AdditionalAndesiteBoxGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
