package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.WaterFlowItem;

@OnlyIn(Dist.CLIENT)
public class WaterFlowRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WaterFlowItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
