
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
		event.registerEntityRenderer(PowerModEntities.TORNADO_ENTITY.get(), TornadoEntityRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MAGIC_FIREBALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.AIR_FLOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WATER_FLOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PIECE_OF_EARTH.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ENERGY_SPHERE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_SHARP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PLASMA_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ACUSTICAL_EXPLODE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.CLUSTER_SHARP.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.LAVA_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TORNADO_CREATE.get(), TornadoCreateRenderer::new);
		event.registerEntityRenderer(PowerModEntities.WHIRLPOOL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.RAIN_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SPIKE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TIGER_CLAW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHURIKEN.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.GLOW.get(), GlowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.FLASH_LIGHT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHADOW.get(), ShadowRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SHADOW_BALL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.VACUUM_SPIRAL.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.VACUUM_WEB.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.SUN_EXPLODE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MOON_STONES.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLACK_HOLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.BLACK_HEART.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.TIME_DILATION.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.MEGAWATT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.PORTAL_BLAST.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.EXPLOSIVE_FLOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(PowerModEntities.ICE_SPEAR.get(), ThrownItemRenderer::new);
	}
}
