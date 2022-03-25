package power.keepeersofthestones.procedures;

import power.keepeersofthestones.world.ForbiddenInactiveSpellsGameRule;
import power.keepeersofthestones.item.WoodenShieldItem;
import power.keepeersofthestones.item.WindItem;
import power.keepeersofthestones.item.WhirlpoolItem;
import power.keepeersofthestones.item.WaterKatanaItem;
import power.keepeersofthestones.item.WaterItem;
import power.keepeersofthestones.item.WaterFlowItem;
import power.keepeersofthestones.item.WaterDropItem;
import power.keepeersofthestones.item.VacuumWebItem;
import power.keepeersofthestones.item.VacuumSwordItem;
import power.keepeersofthestones.item.VacuumSpiralItem;
import power.keepeersofthestones.item.VacuumItem;
import power.keepeersofthestones.item.TpOnVenusItem;
import power.keepeersofthestones.item.TpOnMoonItem;
import power.keepeersofthestones.item.TpOnMarsItem;
import power.keepeersofthestones.item.TpOnEarthItem;
import power.keepeersofthestones.item.TornadoItem;
import power.keepeersofthestones.item.TornadoCreateItem;
import power.keepeersofthestones.item.TornadoBattleAxeItem;
import power.keepeersofthestones.item.TigerClawItem;
import power.keepeersofthestones.item.SunRegenerationItem;
import power.keepeersofthestones.item.SunRayItem;
import power.keepeersofthestones.item.SunItem;
import power.keepeersofthestones.item.SunExplodeItem;
import power.keepeersofthestones.item.SunAxeItem;
import power.keepeersofthestones.item.StormItem;
import power.keepeersofthestones.item.SpikeItem;
import power.keepeersofthestones.item.SpawnItem;
import power.keepeersofthestones.item.SoundSwordItem;
import power.keepeersofthestones.item.SoundItem;
import power.keepeersofthestones.item.SoundEmitateItem;
import power.keepeersofthestones.item.SoundBarrierItem;
import power.keepeersofthestones.item.SnowGolemCreatorItem;
import power.keepeersofthestones.item.ShurikenItem;
import power.keepeersofthestones.item.ShieldOfEarthItem;
import power.keepeersofthestones.item.ShadowarmorItem;
import power.keepeersofthestones.item.ShadowSwordItem;
import power.keepeersofthestones.item.ShadowInvisibleItem;
import power.keepeersofthestones.item.ShadowBallItem;
import power.keepeersofthestones.item.SaiItem;
import power.keepeersofthestones.item.RoseSwordItem;
import power.keepeersofthestones.item.RandomItemItem;
import power.keepeersofthestones.item.RainfallItem;
import power.keepeersofthestones.item.RainKnifeItem;
import power.keepeersofthestones.item.RainItem;
import power.keepeersofthestones.item.RainBowItem;
import power.keepeersofthestones.item.PlasmaBallItem;
import power.keepeersofthestones.item.PieceOfEarthItem;
import power.keepeersofthestones.item.OceanSwordItem;
import power.keepeersofthestones.item.OceanItem;
import power.keepeersofthestones.item.MoonWitherItem;
import power.keepeersofthestones.item.MoonStonesItem;
import power.keepeersofthestones.item.MoonAxeItem;
import power.keepeersofthestones.item.MetalItem;
import power.keepeersofthestones.item.MetalInvulnerabilityItem;
import power.keepeersofthestones.item.MagmaShieldItem;
import power.keepeersofthestones.item.MagicFireballItem;
import power.keepeersofthestones.item.LightningStrikeItem;
import power.keepeersofthestones.item.LightningItem;
import power.keepeersofthestones.item.LightingItem;
import power.keepeersofthestones.item.LightSwordItem;
import power.keepeersofthestones.item.LightItem;
import power.keepeersofthestones.item.LavaItem;
import power.keepeersofthestones.item.LavaHoleItem;
import power.keepeersofthestones.item.LavaHammerItem;
import power.keepeersofthestones.item.LavaBallItem;
import power.keepeersofthestones.item.IronShieldItem;
import power.keepeersofthestones.item.IronGolemCreateItem;
import power.keepeersofthestones.item.IceSpearItem;
import power.keepeersofthestones.item.IceShieldItem;
import power.keepeersofthestones.item.IceSharpItem;
import power.keepeersofthestones.item.IceItem;
import power.keepeersofthestones.item.IceBallItem;
import power.keepeersofthestones.item.GreeneryItem;
import power.keepeersofthestones.item.GlowCreateItem;
import power.keepeersofthestones.item.GalacticSwordItem;
import power.keepeersofthestones.item.FlashLightItem;
import power.keepeersofthestones.item.FistofEarthItem;
import power.keepeersofthestones.item.FireSwordItem;
import power.keepeersofthestones.item.FireItem;
import power.keepeersofthestones.item.FertilizerItem;
import power.keepeersofthestones.item.EnergyStaffItem;
import power.keepeersofthestones.item.EnergySphereItem;
import power.keepeersofthestones.item.EnergyShieldItem;
import power.keepeersofthestones.item.EnergyItem;
import power.keepeersofthestones.item.EclipseItem;
import power.keepeersofthestones.item.EarthItem;
import power.keepeersofthestones.item.DestructionPowerItem;
import power.keepeersofthestones.item.DestructionItem;
import power.keepeersofthestones.item.CultivationItem;
import power.keepeersofthestones.item.CrystalShieldItem;
import power.keepeersofthestones.item.CrystalItem;
import power.keepeersofthestones.item.CrystalDaggerItem;
import power.keepeersofthestones.item.CrestcentItem;
import power.keepeersofthestones.item.CreationItem;
import power.keepeersofthestones.item.CreateShadowItem;
import power.keepeersofthestones.item.CosmosItem;
import power.keepeersofthestones.item.CoralShieldItem;
import power.keepeersofthestones.item.ClusterSharpItem;
import power.keepeersofthestones.item.BurnItem;
import power.keepeersofthestones.item.BloodItem;
import power.keepeersofthestones.item.BlackHoleItem;
import power.keepeersofthestones.item.BeeStingItem;
import power.keepeersofthestones.item.AnimalsItem;
import power.keepeersofthestones.item.AirFlowItem;
import power.keepeersofthestones.item.AirBladeItem;
import power.keepeersofthestones.item.AcusticalExplodeItem;
import power.keepeersofthestones.block.ClusterBlockBlock;
import power.keepeersofthestones.PowerModVariables;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.items.ItemHandlerHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;
import java.util.HashMap;

public class RemovalProhibitedItemsProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				Entity entity = event.player;
				World world = entity.world;
				double i = entity.getPosX();
				double j = entity.getPosY();
				double k = entity.getPosZ();
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("x", i);
				dependencies.put("y", j);
				dependencies.put("z", k);
				dependencies.put("world", world);
				dependencies.put("entity", entity);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PowerMod.LOGGER.warn("Failed to load dependency world for procedure RemovalProhibitedItems!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PowerMod.LOGGER.warn("Failed to load dependency entity for procedure RemovalProhibitedItems!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Entity entity = (Entity) dependencies.get("entity");
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
				if (world.getWorldInfo().getGameRulesInstance().getBoolean(ForbiddenInactiveSpellsGameRule.gamerule)) {
					if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).active) {
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BurnItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MagicFireballItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(AirFlowItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WaterFlowItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WaterDropItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ShieldOfEarthItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(FistofEarthItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(PieceOfEarthItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EnergySphereItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EnergyShieldItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EnergyStaffItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IceBallItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IceShieldItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SnowGolemCreatorItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IceSharpItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(PlasmaBallItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(StormItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SoundSwordItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(AcusticalExplodeItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SoundBarrierItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SoundEmitateItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ClusterSharpItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ClusterBlockBlock.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrystalShieldItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LavaHoleItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LavaBallItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(RainfallItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(RainKnifeItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TornadoCreateItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CoralShieldItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WhirlpoolItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(OceanSwordItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(RainBowItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightningStrikeItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(FireSwordItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(AirBladeItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WaterKatanaItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrystalDaggerItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LavaHammerItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TornadoBattleAxeItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MagmaShieldItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IceSpearItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(RoseSwordItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SpikeItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WoodenShieldItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(FertilizerItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CultivationItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BeeStingItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TigerClawItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SpawnItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ShurikenItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SaiItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MetalInvulnerabilityItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IronGolemCreateItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IronShieldItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightSwordItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(FlashLightItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(GlowCreateItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightingItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ShadowSwordItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ShadowBallItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ShadowInvisibleItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CreateShadowItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(VacuumSwordItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(VacuumSpiralItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(VacuumWebItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SunAxeItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SunExplodeItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SunRayItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SunRegenerationItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MoonAxeItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MoonStonesItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EclipseItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MoonWitherItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(RandomItemItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(DestructionPowerItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(GalacticSwordItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BlackHoleItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TpOnMoonItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TpOnMarsItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TpOnVenusItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TpOnEarthItem.block);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(FireItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(FireItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(FireItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(FireItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WaterItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WaterItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WaterItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WaterItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WindItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WindItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WindItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(WindItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EarthItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EarthItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EarthItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EarthItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EnergyItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EnergyItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EnergyItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(EnergyItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IceItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IceItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IceItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(IceItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightningItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightningItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightningItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightningItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SoundItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SoundItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SoundItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SoundItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrystalItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrystalItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrystalItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrystalItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LavaItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LavaItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LavaItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LavaItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(RainItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(RainItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(RainItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(RainItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TornadoItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TornadoItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TornadoItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(TornadoItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(OceanItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(OceanItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(OceanItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(OceanItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(GreeneryItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(GreeneryItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(GreeneryItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(GreeneryItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(AnimalsItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(AnimalsItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(AnimalsItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(AnimalsItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MetalItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MetalItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MetalItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(MetalItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(LightItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ShadowarmorItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ShadowarmorItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ShadowarmorItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(ShadowarmorItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(VacuumItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(VacuumItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(VacuumItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(VacuumItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrestcentItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrestcentItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrestcentItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CrestcentItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SunItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SunItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SunItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(SunItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CreationItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CreationItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CreationItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CreationItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(DestructionItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(DestructionItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(DestructionItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(DestructionItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CosmosItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CosmosItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CosmosItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(CosmosItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BloodItem.helmet);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BloodItem.body);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BloodItem.legs);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof PlayerEntity) {
							ItemStack _stktoremove = new ItemStack(BloodItem.boots);
							((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
									((PlayerEntity) entity).container.func_234641_j_());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.VAMPIRISM);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.BLOOD_REAPER);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.CURSED_DIAMOND);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.BLACK_HEART);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.TIME_HELMET);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.TIME_CHESTPLATE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.TIME_LEGGINGS);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.TIME_BOOTS);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.TIME_BLADE);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.ACCELERATION_TIME);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.TIME_DILATION);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.TIME_STOP);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
						if (entity instanceof Player _player) {
							ItemStack _stktoremove = new ItemStack(PowerModItems.TIME_REVERSED);
							_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
									_player.inventoryMenu.getCraftSlots());
						}
					} else if ((entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
							.orElse(new PowerModVariables.PlayerVariables())).active) {
						if ((entity instanceof PlayerEntity)
								? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(Items.MILK_BUCKET))
								: false) {
							if (entity instanceof PlayerEntity) {
								ItemStack _stktoremove = new ItemStack(Items.MILK_BUCKET);
								((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
										((PlayerEntity) entity).container.func_234641_j_());
							}
							if (entity instanceof PlayerEntity) {
								ItemStack _setstack = new ItemStack(Items.BUCKET);
								_setstack.setCount((int) 1);
								ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
							}
						}
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 2);
	}
}
