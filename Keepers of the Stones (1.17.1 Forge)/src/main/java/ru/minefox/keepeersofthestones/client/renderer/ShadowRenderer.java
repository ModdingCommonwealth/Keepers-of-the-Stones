package ru.minefox.keepeersofthestones.client.renderer;

import ru.minefox.keepeersofthestones.entity.ShadowEntity;
import ru.minefox.keepeersofthestones.client.model.Modelshadow;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class ShadowRenderer extends MobRenderer<ShadowEntity, Modelshadow<ShadowEntity>> {
	public ShadowRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshadow(context.bakeLayer(Modelshadow.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ShadowEntity entity) {
		return new ResourceLocation("power:textures/shadow.png");
	}
}
