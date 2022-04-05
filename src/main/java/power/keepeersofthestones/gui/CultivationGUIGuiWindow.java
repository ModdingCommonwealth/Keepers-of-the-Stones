
package power.keepeersofthestones.gui;

import power.keepeersofthestones.PowerMod;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CultivationGUIGuiWindow extends ContainerScreen<CultivationGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = CultivationGUIGui.guistate;

	public CultivationGUIGuiWindow(CultivationGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 376;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/cultivation_gui.png");

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
		this.font.drawString(ms, "Select a plant to get", 124, 6, -12829636);
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
		this.addButton(new Button(this.guiLeft + 250, this.guiTop + 52, 77, 20, new StringTextComponent("Water lily"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(0, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 7, this.guiTop + 25, 77, 20, new StringTextComponent("Oak Sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(1, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 169, this.guiTop + 52, 77, 20, new StringTextComponent("Vine"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(2, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 88, this.guiTop + 25, 77, 20, new StringTextComponent("Birch Sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(3, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 250, this.guiTop + 25, 77, 20, new StringTextComponent("Spruce Sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(4, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 169, this.guiTop + 25, 77, 20, new StringTextComponent("Acacia Sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(5, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 7, this.guiTop + 52, 77, 20, new StringTextComponent("Dark sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(6, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 88, this.guiTop + 52, 77, 20, new StringTextComponent("Jungle sapling"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(7, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 7, this.guiTop + 79, 77, 20, new StringTextComponent("Wheat"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(8, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 88, this.guiTop + 79, 77, 20, new StringTextComponent("Potato"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(9, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 169, this.guiTop + 79, 77, 20, new StringTextComponent("Carrot"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(10, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 250, this.guiTop + 79, 77, 20, new StringTextComponent("Beetroot"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(11, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 7, this.guiTop + 106, 77, 20, new StringTextComponent("Melon"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(12, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 88, this.guiTop + 106, 77, 20, new StringTextComponent("Pumpkin"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(13, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 169, this.guiTop + 106, 77, 20, new StringTextComponent("Sugar Cane"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(14, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 250, this.guiTop + 106, 77, 20, new StringTextComponent("Bamboo"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CultivationGUIGui.ButtonPressedMessage(15, x, y, z));
				CultivationGUIGui.handleButtonAction(entity, 15, x, y, z);
			}
		}));
	}
}
