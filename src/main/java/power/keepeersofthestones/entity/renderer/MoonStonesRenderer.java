package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.MoonStonesItem;

@OnlyIn(Dist.CLIENT)
public class MoonStonesRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MoonStonesItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
