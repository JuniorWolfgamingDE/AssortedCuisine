
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.juniorwmg.assortedcuisine.block.CheeseMakerBlock;
import net.juniorwmg.assortedcuisine.block.CheeseBlockBlock;
import net.juniorwmg.assortedcuisine.block.ButterChurnBlock;
import net.juniorwmg.assortedcuisine.AssortedcuisineMod;

public class AssortedcuisineModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AssortedcuisineMod.MODID);
	public static final RegistryObject<Block> BUTTER_CHURN = REGISTRY.register("butter_churn", () -> new ButterChurnBlock());
	public static final RegistryObject<Block> CHEESE_MAKER = REGISTRY.register("cheese_maker", () -> new CheeseMakerBlock());
	public static final RegistryObject<Block> CHEESE_BLOCK = REGISTRY.register("cheese_block", () -> new CheeseBlockBlock());
}
