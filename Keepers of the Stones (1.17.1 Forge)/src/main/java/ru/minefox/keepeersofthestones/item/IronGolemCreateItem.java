
package ru.minefox.keepeersofthestones.item;

import ru.minefox.keepeersofthestones.procedures.IronGolemCreateUseProcedure;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

public class IronGolemCreateItem extends Item {
	public IronGolemCreateItem() {
		super(new Item.Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("iron_golem_create");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 0F;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		IronGolemCreateUseProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer());
		return retval;
	}
}
