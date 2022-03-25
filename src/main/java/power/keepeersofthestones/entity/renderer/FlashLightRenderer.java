package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.FlashLightItem;

@OnlyIn(Dist.CLIENT)
public class FlashLightRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(FlashLightItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
