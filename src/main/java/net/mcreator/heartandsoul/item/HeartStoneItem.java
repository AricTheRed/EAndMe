
package net.mcreator.heartandsoul.item;

import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.heartandsoul.init.HeartAndSoulModTabs;

public class HeartStoneItem extends Item {
	public HeartStoneItem() {
		super(new Item.Properties().tab(HeartAndSoulModTabs.TAB_HEART_AND_SOUL).stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
