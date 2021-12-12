package ru.minefox.keepeersofthestones.client.renderer;

import ru.minefox.keepeersofthestones.entity.GlowEntity;
import ru.minefox.keepeersofthestones.client.model.Modelglow;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

public class GlowRenderer extends MobRenderer<GlowEntity, Modelglow<GlowEntity>> {
	public GlowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelglow(context.bakeLayer(Modelglow.LAYER_LOCATION)), 0.5f);
		this.addLayer(new EyesLayer<GlowEntity, Modelglow<GlowEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("power:textures/glow.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(GlowEntity entity) {
		return new ResourceLocation("power:textures/glow.png");
	}
}
