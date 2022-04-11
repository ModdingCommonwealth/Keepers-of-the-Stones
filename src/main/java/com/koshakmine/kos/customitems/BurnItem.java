package com.koshakmine.kos.customitems;


import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;

public class BurnItem extends Item {

    public BurnItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {

        context.getWorld().addSyncedBlockEvent(context.getBlockPos(), Blocks.FIRE, 1, 0);


        return super.useOnBlock(context);
    }
}

