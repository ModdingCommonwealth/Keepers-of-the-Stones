package power.keepeersofthestones.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class InvincibilityEffectEndProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild : false)) {
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = (false);
				_player.onUpdateAbilities();
			}
		}
	}
}
