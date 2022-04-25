
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
public class PointGUIGuiWindow extends ContainerScreen<PointGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = PointGUIGui.guistate;
	TextFieldWidget tpX;
	TextFieldWidget tpY;
	TextFieldWidget tpZ;

	public PointGUIGuiWindow(PointGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("power:textures/screens/point_gui.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
		tpX.render(ms, mouseX, mouseY, partialTicks);
		tpY.render(ms, mouseX, mouseY, partialTicks);
		tpZ.render(ms, mouseX, mouseY, partialTicks);
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
		if (tpX.isFocused())
			return tpX.keyPressed(key, b, c);
		if (tpY.isFocused())
			return tpY.keyPressed(key, b, c);
		if (tpZ.isFocused())
			return tpZ.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
		tpX.tick();
		tpY.tick();
		tpZ.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "X", 24, 34, -12829636);
		this.font.drawString(ms, "Enter the desired coordinates", 15, 7, -12829636);
		this.font.drawString(ms, "Y", 24, 70, -12829636);
		this.font.drawString(ms, "Z", 24, 106, -12829636);
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
		tpX = new TextFieldWidget(this.font, this.guiLeft + 33, this.guiTop + 25, 120, 20, new StringTextComponent("0")) {
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
		guistate.put("text:tpX", tpX);
		tpX.setMaxStringLength(32767);
		this.children.add(this.tpX);
		tpY = new TextFieldWidget(this.font, this.guiLeft + 33, this.guiTop + 61, 120, 20, new StringTextComponent("0")) {
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
		guistate.put("text:tpY", tpY);
		tpY.setMaxStringLength(32767);
		this.children.add(this.tpY);
		tpZ = new TextFieldWidget(this.font, this.guiLeft + 33, this.guiTop + 97, 120, 20, new StringTextComponent("0")) {
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
		guistate.put("text:tpZ", tpZ);
		tpZ.setMaxStringLength(32767);
		this.children.add(this.tpZ);
		this.addButton(new Button(this.guiLeft + 51, this.guiTop + 133, 67, 20, new StringTextComponent("Teleport"), e -> {
			if (true) {
				PowerMod.PACKET_HANDLER.sendToServer(new PointGUIGui.ButtonPressedMessage(0, x, y, z));
				PointGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
