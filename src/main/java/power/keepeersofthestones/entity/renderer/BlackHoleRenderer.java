package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.BlackHoleItem;

@OnlyIn(Dist.CLIENT)
public class BlackHoleRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(BlackHoleItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
