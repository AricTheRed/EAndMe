package net.mcreator.heartandsoul.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.heartandsoul.init.HeartAndSoulModItems;

public class HastySoulCharmItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(HeartAndSoulModItems.HASTY_SOUL_CHARM.get()))
				: false) {
			if (entity instanceof LivingEntity _entity)
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 60, 1, (false), (false)));
		} else {
			if (entity instanceof LivingEntity _entity)
				_entity.removeAllEffects();
		}
	}
}
