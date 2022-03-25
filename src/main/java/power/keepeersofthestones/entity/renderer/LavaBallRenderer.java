package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.LavaBallItem;

@OnlyIn(Dist.CLIENT)
public class LavaBallRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(LavaBallItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
