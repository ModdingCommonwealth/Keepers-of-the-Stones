
package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.TyrannosaurusRexEntity;
import power.keepeersofthestones.client.model.Modelglow;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TyrannosaurusRexRenderer extends MobRenderer<TyrannosaurusRexEntity, Modelglow<TyrannosaurusRexEntity>> {
	public TyrannosaurusRexRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglow(context.bakeLayer(Modelglow.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(TyrannosaurusRexEntity entity) {
		return new ResourceLocation("power:textures/entities/glow.png");
	}
}
