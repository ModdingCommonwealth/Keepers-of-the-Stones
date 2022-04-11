
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.CheckpointGUIMenu;
import power.keepeersofthestones.procedures.TimeCheckpointProcedure;
import power.keepeersofthestones.procedures.ReturnToPresentProcedure;
import power.keepeersofthestones.procedures.ReturnToPastProcedure;
import power.keepeersofthestones.procedures.ReturnCheckpointProcedure;
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
public class CheckpointGUIButtonMessage {
	private final int buttonID, x, y, z;

	public CheckpointGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CheckpointGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CheckpointGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CheckpointGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = CheckpointGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			ReturnCheckpointProcedure.execute(entity);
		}
		if (buttonID == 1) {

			TimeCheckpointProcedure.execute(x, y, z, entity);
		}
		if (buttonID == 2) {

			ReturnToPastProcedure.execute(entity);
		}
		if (buttonID == 3) {

			ReturnToPresentProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(CheckpointGUIButtonMessage.class, CheckpointGUIButtonMessage::buffer, CheckpointGUIButtonMessage::new,
				CheckpointGUIButtonMessage::handler);
	}
}
