package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.ClusterSharpItem;

@OnlyIn(Dist.CLIENT)
public class ClusterSharpRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ClusterSharpItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
