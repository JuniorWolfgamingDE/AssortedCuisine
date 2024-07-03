
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.juniorwmg.assortedcuisine.block.PumpkinPieBlock;
import net.juniorwmg.assortedcuisine.block.PorkPieBlock;
import net.juniorwmg.assortedcuisine.block.MelonPieBlock;
import net.juniorwmg.assortedcuisine.block.ChocolatePieBlock;
import net.juniorwmg.assortedcuisine.block.ChocolateCakeBlock;
import net.juniorwmg.assortedcuisine.block.ChocolateBarMouldBlock;
import net.juniorwmg.assortedcuisine.block.CheeseMakerBlock;
import net.juniorwmg.assortedcuisine.block.CheeseBlockBlock;
import net.juniorwmg.assortedcuisine.block.ButterChurnBlock;
import net.juniorwmg.assortedcuisine.block.ApplePieBlock;
import net.juniorwmg.assortedcuisine.AssortedcuisineMod;

public class AssortedcuisineModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AssortedcuisineMod.MODID);
	public static final RegistryObject<Block> BUTTER_CHURN = REGISTRY.register("butter_churn", () -> new ButterChurnBlock());
	public static final RegistryObject<Block> CHEESE_MAKER = REGISTRY.register("cheese_maker", () -> new CheeseMakerBlock());
	public static final RegistryObject<Block> CHEESE_BLOCK = REGISTRY.register("cheese_block", () -> new CheeseBlockBlock());
	public static final RegistryObject<Block> APPLE_PIE = REGISTRY.register("apple_pie", () -> new ApplePieBlock());
	public static final RegistryObject<Block> CHOCOLATE_PIE = REGISTRY.register("chocolate_pie", () -> new ChocolatePieBlock());
	public static final RegistryObject<Block> MELON_PIE = REGISTRY.register("melon_pie", () -> new MelonPieBlock());
	public static final RegistryObject<Block> PORK_PIE = REGISTRY.register("pork_pie", () -> new PorkPieBlock());
	public static final RegistryObject<Block> PUMPKIN_PIE = REGISTRY.register("pumpkin_pie", () -> new PumpkinPieBlock());
	public static final RegistryObject<Block> CHOCOLATE_CAKE = REGISTRY.register("chocolate_cake", () -> new ChocolateCakeBlock());
	public static final RegistryObject<Block> CHOCOLATE_BAR_MOULD = REGISTRY.register("chocolate_bar_mould", () -> new ChocolateBarMouldBlock());
}
