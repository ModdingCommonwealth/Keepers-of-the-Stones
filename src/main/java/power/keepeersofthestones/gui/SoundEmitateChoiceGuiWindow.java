
package power.keepeersofthestones.gui;

import power.keepeersofthestones.PowerMod;

import java.util.HashMap;

@OnlyIn(Dist.CLIENT)
public class SoundEmitateChoiceGuiWindow extends ContainerScreen<SoundEmitateChoiceGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = SoundEmitateChoiceGui.guistate;

	public SoundEmitateChoiceGuiWindow(SoundEmitateChoiceGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/sound_emitate_choice.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Select the mob for emitate sound", 6, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 51, this.guiTop + 25, 60, 20, new StringTextComponent("Creeper"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SoundEmitateChoiceGui.ButtonPressedMessage(0, x, y, z));
				SoundEmitateChoiceGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 51, this.guiTop + 79, 55, 20, new StringTextComponent("Zombie"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SoundEmitateChoiceGui.ButtonPressedMessage(1, x, y, z));
				SoundEmitateChoiceGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 51, this.guiTop + 52, 65, 20, new StringTextComponent("Skeleton"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SoundEmitateChoiceGui.ButtonPressedMessage(2, x, y, z));
				SoundEmitateChoiceGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}