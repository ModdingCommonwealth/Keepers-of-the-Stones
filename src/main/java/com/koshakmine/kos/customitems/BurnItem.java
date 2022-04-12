package com.koshakmine.kos.customitems;


import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class BurnItem extends Item {

    public BurnItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
            context.getWorld().setBlockState(context.getBlockPos().up(), Blocks.FIRE.getDefaultState());

        return super.useOnBlock(context);
    }
}

