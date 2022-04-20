package com.koshakmine.kos.client;

import com.koshakmine.kos.Main;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.StickyKeyBinding;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.network.PacketByteBuf;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public class KosClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        KeyBinding resetbinding = KeyBindingHelper.registerKeyBinding(new StickyKeyBinding("key.resetstone", GLFW.GLFW_KEY_U, "key.category.kos", () -> true));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            if (resetbinding.isPressed()) {
                //Fire Master
                PacketByteBuf buf = PacketByteBufs.create();
            }
        });
        KeyBinding flybinding = KeyBindingHelper.registerKeyBinding(new StickyKeyBinding("key.fly", GLFW.GLFW_KEY_R, "key.category.kos", () -> true));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            if (flybinding.isPressed()) {
                if(client.player.hasStatusEffect(Main.FireMasterEffect)) {
                    if(client.player.hasStatusEffect(StatusEffects.LEVITATION)){
                        client.player.removeStatusEffect(StatusEffects.LEVITATION);
                    } else {
                        StatusEffectInstance effect = new StatusEffectInstance(StatusEffects.LEVITATION, 999999, 0);
                        client.player.addStatusEffect(effect);
                    }
                }

            }
        });
    }

}
