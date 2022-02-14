
package power.keepeersofthestones.network;

import power.keepeersofthestones.world.inventory.ChoiseMagicStoneGUIMenu;
import power.keepeersofthestones.procedures.WaterGetProcedure;
import power.keepeersofthestones.procedures.VacuumGetProcedure;
import power.keepeersofthestones.procedures.TornadoGetProcedure;
import power.keepeersofthestones.procedures.SunGetProcedure;
import power.keepeersofthestones.procedures.SoundGetProcedure;
import power.keepeersofthestones.procedures.ShadowGetProcedure;
import power.keepeersofthestones.procedures.RainGetProcedure;
import power.keepeersofthestones.procedures.OceanGetProcedure;
import power.keepeersofthestones.procedures.NextPageGUIChoiceStoneProcedure;
import power.keepeersofthestones.procedures.MetalGetProcedure;
import power.keepeersofthestones.procedures.LightningGetProcedure;
import power.keepeersofthestones.procedures.LightGetProcedure;
import power.keepeersofthestones.procedures.LavaGetProcedure;
import power.keepeersofthestones.procedures.IceGetProcedure;
import power.keepeersofthestones.procedures.GreeneryGetProcedure;
import power.keepeersofthestones.procedures.FireGetProcedure;
import power.keepeersofthestones.procedures.EnergyGetProcedure;
import power.keepeersofthestones.procedures.EarthGetProcedure;
import power.keepeersofthestones.procedures.CrystalGetProcedure;
import power.keepeersofthestones.procedures.AnimalsGetProcedure;
import power.keepeersofthestones.procedures.AirGetProcedure;
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
		if (buttonID == 6) {

			LightningGetProcedure.execute(world, entity);
		}
		if (buttonID == 7) {

			SoundGetProcedure.execute(world, entity);
		}
		if (buttonID == 8) {

			CrystalGetProcedure.execute(world, entity);
		}
		if (buttonID == 9) {

			LavaGetProcedure.execute(world, entity);
		}
		if (buttonID == 10) {

			RainGetProcedure.execute(world, entity);
		}
		if (buttonID == 11) {

			OceanGetProcedure.execute(world, entity);
		}
		if (buttonID == 12) {

			GreeneryGetProcedure.execute(world, entity);
		}
		if (buttonID == 13) {

			TornadoGetProcedure.execute(world, entity);
		}
		if (buttonID == 14) {

			NextPageGUIChoiceStoneProcedure.execute(world, x, y, z, entity);
		}
		if (buttonID == 15) {

			AnimalsGetProcedure.execute(world, entity);
		}
		if (buttonID == 16) {

			MetalGetProcedure.execute(world, entity);
		}
		if (buttonID == 17) {

			LightGetProcedure.execute(world, entity);
		}
		if (buttonID == 18) {

			ShadowGetProcedure.execute(world, entity);
		}
		if (buttonID == 19) {

			VacuumGetProcedure.execute(world, entity);
		}
		if (buttonID == 20) {

			SunGetProcedure.execute(world, entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		PowerMod.addNetworkMessage(ChoiseMagicStoneGUIButtonMessage.class, ChoiseMagicStoneGUIButtonMessage::buffer,
				ChoiseMagicStoneGUIButtonMessage::new, ChoiseMagicStoneGUIButtonMessage::handler);
	}
}
