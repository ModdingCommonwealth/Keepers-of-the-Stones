package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.IceSharpItem;

@OnlyIn(Dist.CLIENT)
public class IceSharpRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(IceSharpItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
