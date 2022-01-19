
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.ChoiseMagicStoneGUIMenu;
import power.keepeersofthestones.procedures.WaterGetProcedure;
import power.keepeersofthestones.procedures.IceGetProcedure;
import power.keepeersofthestones.procedures.FireGetProcedure;
import power.keepeersofthestones.procedures.EnergyGetProcedure;
import power.keepeersofthestones.procedures.EarthGetProcedure;
import power.keepeersofthestones.procedures.AirGetProcedure;
import power.keepeersofthestones.PowerMod;

import net.minecraftforge.fmllegacy.network.NetworkEvent;
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
public class ChoiseMagicStoneGUIButtonMessage {
	private final int buttonID, x, y, z;

	public ChoiseMagicStoneGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public ChoiseMagicStoneGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(ChoiseMagicStoneGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(ChoiseMagicStoneGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = ChoiseMagicStoneGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			FireGetProcedure.execute(world, entity);
		}
		if (buttonID == 1) {

			AirGetProcedure.execute(world, entity);
		}
		if (buttonID == 2) {

			WaterGetProcedure.execute(world, entity);
		}
		if (buttonID == 3) {

			EarthGetProcedure.execute(world, entity);
		}
		if (buttonID == 4) {

			EnergyGetProcedure.execute(world, entity);
		}
		if (buttonID == 5) {

			IceGetProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(ChoiseMagicStoneGUIButtonMessage.class, ChoiseMagicStoneGUIButtonMessage::buffer,
				ChoiseMagicStoneGUIButtonMessage::new, ChoiseMagicStoneGUIButtonMessage::handler);
	}
}
