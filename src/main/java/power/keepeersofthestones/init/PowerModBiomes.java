
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.world.biome.VenusLandBiome;
import power.keepeersofthestones.world.biome.VenusDesertBiome;
import power.keepeersofthestones.world.biome.TriassicPlainsBiome;
import power.keepeersofthestones.world.biome.TriassicDesertBiome;
import power.keepeersofthestones.world.biome.MoonLandBiome;
import power.keepeersofthestones.world.biome.MarsLandBiome;
import power.keepeersofthestones.world.biome.JurassicSwampBiome;
import power.keepeersofthestones.world.biome.JurassicJungleBiome;
import power.keepeersofthestones.world.biome.CretaceousTaigaBiome;
import power.keepeersofthestones.world.biome.CretaceousMountainsBiome;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.biome.Biome;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, PowerMod.MODID);
	public static final RegistryObject<Biome> MOON_LAND = REGISTRY.register("moon_land", () -> MoonLandBiome.createBiome());
	public static final RegistryObject<Biome> MARS_LAND = REGISTRY.register("mars_land", () -> MarsLandBiome.createBiome());
	public static final RegistryObject<Biome> VENUS_LAND = REGISTRY.register("venus_land", () -> VenusLandBiome.createBiome());
	public static final RegistryObject<Biome> VENUS_DESERT = REGISTRY.register("venus_desert", () -> VenusDesertBiome.createBiome());
	public static final RegistryObject<Biome> TRIASSIC_DESERT = REGISTRY.register("triassic_desert", () -> TriassicDesertBiome.createBiome());
	public static final RegistryObject<Biome> TRIASSIC_PLAINS = REGISTRY.register("triassic_plains", () -> TriassicPlainsBiome.createBiome());
	public static final RegistryObject<Biome> JURASSIC_JUNGLE = REGISTRY.register("jurassic_jungle", () -> JurassicJungleBiome.createBiome());
	public static final RegistryObject<Biome> JURASSIC_SWAMP = REGISTRY.register("jurassic_swamp", () -> JurassicSwampBiome.createBiome());
	public static final RegistryObject<Biome> CRETACEOUS_TAIGA = REGISTRY.register("cretaceous_taiga", () -> CretaceousTaigaBiome.createBiome());
	public static final RegistryObject<Biome> CRETACEOUS_MOUNTAINS = REGISTRY.register("cretaceous_mountains",
			() -> CretaceousMountainsBiome.createBiome());

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			MoonLandBiome.init();
			MarsLandBiome.init();
			VenusLandBiome.init();
			VenusDesertBiome.init();
			TriassicDesertBiome.init();
			TriassicPlainsBiome.init();
			JurassicJungleBiome.init();
			JurassicSwampBiome.init();
			CretaceousTaigaBiome.init();
			CretaceousMountainsBiome.init();
		});
	}
}
