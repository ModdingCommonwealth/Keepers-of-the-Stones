package power.keepeersofthestones.procedures;

import power.keepeersofthestones.network.PowerModVariables;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class TeleportToBluePortalProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new PowerModVariables.PlayerVariables())).portalstop) {
			if (PowerModVariables.MapVariables.get(world).blue_portal) {
				{
					Entity _ent = entity;
					_ent.teleportTo(PowerModVariables.MapVariables.get(world).bposx, PowerModVariables.MapVariables.get(world).bposy,
							PowerModVariables.MapVariables.get(world).bposz);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(PowerModVariables.MapVariables.get(world).bposx,
								PowerModVariables.MapVariables.get(world).bposy, PowerModVariables.MapVariables.get(world).bposz, _ent.getYRot(),
								_ent.getXRot());
				}
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.portalstop = _setval;
						capability.syncPlayerVariables(entity);
					});
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
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.portalstop = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, 100);
			}
		}
	}
}
