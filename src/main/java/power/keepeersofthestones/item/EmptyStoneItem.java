
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.EmptyStoneUseProcedure;
import power.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class EmptyStoneItem extends Item {
	public EmptyStoneItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_MISC_KO_S_CATEGORY).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("empty_stone");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EmptyStoneUseProcedure.execute(entity);
		return ar;
	}
}
