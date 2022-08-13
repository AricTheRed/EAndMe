package net.mcreator.heartandsoul.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.heartandsoul.init.HeartAndSoulModItems;

public class HealtyHeartCharmItemInInventoryTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem
				? _playerHasItem.getInventory().contains(new ItemStack(HeartAndSoulModItems.HEALTY_HEART_CHARM.get()))
				: false) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"/attribute @s minecraft:generic.max_health base set 40");
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null)
					_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
							"/attribute @s minecraft:generic.max_health base set 20");
			}
		}
	}
}
