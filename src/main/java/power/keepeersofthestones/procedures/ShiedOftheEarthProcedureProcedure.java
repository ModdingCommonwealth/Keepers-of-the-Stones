package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.Minecraft;

public class ShiedOftheEarthProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.SHIELD_OF_EARTH) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(itemstack);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"item replace entity @s weapon.mainhand with air");
			}
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
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
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
										new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-2 ~1 ~-2 ~2 ~5 ~2 stone outline");
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 3);
			new Object() {
				private int ticks = 0;
				private float waitTicks;
				private LevelAccessor world;

				public void start(LevelAccessor world, int waitTicks) {
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
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands()
								.performCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
										new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
										"fill ~-2 ~1 ~-2 ~2 ~5 ~2 dirt outline");
					new Object() {
						private int ticks = 0;
						private float waitTicks;
						private LevelAccessor world;

						public void start(LevelAccessor world, int waitTicks) {
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
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands()
										.performCommand(
												new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "",
														new TextComponent(""), _level.getServer(), null).withSuppressedOutput(),
												"fill ~-2 ~1 ~-2 ~2 ~5 ~2 air outline");
							if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new PowerModVariables.PlayerVariables())).earth) {
								if (!(entity instanceof Player _playerHasItem
										? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.SHIELD_OF_EARTH))
										: false)) {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null)
											_ent.getServer().getCommands().performCommand(
													_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
													"give @s power:shield_of_earth{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
							} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
									.orElse(new PowerModVariables.PlayerVariables())).coal_merger) {
								if (!(entity instanceof Player _playerHasItem
										? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.SHIELD_OF_EARTH))
										: false)) {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null)
											_ent.getServer().getCommands().performCommand(
													_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
													"give @s power:shield_of_earth{Enchantments:[{id:binding_curse,lvl:1},{id:vanishing_curse,lvl:1}]}");
									}
								}
							}
							MinecraftForge.EVENT_BUS.unregister(this);
						}
					}.start(world, 100);
					MinecraftForge.EVENT_BUS.unregister(this);
				}
			}.start(world, 300);
		}
	}
}
