package power.keepeersofthestones.procedures;

import power.keepeersofthestones.init.PowerModItems;
import power.keepeersofthestones.init.PowerModEntities;
import power.keepeersofthestones.entity.ShadowEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

public class CreateShadowUseProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == PowerModItems.CREATE_SHADOW.get()) {
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 400);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new ShadowEntity(PowerModEntities.SHADOW.get(), _level);
				entityToSpawn.moveTo(x, (y + 3), z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
