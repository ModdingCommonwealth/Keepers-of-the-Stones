package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class TeleportationGetProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).selected) {
			if (!PowerModVariables.MapVariables.get(world).teleportation_stone) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(PowerModItems.TELEPORTATION_STONE);
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
				PowerModVariables.MapVariables.get(world).teleportation_stone = (boolean) (true);
				PowerModVariables.MapVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player)
					_player.closeContainer();
			}
		}
	}
}
