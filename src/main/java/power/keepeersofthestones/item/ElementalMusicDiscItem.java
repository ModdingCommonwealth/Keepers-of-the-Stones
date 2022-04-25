
package power.keepeersofthestones.item;

import power.keepeersofthestones.itemgroup.TechnologiesAndArtifactsItemGroup;
import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

@PowerModElements.ModElement.Tag
public class ElementalMusicDiscItem extends PowerModElements.ModElement {
	@ObjectHolder("power:elemental_music_disc")
	public static final Item block = null;

	public ElementalMusicDiscItem(PowerModElements instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, PowerModElements.sounds.get(new ResourceLocation("power:powerful_stone")),
					new Item.Properties().group(TechnologiesAndArtifactsItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("elemental_music_disc");
		}
	}
}
