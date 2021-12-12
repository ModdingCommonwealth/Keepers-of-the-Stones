
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.minefox.keepeersofthestones.init;

import ru.minefox.keepeersofthestones.block.entity.WoodStoneBoxBlockEntity;
import ru.minefox.keepeersofthestones.block.entity.StoneStoneBoxBlockEntity;
import ru.minefox.keepeersofthestones.block.entity.IronStoneBoxBlockEntity;
import ru.minefox.keepeersofthestones.block.entity.GoldStoneBoxBlockEntity;
import ru.minefox.keepeersofthestones.block.entity.AndesiteStoneBoxBlockEntity;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> WOOD_STONE_BOX = register("power:wood_stone_box", PowerModBlocks.WOOD_STONE_BOX,
			WoodStoneBoxBlockEntity::new);
	public static final BlockEntityType<?> STONE_STONE_BOX = register("power:stone_stone_box", PowerModBlocks.STONE_STONE_BOX,
			StoneStoneBoxBlockEntity::new);
	public static final BlockEntityType<?> ANDESITE_STONE_BOX = register("power:andesite_stone_box", PowerModBlocks.ANDESITE_STONE_BOX,
			AndesiteStoneBoxBlockEntity::new);
	public static final BlockEntityType<?> IRON_STONE_BOX = register("power:iron_stone_box", PowerModBlocks.IRON_STONE_BOX,
			IronStoneBoxBlockEntity::new);
	public static final BlockEntityType<?> GOLD_STONE_BOX = register("power:gold_stone_box", PowerModBlocks.GOLD_STONE_BOX,
			GoldStoneBoxBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
