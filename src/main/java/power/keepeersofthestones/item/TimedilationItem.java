
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.TimeDilationUseProcedure;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

public class TimedilationItem extends Item {
	public TimedilationItem() {
		super(new Item.Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("time_dilation");
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
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		TimeDilationUseProcedure.execute(entity.level, entity, sourceentity, itemstack);
		return retval;
	}
}
