package power.keepeersofthestones.procedures;

import power.keepeersofthestones.item.EnergyStoneItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import java.util.Map;

public class EnergyGetProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure EnergyGet!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure EnergyGet!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).selected) {
			if (!PowerModVariables.WorldVariables.get(world).energy_stone) {
				if (entity instanceof PlayerEntity) {
					ItemStack _setstack = new ItemStack(EnergyStoneItem.block);
					_setstack.setCount((int) 1);
					ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
				}
				PowerModVariables.WorldVariables.get(world).energy_stone = (true);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (true);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).closeScreen();
			}
		}
	}
}
