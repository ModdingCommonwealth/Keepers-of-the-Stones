
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.client.renderer.TornadoEntityRenderer;
import power.keepeersofthestones.client.renderer.TornadoCreateRenderer;
import power.keepeersofthestones.client.renderer.ShadowRenderer;
import power.keepeersofthestones.client.renderer.GlowRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PowerModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(PowerModEntities.MAGIC_FIREBALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.AIR_FLOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WATER_FLOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PIECE_OF_EARTH, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ENERGY_SPHERE, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_BALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_SHARP, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PLASMA_BALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ACUSTICAL_EXPLODE, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.CLUSTER_SHARP, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.LAVA_BALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TORNADO_CREATE, TornadoCreateRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WHIRLPOOL, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.RAIN_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SPIKE, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TIGER_CLAW, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHURIKEN, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GLOW, GlowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.FLASH_LIGHT, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHADOW, ShadowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHADOW_BALL, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.VACUUM_SPIRAL, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.VACUUM_WEB, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SUN_EXPLODE, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MOON_STONES, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLACK_HOLE, ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TORNADO_ENTITY, TornadoEntityRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLACK_HEART, ThrownItemRenderer::new);
	}
}
