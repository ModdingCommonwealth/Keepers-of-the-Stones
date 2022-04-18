
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.AcceptTpOnEarthMenu;
import power.keepeersofthestones.network.AcceptTpOnEarthButtonMessage;
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

public class AcceptTpOnEarthScreen extends AbstractContainerScreen<AcceptTpOnEarthMenu> {
	private final static HashMap<String, Object> guistate = AcceptTpOnEarthMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public AcceptTpOnEarthScreen(AcceptTpOnEarthMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 267;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/accept_tp_on_earth.png");

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
		this.font.draw(poseStack, "They want to teleport you to the earth.", 34, 7, -12829636);
		this.font.draw(poseStack, " Do you agree?", 88, 25, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 52, this.topPos + 70, 40, 20, new TextComponent("Yes"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new AcceptTpOnEarthButtonMessage(0, x, y, z));
				AcceptTpOnEarthButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 169, this.topPos + 70, 35, 20, new TextComponent("No"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new AcceptTpOnEarthButtonMessage(1, x, y, z));
				AcceptTpOnEarthButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
