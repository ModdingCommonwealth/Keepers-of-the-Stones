
package power.keepeersofthestones.gui;

import power.keepeersofthestones.PowerMod;

import java.util.HashMap;

@OnlyIn(Dist.CLIENT)
public class SpawnAnimalsGUIGuiWindow extends ContainerScreen<SpawnAnimalsGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = SpawnAnimalsGUIGui.guistate;

	public SpawnAnimalsGUIGuiWindow(SpawnAnimalsGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/spawn_animals_gui.png");

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
		this.font.drawString(ms, "Choose an animal to summon", 15, 7, -12829636);
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
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 25, 46, 20, new StringTextComponent("Wolf"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIGui.ButtonPressedMessage(0, x, y, z));
				SpawnAnimalsGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 78, this.guiTop + 25, 61, 20, new StringTextComponent("Chicken"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIGui.ButtonPressedMessage(1, x, y, z));
				SpawnAnimalsGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 52, 40, 20, new StringTextComponent("Cow"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIGui.ButtonPressedMessage(2, x, y, z));
				SpawnAnimalsGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 78, this.guiTop + 52, 40, 20, new StringTextComponent("Cat"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIGui.ButtonPressedMessage(3, x, y, z));
				SpawnAnimalsGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 15, this.guiTop + 79, 51, 20, new StringTextComponent("Horse"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIGui.ButtonPressedMessage(4, x, y, z));
				SpawnAnimalsGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}
}