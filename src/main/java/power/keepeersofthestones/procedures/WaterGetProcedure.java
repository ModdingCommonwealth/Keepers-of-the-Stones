package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class WaterGetProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!PowerModVariables.WorldVariables.get(world).water_stone) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.WATER_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			PowerModVariables.WorldVariables.get(world).water_stone = true;
			PowerModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
