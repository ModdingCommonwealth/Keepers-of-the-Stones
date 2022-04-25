
package power.keepeersofthestones.gui;

import power.keepeersofthestones.PowerMod;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ChoiseMagicStoneGUIGuiWindow extends ContainerScreen<ChoiseMagicStoneGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = ChoiseMagicStoneGUIGui.guistate;

	public ChoiseMagicStoneGUIGuiWindow(ChoiseMagicStoneGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 400;
		this.ySize = 200;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/choise_magic_stone_gui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/fire_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 33, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/air_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 60, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/water_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 87, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/earth_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 114, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/energy_master.png"));
		this.blit(ms, this.guiLeft + 19, this.guiTop + 141, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/ice_master.png"));
		this.blit(ms, this.guiLeft + 118, this.guiTop + 33, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/lightning_master.png"));
		this.blit(ms, this.guiLeft + 118, this.guiTop + 60, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/sound_master.png"));
		this.blit(ms, this.guiLeft + 118, this.guiTop + 87, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/crystal_master.png"));
		this.blit(ms, this.guiLeft + 118, this.guiTop + 114, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/lava_master.png"));
		this.blit(ms, this.guiLeft + 118, this.guiTop + 141, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/rain_master.png"));
		this.blit(ms, this.guiLeft + 217, this.guiTop + 33, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/ocean_master.png"));
		this.blit(ms, this.guiLeft + 217, this.guiTop + 87, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/greenery_master.png"));
		this.blit(ms, this.guiLeft + 217, this.guiTop + 114, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/tornado_master.png"));
		this.blit(ms, this.guiLeft + 217, this.guiTop + 60, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/animals_master.png"));
		this.blit(ms, this.guiLeft + 217, this.guiTop + 141, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/metal_master.png"));
		this.blit(ms, this.guiLeft + 307, this.guiTop + 33, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/light_master.png"));
		this.blit(ms, this.guiLeft + 307, this.guiTop + 60, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/shadow_master.png"));
		this.blit(ms, this.guiLeft + 307, this.guiTop + 87, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/vacuum_master.png"));
		this.blit(ms, this.guiLeft + 307, this.guiTop + 114, 0, 0, 16, 16, 16, 16);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("power:textures/screens/sun_master.png"));
		this.blit(ms, this.guiLeft + 307, this.guiTop + 141, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Choose a stone to get it", 127, 6, -12829636);
		this.font.drawString(ms, "1/3", 10, 6, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 33, 56, 20, new StringTextComponent("Fire"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(0, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 60, 56, 20, new StringTextComponent("Air"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(1, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 87, 56, 20, new StringTextComponent("Water"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(2, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 114, 56, 20, new StringTextComponent("Earth"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(3, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 37, this.guiTop + 141, 56, 20, new StringTextComponent("Energy"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(4, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 33, 56, 20, new StringTextComponent("Ice"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(5, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 5, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 60, 56, 20, new StringTextComponent("Lightning"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(6, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 6, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 87, 56, 20, new StringTextComponent("Sound"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(7, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 7, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 114, 56, 20, new StringTextComponent("Crystal"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(8, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 8, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 136, this.guiTop + 141, 56, 20, new StringTextComponent("Lava"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(9, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 9, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 235, this.guiTop + 33, 56, 20, new StringTextComponent("Rain"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(10, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 10, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 235, this.guiTop + 87, 56, 20, new StringTextComponent("Ocean"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(11, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 11, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 235, this.guiTop + 114, 56, 20, new StringTextComponent("Greenery"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(12, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 12, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 235, this.guiTop + 60, 56, 20, new StringTextComponent("Tornado"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(13, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 13, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 316, this.guiTop + 168, 72, 20, new StringTextComponent("Next page"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(14, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 14, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 235, this.guiTop + 141, 56, 20, new StringTextComponent("Animals"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(15, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 15, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 33, 56, 20, new StringTextComponent("Metal"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(16, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 16, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 60, 56, 20, new StringTextComponent("Light"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(17, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 17, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 87, 56, 20, new StringTextComponent("Shadow"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(18, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 18, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 114, 56, 20, new StringTextComponent("Vacuum"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(19, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 19, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 325, this.guiTop + 141, 56, 20, new StringTextComponent("Sun"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new ChoiseMagicStoneGUIGui.ButtonPressedMessage(20, x, y, z));
				ChoiseMagicStoneGUIGui.handleButtonAction(entity, 20, x, y, z);
			}
		}));
	}
}
