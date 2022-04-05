package power.keepeersofthestones.entity.renderer;

import power.keepeersofthestones.item.TornadoCreateItem;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.IRenderTypeBuffer;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class TornadoCreateRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(TornadoCreateItem.arrow, renderManager -> new CustomRender(renderManager));
		}
	}

	@OnlyIn(Dist.CLIENT)
	public static class CustomRender extends EntityRenderer<TornadoCreateItem.ArrowCustomEntity> {
		private static final ResourceLocation texture = new ResourceLocation("power:textures/tornado.png");

		public CustomRender(EntityRendererManager renderManager) {
			super(renderManager);
		}

		@Override
		public void render(TornadoCreateItem.ArrowCustomEntity entityIn, float entityYaw, float partialTicks, MatrixStack matrixStackIn,
				IRenderTypeBuffer bufferIn, int packedLightIn) {
			IVertexBuilder vb = bufferIn.getBuffer(RenderType.getEntityCutout(this.getEntityTexture(entityIn)));
			matrixStackIn.push();
			matrixStackIn.rotate(Vector3f.YP.rotationDegrees(MathHelper.lerp(partialTicks, entityIn.prevRotationYaw, entityIn.rotationYaw) - 90));
			matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(90 + MathHelper.lerp(partialTicks, entityIn.prevRotationPitch, entityIn.rotationPitch)));
			EntityModel model = new Modeltornadomodel();
			model.render(matrixStackIn, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
			matrixStackIn.pop();
			super.render(entityIn, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
		}

		@Override
		public ResourceLocation getEntityTexture(TornadoCreateItem.ArrowCustomEntity entity) {
			return texture;
		}
	}

	public static class Modeltornadomodel extends EntityModel<Entity> {
		private final ModelRenderer bone;
		private final ModelRenderer bone_r1;
		private final ModelRenderer bone_r2;
		private final ModelRenderer bone_r3;
		private final ModelRenderer bone_r4;

		public Modeltornadomodel() {
			textureWidth = 128;
			textureHeight = 128;
			bone = new ModelRenderer(this);
			bone.setRotationPoint(0.0F, 24.0F, 0.0F);
			bone.setTextureOffset(0, 0).addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, 0.0F, false);
			bone_r1 = new ModelRenderer(this);
			bone_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r1);
			setRotationAngle(bone_r1, 0.0F, -1.7453F, 0.0F);
			bone_r1.setTextureOffset(0, 0).addBox(-12.0F, -49.0F, -12.0F, 24.0F, 11.0F, 24.0F, 0.0F, false);
			bone_r2 = new ModelRenderer(this);
			bone_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r2);
			setRotationAngle(bone_r2, 0.0F, -1.309F, 0.0F);
			bone_r2.setTextureOffset(0, 35).addBox(-9.0F, -38.0F, -9.0F, 18.0F, 14.0F, 18.0F, 0.0F, false);
			bone_r3 = new ModelRenderer(this);
			bone_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r3);
			setRotationAngle(bone_r3, 0.0F, -0.8727F, 0.0F);
			bone_r3.setTextureOffset(59, 54).addBox(-6.5F, -24.0F, -6.5F, 13.0F, 10.0F, 13.0F, 0.0F, false);
			bone_r4 = new ModelRenderer(this);
			bone_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
			bone.addChild(bone_r4);
			setRotationAngle(bone_r4, 0.0F, -0.4363F, 0.0F);
			bone_r4.setTextureOffset(54, 35).addBox(-4.5F, -14.0F, -4.5F, 9.0F, 8.0F, 9.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			bone.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.bone_r1.rotateAngleY = f2;
			this.bone_r2.rotateAngleY = f2;
			this.bone_r3.rotateAngleY = f2;
			this.bone_r4.rotateAngleY = f2;
			this.bone.rotateAngleY = f2;
		}
	}

}
