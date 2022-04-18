
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.ChoiseMagicStonesPage3Menu;
import power.keepeersofthestones.network.ChoiseMagicStonesPage3ButtonMessage;
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

public class ChoiseMagicStonesPage3Screen extends AbstractContainerScreen<ChoiseMagicStonesPage3Menu> {
	private final static HashMap<String, Object> guistate = ChoiseMagicStonesPage3Menu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ChoiseMagicStonesPage3Screen(ChoiseMagicStonesPage3Menu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/choise_magic_stones_page_3.png");

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
		this.font.draw(poseStack, "3/3", 10, 6, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 33, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 141, 56, 20, new TextComponent("  "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 114, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 60, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 141, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 33, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 60, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 114, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 127, this.topPos + 87, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 87, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 226, this.topPos + 33, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 226, this.topPos + 60, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 226, this.topPos + 87, 56, 20, new TextComponent(" "), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 10, this.topPos + 168, 93, 20, new TextComponent("Previous page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStonesPage3ButtonMessage(13, x, y, z));
				ChoiseMagicStonesPage3ButtonMessage.handleButtonAction(entity, 13, x, y, z);
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
		}));
	}
}
