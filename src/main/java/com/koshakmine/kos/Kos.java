package com.koshakmine.kos;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class Kos implements ModInitializer {
        public final FireStoneItem Fire_Stone = new FireStoneItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));
        public final static Item Fire_Sword = new SwordItem(ToolMaterials.NETHERITE, 7, -2.5F, new FabricItemSettings().group(ItemGroup.COMBAT));

        @Override
        public void onInitialize() {
            Registry.register(Registry.ITEM, new Identifier("kos", "fire_stone"), Fire_Stone);
            Registry.register(Registry.ITEM, new Identifier("kos", "fire_sword"), Fire_Sword);
        }

    public class FireStoneItem extends Item {

        public FireStoneItem(Settings settings) {
            super(settings);
        }

        @Override
        public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {

            return TypedActionResult.success(playerEntity.getStackInHand(hand));
        }
    }

}
