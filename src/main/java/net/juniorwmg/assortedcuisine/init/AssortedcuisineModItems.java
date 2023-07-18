
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.juniorwmg.assortedcuisine.item.SuperSugarSweetsItem;
import net.juniorwmg.assortedcuisine.item.SuperSugarItem;
import net.juniorwmg.assortedcuisine.item.SugarSweetsItem;
import net.juniorwmg.assortedcuisine.item.SpikedPumpkinSodaItem;
import net.juniorwmg.assortedcuisine.item.SparklingWaterBottleItem;
import net.juniorwmg.assortedcuisine.item.SlurmSodaItem;
import net.juniorwmg.assortedcuisine.item.ShroomSodaItem;
import net.juniorwmg.assortedcuisine.item.RootSodaItem;
import net.juniorwmg.assortedcuisine.item.PumpkinSodaItem;
import net.juniorwmg.assortedcuisine.item.GoldenAppleSodaItem;
import net.juniorwmg.assortedcuisine.item.FilledCarbonDioxideCylinderItem;
import net.juniorwmg.assortedcuisine.item.DragonFruitItem;
import net.juniorwmg.assortedcuisine.item.DiamondSodaItem;
import net.juniorwmg.assortedcuisine.item.CreamPumpkinSodaItem;
import net.juniorwmg.assortedcuisine.item.CocoaSodaItem;
import net.juniorwmg.assortedcuisine.item.CarbonDioxideCylinderItem;
import net.juniorwmg.assortedcuisine.item.AppleSodaItem;
import net.juniorwmg.assortedcuisine.AssortedcuisineMod;

public class AssortedcuisineModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AssortedcuisineMod.MODID);
	public static final RegistryObject<Item> DRAGON_FRUIT = REGISTRY.register("dragon_fruit", () -> new DragonFruitItem());
	public static final RegistryObject<Item> APPLE_SODA = REGISTRY.register("apple_soda", () -> new AppleSodaItem());
	public static final RegistryObject<Item> GOLDEN_APPLE_SODA = REGISTRY.register("golden_apple_soda", () -> new GoldenAppleSodaItem());
	public static final RegistryObject<Item> COCOA_SODA = REGISTRY.register("cocoa_soda", () -> new CocoaSodaItem());
	public static final RegistryObject<Item> ROOT_SODA = REGISTRY.register("root_soda", () -> new RootSodaItem());
	public static final RegistryObject<Item> DIAMOND_SODA = REGISTRY.register("diamond_soda", () -> new DiamondSodaItem());
	public static final RegistryObject<Item> SHROOM_SODA = REGISTRY.register("shroom_soda", () -> new ShroomSodaItem());
	public static final RegistryObject<Item> PUMPKIN_SODA = REGISTRY.register("pumpkin_soda", () -> new PumpkinSodaItem());
	public static final RegistryObject<Item> CREAM_PUMPKIN_SODA = REGISTRY.register("cream_pumpkin_soda", () -> new CreamPumpkinSodaItem());
	public static final RegistryObject<Item> SPIKED_PUMPKIN_SODA = REGISTRY.register("spiked_pumpkin_soda", () -> new SpikedPumpkinSodaItem());
	public static final RegistryObject<Item> SLURM_SODA = REGISTRY.register("slurm_soda", () -> new SlurmSodaItem());
	public static final RegistryObject<Item> CARBON_DIOXIDE_CYLINDER = REGISTRY.register("carbon_dioxide_cylinder", () -> new CarbonDioxideCylinderItem());
	public static final RegistryObject<Item> FILLED_CARBON_DIOXIDE_CYLINDER = REGISTRY.register("filled_carbon_dioxide_cylinder", () -> new FilledCarbonDioxideCylinderItem());
	public static final RegistryObject<Item> SPARKLING_WATER_BOTTLE = REGISTRY.register("sparkling_water_bottle", () -> new SparklingWaterBottleItem());
	public static final RegistryObject<Item> SUPER_SUGAR = REGISTRY.register("super_sugar", () -> new SuperSugarItem());
	public static final RegistryObject<Item> SUGAR_SWEETS = REGISTRY.register("sugar_sweets", () -> new SugarSweetsItem());
	public static final RegistryObject<Item> SUPER_SUGAR_SWEETS = REGISTRY.register("super_sugar_sweets", () -> new SuperSugarSweetsItem());
}
