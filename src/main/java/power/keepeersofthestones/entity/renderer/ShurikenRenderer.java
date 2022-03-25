package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.ShurikenItem;

@OnlyIn(Dist.CLIENT)
public class ShurikenRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ShurikenItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
