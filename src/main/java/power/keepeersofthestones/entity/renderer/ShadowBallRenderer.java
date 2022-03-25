package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.ShadowBallItem;

@OnlyIn(Dist.CLIENT)
public class ShadowBallRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ShadowBallItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
