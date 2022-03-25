package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.RainBowItem;

@OnlyIn(Dist.CLIENT)
public class RainBowRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(RainBowItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
