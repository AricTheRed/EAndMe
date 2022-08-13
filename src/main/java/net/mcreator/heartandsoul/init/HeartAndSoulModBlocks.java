
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.heartandsoul.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.heartandsoul.block.HeartOreBlock;
import net.mcreator.heartandsoul.HeartAndSoulMod;

public class HeartAndSoulModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, HeartAndSoulMod.MODID);
	public static final RegistryObject<Block> HEART_ORE = REGISTRY.register("heart_ore", () -> new HeartOreBlock());
}
