
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import power.keepeersofthestones.network.SpecialAbilityKeyMessage;
import power.keepeersofthestones.network.DetransformKeyMessage;
import power.keepeersofthestones.PowerMod;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class PowerModKeyMappings {
	public static final KeyMapping DETRANSFORM_KEY = new KeyMapping("key.power.detransform_key", GLFW.GLFW_KEY_U, "key.categories.stones");
	public static final KeyMapping SPECIAL_ABILITY_KEY = new KeyMapping("key.power.special_ability_key", GLFW.GLFW_KEY_R, "key.categories.stones");

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(DETRANSFORM_KEY);
		ClientRegistry.registerKeyBinding(SPECIAL_ABILITY_KEY);
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
				if (event.getKey() == SPECIAL_ABILITY_KEY.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						PowerMod.PACKET_HANDLER.sendToServer(new SpecialAbilityKeyMessage(0, 0));
						SpecialAbilityKeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
					}
				}
			}
		}
	}
}
