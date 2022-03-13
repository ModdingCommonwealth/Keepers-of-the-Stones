
package power.keepeersofthestones.item;

import power.keepeersofthestones.procedures.EnergyShieldProcedureProcedure;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

public class EnergyShieldItem extends Item {
	public EnergyShieldItem() {
		super(new Item.Properties().tab(null).stacksTo(1).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("energy_shield");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		EnergyShieldProcedureProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
		return retval;
	}
}
