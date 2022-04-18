
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.PointGUIMenu;
import power.keepeersofthestones.network.PointGUIButtonMessage;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class PointGUIScreen extends AbstractContainerScreen<PointGUIMenu> {
	private final static HashMap<String, Object> guistate = PointGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox tpX;
	EditBox tpY;
	EditBox tpZ;

	public PointGUIScreen(PointGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/point_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		tpX.render(ms, mouseX, mouseY, partialTicks);
		tpY.render(ms, mouseX, mouseY, partialTicks);
		tpZ.render(ms, mouseX, mouseY, partialTicks);
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
		if (tpX.isFocused())
			return tpX.keyPressed(key, b, c);
		if (tpY.isFocused())
			return tpY.keyPressed(key, b, c);
		if (tpZ.isFocused())
			return tpZ.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		tpX.tick();
		tpY.tick();
		tpZ.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "X", 24, 34, -12829636);
		this.font.draw(poseStack, "Enter the desired coordinates", 15, 7, -12829636);
		this.font.draw(poseStack, "Y", 24, 70, -12829636);
		this.font.draw(poseStack, "Z", 24, 106, -12829636);
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
		tpX = new EditBox(this.font, this.leftPos + 33, this.topPos + 25, 120, 20, new TextComponent("0")) {
			{
				setSuggestion("0");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:tpX", tpX);
		tpX.setMaxLength(32767);
		this.addWidget(this.tpX);
		tpY = new EditBox(this.font, this.leftPos + 33, this.topPos + 61, 120, 20, new TextComponent("0")) {
			{
				setSuggestion("0");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:tpY", tpY);
		tpY.setMaxLength(32767);
		this.addWidget(this.tpY);
		tpZ = new EditBox(this.font, this.leftPos + 33, this.topPos + 97, 120, 20, new TextComponent("0")) {
			{
				setSuggestion("0");
			}

			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:tpZ", tpZ);
		tpZ.setMaxLength(32767);
		this.addWidget(this.tpZ);
		this.addRenderableWidget(new Button(this.leftPos + 51, this.topPos + 133, 67, 20, new TextComponent("Teleport"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new PointGUIButtonMessage(0, x, y, z));
				PointGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
