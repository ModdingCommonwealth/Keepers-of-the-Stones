
package power.keepeersofthestones.item;

import power.keepeersofthestones.init.PowerModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

public class ElementalMusicDiscItem extends RecordItem {
	public ElementalMusicDiscItem() {
		super(0, PowerModSounds.REGISTRY.get(new ResourceLocation("power:powerful_stone")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("elemental_music_disc");
	}
}
