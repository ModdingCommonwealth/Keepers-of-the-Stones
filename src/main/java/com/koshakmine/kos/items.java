package com.koshakmine.kos;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import javax.swing.*;

public class items {
    // fire stone
    public class FireStoneItem extends Item {

        public FireStoneItem(Settings settings) {
            super(settings);
        }

        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

            return TypedActionResult.success(playerEntity.getStackInHand(hand));
        }
    }
    // fire sword
    public class FireSwordItem extends Item {

        public FireSwordItem(Settings settings) {
            super(settings);
        }

        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
            interface AttackEntityCallback(ActionResult) {
                abstract ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable() EntityHitResult hitResult);
            }
            return TypedActionResult.success(playerEntity.getStackInHand(hand));
        }
    }
}

