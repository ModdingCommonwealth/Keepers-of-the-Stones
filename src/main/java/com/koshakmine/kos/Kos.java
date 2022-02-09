package com.koshakmine.kos;

import com.koshakmine.kos.customitems.FireStoneItem;
import com.koshakmine.kos.customitems.FireSwordItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Kos implements ModInitializer {
        public final static FireSwordItem Fire_Sword = new FireSwordItem(ToolMaterials.NETHERITE, 7, -2.5F, new FabricItemSettings().group(ItemGroup.COMBAT));
        public final FireStoneItem Fire_Stone = new FireStoneItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));

        @Override
        public void onInitialize() {
            Registry.register(Registry.ITEM, new Identifier("kos", "fire_stone"), Fire_Stone);
            Registry.register(Registry.ITEM, new Identifier("kos", "fire_sword"), Fire_Sword);
        }


}
