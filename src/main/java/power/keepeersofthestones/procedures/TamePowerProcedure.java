package power.keepeersofthestones.procedures;

import power.keepeersofthestones.item.TamerItem;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.Map;

public class TamePowerProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure TamePower!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure TamePower!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				PowerMod.LOGGER.warn("Failed to load dependency sourceentity for procedure TamePower!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PowerMod.LOGGER.warn("Failed to load dependency itemstack for procedure TamePower!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == TamerItem.block) {
			if (world.isRemote()) {
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
			}
			if (sourceentity instanceof PlayerEntity)
				((PlayerEntity) sourceentity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 400);
			if ((entity instanceof TameableEntity) && (sourceentity instanceof PlayerEntity)) {
				((TameableEntity) entity).setTamed(true);
				((TameableEntity) entity).setTamedBy((PlayerEntity) sourceentity);
			}
		}
	}
}
