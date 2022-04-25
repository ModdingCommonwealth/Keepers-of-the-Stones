
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
public class ChoiseMagicStonesPage2GuiWindow extends ContainerScreen<ChoiseMagicStonesPage2Gui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = ChoiseMagicStonesPage2Gui.guistate;

	public ChoiseMagicStonesPage2GuiWindow(ChoiseMagicStonesPage2Gui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 400;
		this.ySize = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/choise_magic_stones_page_2.png");

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

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/moon_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 33, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/cosmos_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 60, 0, 0, -1, -1, -1, -1);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/blood_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 141, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/time_master.png"));
		this.blit(ms, this.guiLeft + 109, this.guiTop + 33, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/technology_master.png"));
		this.blit(ms, this.guiLeft + 109, this.guiTop + 60, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/teleportation_master.png"));
		this.blit(ms, this.guiLeft + 109, this.guiTop + 87, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/explosion_master.png"));
		this.blit(ms, this.guiLeft + 109, this.guiTop + 114, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/creation_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 87, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/destruction_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 114, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/amber_master.png"));
		this.blit(ms, this.guiLeft + 109, this.guiTop + 141, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/space_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 60, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/blue_flame_master.png"));
		this.blit(ms, this.guiLeft + 208, this.guiTop + 33, 0, 0, 16, 16, 16, 16);

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
		this.font.drawString(ms, "Choose a stone to get it", 127, 6, -12829636);
		this.font.drawString(ms, "2/3", 10, 6, -12829636);
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
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 33, 56, 20, new StringTextComponent(" Moon"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(0, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 127, this.guiTop + 141, 56, 20, new StringTextComponent(" Amber"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(1, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 114, 56, 20, new StringTextComponent(" Destruct"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(2, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 60, 56, 20, new StringTextComponent("Space"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(3, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 141, 56, 20, new StringTextComponent("Blood"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(4, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 127, this.guiTop + 33, 56, 20, new StringTextComponent("Time"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(5, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 127, this.guiTop + 60, 56, 20, new StringTextComponent("Tech"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(6, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 127, this.guiTop + 114, 56, 20, new StringTextComponent("Explosion"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(7, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 127, this.guiTop + 87, 56, 20, new StringTextComponent("TP"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(8, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 87, 56, 20, new StringTextComponent("Creation"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(9, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 226, this.guiTop + 33, 56, 20, new StringTextComponent(" Blue Flame"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(10, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 226, this.guiTop + 60, 56, 20, new StringTextComponent(" "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(11, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 226, this.guiTop + 87, 56, 20, new StringTextComponent(" "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(12, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 168, 93, 20, new StringTextComponent("Previous page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(13, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 226, this.guiTop + 114, 56, 20, new StringTextComponent(" "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(14, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 226, this.guiTop + 141, 56, 20, new StringTextComponent(" "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(15, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 15, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 33, 56, 20, new StringTextComponent(" "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(16, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 16, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 60, 56, 20, new StringTextComponent(" "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(17, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 17, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 87, 56, 20, new StringTextComponent(" "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(18, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 18, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 114, 56, 20, new StringTextComponent(" "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(19, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 19, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 141, 56, 20, new StringTextComponent(" "), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(20, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 20, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 316, this.guiTop + 168, 72, 20, new StringTextComponent("Next page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2Gui.ButtonPressedMessage(21, x, y, z));
				ChoiseMagicStonesPage2Gui.handleButtonAction(entity, 21, x, y, z);
			}
		}));
	}
}
