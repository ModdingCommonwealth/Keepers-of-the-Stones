
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.RainStoneUseProcedure;
import power.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class RainStoneItem extends Item {
	public RainStoneItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_ADDITIONAL_GROUP).durability(10).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("rain_stone");
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
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		RainStoneUseProcedure.execute(entity);
		return ar;
	}
}
