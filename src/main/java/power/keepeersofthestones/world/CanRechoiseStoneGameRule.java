package power.keepeersofthestones.world;

import power.keepeersofthestones.PowerModElements;

import net.minecraftforge.fml.common.ObfuscationReflectionHelper;

import net.minecraft.world.GameRules;

import java.lang.reflect.Method;

@PowerModElements.ModElement.Tag
public class CanRechoiseStoneGameRule extends PowerModElements.ModElement {
	public static final GameRules.RuleKey<GameRules.BooleanValue> gamerule = GameRules.register("canRechoiseStone", GameRules.Category.PLAYER,
			create(true));

	public CanRechoiseStoneGameRule(PowerModElements instance) {
		super(instance, 492);
	}

	public static GameRules.RuleType<GameRules.BooleanValue> create(boolean defaultValue) {
		try {
			Method createGameruleMethod = ObfuscationReflectionHelper.findMethod(GameRules.BooleanValue.class, "func_223568_b", boolean.class);
			createGameruleMethod.setAccessible(true);
			return (GameRules.RuleType<GameRules.BooleanValue>) createGameruleMethod.invoke(null, defaultValue);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
