
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.world.inventory.SpawnAnimalsGUIMenu;
import power.keepeersofthestones.world.inventory.SoundEmitateChoiceMenu;
import power.keepeersofthestones.world.inventory.RedstoneBundleGUIMenu;
import power.keepeersofthestones.world.inventory.CultivationGUIMenu;
import power.keepeersofthestones.world.inventory.ChoiseMagicStonesPage2Menu;
import power.keepeersofthestones.world.inventory.ChoiseMagicStoneGUIMenu;
import power.keepeersofthestones.world.inventory.CheckpointGUIMenu;
import power.keepeersofthestones.world.inventory.BuildingGUIMenu;
import power.keepeersofthestones.world.inventory.BatteryCreateGUIMenu;
import power.keepeersofthestones.world.inventory.AcceptTpOnVenusMenu;
import power.keepeersofthestones.world.inventory.AcceptTpOnMoonMenu;
import power.keepeersofthestones.world.inventory.AcceptTpOnMarsMenu;
import power.keepeersofthestones.world.inventory.AcceptTpOnEarthMenu;

import net.minecraftforge.network.IContainerFactory;
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
	public static final MenuType<SoundEmitateChoiceMenu> SOUND_EMITATE_CHOICE = register("sound_emitate_choice",
			(id, inv, extraData) -> new SoundEmitateChoiceMenu(id, inv, extraData));
	public static final MenuType<CultivationGUIMenu> CULTIVATION_GUI = register("cultivation_gui",
			(id, inv, extraData) -> new CultivationGUIMenu(id, inv, extraData));
	public static final MenuType<SpawnAnimalsGUIMenu> SPAWN_ANIMALS_GUI = register("spawn_animals_gui",
			(id, inv, extraData) -> new SpawnAnimalsGUIMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicStoneGUIMenu> CHOISE_MAGIC_STONE_GUI = register("choise_magic_stone_gui",
			(id, inv, extraData) -> new ChoiseMagicStoneGUIMenu(id, inv, extraData));
	public static final MenuType<ChoiseMagicStonesPage2Menu> CHOISE_MAGIC_STONES_PAGE_2 = register("choise_magic_stones_page_2",
			(id, inv, extraData) -> new ChoiseMagicStonesPage2Menu(id, inv, extraData));
	public static final MenuType<CheckpointGUIMenu> CHECKPOINT_GUI = register("checkpoint_gui",
			(id, inv, extraData) -> new CheckpointGUIMenu(id, inv, extraData));
	public static final MenuType<AcceptTpOnMoonMenu> ACCEPT_TP_ON_MOON = register("accept_tp_on_moon",
			(id, inv, extraData) -> new AcceptTpOnMoonMenu(id, inv, extraData));
	public static final MenuType<AcceptTpOnEarthMenu> ACCEPT_TP_ON_EARTH = register("accept_tp_on_earth",
			(id, inv, extraData) -> new AcceptTpOnEarthMenu(id, inv, extraData));
	public static final MenuType<AcceptTpOnMarsMenu> ACCEPT_TP_ON_MARS = register("accept_tp_on_mars",
			(id, inv, extraData) -> new AcceptTpOnMarsMenu(id, inv, extraData));
	public static final MenuType<AcceptTpOnVenusMenu> ACCEPT_TP_ON_VENUS = register("accept_tp_on_venus",
			(id, inv, extraData) -> new AcceptTpOnVenusMenu(id, inv, extraData));
	public static final MenuType<BatteryCreateGUIMenu> BATTERY_CREATE_GUI = register("battery_create_gui",
			(id, inv, extraData) -> new BatteryCreateGUIMenu(id, inv, extraData));
	public static final MenuType<RedstoneBundleGUIMenu> REDSTONE_BUNDLE_GUI = register("redstone_bundle_gui",
			(id, inv, extraData) -> new RedstoneBundleGUIMenu(id, inv, extraData));
	public static final MenuType<BuildingGUIMenu> BUILDING_GUI = register("building_gui",
			(id, inv, extraData) -> new BuildingGUIMenu(id, inv, extraData));

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
