
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepeersofthestones.init;

import ru.minefox.keepeersofthestones.entity.WhirlpoolEntity;
import ru.minefox.keepeersofthestones.entity.WaterFlowEntity;
import ru.minefox.keepeersofthestones.entity.VacuumWebEntity;
import ru.minefox.keepeersofthestones.entity.VacuumSpiralEntity;
import ru.minefox.keepeersofthestones.entity.TornadoEntityEntity;
import ru.minefox.keepeersofthestones.entity.TornadoCreateEntity;
import ru.minefox.keepeersofthestones.entity.TigerClawEntity;
import ru.minefox.keepeersofthestones.entity.SunExplodeEntity;
import ru.minefox.keepeersofthestones.entity.SpikeEntity;
import ru.minefox.keepeersofthestones.entity.ShurikenEntity;
import ru.minefox.keepeersofthestones.entity.ShadowEntity;
import ru.minefox.keepeersofthestones.entity.ShadowBallEntity;
import ru.minefox.keepeersofthestones.entity.RainBowEntity;
import ru.minefox.keepeersofthestones.entity.PlasmaBallEntity;
import ru.minefox.keepeersofthestones.entity.PieceOfEarthEntity;
import ru.minefox.keepeersofthestones.entity.MoonStonesEntity;
import ru.minefox.keepeersofthestones.entity.MagicFireballEntity;
import ru.minefox.keepeersofthestones.entity.LavaBallEntity;
import ru.minefox.keepeersofthestones.entity.IceSharpEntity;
import ru.minefox.keepeersofthestones.entity.IceBallEntity;
import ru.minefox.keepeersofthestones.entity.GlowEntity;
import ru.minefox.keepeersofthestones.entity.FlashLightEntity;
import ru.minefox.keepeersofthestones.entity.EnergySphereEntity;
import ru.minefox.keepeersofthestones.entity.ClusterSharpEntity;
import ru.minefox.keepeersofthestones.entity.BlackHoleEntity;
import ru.minefox.keepeersofthestones.entity.AirFlowEntity;
import ru.minefox.keepeersofthestones.entity.AcusticalExplodeEntity;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<MagicFireballEntity> MAGIC_FIREBALL = register("entitybulletmagic_fireball",
			EntityType.Builder.<MagicFireballEntity>of(MagicFireballEntity::new, MobCategory.MISC).setCustomClientFactory(MagicFireballEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<AirFlowEntity> AIR_FLOW = register("entitybulletair_flow",
			EntityType.Builder.<AirFlowEntity>of(AirFlowEntity::new, MobCategory.MISC).setCustomClientFactory(AirFlowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<WaterFlowEntity> WATER_FLOW = register("entitybulletwater_flow",
			EntityType.Builder.<WaterFlowEntity>of(WaterFlowEntity::new, MobCategory.MISC).setCustomClientFactory(WaterFlowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PieceOfEarthEntity> PIECE_OF_EARTH = register("entitybulletpiece_of_earth",
			EntityType.Builder.<PieceOfEarthEntity>of(PieceOfEarthEntity::new, MobCategory.MISC).setCustomClientFactory(PieceOfEarthEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<EnergySphereEntity> ENERGY_SPHERE = register("entitybulletenergy_sphere",
			EntityType.Builder.<EnergySphereEntity>of(EnergySphereEntity::new, MobCategory.MISC).setCustomClientFactory(EnergySphereEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<IceBallEntity> ICE_BALL = register("entitybulletice_ball",
			EntityType.Builder.<IceBallEntity>of(IceBallEntity::new, MobCategory.MISC).setCustomClientFactory(IceBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<IceSharpEntity> ICE_SHARP = register("entitybulletice_sharp",
			EntityType.Builder.<IceSharpEntity>of(IceSharpEntity::new, MobCategory.MISC).setCustomClientFactory(IceSharpEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<PlasmaBallEntity> PLASMA_BALL = register("entitybulletplasma_ball",
			EntityType.Builder.<PlasmaBallEntity>of(PlasmaBallEntity::new, MobCategory.MISC).setCustomClientFactory(PlasmaBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<AcusticalExplodeEntity> ACUSTICAL_EXPLODE = register("entitybulletacustical_explode",
			EntityType.Builder.<AcusticalExplodeEntity>of(AcusticalExplodeEntity::new, MobCategory.MISC)
					.setCustomClientFactory(AcusticalExplodeEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ClusterSharpEntity> CLUSTER_SHARP = register("entitybulletcluster_sharp",
			EntityType.Builder.<ClusterSharpEntity>of(ClusterSharpEntity::new, MobCategory.MISC).setCustomClientFactory(ClusterSharpEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<LavaBallEntity> LAVA_BALL = register("entitybulletlava_ball",
			EntityType.Builder.<LavaBallEntity>of(LavaBallEntity::new, MobCategory.MISC).setCustomClientFactory(LavaBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TornadoCreateEntity> TORNADO_CREATE = register("entitybullettornado_create",
			EntityType.Builder.<TornadoCreateEntity>of(TornadoCreateEntity::new, MobCategory.MISC).setCustomClientFactory(TornadoCreateEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<WhirlpoolEntity> WHIRLPOOL = register("entitybulletwhirlpool",
			EntityType.Builder.<WhirlpoolEntity>of(WhirlpoolEntity::new, MobCategory.MISC).setCustomClientFactory(WhirlpoolEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<RainBowEntity> RAIN_BOW = register("entitybulletrain_bow",
			EntityType.Builder.<RainBowEntity>of(RainBowEntity::new, MobCategory.MISC).setCustomClientFactory(RainBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SpikeEntity> SPIKE = register("entitybulletspike",
			EntityType.Builder.<SpikeEntity>of(SpikeEntity::new, MobCategory.MISC).setCustomClientFactory(SpikeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TigerClawEntity> TIGER_CLAW = register("entitybullettiger_claw",
			EntityType.Builder.<TigerClawEntity>of(TigerClawEntity::new, MobCategory.MISC).setCustomClientFactory(TigerClawEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ShurikenEntity> SHURIKEN = register("entitybulletshuriken",
			EntityType.Builder.<ShurikenEntity>of(ShurikenEntity::new, MobCategory.MISC).setCustomClientFactory(ShurikenEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<GlowEntity> GLOW = register("glow", EntityType.Builder.<GlowEntity>of(GlowEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GlowEntity::new).sized(1f, 1f));
	public static final EntityType<FlashLightEntity> FLASH_LIGHT = register("entitybulletflash_light",
			EntityType.Builder.<FlashLightEntity>of(FlashLightEntity::new, MobCategory.MISC).setCustomClientFactory(FlashLightEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<ShadowEntity> SHADOW = register("shadow",
			EntityType.Builder.<ShadowEntity>of(ShadowEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(ShadowEntity::new).sized(1f, 1f));
	public static final EntityType<ShadowBallEntity> SHADOW_BALL = register("entitybulletshadow_ball",
			EntityType.Builder.<ShadowBallEntity>of(ShadowBallEntity::new, MobCategory.MISC).setCustomClientFactory(ShadowBallEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<VacuumSpiralEntity> VACUUM_SPIRAL = register("entitybulletvacuum_spiral",
			EntityType.Builder.<VacuumSpiralEntity>of(VacuumSpiralEntity::new, MobCategory.MISC).setCustomClientFactory(VacuumSpiralEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<VacuumWebEntity> VACUUM_WEB = register("entitybulletvacuum_web",
			EntityType.Builder.<VacuumWebEntity>of(VacuumWebEntity::new, MobCategory.MISC).setCustomClientFactory(VacuumWebEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<SunExplodeEntity> SUN_EXPLODE = register("entitybulletsun_explode",
			EntityType.Builder.<SunExplodeEntity>of(SunExplodeEntity::new, MobCategory.MISC).setCustomClientFactory(SunExplodeEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<MoonStonesEntity> MOON_STONES = register("entitybulletmoon_stones",
			EntityType.Builder.<MoonStonesEntity>of(MoonStonesEntity::new, MobCategory.MISC).setCustomClientFactory(MoonStonesEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BlackHoleEntity> BLACK_HOLE = register("entitybulletblack_hole",
			EntityType.Builder.<BlackHoleEntity>of(BlackHoleEntity::new, MobCategory.MISC).setCustomClientFactory(BlackHoleEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<TornadoEntityEntity> TORNADO_ENTITY = register("tornado_entity",
			EntityType.Builder.<TornadoEntityEntity>of(TornadoEntityEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(TornadoEntityEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			GlowEntity.init();
			ShadowEntity.init();
			TornadoEntityEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(GLOW, GlowEntity.createAttributes().build());
		event.put(SHADOW, ShadowEntity.createAttributes().build());
		event.put(TORNADO_ENTITY, TornadoEntityEntity.createAttributes().build());
	}
}
