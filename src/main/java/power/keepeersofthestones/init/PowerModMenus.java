
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.world.inventory.SpawnAnimalsGUIMenu;
import power.keepeersofthestones.world.inventory.SoundEmitateChoiceMenu;
import power.keepeersofthestones.world.inventory.MediumStoneBoxGUIMenu;
import power.keepeersofthestones.world.inventory.GreatStoneBoxGUIMenu;
import power.keepeersofthestones.world.inventory.CultivationGUIMenu;
import power.keepeersofthestones.world.inventory.ChoiseMagicStonesPage2Menu;
import power.keepeersofthestones.world.inventory.ChoiseMagicStoneGUIMenu;
import power.keepeersofthestones.world.inventory.CheckpointGUIMenu;
import power.keepeersofthestones.world.inventory.BasicStoneBoxGUIMenu;
import power.keepeersofthestones.world.inventory.AdditionalAndesiteBoxGUIMenu;
import power.keepeersofthestones.world.inventory.AdditionStoneBoxGUIMenu;

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
	public static final MenuType<ChoiseMagicStoneGUIMenu> CHOISE_MAGIC_STONE_GUI = register("choise_magic_stone_gui",
			(id, inv, extraData) -> new ChoiseMagicStoneGUIMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicStonesPage2Menu> CHOISE_MAGIC_STONES_PAGE_2 = register("choise_magic_stones_page_2",
			(id, inv, extraData) -> new ChoiseMagicStonesPage2Menu(id, inv, extraData));
	public static final MenuType<CheckpointGUIMenu> CHECKPOINT_GUI = register("checkpoint_gui",
			(id, inv, extraData) -> new CheckpointGUIMenu(id, inv, extraData));

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
