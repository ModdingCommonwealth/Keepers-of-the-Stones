package com.koshakmine.kos;

import com.koshakmine.kos.customitems.FireStoneItem;
import com.koshakmine.kos.customitems.FireSwordItem;
import com.koshakmine.kos.customitems.MagicFireballItem;
import com.koshakmine.kos.effects.FireMasterEffect;
import com.koshakmine.kos.entities.MagicFiraballEntity;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
    //Items

        public final static FireSwordItem Fire_Sword = new FireSwordItem(ToolMaterials.NETHERITE, 7, -2.5F, new FabricItemSettings().group(ItemGroup.COMBAT));
        public final static FireStoneItem Fire_Stone = new FireStoneItem(new FabricItemSettings().group(ItemGroup.MISC).maxCount(1));
    public static final Item MagicFireballItem = new MagicFireballItem(new Item.Settings().group(ItemGroup.MISC).maxCount(16));
    //Blocks

    //Effects
    public static final StatusEffect FireMasterEffect = new FireMasterEffect();
    public static final StatusEffectInstance FireMasterEffectInstance = new StatusEffectInstance(FireMasterEffect, 12000);
    //Entities
    public static final EntityType<MagicFiraballEntity> PackedSnowballEntityType = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("kos", "magic_fireballentity"),
            FabricEntityTypeBuilder.<MagicFiraballEntity>create(SpawnGroup.MISC, MagicFiraballEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)) // dimensions in Minecraft units of the projectile
                    .trackRangeBlocks(4).trackedUpdateRate(10) // necessary for all thrown projectiles (as it prevents it from breaking, lol)
                    .build() // VERY IMPORTANT DONT DELETE FOR THE LOVE OF GOD PSLSSSSSS
    );
        @Override
        public void onInitialize() {
            Registry.register(Registry.ITEM, new Identifier("kos", "fire_stone"), Fire_Stone);
            Registry.register(Registry.ITEM, new Identifier("kos", "fire_sword"), Fire_Sword);
            Registry.register(Registry.STATUS_EFFECT, new Identifier("kos", "fire_master"), FireMasterEffect);
            Registry.register(Registry.ITEM, new Identifier("kos", "magic_fireball"), MagicFireballItem);
        }


}
