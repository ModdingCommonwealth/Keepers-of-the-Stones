/*
 *    MCreator note:
 *
 *    If you lock base mod element files, you can edit this file and the proxy files
 *    and they won't get overwritten. If you change your mod package or modid, you
 *    need to apply these changes to this file MANUALLY.
 *
 *
 *    If you do not lock base mod element files in Workspace settings, this file
 *    will be REGENERATED on each build.
 *
 */
package ru.minefox.keepersofthestones;

import ru.minefox.keepersofthestones.procedures.RechargeMagicalFireballProcedure;
import ru.minefox.keepersofthestones.procedures.FireStoneUseProcedure;
import ru.minefox.keepersofthestones.procedures.FireMasterEffectsProcedure;
import ru.minefox.keepersofthestones.procedures.FireMasterEffectStartProcedure;
import ru.minefox.keepersofthestones.procedures.FireMasterEffectEndProcedure;
import ru.minefox.keepersofthestones.procedures.BurnProcedureProcedure;
import ru.minefox.keepersofthestones.procedures.BurnBlockProcedureProcedure;
import ru.minefox.keepersofthestones.item.MagicStonesItemGroup;
import ru.minefox.keepersofthestones.item.FireSwordTool;
import ru.minefox.keepersofthestones.item.FireStoneItem;
import ru.minefox.keepersofthestones.item.FireArmorMaterial;
import ru.minefox.keepersofthestones.item.BurnItem;
import ru.minefox.keepersofthestones.entity.effect.RechargeFireStoneEffect;
import ru.minefox.keepersofthestones.entity.effect.FireMasterEffect;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.entity.effect.StatusEffect;

import net.fabricmc.fabric.api.command.v1.CommandRegistrationCallback;
import net.fabricmc.api.ModInitializer;

public class PowerMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final Item FireStone_ITEM = Registry.register(Registry.ITEM, id("fire_stone"), new FireStoneItem());
	public static final Item Burn_ITEM = Registry.register(Registry.ITEM, id("burn"), new BurnItem());
	public static final ItemGroup MagicStones = MagicStonesItemGroup.get();
	public static final Item Fire_HELMET = Registry.register(Registry.ITEM, id("fire_helmet"), FireArmorMaterial.HELMET);
	public static final Item Fire_CHESTPLATE = Registry.register(Registry.ITEM, id("fire_chestplate"), FireArmorMaterial.CHESTPLATE);
	public static final Item Fire_LEGGINGS = Registry.register(Registry.ITEM, id("fire_leggings"), FireArmorMaterial.LEGGINGS);
	public static final Item Fire_BOOTS = Registry.register(Registry.ITEM, id("fire_boots"), FireArmorMaterial.BOOTS);
	public static final Item FireSword_ITEM = Registry.register(Registry.ITEM, id("fire_sword"), FireSwordTool.INSTANCE);
	public static final StatusEffect RechargeFireStone_STATUS_EFFECT = Registry.register(Registry.STATUS_EFFECT, id("recharge_fire_stone"),
			new RechargeFireStoneEffect());
	public static final StatusEffect FireMaster_STATUS_EFFECT = Registry.register(Registry.STATUS_EFFECT, id("fire_master"), new FireMasterEffect());

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing PowerMod");
		new FireMasterEffectStartProcedure();
		new FireMasterEffectEndProcedure();
		new FireMasterEffectsProcedure();
		new FireStoneUseProcedure();
		new RechargeMagicalFireballProcedure();
		new BurnBlockProcedureProcedure();
		new BurnProcedureProcedure();
		CommandRegistrationCallback.EVENT.register((dispatcher, dedicated) -> {
		});
	}

	public static final Identifier id(String s) {
		return new Identifier("power", s);
	}
}
