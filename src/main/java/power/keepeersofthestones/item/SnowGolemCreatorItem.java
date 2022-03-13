
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.GolemCreateProcedure;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

public class SnowGolemCreatorItem extends Item {
	public SnowGolemCreatorItem() {
		super(new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("snow_golem_creator");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		GolemCreateProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return retval;
	}
}
