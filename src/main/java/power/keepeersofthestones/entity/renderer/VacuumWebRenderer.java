package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.VacuumWebItem;

@OnlyIn(Dist.CLIENT)
public class VacuumWebRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(VacuumWebItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
