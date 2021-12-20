// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeltornadocc<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "tornadocc"), "main");
	private final ModelPart bone;

	public Modeltornadocc(ModelPart root) {
		this.bone = root.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone_r1 = bone
				.addOrReplaceChild("bone_r1",
						CubeListBuilder.create().texOffs(0, 0).addBox(-12.0F, -49.0F, -12.0F, 24.0F, 11.0F, 24.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.7453F, 0.0F));

		PartDefinition bone_r2 = bone
				.addOrReplaceChild("bone_r2",
						CubeListBuilder.create().texOffs(0, 35).addBox(-9.0F, -38.0F, -9.0F, 18.0F, 14.0F, 18.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.309F, 0.0F));

		PartDefinition bone_r3 = bone
				.addOrReplaceChild("bone_r3",
						CubeListBuilder.create().texOffs(59, 54).addBox(-6.5F, -24.0F, -6.5F, 13.0F, 10.0F, 13.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.8727F, 0.0F));

		PartDefinition bone_r4 = bone
				.addOrReplaceChild("bone_r4",
						CubeListBuilder.create().texOffs(54, 35).addBox(-4.5F, -14.0F, -4.5F, 9.0F, 8.0F, 9.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.4363F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.bone.yRot = ageInTicks;
	}
}