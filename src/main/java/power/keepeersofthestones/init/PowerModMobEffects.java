
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.potion.WaterMasterMobEffect;
import power.keepeersofthestones.potion.VacuumMasterMobEffect;
import power.keepeersofthestones.potion.UnelementalMasterMobEffect;
import power.keepeersofthestones.potion.TornadoMasterMobEffect;
import power.keepeersofthestones.potion.SunMasterMobEffect;
import power.keepeersofthestones.potion.SoundMasterMobEffect;
import power.keepeersofthestones.potion.ShadowMasterMobEffect;
import power.keepeersofthestones.potion.RechargeWaterStoneMobEffect;
import power.keepeersofthestones.potion.RechargeVacuumStoneMobEffect;
import power.keepeersofthestones.potion.RechargeTornadoStoneMobEffect;
import power.keepeersofthestones.potion.RechargeSunStoneMobEffect;
import power.keepeersofthestones.potion.RechargeSoundStoneMobEffect;
import power.keepeersofthestones.potion.RechargeShadowStoneMobEffect;
import power.keepeersofthestones.potion.RechargeRainStoneMobEffect;
import power.keepeersofthestones.potion.RechargeOceanStoneMobEffect;
import power.keepeersofthestones.potion.RechargeMoonStoneMobEffect;
import power.keepeersofthestones.potion.RechargeMetalStoneMobEffect;
import power.keepeersofthestones.potion.RechargeLightningStoneMobEffect;
import power.keepeersofthestones.potion.RechargeLightStoneMobEffect;
import power.keepeersofthestones.potion.RechargeLavaStoneMobEffect;
import power.keepeersofthestones.potion.RechargeIceStoneMobEffect;
import power.keepeersofthestones.potion.RechargeGreeneryStoneMobEffect;
import power.keepeersofthestones.potion.RechargeFireStoneMobEffect;
import power.keepeersofthestones.potion.RechargeEnergyStoneMobEffect;
import power.keepeersofthestones.potion.RechargeEmptyStoneMobEffect;
import power.keepeersofthestones.potion.RechargeEarthStoneMobEffect;
import power.keepeersofthestones.potion.RechargeDestructionStoneMobEffect;
import power.keepeersofthestones.potion.RechargeCrystalStoneMobEffect;
import power.keepeersofthestones.potion.RechargeCreationStoneMobEffect;
import power.keepeersofthestones.potion.RechargeCosmosStoneMobEffect;
import power.keepeersofthestones.potion.RechargeAnimalsStoneMobEffect;
import power.keepeersofthestones.potion.RechargeAirStoneMobEffect;
import power.keepeersofthestones.potion.RainMasterMobEffect;
import power.keepeersofthestones.potion.OceanMasterMobEffect;
import power.keepeersofthestones.potion.MoonMasterMobEffect;
import power.keepeersofthestones.potion.MetalMasterMobEffect;
import power.keepeersofthestones.potion.LightningMasterMobEffect;
import power.keepeersofthestones.potion.LightMasterMobEffect;
import power.keepeersofthestones.potion.LavaMasterMobEffect;
import power.keepeersofthestones.potion.InvincibilityMobEffect;
import power.keepeersofthestones.potion.InfernoMergerMobEffect;
import power.keepeersofthestones.potion.IceMasterMobEffect;
import power.keepeersofthestones.potion.GreeneryMasterMobEffect;
import power.keepeersofthestones.potion.GeyserMergerMobEffect;
import power.keepeersofthestones.potion.FireMasterMobEffect;
import power.keepeersofthestones.potion.EnergyMasterMobEffect;
import power.keepeersofthestones.potion.EarthMasterMobEffect;
import power.keepeersofthestones.potion.DestructionMasterMobEffect;
import power.keepeersofthestones.potion.CrystalMasterMobEffect;
import power.keepeersofthestones.potion.CreationMasterMobEffect;
import power.keepeersofthestones.potion.CosmosMasterMobEffect;
import power.keepeersofthestones.potion.CoalMergerMobEffect;
import power.keepeersofthestones.potion.AnimalsMasterMobEffect;
import power.keepeersofthestones.potion.AirMasterMobEffect;

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
	public static final MobEffect COAL_MERGER = register(new CoalMergerMobEffect());

	private static MobEffect register(MobEffect effect) {
		REGISTRY.add(effect);
		return effect;
	}

	@SubscribeEvent
	public static void registerMobEffects(RegistryEvent.Register<MobEffect> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MobEffect[0]));
	}
}
