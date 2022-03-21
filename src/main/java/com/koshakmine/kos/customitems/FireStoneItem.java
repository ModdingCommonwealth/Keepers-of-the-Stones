package com.koshakmine.kos.customitems;

import com.koshakmine.kos.Main;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class FireStoneItem extends Item {

    public FireStoneItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        context.getPlayer().getMainHandStack().setCount(0);
        ItemStack sword = new ItemStack(Main.Fire_Sword);
        context.getPlayer().giveItemStack(sword);
        context.getPlayer().addStatusEffect(Main.FireMasterEffectInstance);

        return super.useOnBlock(context);
    }
}
