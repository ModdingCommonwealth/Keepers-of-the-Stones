package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.AirFlowItem;

@OnlyIn(Dist.CLIENT)
public class AirFlowRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AirFlowItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
