
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.ChoiseMagicStonesPage2Menu;
import power.keepeersofthestones.network.ChoiseMagicStonesPage2ButtonMessage;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ChoiseMagicStonesPage2Screen extends AbstractContainerScreen<ChoiseMagicStonesPage2Menu> {
	private final static HashMap<String, Object> guistate = ChoiseMagicStonesPage2Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ChoiseMagicStonesPage2Screen(ChoiseMagicStonesPage2Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/choise_magic_stones_page_2.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/moon_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/cosmos_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 60, 0, 0, -1, -1, -1, -1);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/blood_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/time_master.png"));
		this.blit(ms, this.leftPos + 109, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/technology_master.png"));
		this.blit(ms, this.leftPos + 109, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/teleportation_master.png"));
		this.blit(ms, this.leftPos + 109, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/explosion_master.png"));
		this.blit(ms, this.leftPos + 109, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/creation_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/destruction_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/amber_master.png"));
		this.blit(ms, this.leftPos + 109, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/space_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Choose a stone to get it", 127, 6, -12829636);
		this.font.draw(poseStack, "2/3", 10, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 33, 56, 20, new TextComponent(" Moon"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(0, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 141, 56, 20, new TextComponent(" Amber"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(1, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 114, 56, 20, new TextComponent(" Destruct"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(2, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 60, 56, 20, new TextComponent("Space"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(3, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 141, 56, 20, new TextComponent("Blood"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(4, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 33, 56, 20, new TextComponent("Time"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(5, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 60, 56, 20, new TextComponent("Tech"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(6, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 114, 56, 20, new TextComponent("Explosion"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(7, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 87, 56, 20, new TextComponent("TP"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(8, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 87, 56, 20, new TextComponent("Creation"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(9, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 226, this.topPos + 33, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 226, this.topPos + 60, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 226, this.topPos + 87, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 10, this.topPos + 168, 93, 20, new TextComponent("Previous page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(13, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 226, this.topPos + 114, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 226, this.topPos + 141, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 33, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 60, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 87, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 114, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 141, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 316, this.topPos + 168, 72, 20, new TextComponent("Next page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage2ButtonMessage(21, x, y, z));
				ChoiseMagicStonesPage2ButtonMessage.handleButtonAction(entity, 21, x, y, z);
			}
		}));
	}
}
