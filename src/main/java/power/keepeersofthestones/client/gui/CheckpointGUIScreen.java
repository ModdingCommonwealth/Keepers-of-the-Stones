
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.CheckpointGUIMenu;
import power.keepeersofthestones.network.CheckpointGUIButtonMessage;
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

public class CheckpointGUIScreen extends AbstractContainerScreen<CheckpointGUIMenu> {
	private final static HashMap<String, Object> guistate = CheckpointGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CheckpointGUIScreen(CheckpointGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/checkpoint_gui.png");

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
		this.font.draw(poseStack, "Returning to the last point", 15, 7, -12829636);
		this.font.draw(poseStack, "Time travel", 60, 79, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 25, 126, 20, new TextComponent("Checkpoint"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckpointGUIButtonMessage(0, x, y, z));
				CheckpointGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 52, 126, 20, new TextComponent("Set checkpoint"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckpointGUIButtonMessage(1, x, y, z));
				CheckpointGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 97, 126, 20, new TextComponent("Return to the past"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckpointGUIButtonMessage(2, x, y, z));
				CheckpointGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 24, this.topPos + 124, 134, 20, new TextComponent("Return to the present"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new CheckpointGUIButtonMessage(3, x, y, z));
				CheckpointGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
