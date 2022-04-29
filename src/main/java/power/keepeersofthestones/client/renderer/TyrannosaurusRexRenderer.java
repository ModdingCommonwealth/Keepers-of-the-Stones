
package power.keepeersofthestones.client.renderer;

import power.keepeersofthestones.entity.TyrannosaurusRexEntity;
import power.keepeersofthestones.client.model.Modeltyrannosaurus_rex;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class TyrannosaurusRexRenderer extends MobRenderer<TyrannosaurusRexEntity, Modeltyrannosaurus_rex<TyrannosaurusRexEntity>> {
	public TyrannosaurusRexRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltyrannosaurus_rex(context.bakeLayer(Modeltyrannosaurus_rex.LAYER_LOCATION)), 1.1f);
	}

	@Override
	public ResourceLocation getTextureLocation(TyrannosaurusRexEntity entity) {
		return new ResourceLocation("power:textures/entities/tyrannosaurus_rex.png");
	}
}
