
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.SpaceAtlasGUIMenu;
import power.keepeersofthestones.network.SpaceAtlasGUIButtonMessage;
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

public class SpaceAtlasGUIScreen extends AbstractContainerScreen<SpaceAtlasGUIMenu> {
	private final static HashMap<String, Object> guistate = SpaceAtlasGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SpaceAtlasGUIScreen(SpaceAtlasGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/space atlas_book.png"));
		this.blit(ms, this.leftPos + -156, this.topPos + -43, 0, 0, 512, 256, 512, 256);

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
		this.font.draw(poseStack, "Atlas of Space Travel", -68, -20, -16777216);
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
		this.addRenderableWidget(new Button(this.leftPos + -83, this.topPos + 25, 46, 20, new TextComponent("Moon"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIButtonMessage(0, x, y, z));
				SpaceAtlasGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -83, this.topPos + -2, 51, 20, new TextComponent("Earth"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIButtonMessage(1, x, y, z));
				SpaceAtlasGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -83, this.topPos + 52, 46, 20, new TextComponent("Mars"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIButtonMessage(2, x, y, z));
				SpaceAtlasGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + -83, this.topPos + 79, 51, 20, new TextComponent("Venus"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpaceAtlasGUIButtonMessage(3, x, y, z));
				SpaceAtlasGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
