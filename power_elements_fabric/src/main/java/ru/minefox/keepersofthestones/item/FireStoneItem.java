
package ru.minefox.keepersofthestones.item;

import ru.minefox.keepersofthestones.procedures.FireStoneUseProcedure;

import net.minecraft.world.World;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Rarity;
import net.minecraft.util.Hand;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.block.BlockState;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.Map;
import java.util.HashMap;

public class FireStoneItem extends Item {
	public FireStoneItem() {
		super(new FabricItemSettings().group(MagicStonesItemGroup.get()).maxDamage(10).fireproof().rarity(Rarity.COMMON));
	}

	@Override
	public int getMaxUseTime(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
		return (float) (0F);
	}

	@Environment(EnvType.CLIENT)
	@Override
	public boolean hasGlint(ItemStack stack) {
		return true;
	}

	@Override
	public int getEnchantability() {
		return 0;
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity entity, Hand hand) {
		TypedActionResult<ItemStack> retval = super.use(world, entity, hand);
		ItemStack itemstack = retval.getValue();
		double x = entity.getPos().getX();
		double y = entity.getPos().getY();
		double z = entity.getPos().getZ();
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("entity", entity);
			FireStoneUseProcedure.executeProcedure($_dependencies);
		}
		return super.use(world, entity, hand);
	}
}
