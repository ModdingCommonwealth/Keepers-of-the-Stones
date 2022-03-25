package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.SunExplodeItem;

@OnlyIn(Dist.CLIENT)
public class SunExplodeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(SunExplodeItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
