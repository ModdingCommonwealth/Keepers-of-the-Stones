
package ru.minefox.keepersofthestones.item;

import ru.minefox.keepersofthestones.PowerMod;

import net.minecraft.world.World;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.UseAction;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.util.Hand;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundCategory;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.FlyingItemEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.Entity;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.MinecraftClient;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.FabricLoader;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import java.util.Random;

public class MagicFireballRangedItem extends Item {
	public static final EntityType<CustomProjectileEntity> ENTITY_TYPE = Registry.register(Registry.ENTITY_TYPE,
			new Identifier("power", "magic_fireball_projectile"),
			FabricEntityTypeBuilder.<CustomProjectileEntity>create(SpawnGroup.MISC, CustomProjectileEntity::new)
					.dimensions(EntityDimensions.fixed(0.5F, 0.5F)).build());

	public MagicFireballRangedItem() {
		super(new Item.Settings().group(null).maxDamage(5000));
		if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
			EntityRendererRegistry.INSTANCE.register(ENTITY_TYPE, (dispatcher, context) -> {
				return new FlyingItemEntityRenderer(dispatcher, MinecraftClient.getInstance().getItemRenderer());
			});
		}
	}

	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.BOW;
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		user.setCurrentHand(hand);
		return TypedActionResult.success(user.getStackInHand(hand));
	}

	public int getMaxUseTime(ItemStack stack) {
		return 72000;
	}

	@Override
	public void onStoppedUsing(ItemStack itemstack, World world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClient() && entityLiving instanceof ServerPlayerEntity) {
			ServerPlayerEntity entity = (ServerPlayerEntity) entityLiving;
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (true) {
				CustomProjectileEntity entityarrow = shoot(world, entity, new Random(31100L), 1f, 8, 2);
				itemstack.damage(1, entity, e -> e.sendToolBreakStatus(entity.getActiveHand()));
				entityarrow.pickupType = PersistentProjectileEntity.PickupPermission.DISALLOWED;
			}
		}
	}

	public static class CustomProjectileEntity extends PersistentProjectileEntity implements FlyingItemEntity {
		public CustomProjectileEntity(EntityType<? extends CustomProjectileEntity> type, World world) {
			super(type, world);
		}

		public CustomProjectileEntity(EntityType<? extends CustomProjectileEntity> type, double x, double y, double z, World world) {
			super(type, x, y, z, world);
		}

		public CustomProjectileEntity(EntityType<? extends CustomProjectileEntity> type, LivingEntity entity, World world) {
			super(type, entity, world);
		}

		@Override
		@Environment(EnvType.CLIENT)
		public ItemStack getStack() {
			return new ItemStack(PowerMod.MagicFireball_ITEM);
		}

		@Override
		protected ItemStack asItemStack() {
			return ItemStack.EMPTY;
		}

		@Override
		protected void onHit(LivingEntity entity) {
			super.onHit(entity);
			entity.setStuckArrowCount(entity.getStuckArrowCount() - 1);
		}

		@Override
		public void tick() {
			super.tick();
			double x = this.getX();
			double y = this.getY();
			double z = this.getZ();
			World world = this.world;
			Entity entity = this.getOwner();
			Entity imediatesourceentity = this;
			if (this.inGround) {
				this.remove();
			}
		}
	}

	public static CustomProjectileEntity shoot(World world, LivingEntity entity, Random random, float power, double damage, int knockback) {
		CustomProjectileEntity arrow = new CustomProjectileEntity(ENTITY_TYPE, entity, world);
		arrow.setVelocity(entity.getRotationVector().x, entity.getRotationVector().y, entity.getRotationVector().z, power * 2, 0);
		arrow.setSilent(true);
		arrow.setCritical(false);
		arrow.setDamage(damage);
		arrow.setPunch(knockback);
		world.spawnEntity(arrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		world.playSound((PlayerEntity) null, (double) x, (double) y, (double) z, new SoundEvent(new Identifier("entity.arrow.shoot")),
				SoundCategory.PLAYERS, 1, 1F / (random.nextFloat() * 0.5F + 1) + (power / 2));
		return arrow;
	}

	public static CustomProjectileEntity shoot(LivingEntity entity, LivingEntity target) {
		CustomProjectileEntity arrow = new CustomProjectileEntity(ENTITY_TYPE, entity, entity.world);
		double d0 = target.getX() + (double) target.getStandingEyeHeight() - 1.1;
		double d1 = target.getY() - entity.getX();
		double d3 = target.getZ() - entity.getZ();
		arrow.setVelocity(d1, d0 - arrow.getY() + (double) MathHelper.sqrt(d1 * d1 + d3 * d3) * 0.2F, d3, 1f * 2, 12.0F);
		arrow.setSilent(true);
		arrow.setDamage(8);
		arrow.setPunch(2);
		arrow.setCritical(false);
		entity.world.spawnEntity(arrow);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		entity.world.playSound((PlayerEntity) null, (double) x, (double) y, (double) z, new SoundEvent(new Identifier("entity.arrow.shoot")),
				SoundCategory.PLAYERS, 1, 1F / (new Random().nextFloat() * 0.5F + 1));
		return arrow;
	}
}
