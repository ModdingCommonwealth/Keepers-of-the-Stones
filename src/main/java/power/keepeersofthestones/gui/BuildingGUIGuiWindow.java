
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
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class BuildingGUIGuiWindow extends ContainerScreen<BuildingGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = BuildingGUIGui.guistate;
	TextFieldWidget sX;
	TextFieldWidget sY;
	TextFieldWidget sZ;

	public BuildingGUIGuiWindow(BuildingGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 255;
		this.ySize = 211;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/building_gui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
		sX.render(ms, mouseX, mouseY, partialTicks);
		sY.render(ms, mouseX, mouseY, partialTicks);
		sZ.render(ms, mouseX, mouseY, partialTicks);
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
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
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
	public void tick() {
		super.tick();
		sX.tick();
		sY.tick();
		sZ.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Select the structure you want to place", 28, 110, -12829636);
		this.font.drawString(ms, "Enter the coordinates for the structure", 28, 11, -12829636);
		this.font.drawString(ms, "X:", 55, 38, -12829636);
		this.font.drawString(ms, "Y:", 55, 65, -12829636);
		this.font.drawString(ms, "Z:", 55, 92, -12829636);
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
		this.addButton(new Button(this.guiLeft + 181, this.guiTop + 137, 61, 20, new StringTextComponent("Library"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(0, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 100, this.guiTop + 137, 77, 20, new StringTextComponent("Blacksmith"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(1, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 137, 87, 20, new StringTextComponent("Butcher Shop"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(2, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		sX = new TextFieldWidget(this.font, this.guiLeft + 73, this.guiTop + 29, 120, 20, new StringTextComponent("0")) {
			{
				setSuggestion("0");
			}

			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:sX", sX);
		sX.setMaxStringLength(32767);
		this.children.add(this.sX);
		sY = new TextFieldWidget(this.font, this.guiLeft + 73, this.guiTop + 56, 120, 20, new StringTextComponent("0")) {
			{
				setSuggestion("0");
			}

			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:sY", sY);
		sY.setMaxStringLength(32767);
		this.children.add(this.sY);
		sZ = new TextFieldWidget(this.font, this.guiLeft + 73, this.guiTop + 83, 120, 20, new StringTextComponent("0")) {
			{
				setSuggestion("0");
			}

			@Override
			public void writeText(String text) {
				super.writeText(text);
				if (getText().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}

			@Override
			public void setCursorPosition(int pos) {
				super.setCursorPosition(pos);
				if (getText().isEmpty())
					setSuggestion("0");
				else
					setSuggestion(null);
			}
		};
		guistate.put("text:sZ", sZ);
		sZ.setMaxStringLength(32767);
		this.children.add(this.sZ);
		this.addButton(new Button(this.guiLeft + 10, this.guiTop + 164, 82, 20, new StringTextComponent("Streetlight"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new BuildingGUIGui.ButtonPressedMessage(3, x, y, z));
				BuildingGUIGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
	}
}
