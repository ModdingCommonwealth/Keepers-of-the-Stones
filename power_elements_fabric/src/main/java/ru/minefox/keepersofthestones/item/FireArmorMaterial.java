
package ru.minefox.keepersofthestones.item;

import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.recipe.Ingredient;
import net.minecraft.item.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.entity.EquipmentSlot;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

public class FireArmorMaterial implements ArmorMaterial {
	private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
	private static final int[] PROTECTION_VALUES = new int[]{6, 10, 12, 8};
	public static final Item HELMET = new ArmorItem(new FireArmorMaterial(), EquipmentSlot.HEAD, new Item.Settings().group(null));
	public static final Item CHESTPLATE = new ArmorItem(new FireArmorMaterial(), EquipmentSlot.CHEST, new Item.Settings().group(null));
	public static final Item LEGGINGS = new ArmorItem(new FireArmorMaterial(), EquipmentSlot.LEGS, new Item.Settings().group(null));
	public static final Item BOOTS = new ArmorItem(new FireArmorMaterial(), EquipmentSlot.FEET, new Item.Settings().group(null));

	public int getDurability(EquipmentSlot equipmentSlot_1) {
		return BASE_DURABILITY[equipmentSlot_1.getEntitySlotId()] * 40;
	}

	public int getProtectionAmount(EquipmentSlot equipmentSlot_1) {
		return PROTECTION_VALUES[equipmentSlot_1.getEntitySlotId()];
	}

	public int getEnchantability() {
		return 9;
	}

	public SoundEvent getEquipSound() {
		return new SoundEvent(new Identifier(""));
	}

	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.AIR);
	}

	@Environment(EnvType.CLIENT)
	public String getName() {
		return "fire__";
	}

	public float getToughness() {
		return 10F;
	}

	public float getKnockbackResistance() {
		return 0f;
	}
}
