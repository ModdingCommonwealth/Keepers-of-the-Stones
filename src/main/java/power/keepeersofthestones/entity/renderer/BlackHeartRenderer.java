package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.BlackHeartItem;

@OnlyIn(Dist.CLIENT)
public class BlackHeartRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlackHeartItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
