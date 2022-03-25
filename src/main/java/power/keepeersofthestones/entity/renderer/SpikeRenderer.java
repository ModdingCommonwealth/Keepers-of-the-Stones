package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.SpikeItem;

@OnlyIn(Dist.CLIENT)
public class SpikeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SpikeItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
