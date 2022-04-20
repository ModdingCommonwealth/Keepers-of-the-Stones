
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.SkillsGUIMenu;

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

public class SkillsGUIScreen extends AbstractContainerScreen<SkillsGUIMenu> {
	private final static HashMap<String, Object> guistate = SkillsGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public SkillsGUIScreen(SkillsGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/skills_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/book_of_elements.png"));
		this.blit(ms, this.leftPos + 55, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/fire_stone.png"));
		this.blit(ms, this.leftPos + 10, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/fire_master.png"));
		this.blit(ms, this.leftPos + 10, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/magic_fireball.png"));
		this.blit(ms, this.leftPos + 10, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/book_of_elements.png"));
		this.blit(ms, this.leftPos + 154, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/book_of_elements.png"));
		this.blit(ms, this.leftPos + 262, this.topPos + 33, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "Skills", 172, 6, -12829636);
		this.font.draw(poseStack, "Level 1", 46, 24, -12829636);
		this.font.draw(poseStack, "5 minutes", 46, 60, -12829636);
		this.font.draw(poseStack, "10 minutes", 46, 87, -12829636);
		this.font.draw(poseStack, "3 seconds", 46, 114, -12829636);
		this.font.draw(poseStack, "Level 2", 145, 24, -12829636);
		this.font.draw(poseStack, "Level 3", 253, 24, -12829636);
		this.font.draw(poseStack, "2 seconds", 145, 114, -12829636);
		this.font.draw(poseStack, "3 minutes", 145, 60, -12829636);
		this.font.draw(poseStack, "15 minutes", 145, 87, -12829636);
		this.font.draw(poseStack, "2 minutes", 253, 60, -12829636);
		this.font.draw(poseStack, "20 minutes", 253, 87, -12829636);
		this.font.draw(poseStack, "1 second", 253, 114, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 145, this.topPos + 141, 61, 20, new TextComponent("Upgrade"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 253, this.topPos + 141, 61, 20, new TextComponent("Upgrade"), e -> {
		}));
	}
}
