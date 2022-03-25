package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.TigerClawItem;

@OnlyIn(Dist.CLIENT)
public class TigerClawRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TigerClawItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
