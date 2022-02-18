
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.world.biome.VenusLandBiome;
import power.keepeersofthestones.world.biome.VenusDesertBiome;
import power.keepeersofthestones.world.biome.MoonLandBiome;
import power.keepeersofthestones.world.biome.MarsLandBiome;
import power.keepeersofthestones.world.biome.AncientJungleBiome;
import power.keepeersofthestones.world.biome.AncientDesertBiome;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome MOON_LAND = register("moon_land", MoonLandBiome.createBiome());
	public static Biome MARS_LAND = register("mars_land", MarsLandBiome.createBiome());
	public static Biome VENUS_LAND = register("venus_land", VenusLandBiome.createBiome());
	public static Biome VENUS_DESERT = register("venus_desert", VenusDesertBiome.createBiome());
	public static Biome ANCIENT_JUNGLE = register("ancient_jungle", AncientJungleBiome.createBiome());
	public static Biome ANCIENT_DESERT = register("ancient_desert", AncientDesertBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(PowerMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MoonLandBiome.init();
			MarsLandBiome.init();
			VenusLandBiome.init();
			VenusDesertBiome.init();
			AncientJungleBiome.init();
			AncientDesertBiome.init();
		});
	}
}
