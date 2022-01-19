package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class EarthGetProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!PowerModVariables.WorldVariables.get(world).earth_stone) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(PowerModItems.EARTH_STONE);
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			PowerModVariables.WorldVariables.get(world).earth_stone = true;
			PowerModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof Player _player)
				_player.closeContainer();
		}
	}
}
