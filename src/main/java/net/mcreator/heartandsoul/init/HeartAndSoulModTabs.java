
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heartandsoul.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class HeartAndSoulModTabs {
	public static CreativeModeTab TAB_HEART_AND_SOUL;

	public static void load() {
		TAB_HEART_AND_SOUL = new CreativeModeTab("tabheart_and_soul") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(HeartAndSoulModBlocks.HEART_ORE.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
