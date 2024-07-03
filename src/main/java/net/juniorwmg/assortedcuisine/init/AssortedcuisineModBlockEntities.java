
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.juniorwmg.assortedcuisine.block.entity.ChocolateBarMouldBlockEntity;
import net.juniorwmg.assortedcuisine.block.entity.CheeseMakerBlockEntity;
import net.juniorwmg.assortedcuisine.block.entity.ButterChurnBlockEntity;
import net.juniorwmg.assortedcuisine.AssortedcuisineMod;

public class AssortedcuisineModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AssortedcuisineMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BUTTER_CHURN = register("butter_churn", AssortedcuisineModBlocks.BUTTER_CHURN, ButterChurnBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHEESE_MAKER = register("cheese_maker", AssortedcuisineModBlocks.CHEESE_MAKER, CheeseMakerBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> CHOCOLATE_BAR_MOULD = register("chocolate_bar_mould", AssortedcuisineModBlocks.CHOCOLATE_BAR_MOULD, ChocolateBarMouldBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
