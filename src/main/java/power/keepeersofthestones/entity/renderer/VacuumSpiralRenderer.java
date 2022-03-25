package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.VacuumSpiralItem;

@OnlyIn(Dist.CLIENT)
public class VacuumSpiralRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(VacuumSpiralItem.arrow,
					renderManager -> new SpriteRenderer(renderManager, Minecraft.getInstance().getItemRenderer()));
		}
	}
}
