package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.PlasmaBallItem;

@OnlyIn(Dist.CLIENT)
public class PlasmaBallRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PlasmaBallItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
