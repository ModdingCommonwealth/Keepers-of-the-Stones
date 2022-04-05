package power.keepeersofthestones.procedures;

import power.keepeersofthestones.potion.TimeStopEffectPotionEffect;
import power.keepeersofthestones.potion.AccelerationTimeEffectPotionEffect;
import power.keepeersofthestones.item.TimeStopItem;
import power.keepeersofthestones.PowerMod;

import net.minecraft.world.IWorld;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.Map;
import java.util.Collection;

public class TimeStopUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure TimeStopUse!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure TimeStopUse!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PowerMod.LOGGER.warn("Failed to load dependency itemstack for procedure TimeStopUse!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (!(new Object() {
			boolean check(Entity _entity) {
				if (_entity instanceof LivingEntity) {
					Collection<EffectInstance> effects = ((LivingEntity) _entity).getActivePotionEffects();
					for (EffectInstance effect : effects) {
						if (effect.getPotion() == AccelerationTimeEffectPotionEffect.potion)
							return true;
					}
				}
				return false;
			}
		}.check(entity))) {
			if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == TimeStopItem.block) {
				if (world.isRemote()) {
					Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
				}
				if (entity instanceof PlayerEntity)
					((PlayerEntity) entity).getCooldownTracker().setCooldown(itemstack.getItem(), (int) 400);
				{
					Entity _ent = entity;
					if (!_ent.world.isRemote && _ent.world.getServer() != null) {
						_ent.world.getServer().getCommandManager().handleCommand(
								_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "effect give @e minecraft:slowness 60 255");
					}
				}
				if (entity instanceof LivingEntity)
					((LivingEntity) entity)
							.addPotionEffect(new EffectInstance(TimeStopEffectPotionEffect.potion, (int) 1500, (int) 0, (false), (false)));
			}
		}
	}
}
