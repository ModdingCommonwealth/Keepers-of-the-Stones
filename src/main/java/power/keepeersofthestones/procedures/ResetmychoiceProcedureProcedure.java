package power.keepeersofthestones.procedures;

import power.keepeersofthestones.world.inventory.ChoiseMagicStoneGUIMenu;
import power.keepeersofthestones.network.PowerModVariables;
import power.keepeersofthestones.init.PowerModItems;
import power.keepeersofthestones.init.PowerModGameRules;

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

public class ResetmychoiceProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(PowerModGameRules.CANRECHOISESTONE) == true) {
			if (!(entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null)
					.orElse(new PowerModVariables.PlayerVariables())).selected) {
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.FIRE_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.FIRE_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).fire_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.AIR_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.AIR_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).air_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.WATER_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.WATER_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).water_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.EARTH_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.EARTH_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).earth_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.ENERGY_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.ENERGY_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).energy_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.ICE_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.ICE_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).ice_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.LIGHTNING_STONE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.LIGHTNING_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).lightning_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.SOUND_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.SOUND_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).sound_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.CRYSTAL_STONE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.CRYSTAL_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).crystal_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.LAVA_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.LAVA_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).lava_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.RAIN_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.RAIN_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).rain_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.TORNADO_STONE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.TORNADO_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).tornado_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.OCEAN_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.OCEAN_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).ocean_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.GREENERY_STONE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.GREENERY_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).greenery_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.ANIMALS_STONE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.ANIMALS_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).animals_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.METAL_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.METAL_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).metal_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.LIGHT_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.LIGHT_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).light_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.SHADOW_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.SHADOW_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).shadow_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.VACUUM_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.VACUUM_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).vacuum_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.SUN_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.SUN_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).sun_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.MOON_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.MOON_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).moon_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.CREATION_STONE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.CREATION_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).creation_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.DESTRUCTION_STONE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.DESTRUCTION_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).destruction_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.COSMOS_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.COSMOS_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).cosmos_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.BLOOD_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.BLOOD_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).blood_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.TIME_STONE)) : false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.TIME_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.WorldVariables.get(world).time_stone = (boolean) (false);
				PowerModVariables.WorldVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.TECHNOLOGY_STONE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.TECHNOLOGY_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.MapVariables.get(world).technology_stone = (boolean) (false);
				PowerModVariables.MapVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
			if (entity instanceof Player _playerHasItem
					? _playerHasItem.getInventory().contains(new ItemStack(PowerModItems.TELEPORTATION_STONE))
					: false) {
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(PowerModItems.TELEPORTATION_STONE);
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1,
							_player.inventoryMenu.getCraftSlots());
				}
				PowerModVariables.MapVariables.get(world).teleportation_stone = (boolean) (false);
				PowerModVariables.MapVariables.get(world).syncData(world);
				{
					boolean _setval = (boolean) (false);
					entity.getCapability(PowerModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.selected = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					if (entity instanceof ServerPlayer _ent) {
						BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
						NetworkHooks.openGui((ServerPlayer) _ent, new MenuProvider() {
							@Override
							public Component getDisplayName() {
								return new TextComponent("ChoiseMagicStoneGUI");
							}

							@Override
							public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
								return new ChoiseMagicStoneGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
							}
						}, _bpos);
					}
				}
			}
		}
	}
}
