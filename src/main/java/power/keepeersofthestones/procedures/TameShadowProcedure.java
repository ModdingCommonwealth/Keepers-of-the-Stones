package power.keepeersofthestones.procedures;

import power.keepeersofthestones.item.ShadowSwordItem;
import power.keepeersofthestones.PowerMod;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class TameShadowProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure TameShadow!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				PowerMod.LOGGER.warn("Failed to load dependency sourceentity for procedure TameShadow!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((sourceentity instanceof PlayerEntity)
				? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(ShadowSwordItem.block))
				: false) {
			if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
				((TameableEntity) entity).setTamed(true);
				((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
			}
		}
	}
}
