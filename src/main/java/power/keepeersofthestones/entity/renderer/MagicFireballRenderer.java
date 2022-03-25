package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.MagicFireballItem;

@OnlyIn(Dist.CLIENT)
public class MagicFireballRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(MagicFireballItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
