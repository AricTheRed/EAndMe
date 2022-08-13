
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heartandsoul.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.heartandsoul.item.SpeedySoulCharmItem;
import net.mcreator.heartandsoul.item.SoulStoneItem;
import net.mcreator.heartandsoul.item.ResistiveHeartCharmItem;
import net.mcreator.heartandsoul.item.RegenativeHeartCharmItem;
import net.mcreator.heartandsoul.item.PpItem;
import net.mcreator.heartandsoul.item.PowerfulSoulCharmItem;
import net.mcreator.heartandsoul.item.LuckyHeartCharmItem;
import net.mcreator.heartandsoul.item.HeavyHeartCharmItem;
import net.mcreator.heartandsoul.item.HeartStoneItem;
import net.mcreator.heartandsoul.item.HealtyHeartCharmItem;
import net.mcreator.heartandsoul.item.HastySoulCharmItem;
import net.mcreator.heartandsoul.item.FireyHeartCharmItem;
import net.mcreator.heartandsoul.HeartAndSoulMod;

public class HeartAndSoulModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HeartAndSoulMod.MODID);
	public static final RegistryObject<Item> HEART_ORE = block(HeartAndSoulModBlocks.HEART_ORE, HeartAndSoulModTabs.TAB_HEART_AND_SOUL);
	public static final RegistryObject<Item> HEART_STONE = REGISTRY.register("heart_stone", () -> new HeartStoneItem());
	public static final RegistryObject<Item> HEALTY_HEART_CHARM = REGISTRY.register("healty_heart_charm", () -> new HealtyHeartCharmItem());
	public static final RegistryObject<Item> FIREY_HEART_CHARM = REGISTRY.register("firey_heart_charm", () -> new FireyHeartCharmItem());
	public static final RegistryObject<Item> RESISTIVE_HEART_CHARM = REGISTRY.register("resistive_heart_charm", () -> new ResistiveHeartCharmItem());
	public static final RegistryObject<Item> LUCKY_HEART_CHARM = REGISTRY.register("lucky_heart_charm", () -> new LuckyHeartCharmItem());
	public static final RegistryObject<Item> HEAVY_HEART_CHARM = REGISTRY.register("heavy_heart_charm", () -> new HeavyHeartCharmItem());
	public static final RegistryObject<Item> REGENATIVE_HEART_CHARM = REGISTRY.register("regenative_heart_charm",
			() -> new RegenativeHeartCharmItem());
	public static final RegistryObject<Item> SOUL_STONE = REGISTRY.register("soul_stone", () -> new SoulStoneItem());
	public static final RegistryObject<Item> POWERFUL_SOUL_CHARM = REGISTRY.register("powerful_soul_charm", () -> new PowerfulSoulCharmItem());
	public static final RegistryObject<Item> SPEEDY_SOUL_CHARM = REGISTRY.register("speedy_soul_charm", () -> new SpeedySoulCharmItem());
	public static final RegistryObject<Item> HASTY_SOUL_CHARM = REGISTRY.register("hasty_soul_charm", () -> new HastySoulCharmItem());
	public static final RegistryObject<Item> PP = REGISTRY.register("pp", () -> new PpItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
