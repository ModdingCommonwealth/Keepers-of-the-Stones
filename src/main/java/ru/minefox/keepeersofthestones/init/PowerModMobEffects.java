
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepeersofthestones.init;

import ru.minefox.keepeersofthestones.potion.WaterMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.VacuumMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.UnelementalMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.TornadoMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.SunMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.SoundMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.ShadowMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeWaterStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeVacuumStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeTornadoStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeSunStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeSoundStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeShadowStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeRainStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeOceanStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeMoonStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeMetalStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeLightningStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeLightStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeLavaStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeIceStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeGreeneryStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeFireStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeEnergyStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeEmptyStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeEarthStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeDestructionStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeCrystalStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeCreationStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeCosmosStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeAnimalsStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RechargeAirStoneMobEffect;
import ru.minefox.keepeersofthestones.potion.RainMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.OceanMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.MoonMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.MetalMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.LightningMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.LightMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.LavaMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.InvincibilityMobEffect;
import ru.minefox.keepeersofthestones.potion.InfernoMergerMobEffect;
import ru.minefox.keepeersofthestones.potion.IceMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.GreeneryMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.GeyserMergerMobEffect;
import ru.minefox.keepeersofthestones.potion.FireMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.EnergyMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.EarthMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.DestructionMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.CrystalMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.CreationMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.CosmosMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.AnimalsMasterMobEffect;
import ru.minefox.keepeersofthestones.potion.AirMasterMobEffect;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.effect.MobEffect;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModMobEffects {
	private static final List<MobEffect> REGISTRY = new ArrayList<>();
	public static final MobEffect FIRE_MASTER = register(new FireMasterMobEffect());
	public static final MobEffect AIR_MASTER = register(new AirMasterMobEffect());
	public static final MobEffect WATER_MASTER = register(new WaterMasterMobEffect());
	public static final MobEffect EARTH_MASTER = register(new EarthMasterMobEffect());
	public static final MobEffect RECHARGE_FIRE_STONE = register(new RechargeFireStoneMobEffect());
	public static final MobEffect RECHARGE_AIR_STONE = register(new RechargeAirStoneMobEffect());
	public static final MobEffect RECHARGE_WATER_STONE = register(new RechargeWaterStoneMobEffect());
	public static final MobEffect RECHARGE_EARTH_STONE = register(new RechargeEarthStoneMobEffect());
	public static final MobEffect ENERGY_MASTER = register(new EnergyMasterMobEffect());
	public static final MobEffect RECHARGE_ENERGY_STONE = register(new RechargeEnergyStoneMobEffect());
	public static final MobEffect ICE_MASTER = register(new IceMasterMobEffect());
	public static final MobEffect RECHARGE_ICE_STONE = register(new RechargeIceStoneMobEffect());
	public static final MobEffect LIGHTNING_MASTER = register(new LightningMasterMobEffect());
	public static final MobEffect RECHARGE_LIGHTNING_STONE = register(new RechargeLightningStoneMobEffect());
	public static final MobEffect SOUND_MASTER = register(new SoundMasterMobEffect());
	public static final MobEffect RECHARGE_SOUND_STONE = register(new RechargeSoundStoneMobEffect());
	public static final MobEffect CRYSTAL_MASTER = register(new CrystalMasterMobEffect());
	public static final MobEffect RECHARGE_CRYSTAL_STONE = register(new RechargeCrystalStoneMobEffect());
	public static final MobEffect LAVA_MASTER = register(new LavaMasterMobEffect());
	public static final MobEffect RECHARGE_LAVA_STONE = register(new RechargeLavaStoneMobEffect());
	public static final MobEffect RAIN_MASTER = register(new RainMasterMobEffect());
	public static final MobEffect RECHARGE_RAIN_STONE = register(new RechargeRainStoneMobEffect());
	public static final MobEffect TORNADO_MASTER = register(new TornadoMasterMobEffect());
	public static final MobEffect RECHARGE_TORNADO_STONE = register(new RechargeTornadoStoneMobEffect());
	public static final MobEffect OCEAN_MASTER = register(new OceanMasterMobEffect());
	public static final MobEffect RECHARGE_OCEAN_STONE = register(new RechargeOceanStoneMobEffect());
	public static final MobEffect INFERNO_MERGER = register(new InfernoMergerMobEffect());
	public static final MobEffect GREENERY_MASTER = register(new GreeneryMasterMobEffect());
	public static final MobEffect RECHARGE_GREENERY_STONE = register(new RechargeGreeneryStoneMobEffect());
	public static final MobEffect GEYSER_MERGER = register(new GeyserMergerMobEffect());
	public static final MobEffect ANIMALS_MASTER = register(new AnimalsMasterMobEffect());
	public static final MobEffect RECHARGE_ANIMALS_STONE = register(new RechargeAnimalsStoneMobEffect());
	public static final MobEffect INVINCIBILITY = register(new InvincibilityMobEffect());
	public static final MobEffect METAL_MASTER = register(new MetalMasterMobEffect());
	public static final MobEffect RECHARGE_METAL_STONE = register(new RechargeMetalStoneMobEffect());
	public static final MobEffect UNELEMENTAL_MASTER = register(new UnelementalMasterMobEffect());
	public static final MobEffect RECHARGE_EMPTY_STONE = register(new RechargeEmptyStoneMobEffect());
	public static final MobEffect LIGHT_MASTER = register(new LightMasterMobEffect());
	public static final MobEffect RECHARGE_LIGHT_STONE = register(new RechargeLightStoneMobEffect());
	public static final MobEffect SHADOW_MASTER = register(new ShadowMasterMobEffect());
	public static final MobEffect RECHARGE_SHADOW_STONE = register(new RechargeShadowStoneMobEffect());
	public static final MobEffect VACUUM_MASTER = register(new VacuumMasterMobEffect());
	public static final MobEffect RECHARGE_VACUUM_STONE = register(new RechargeVacuumStoneMobEffect());
	public static final MobEffect RECHARGE_SUN_STONE = register(new RechargeSunStoneMobEffect());
	public static final MobEffect SUN_MASTER = register(new SunMasterMobEffect());
	public static final MobEffect MOON_MASTER = register(new MoonMasterMobEffect());
	public static final MobEffect RECHARGE_MOON_STONE = register(new RechargeMoonStoneMobEffect());
	public static final MobEffect RECHARGE_CREATION_STONE = register(new RechargeCreationStoneMobEffect());
	public static final MobEffect CREATION_MASTER = register(new CreationMasterMobEffect());
	public static final MobEffect RECHARGE_DESTRUCTION_STONE = register(new RechargeDestructionStoneMobEffect());
	public static final MobEffect DESTRUCTION_MASTER = register(new DestructionMasterMobEffect());
	public static final MobEffect COSMOS_MASTER = register(new CosmosMasterMobEffect());
	public static final MobEffect RECHARGE_COSMOS_STONE = register(new RechargeCosmosStoneMobEffect());

	private static MobEffect register(MobEffect effect) {
		REGISTRY.add(effect);
		return effect;
	}

	@SubscribeEvent
	public static void registerMobEffects(RegistryEvent.Register<MobEffect> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MobEffect[0]));
	}
}
