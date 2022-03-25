package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.EnergySphereItem;

@OnlyIn(Dist.CLIENT)
public class EnergySphereRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(EnergySphereItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
