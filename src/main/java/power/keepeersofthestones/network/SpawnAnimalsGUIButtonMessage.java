
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.SpawnAnimalsGUIMenu;
import power.keepeersofthestones.procedures.SummonWolfProcedure;
import power.keepeersofthestones.procedures.SummonSheepProcedure;
import power.keepeersofthestones.procedures.SummonHorseProcedure;
import power.keepeersofthestones.procedures.SummonCowProcedure;
import power.keepeersofthestones.procedures.SummonChickenProcedure;
import power.keepeersofthestones.procedures.SummonCatProcedure;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SpawnAnimalsGUIButtonMessage {
	private final int buttonID, x, y, z;

	public SpawnAnimalsGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public SpawnAnimalsGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(SpawnAnimalsGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(SpawnAnimalsGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = SpawnAnimalsGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			SummonWolfProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 1) {

			SummonChickenProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 2) {

			SummonCowProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 3) {

			SummonCatProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 4) {

			SummonHorseProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 5) {

			SummonSheepProcedure.execute(world, x, y, z, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(SpawnAnimalsGUIButtonMessage.class, SpawnAnimalsGUIButtonMessage::buffer, SpawnAnimalsGUIButtonMessage::new,
				SpawnAnimalsGUIButtonMessage::handler);
	}
}
