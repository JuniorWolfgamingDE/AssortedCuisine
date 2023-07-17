
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.juniorwmg.assortedcuisine.item.DragonFruitItem;
import net.juniorwmg.assortedcuisine.AssortedcuisineMod;

public class AssortedcuisineModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AssortedcuisineMod.MODID);
	public static final RegistryObject<Item> DRAGON_FRUIT = REGISTRY.register("dragon_fruit", () -> new DragonFruitItem());
}
