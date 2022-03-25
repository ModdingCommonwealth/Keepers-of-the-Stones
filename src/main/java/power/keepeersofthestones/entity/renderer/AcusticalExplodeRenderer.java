package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.AcusticalExplodeItem;

@OnlyIn(Dist.CLIENT)
public class AcusticalExplodeRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(AcusticalExplodeItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
