package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.PieceOfEarthItem;

@OnlyIn(Dist.CLIENT)
public class PieceOfEarthRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(PieceOfEarthItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
