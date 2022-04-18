
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.SpawnAnimalsGUIMenu;
import power.keepeersofthestones.network.SpawnAnimalsGUIButtonMessage;
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

public class SpawnAnimalsGUIScreen extends AbstractContainerScreen<SpawnAnimalsGUIMenu> {
	private final static HashMap<String, Object> guistate = SpawnAnimalsGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SpawnAnimalsGUIScreen(SpawnAnimalsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/spawn_animals_gui.png");

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
		this.font.draw(poseStack, "Choose an animal to summon", 15, 7, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 25, 46, 20, new TextComponent("Wolf"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIButtonMessage(0, x, y, z));
				SpawnAnimalsGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 25, 61, 20, new TextComponent("Chicken"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIButtonMessage(1, x, y, z));
				SpawnAnimalsGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 52, 40, 20, new TextComponent("Cow"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIButtonMessage(2, x, y, z));
				SpawnAnimalsGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 52, 40, 20, new TextComponent("Cat"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIButtonMessage(3, x, y, z));
				SpawnAnimalsGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 15, this.topPos + 79, 51, 20, new TextComponent("Horse"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIButtonMessage(4, x, y, z));
				SpawnAnimalsGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 78, this.topPos + 79, 51, 20, new TextComponent("Sheep"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new SpawnAnimalsGUIButtonMessage(5, x, y, z));
				SpawnAnimalsGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
	}
}
