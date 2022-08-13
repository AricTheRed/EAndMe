
package net.mcreator.heartandsoul.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.heartandsoul.procedures.SpeedySoulCharmItemInInventoryTickProcedure;
import net.mcreator.heartandsoul.init.HeartAndSoulModTabs;

public class SpeedySoulCharmItem extends Item {
	public SpeedySoulCharmItem() {
		super(new Item.Properties().tab(HeartAndSoulModTabs.TAB_HEART_AND_SOUL).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		SpeedySoulCharmItemInInventoryTickProcedure.execute(entity);
	}
}
