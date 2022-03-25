
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.keepeersofthestones.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class PowerModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> GETTINGSTONESWHENENTERINGTHEGAME = GameRules
			.register("gettingStonesWhenEnteringTheGame", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> FORBIDDENINACTIVESPELLS = GameRules.register("forbiddenInactiveSpells",
			GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> CANRECHOISESTONE = GameRules.register("canRechoiseStone", GameRules.Category.PLAYER,
			GameRules.BooleanValue.create(true));
}
