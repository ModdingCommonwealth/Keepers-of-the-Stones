
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.potion.WaterMasterMobEffect;
import power.keepeersofthestones.potion.VacuumMasterMobEffect;
import power.keepeersofthestones.potion.TornadoMasterMobEffect;
import power.keepeersofthestones.potion.TimeStopEffectMobEffect;
import power.keepeersofthestones.potion.TimeMasterEffectMobEffect;
import power.keepeersofthestones.potion.TeleportationMasterMobEffect;
import power.keepeersofthestones.potion.TechnologyMasterMobEffect;
import power.keepeersofthestones.potion.SunMasterMobEffect;
import power.keepeersofthestones.potion.SpaceMasterMobEffect;
import power.keepeersofthestones.potion.SoundMasterMobEffect;
import power.keepeersofthestones.potion.ShadowMasterMobEffect;
import power.keepeersofthestones.potion.RechargeWaterStoneMobEffect;
import power.keepeersofthestones.potion.RechargeVacuumStoneMobEffect;
import power.keepeersofthestones.potion.RechargeTornadoStoneMobEffect;
import power.keepeersofthestones.potion.RechargeTimeStoneMobEffect;
import power.keepeersofthestones.potion.RechargeTeleportationStoneMobEffect;
import power.keepeersofthestones.potion.RechargeTechnologyStoneMobEffect;
import power.keepeersofthestones.potion.RechargeSunStoneMobEffect;
import power.keepeersofthestones.potion.RechargeSpaceStoneMobEffect;
import power.keepeersofthestones.potion.RechargeSoundStoneMobEffect;
import power.keepeersofthestones.potion.RechargeShadowStoneMobEffect;
import power.keepeersofthestones.potion.RechargeRainStoneMobEffect;
import power.keepeersofthestones.potion.RechargeOceanStoneMobEffect;
import power.keepeersofthestones.potion.RechargeMoonStoneMobEffect;
import power.keepeersofthestones.potion.RechargeMetalStoneMobEffect;
import power.keepeersofthestones.potion.RechargeMagnetStoneMobEffect;
import power.keepeersofthestones.potion.RechargeLightningStoneMobEffect;
import power.keepeersofthestones.potion.RechargeLightStoneMobEffect;
import power.keepeersofthestones.potion.RechargeLavaStoneMobEffect;
import power.keepeersofthestones.potion.RechargeIceStoneMobEffect;
import power.keepeersofthestones.potion.RechargeGreeneryStoneMobEffect;
import power.keepeersofthestones.potion.RechargeFireStoneMobEffect;
import power.keepeersofthestones.potion.RechargeExplosionStoneMobEffect;
import power.keepeersofthestones.potion.RechargeEnergyStoneMobEffect;
import power.keepeersofthestones.potion.RechargeEarthStoneMobEffect;
import power.keepeersofthestones.potion.RechargeDestructionStoneMobEffect;
import power.keepeersofthestones.potion.RechargeCrystalStoneMobEffect;
import power.keepeersofthestones.potion.RechargeCreationStoneMobEffect;
import power.keepeersofthestones.potion.RechargeBloodStoneMobEffect;
import power.keepeersofthestones.potion.RechargeAnimalsStoneMobEffect;
import power.keepeersofthestones.potion.RechargeAmberStoneMobEffect;
import power.keepeersofthestones.potion.RechargeAirStoneMobEffect;
import power.keepeersofthestones.potion.RainMasterMobEffect;
import power.keepeersofthestones.potion.RainFlyMobEffect;
import power.keepeersofthestones.potion.OceanMasterMobEffect;
import power.keepeersofthestones.potion.MoonMasterMobEffect;
import power.keepeersofthestones.potion.MetalMasterMobEffect;
import power.keepeersofthestones.potion.MagnetMasterMobEffect;
import power.keepeersofthestones.potion.LightningMasterMobEffect;
import power.keepeersofthestones.potion.LightMasterMobEffect;
import power.keepeersofthestones.potion.LavaMasterMobEffect;
import power.keepeersofthestones.potion.InvincibilityMobEffect;
import power.keepeersofthestones.potion.IceMasterMobEffect;
import power.keepeersofthestones.potion.GreeneryMasterMobEffect;
import power.keepeersofthestones.potion.FogMobEffect;
import power.keepeersofthestones.potion.FireMasterMobEffect;
import power.keepeersofthestones.potion.FireFlyingMobEffect;
import power.keepeersofthestones.potion.ExplosionMasterMobEffect;
import power.keepeersofthestones.potion.EnergyMasterMobEffect;
import power.keepeersofthestones.potion.EarthMasterMobEffect;
import power.keepeersofthestones.potion.DestructionMasterMobEffect;
import power.keepeersofthestones.potion.CrystalMasterMobEffect;
import power.keepeersofthestones.potion.CreationMasterMobEffect;
import power.keepeersofthestones.potion.BloodMasterMobEffect;
import power.keepeersofthestones.potion.AnimalsMasterMobEffect;
import power.keepeersofthestones.potion.AmberMasterMobEffect;
import power.keepeersofthestones.potion.AirMasterMobEffect;
import power.keepeersofthestones.potion.AccelerationTimeEffectMobEffect;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class PowerModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, PowerMod.MODID);
	public static final RegistryObject<MobEffect> FIRE_MASTER = REGISTRY.register("fire_master", () -> new FireMasterMobEffect());
	public static final RegistryObject<MobEffect> AIR_MASTER = REGISTRY.register("air_master", () -> new AirMasterMobEffect());
	public static final RegistryObject<MobEffect> WATER_MASTER = REGISTRY.register("water_master", () -> new WaterMasterMobEffect());
	public static final RegistryObject<MobEffect> EARTH_MASTER = REGISTRY.register("earth_master", () -> new EarthMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_FIRE_STONE = REGISTRY.register("recharge_fire_stone",
			() -> new RechargeFireStoneMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_AIR_STONE = REGISTRY.register("recharge_air_stone", () -> new RechargeAirStoneMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_WATER_STONE = REGISTRY.register("recharge_water_stone",
			() -> new RechargeWaterStoneMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_EARTH_STONE = REGISTRY.register("recharge_earth_stone",
			() -> new RechargeEarthStoneMobEffect());
	public static final RegistryObject<MobEffect> ENERGY_MASTER = REGISTRY.register("energy_master", () -> new EnergyMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_ENERGY_STONE = REGISTRY.register("recharge_energy_stone",
			() -> new RechargeEnergyStoneMobEffect());
	public static final RegistryObject<MobEffect> ICE_MASTER = REGISTRY.register("ice_master", () -> new IceMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_ICE_STONE = REGISTRY.register("recharge_ice_stone", () -> new RechargeIceStoneMobEffect());
	public static final RegistryObject<MobEffect> LIGHTNING_MASTER = REGISTRY.register("lightning_master", () -> new LightningMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_LIGHTNING_STONE = REGISTRY.register("recharge_lightning_stone",
			() -> new RechargeLightningStoneMobEffect());
	public static final RegistryObject<MobEffect> SOUND_MASTER = REGISTRY.register("sound_master", () -> new SoundMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_SOUND_STONE = REGISTRY.register("recharge_sound_stone",
			() -> new RechargeSoundStoneMobEffect());
	public static final RegistryObject<MobEffect> CRYSTAL_MASTER = REGISTRY.register("crystal_master", () -> new CrystalMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_CRYSTAL_STONE = REGISTRY.register("recharge_crystal_stone",
			() -> new RechargeCrystalStoneMobEffect());
	public static final RegistryObject<MobEffect> LAVA_MASTER = REGISTRY.register("lava_master", () -> new LavaMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_LAVA_STONE = REGISTRY.register("recharge_lava_stone",
			() -> new RechargeLavaStoneMobEffect());
	public static final RegistryObject<MobEffect> RAIN_MASTER = REGISTRY.register("rain_master", () -> new RainMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_RAIN_STONE = REGISTRY.register("recharge_rain_stone",
			() -> new RechargeRainStoneMobEffect());
	public static final RegistryObject<MobEffect> TORNADO_MASTER = REGISTRY.register("tornado_master", () -> new TornadoMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_TORNADO_STONE = REGISTRY.register("recharge_tornado_stone",
			() -> new RechargeTornadoStoneMobEffect());
	public static final RegistryObject<MobEffect> OCEAN_MASTER = REGISTRY.register("ocean_master", () -> new OceanMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_OCEAN_STONE = REGISTRY.register("recharge_ocean_stone",
			() -> new RechargeOceanStoneMobEffect());
	public static final RegistryObject<MobEffect> GREENERY_MASTER = REGISTRY.register("greenery_master", () -> new GreeneryMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_GREENERY_STONE = REGISTRY.register("recharge_greenery_stone",
			() -> new RechargeGreeneryStoneMobEffect());
	public static final RegistryObject<MobEffect> ANIMALS_MASTER = REGISTRY.register("animals_master", () -> new AnimalsMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_ANIMALS_STONE = REGISTRY.register("recharge_animals_stone",
			() -> new RechargeAnimalsStoneMobEffect());
	public static final RegistryObject<MobEffect> INVINCIBILITY = REGISTRY.register("invincibility", () -> new InvincibilityMobEffect());
	public static final RegistryObject<MobEffect> METAL_MASTER = REGISTRY.register("metal_master", () -> new MetalMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_METAL_STONE = REGISTRY.register("recharge_metal_stone",
			() -> new RechargeMetalStoneMobEffect());
	public static final RegistryObject<MobEffect> LIGHT_MASTER = REGISTRY.register("light_master", () -> new LightMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_LIGHT_STONE = REGISTRY.register("recharge_light_stone",
			() -> new RechargeLightStoneMobEffect());
	public static final RegistryObject<MobEffect> SHADOW_MASTER = REGISTRY.register("shadow_master", () -> new ShadowMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_SHADOW_STONE = REGISTRY.register("recharge_shadow_stone",
			() -> new RechargeShadowStoneMobEffect());
	public static final RegistryObject<MobEffect> VACUUM_MASTER = REGISTRY.register("vacuum_master", () -> new VacuumMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_VACUUM_STONE = REGISTRY.register("recharge_vacuum_stone",
			() -> new RechargeVacuumStoneMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_SUN_STONE = REGISTRY.register("recharge_sun_stone", () -> new RechargeSunStoneMobEffect());
	public static final RegistryObject<MobEffect> SUN_MASTER = REGISTRY.register("sun_master", () -> new SunMasterMobEffect());
	public static final RegistryObject<MobEffect> MOON_MASTER = REGISTRY.register("moon_master", () -> new MoonMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_MOON_STONE = REGISTRY.register("recharge_moon_stone",
			() -> new RechargeMoonStoneMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_CREATION_STONE = REGISTRY.register("recharge_creation_stone",
			() -> new RechargeCreationStoneMobEffect());
	public static final RegistryObject<MobEffect> CREATION_MASTER = REGISTRY.register("creation_master", () -> new CreationMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_DESTRUCTION_STONE = REGISTRY.register("recharge_destruction_stone",
			() -> new RechargeDestructionStoneMobEffect());
	public static final RegistryObject<MobEffect> DESTRUCTION_MASTER = REGISTRY.register("destruction_master",
			() -> new DestructionMasterMobEffect());
	public static final RegistryObject<MobEffect> SPACE_MASTER = REGISTRY.register("space_master", () -> new SpaceMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_SPACE_STONE = REGISTRY.register("recharge_space_stone",
			() -> new RechargeSpaceStoneMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_BLOOD_STONE = REGISTRY.register("recharge_blood_stone",
			() -> new RechargeBloodStoneMobEffect());
	public static final RegistryObject<MobEffect> BLOOD_MASTER = REGISTRY.register("blood_master", () -> new BloodMasterMobEffect());
	public static final RegistryObject<MobEffect> TECHNOLOGY_MASTER = REGISTRY.register("technology_master", () -> new TechnologyMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_TECHNOLOGY_STONE = REGISTRY.register("recharge_technology_stone",
			() -> new RechargeTechnologyStoneMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_TIME_STONE = REGISTRY.register("recharge_time_stone",
			() -> new RechargeTimeStoneMobEffect());
	public static final RegistryObject<MobEffect> TIME_MASTER_EFFECT = REGISTRY.register("time_master_effect", () -> new TimeMasterEffectMobEffect());
	public static final RegistryObject<MobEffect> ACCELERATION_TIME_EFFECT = REGISTRY.register("acceleration_time_effect",
			() -> new AccelerationTimeEffectMobEffect());
	public static final RegistryObject<MobEffect> TIME_STOP_EFFECT = REGISTRY.register("time_stop_effect", () -> new TimeStopEffectMobEffect());
	public static final RegistryObject<MobEffect> FIRE_FLYING = REGISTRY.register("fire_flying", () -> new FireFlyingMobEffect());
	public static final RegistryObject<MobEffect> RAIN_FLY = REGISTRY.register("rain_fly", () -> new RainFlyMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_TELEPORTATION_STONE = REGISTRY.register("recharge_teleportation_stone",
			() -> new RechargeTeleportationStoneMobEffect());
	public static final RegistryObject<MobEffect> TELEPORTATION_MASTER = REGISTRY.register("teleportation_master",
			() -> new TeleportationMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_EXPLOSION_STONE = REGISTRY.register("recharge_explosion_stone",
			() -> new RechargeExplosionStoneMobEffect());
	public static final RegistryObject<MobEffect> EXPLOSION_MASTER = REGISTRY.register("explosion_master", () -> new ExplosionMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_AMBER_STONE = REGISTRY.register("recharge_amber_stone",
			() -> new RechargeAmberStoneMobEffect());
	public static final RegistryObject<MobEffect> AMBER_MASTER = REGISTRY.register("amber_master", () -> new AmberMasterMobEffect());
	public static final RegistryObject<MobEffect> FOG = REGISTRY.register("fog", () -> new FogMobEffect());
	public static final RegistryObject<MobEffect> MAGNET_MASTER = REGISTRY.register("magnet_master", () -> new MagnetMasterMobEffect());
	public static final RegistryObject<MobEffect> RECHARGE_MAGNET_STONE = REGISTRY.register("recharge_magnet_stone",
			() -> new RechargeMagnetStoneMobEffect());
}
