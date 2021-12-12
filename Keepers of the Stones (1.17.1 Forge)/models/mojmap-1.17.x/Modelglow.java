// Made with Blockbench 4.0.1
// Exported for Minecraft version 1.17 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelglow<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "glow"), "main");
	private final ModelPart head;
	private final ModelPart left_leg;
	private final ModelPart right_leg;

	public Modelglow(ModelPart root) {
		this.head = root.getChild("head");
		this.left_leg = root.getChild("left_leg");
		this.right_leg = root.getChild("right_leg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 16)
						.addBox(-5.0F, -7.0F, -5.0F, 10.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -13.0F, -6.0F, 12.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(18, 35)
						.addBox(3.0F, -9.0F, -6.0F, 3.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 31)
						.addBox(-6.0F, -9.0F, -6.0F, 3.0F, 4.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(30, 21)
						.addBox(-3.0F, -9.0F, -4.0F, 6.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(36, 25)
						.addBox(0.0F, -20.0F, -15.0F, 0.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_r1 = head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -15.0F, -15.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(36, 0)
				.addBox(1.0F, -2.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(36, 6)
				.addBox(-4.0F, -2.0F, -2.0F, 3.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		head.render(poseStack, buffer, packedLight, packedOverlay);
		left_leg.render(poseStack, buffer, packedLight, packedOverlay);
		right_leg.render(poseStack, buffer, packedLight, packedOverlay);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.left_leg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.right_leg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}