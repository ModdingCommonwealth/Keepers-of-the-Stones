package power.keepeersofthestones.procedures;

import power.keepeersofthestones.item.MoonWitherItem;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;

import java.util.Map;

public class MoonWitherUseProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure MoonWitherUse!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure MoonWitherUse!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				PowerMod.LOGGER.warn("Failed to load dependency sourceentity for procedure MoonWitherUse!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				PowerMod.LOGGER.warn("Failed to load dependency itemstack for procedure MoonWitherUse!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == MoonWitherItem.block) {
			if (world.isRemote()) {
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
			}
			{
				Entity _ent = sourceentity;
				if (!_ent.world.isRemote && _ent.world.getServer() != null) {
					_ent.world.getServer().getCommandManager().handleCommand(_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
							"item replace entity @s weapon.mainhand with air");
				}
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.WITHER, (int) 200, (int) 4, (false), (false)));
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private IWorld world;

				public void start(IWorld world, int waitTicks) {
					this.waitTicks = waitTicks;
					MinecraftForge.EVENT_BUS.register(this);
					this.world = world;
				}

				@SubscribeEvent
				public void tick(TickEvent.ServerTickEvent event) {
					if (event.phase == TickEvent.Phase.END) {
						this.ticks += 1;
						if (this.ticks >= this.waitTicks)
							run();
					}
				}

				private void run() {
					if ((sourceentity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).moon) {
						if (!((sourceentity instanceof PlayerEntity)
								? ((PlayerEntity) sourceentity).inventory.hasItemStack(new ItemStack(MoonWitherItem.block))
								: false)) {
							{
								Entity _ent = sourceentity;
								if (!_ent.world.isRemote && _ent.world.getServer() != null) {
									_ent.world.getServer().getCommandManager().handleCommand(
											_ent.getCommandSource().withFeedbackDisabled().withPermissionLevel(4),
											"give @s power:moon_wither{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
								}
							}
						}
					}
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, (int) 400);
		}
	}
}
