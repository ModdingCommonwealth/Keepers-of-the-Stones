
package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.TornadoEntityEntity;
import power.keepeersofthestones.client.model.Modeltornadocc;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TornadoEntityRenderer extends MobRenderer<TornadoEntityEntity, Modeltornadocc<TornadoEntityEntity>> {
	public TornadoEntityRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltornadocc(context.bakeLayer(Modeltornadocc.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TornadoEntityEntity entity) {
		return new ResourceLocation("power:textures/entities/tornado.png");
	}
}
