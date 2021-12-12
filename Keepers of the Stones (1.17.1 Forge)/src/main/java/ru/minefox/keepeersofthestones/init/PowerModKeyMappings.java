
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepeersofthestones.init;

import ru.minefox.keepeersofthestones.network.DetransformKeyMessage;
import ru.minefox.keepeersofthestones.PowerMod;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fmlclient.registry.ClientRegistry;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerModKeyMappings {
	public static final KeyMapping DETRANSFORM_KEY = new KeyMapping("key.power.detransform_key", GLFW.GLFW_KEY_U, "key.categories.stones");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(DETRANSFORM_KEY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == DETRANSFORM_KEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						PowerMod.PACKET_HANDLER.sendToServer(new DetransformKeyMessage(0, 0));
						DetransformKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
