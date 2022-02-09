package com.koshakmine.kos.effects;

import com.koshakmine.kos.Kos;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.AttributeContainer;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.item.ItemStack;


public class FireMasterEffect extends StatusEffect {

    public FireMasterEffect() {
        super(StatusEffectCategory.BENEFICIAL, 0x98D982);
    }

    @Override
    public void onRemoved (LivingEntity entity, AttributeContainer attributes, int amplifier) {
        if(entity.isPlayer()){
            entity.setOnFireFor(1);

        }
        super.onRemoved(entity, attributes, amplifier);
    }
}
