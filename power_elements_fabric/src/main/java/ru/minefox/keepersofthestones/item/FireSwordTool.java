
package ru.minefox.keepersofthestones.item;

import net.minecraft.recipe.Ingredient;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

public class FireSwordTool {
	public static final ToolMaterial FIRESWORD_TOOL_MATERIAL = new ToolMaterial() {
		@Override
		public int getDurability() {
			return 5000;
		}

		@Override
		public float getMiningSpeedMultiplier() {
			return 4F;
		}

		@Override
		public float getAttackDamage() {
			return 5F;
		}

		@Override
		public int getMiningLevel() {
			return 1;
		}

		@Override
		public int getEnchantability() {
			return 2;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.EMPTY;
		}
	};
	public static final Item INSTANCE = new SwordItem(FIRESWORD_TOOL_MATERIAL, 0, (float) -2.5, (new FabricItemSettings().group(null).fireproof())) {
	};
}
