package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.WhirlpoolItem;

@OnlyIn(Dist.CLIENT)
public class WhirlpoolRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(WhirlpoolItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
