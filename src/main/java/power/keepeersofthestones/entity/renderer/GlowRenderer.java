
package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.entity.GlowEntity;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class GlowRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(GlowEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new Modelglowmodel(), 0.5f) {
					{
						this.addLayer(new GlowingLayer<>(this));
					}

					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("power:textures/entities/glow.png");
					}
				};
			});
		}
	}

	@OnlyIn(Dist.CLIENT)
	private static class GlowingLayer<T extends Entity, M extends EntityModel<T>> extends LayerRenderer<T, M> {
		public GlowingLayer(IEntityRenderer<T, M> er) {
			super(er);
		}

		public void render(MatrixStack matrixStackIn, IRenderTypeBuffer bufferIn, int packedLightIn, T entitylivingbaseIn, float limbSwing,
				float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
			IVertexBuilder ivertexbuilder = bufferIn.getBuffer(RenderType.getEyes(new ResourceLocation("power:textures/entities/glow.png")));
			this.getEntityModel().render(matrixStackIn, ivertexbuilder, 15728640, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		}
	}

	// Made with Blockbench 4.1.2
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modelglowmodel extends EntityModel<Entity> {
		private final ModelRenderer root;
		private final ModelRenderer head;
		private final ModelRenderer head_r1;
		private final ModelRenderer left_leg;
		private final ModelRenderer right_leg;

		public Modelglowmodel() {
			textureWidth = 64;
			textureHeight = 64;
			root = new ModelRenderer(this);
			root.setRotationPoint(0.0F, 24.0F, 0.0F);
			head = new ModelRenderer(this);
			head.setRotationPoint(0.0F, 0.0F, 0.0F);
			root.addChild(head);
			head.setTextureOffset(0, 16).addBox(-5.0F, -7.0F, -5.0F, 10.0F, 5.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(0, 0).addBox(-6.0F, -13.0F, -6.0F, 12.0F, 4.0F, 12.0F, 0.0F, false);
			head.setTextureOffset(18, 35).addBox(3.0F, -9.0F, -6.0F, 3.0F, 4.0F, 12.0F, 0.0F, false);
			head.setTextureOffset(0, 31).addBox(-6.0F, -9.0F, -6.0F, 3.0F, 4.0F, 12.0F, 0.0F, false);
			head.setTextureOffset(30, 21).addBox(-3.0F, -9.0F, -4.0F, 6.0F, 4.0F, 10.0F, 0.0F, false);
			head.setTextureOffset(36, 25).addBox(0.0F, -20.0F, -15.0F, 0.0F, 8.0F, 10.0F, 0.0F, false);
			head_r1 = new ModelRenderer(this);
			head_r1.setRotationPoint(0.0F, -15.0F, -15.0F);
			head.addChild(head_r1);
			setRotationAngle(head_r1, 0.2182F, 0.0F, 0.0F);
			head_r1.setTextureOffset(0, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.0F, false);
			left_leg = new ModelRenderer(this);
			left_leg.setRotationPoint(0.0F, 0.0F, 0.0F);
			root.addChild(left_leg);
			left_leg.setTextureOffset(36, 0).addBox(1.0F, -2.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
			right_leg = new ModelRenderer(this);
			right_leg.setRotationPoint(0.0F, 0.0F, 0.0F);
			root.addChild(right_leg);
			right_leg.setTextureOffset(36, 6).addBox(-4.0F, -2.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			root.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.left_leg.rotateAngleY = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.right_leg.rotateAngleY = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
