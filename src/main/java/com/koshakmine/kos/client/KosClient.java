package com.koshakmine.kos.client;

import com.koshakmine.kos.Main;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.option.StickyKeyBinding;
import net.minecraft.item.ItemStack;
import org.lwjgl.glfw.GLFW;

@Environment(EnvType.CLIENT)
public class KosClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        KeyBinding stickyBinding = KeyBindingHelper.registerKeyBinding(new StickyKeyBinding("key.resetstone", GLFW.GLFW_KEY_U, "key.category.kos", () -> true));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {

            if (stickyBinding.isPressed()) {
                //Fire Master
                client.player.removeStatusEffect(Main.FireMasterEffect);
                ItemStack sword = new ItemStack(Main.Fire_Sword);
                ItemStack fireball = new ItemStack(Main.MagicFireballItem);
                ItemStack stone = new ItemStack(Main.Fire_Stone);
                ItemStack burn = new ItemStack(Main.BurnItem);
                int slot1 = client.player.getInventory().getSlotWithStack(sword);
                int slot2 = client.player.getInventory().getSlotWithStack(fireball);
                int slot3 = client.player.getInventory().getSlotWithStack(burn);
                client.player.getInventory().removeStack(slot1, 1);
                client.player.getInventory().removeStack(slot2, 1);
                client.player.getInventory().removeStack(slot3, 1);
                client.player.giveItemStack(stone);
            }
        });
    }

}
