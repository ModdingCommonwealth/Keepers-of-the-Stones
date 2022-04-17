package power.keepeersofthestones.procedures;

import power.keepeersofthestones.world.inventory.SoundEmitateChoiceMenu;
import power.keepeersofthestones.world.inventory.EBWaterMenu;
import power.keepeersofthestones.world.inventory.EBVacuumMenu;
import power.keepeersofthestones.world.inventory.EBTornadoMenu;
import power.keepeersofthestones.world.inventory.EBTimeMenu;
import power.keepeersofthestones.world.inventory.EBTeleportationMenu;
import power.keepeersofthestones.world.inventory.EBSunMenu;
import power.keepeersofthestones.world.inventory.EBSpaceMenu;
import power.keepeersofthestones.world.inventory.EBSoundMenu;
import power.keepeersofthestones.world.inventory.EBShadowMenu;
import power.keepeersofthestones.world.inventory.EBRainMenu;
import power.keepeersofthestones.world.inventory.EBOceanMenu;
import power.keepeersofthestones.world.inventory.EBMoonMenu;
import power.keepeersofthestones.world.inventory.EBMetalMenu;
import power.keepeersofthestones.world.inventory.EBLightningMenu;
import power.keepeersofthestones.world.inventory.EBLightMenu;
import power.keepeersofthestones.world.inventory.EBLavaMenu;
import power.keepeersofthestones.world.inventory.EBIceMenu;
import power.keepeersofthestones.world.inventory.EBGreeneryMenu;
import power.keepeersofthestones.world.inventory.EBFireMenu;
import power.keepeersofthestones.world.inventory.EBExplosionMenu;
import power.keepeersofthestones.world.inventory.EBEnergyMenu;
import power.keepeersofthestones.world.inventory.EBEarthMenu;
import power.keepeersofthestones.world.inventory.EBDestructionMenu;
import power.keepeersofthestones.world.inventory.EBCrystalMenu;
import power.keepeersofthestones.world.inventory.EBCreationMenu;
import power.keepeersofthestones.world.inventory.EBBlueFlameMenu;
import power.keepeersofthestones.world.inventory.EBBloodMenu;
import power.keepeersofthestones.world.inventory.EBAnimalsMenu;
import power.keepeersofthestones.world.inventory.EBAmberMenu;
import power.keepeersofthestones.world.inventory.EBAirMenu;
import power.keepeersofthestones.init.PowerModItems;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import io.netty.buffer.Unpooled;

public class OpenBookProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.FIRE_STONE.get())) : false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBFire");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBFireMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.AIR_STONE.get())) : false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBAir");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBAirMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.WATER_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBWater");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBWaterMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.EARTH_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBEarth");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBEarthMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.ENERGY_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBEnergy");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBEnergyMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.ICE_STONE.get())) : false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBIce");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBIceMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.LIGHTNING_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBLightning");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBLightningMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.SOUND_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBSound");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBSoundMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.CRYSTAL_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBCrystal");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBCrystalMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.LAVA_STONE.get())) : false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBLava");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBLavaMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.RAIN_STONE.get())) : false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBRain");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBRainMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.TORNADO_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBTornado");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBTornadoMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.OCEAN_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBOcean");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBOceanMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.GREENERY_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBGreenery");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBGreeneryMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.ANIMALS_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBAnimals");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBAnimalsMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.METAL_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBMetal");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBMetalMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.LIGHT_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBLight");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBLightMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.SHADOW_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBShadow");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBShadowMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.VACUUM_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBVacuum");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBVacuumMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.SUN_STONE.get())) : false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBSun");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBSunMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.MOON_STONE.get())) : false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBMoon");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBMoonMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.SPACE_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBSpace");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBSpaceMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.TIME_STONE.get())) : false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBTime");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBTimeMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.CREATION_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBCreation");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBCreationMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.DESTRUCTION_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBDestruction");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBDestructionMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.BLOOD_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBBlood");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBBloodMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.TECHNOLOGY_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("SoundEmitateChoice");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new SoundEmitateChoiceMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.TELEPORTATION_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBTeleportation");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBTeleportationMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.EXPLOSION_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBExplosion");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBExplosionMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.AMBER_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBAmber");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBAmberMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.BLUE_FLAME_STONE.get()))
				: false) {
			{
				if (entity instanceof ServerPlayer _ent) {
					BlockPos _bpos = new BlockPos(x, y, z);
					NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
						@Override
						public Component getDisplayName() {
							return new TextComponent("EBBlueFlame");
						}

						@Override
						public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
							return new EBBlueFlameMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
						}
					}, _bpos);
				}
			}
		}
		GetPowerLevel1Procedure.execute(entity);
	}
}
