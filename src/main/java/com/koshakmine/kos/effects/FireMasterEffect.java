package com.koshakmine.kos.effects;


import com.koshakmine.kos.Main;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;


public class FireMasterEffect extends StatusEffect {

    public FireMasterEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x98D982);
    }

    @Override
        public void onRemoved (LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if(entity instanceof PlayerEntity player){
            ItemStack sword = new ItemStack(Main.Fire_Sword);
            ItemStack fireball = new ItemStack(Main.MagicFireballItem);
            ItemStack stone = new ItemStack(Main.Fire_Stone);
            int slot1 = player.getInventory().getSlotWithStack(sword);
            int slot2 = player.getInventory().getSlotWithStack(fireball);
            player.getInventory().removeStack(slot1, 1);
            player.getInventory().removeStack(slot2, 1);
            player.giveItemStack(stone);

        }
        super.onRemoved(entity, attributes, amplifier);
    }
}

