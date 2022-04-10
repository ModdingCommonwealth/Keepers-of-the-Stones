package com.koshakmine.kos.customitems;

import com.koshakmine.kos.entities.MagicFiraballEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MagicFireballItem extends Item {

    public MagicFireballItem(Settings settings) {
        super(settings);
    }
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand); // creates a new ItemStack instance of the user's itemStack in-hand
		user.getItemCooldownManager().set(this, 40);
        if (!world.isClient) {
            MagicFiraballEntity firaballEntity = new MagicFiraballEntity(world, user);
            firaballEntity.setItem(itemStack);
            firaballEntity.setVelocity(user, user.getPitch(), user.getYaw(), 0.0F, 1F, 0F);
            world.spawnEntity(firaballEntity); // spawns entity
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        if (!user.getAbilities().creativeMode) {
            itemStack.decrement(1); // decrements itemStack if user is not in creative mode
        }

        return TypedActionResult.success(itemStack, world.isClient());
    }

}
