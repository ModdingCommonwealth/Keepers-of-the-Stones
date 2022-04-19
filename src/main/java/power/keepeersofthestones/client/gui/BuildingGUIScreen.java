
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.BuildingGUIMenu;
import power.keepeersofthestones.network.BuildingGUIButtonMessage;
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

public class BuildingGUIScreen extends AbstractContainerScreen<BuildingGUIMenu> {
	private final static HashMap<String, Object> guistate = BuildingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox sX;
	EditBox sY;
	EditBox sZ;

	public BuildingGUIScreen(BuildingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 255;
		this.imageHeight = 211;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/building_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
		sX.render(ms, mouseX, mouseY, partialTicks);
		sY.render(ms, mouseX, mouseY, partialTicks);
		sZ.render(ms, mouseX, mouseY, partialTicks);
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
		if (sX.isFocused())
			return sX.keyPressed(key, b, c);
		if (sY.isFocused())
			return sY.keyPressed(key, b, c);
		if (sZ.isFocused())
			return sZ.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		sX.tick();
		sY.tick();
		sZ.tick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Select the structure you want to place", 28, 110, -12829636);
		this.font.draw(poseStack, "Enter the coordinates for the structure", 28, 11, -12829636);
		this.font.draw(poseStack, "X:", 55, 38, -12829636);
		this.font.draw(poseStack, "Y:", 55, 65, -12829636);
		this.font.draw(poseStack, "Z:", 55, 92, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 181, this.topPos + 137, 61, 20, new TextComponent("Library"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIButtonMessage(0, x, y, z));
				BuildingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 100, this.topPos + 137, 77, 20, new TextComponent("Blacksmith"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIButtonMessage(1, x, y, z));
				BuildingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 10, this.topPos + 137, 87, 20, new TextComponent("Butcher Shop"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIButtonMessage(2, x, y, z));
				BuildingGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		sX = new EditBox(this.font, this.leftPos + 73, this.topPos + 29, 120, 20, new TextComponent("0")) {
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
		guistate.put("text:sX", sX);
		sX.setMaxLength(32767);
		this.addWidget(this.sX);
		sY = new EditBox(this.font, this.leftPos + 73, this.topPos + 56, 120, 20, new TextComponent("0")) {
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
		guistate.put("text:sY", sY);
		sY.setMaxLength(32767);
		this.addWidget(this.sY);
		sZ = new EditBox(this.font, this.leftPos + 73, this.topPos + 83, 120, 20, new TextComponent("0")) {
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
		guistate.put("text:sZ", sZ);
		sZ.setMaxLength(32767);
		this.addWidget(this.sZ);
		this.addRenderableWidget(new Button(this.leftPos + 10, this.topPos + 164, 82, 20, new TextComponent("Streetlight"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIButtonMessage(3, x, y, z));
				BuildingGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
