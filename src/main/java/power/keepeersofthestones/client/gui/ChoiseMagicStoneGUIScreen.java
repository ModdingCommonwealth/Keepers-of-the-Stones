
package power.keepeersofthestones.client.gui;

import power.keepeersofthestones.world.inventory.ChoiseMagicStoneGUIMenu;
import power.keepeersofthestones.network.ChoiseMagicStoneGUIButtonMessage;
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

public class ChoiseMagicStoneGUIScreen extends AbstractContainerScreen<ChoiseMagicStoneGUIMenu> {
	private final static HashMap<String, Object> guistate = ChoiseMagicStoneGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ChoiseMagicStoneGUIScreen(ChoiseMagicStoneGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 400;
		this.imageHeight = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/choise_magic_stone_gui.png");

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

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/fire_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/air_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/water_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/earth_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/energy_master.png"));
		this.blit(ms, this.leftPos + 19, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/ice_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/lightning_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/sound_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/crystal_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/lava_master.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/rain_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/ocean_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/greenery_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/tornado_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/animals_master.png"));
		this.blit(ms, this.leftPos + 217, this.topPos + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/metal_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 33, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/light_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 60, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/shadow_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 87, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/vacuum_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 114, 0, 0, 16, 16, 16, 16);

		RenderSystem.setShaderTexture(0, new ResourceLocation("power:textures/screens/sun_master.png"));
		this.blit(ms, this.leftPos + 307, this.topPos + 141, 0, 0, 16, 16, 16, 16);

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
		this.font.draw(poseStack, "1/3", 10, 6, -12829636);
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
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 33, 56, 20, new TextComponent("Fire"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(0, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 60, 56, 20, new TextComponent("Air"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(1, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 87, 56, 20, new TextComponent("Water"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(2, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 114, 56, 20, new TextComponent("Earth"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(3, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 37, this.topPos + 141, 56, 20, new TextComponent("Energy"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(4, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 136, this.topPos + 33, 56, 20, new TextComponent("Ice"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(5, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 136, this.topPos + 60, 56, 20, new TextComponent("Lightning"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(6, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 136, this.topPos + 87, 56, 20, new TextComponent("Sound"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(7, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 136, this.topPos + 114, 56, 20, new TextComponent("Crystal"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(8, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 136, this.topPos + 141, 56, 20, new TextComponent("Lava"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(9, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 235, this.topPos + 33, 56, 20, new TextComponent("Rain"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(10, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 235, this.topPos + 87, 56, 20, new TextComponent("Ocean"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(11, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 235, this.topPos + 114, 56, 20, new TextComponent("Greenery"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(12, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 235, this.topPos + 60, 56, 20, new TextComponent("Tornado"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(13, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 316, this.topPos + 168, 72, 20, new TextComponent("Next page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(14, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 235, this.topPos + 141, 56, 20, new TextComponent("Animals"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(15, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 15, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 33, 56, 20, new TextComponent("Metal"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(16, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 16, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 60, 56, 20, new TextComponent("Light"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(17, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 17, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 87, 56, 20, new TextComponent("Shadow"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(18, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 18, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 114, 56, 20, new TextComponent("Vacuum"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(19, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 19, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 325, this.topPos + 141, 56, 20, new TextComponent("Sun"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIButtonMessage(20, x, y, z));
				ChoiseMagicStoneGUIButtonMessage.handleButtonAction(entity, 20, x, y, z);
			}
		}));
	}
}
