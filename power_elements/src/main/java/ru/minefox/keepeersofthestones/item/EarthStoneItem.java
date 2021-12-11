
package ru.minefox.keepeersofthestones.item;

import ru.minefox.keepeersofthestones.procedures.EarthStoneUseProcedure;
import ru.minefox.keepeersofthestones.init.PowerModTabs;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

public class EarthStoneItem extends Item {
	public EarthStoneItem() {
		super(new Item.Properties().tab(PowerModTabs.TAB_MAGICAL_STONE).durability(10).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("earth_stone");
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
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EarthStoneUseProcedure.execute(entity);
		return ar;
	}
}
