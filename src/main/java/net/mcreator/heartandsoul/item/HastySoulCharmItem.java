
package net.mcreator.heartandsoul.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.Entity;

import net.mcreator.heartandsoul.procedures.HastySoulCharmItemInInventoryTickProcedure;
import net.mcreator.heartandsoul.init.HeartAndSoulModTabs;

public class HastySoulCharmItem extends Item {
	public HastySoulCharmItem() {
		super(new Item.Properties().tab(HeartAndSoulModTabs.TAB_HEART_AND_SOUL).stacksTo(64).rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		HastySoulCharmItemInInventoryTickProcedure.execute(entity);
	}
}
