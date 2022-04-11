
package power.keepeersofthestones.item;

import power.keepeersofthestones.init.PowerModTabs;
import power.keepeersofthestones.init.PowerModSounds;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class ElementalMusicDiscItem extends RecordItem {
	public ElementalMusicDiscItem() {
		super(0, PowerModSounds.REGISTRY.get(new ResourceLocation("power:powerful_stone")),
				new Item.Properties().tab(PowerModTabs.TAB_TECHNOLOGIES_AND_ARTIFACTS).stacksTo(1).rarity(Rarity.RARE));
	}
}
