
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepeersofthestones.init;

import ru.minefox.keepeersofthestones.client.model.Modeltornadocc;
import ru.minefox.keepeersofthestones.client.model.Modelshadow;
import ru.minefox.keepeersofthestones.client.model.Modelglow;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeltornadocc.LAYER_LOCATION, Modeltornadocc::createBodyLayer);
		event.registerLayerDefinition(Modelshadow.LAYER_LOCATION, Modelshadow::createBodyLayer);
		event.registerLayerDefinition(Modelglow.LAYER_LOCATION, Modelglow::createBodyLayer);
	}
}
