package power.keepeersofthestones.procedures;

import power.keepeersofthestones.item.WaterStoneItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class WaterGetProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure WaterGet!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure WaterGet!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		if (!PowerModVariables.WorldVariables.get(world).water_stone) {
			if (entity instanceof PlayerEntity) {
				ItemStack _setstack = new ItemStack(WaterStoneItem.block);
				_setstack.setCount((int) 1);
				ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
			}
			PowerModVariables.WorldVariables.get(world).water_stone = (true);
			PowerModVariables.WorldVariables.get(world).syncData(world);
		}
	}
}
