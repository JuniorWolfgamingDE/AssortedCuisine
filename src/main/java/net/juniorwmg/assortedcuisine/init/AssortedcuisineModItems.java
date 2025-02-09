
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.juniorwmg.assortedcuisine.item.WhiskItem;
import net.juniorwmg.assortedcuisine.item.UnfinishedScrambledEggsItem;
import net.juniorwmg.assortedcuisine.item.SuperSugarSweetsItem;
import net.juniorwmg.assortedcuisine.item.SuperSugarItem;
import net.juniorwmg.assortedcuisine.item.SuperHealthPackItem;
import net.juniorwmg.assortedcuisine.item.SugarSweetsItem;
import net.juniorwmg.assortedcuisine.item.SpikedPumpkinSodaItem;
import net.juniorwmg.assortedcuisine.item.SparklingWaterBottleItem;
import net.juniorwmg.assortedcuisine.item.SlurmSodaItem;
import net.juniorwmg.assortedcuisine.item.ShroomSodaItem;
import net.juniorwmg.assortedcuisine.item.ScrambledEggsItem;
import net.juniorwmg.assortedcuisine.item.RootSodaItem;
import net.juniorwmg.assortedcuisine.item.RawScrambledEggsItem;
import net.juniorwmg.assortedcuisine.item.RawPumpkinPieItem;
import net.juniorwmg.assortedcuisine.item.RawPorkPieItem;
import net.juniorwmg.assortedcuisine.item.RawMelonPieItem;
import net.juniorwmg.assortedcuisine.item.RawEmptyPieItem;
import net.juniorwmg.assortedcuisine.item.RawChocolatePieItem;
import net.juniorwmg.assortedcuisine.item.RawApplePieItem;
import net.juniorwmg.assortedcuisine.item.PumpkinSodaItem;
import net.juniorwmg.assortedcuisine.item.PumpkinSliceItem;
import net.juniorwmg.assortedcuisine.item.PiePanItem;
import net.juniorwmg.assortedcuisine.item.MrCheeseItemItem;
import net.juniorwmg.assortedcuisine.item.KnifeItem;
import net.juniorwmg.assortedcuisine.item.HotChocolateMilkItem;
import net.juniorwmg.assortedcuisine.item.HotCheeseSandwhichItem;
import net.juniorwmg.assortedcuisine.item.HealthPackItem;
import net.juniorwmg.assortedcuisine.item.GoldenAppleSodaItem;
import net.juniorwmg.assortedcuisine.item.FilledCarbonDioxideCylinderItem;
import net.juniorwmg.assortedcuisine.item.DragonFruitItem;
import net.juniorwmg.assortedcuisine.item.DoughItem;
import net.juniorwmg.assortedcuisine.item.DiamondSodaItem;
import net.juniorwmg.assortedcuisine.item.CreamPumpkinSodaItem;
import net.juniorwmg.assortedcuisine.item.CocoaSodaItem;
import net.juniorwmg.assortedcuisine.item.CocoaDustItem;
import net.juniorwmg.assortedcuisine.item.ChocolateMilkItem;
import net.juniorwmg.assortedcuisine.item.ChocolateBarItem;
import net.juniorwmg.assortedcuisine.item.ChocolateBallsItem;
import net.juniorwmg.assortedcuisine.item.CheeseMusicDiscItem;
import net.juniorwmg.assortedcuisine.item.CheeseItem;
import net.juniorwmg.assortedcuisine.item.CheeseBurgerItem;
import net.juniorwmg.assortedcuisine.item.CarbonDioxideCylinderItem;
import net.juniorwmg.assortedcuisine.item.ButterItem;
import net.juniorwmg.assortedcuisine.item.BreadSliceItem;
import net.juniorwmg.assortedcuisine.item.BandageItem;
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
	public static final RegistryObject<Item> BANDAGE = REGISTRY.register("bandage", () -> new BandageItem());
	public static final RegistryObject<Item> HEALTH_PACK = REGISTRY.register("health_pack", () -> new HealthPackItem());
	public static final RegistryObject<Item> SUPER_HEALTH_PACK = REGISTRY.register("super_health_pack", () -> new SuperHealthPackItem());
	public static final RegistryObject<Item> BUTTER = REGISTRY.register("butter", () -> new ButterItem());
	public static final RegistryObject<Item> BUTTER_CHURN = block(AssortedcuisineModBlocks.BUTTER_CHURN);
	public static final RegistryObject<Item> CHEESE_MAKER = block(AssortedcuisineModBlocks.CHEESE_MAKER);
	public static final RegistryObject<Item> CHEESE_BLOCK = block(AssortedcuisineModBlocks.CHEESE_BLOCK);
	public static final RegistryObject<Item> KNIFE = REGISTRY.register("knife", () -> new KnifeItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> WHISK = REGISTRY.register("whisk", () -> new WhiskItem());
	public static final RegistryObject<Item> UNFINISHED_SCRAMBLED_EGGS = REGISTRY.register("unfinished_scrambled_eggs", () -> new UnfinishedScrambledEggsItem());
	public static final RegistryObject<Item> RAW_SCRAMBLED_EGGS = REGISTRY.register("raw_scrambled_eggs", () -> new RawScrambledEggsItem());
	public static final RegistryObject<Item> SCRAMBLED_EGGS = REGISTRY.register("scrambled_eggs", () -> new ScrambledEggsItem());
	public static final RegistryObject<Item> BREAD_SLICE = REGISTRY.register("bread_slice", () -> new BreadSliceItem());
	public static final RegistryObject<Item> HOT_CHEESE_SANDWHICH = REGISTRY.register("hot_cheese_sandwhich", () -> new HotCheeseSandwhichItem());
	public static final RegistryObject<Item> CHEESE_BURGER = REGISTRY.register("cheese_burger", () -> new CheeseBurgerItem());
	public static final RegistryObject<Item> PUMPKIN_SLICE = REGISTRY.register("pumpkin_slice", () -> new PumpkinSliceItem());
	public static final RegistryObject<Item> DOUGH = REGISTRY.register("dough", () -> new DoughItem());
	public static final RegistryObject<Item> COCOA_DUST = REGISTRY.register("cocoa_dust", () -> new CocoaDustItem());
	public static final RegistryObject<Item> CHOCOLATE_MILK = REGISTRY.register("chocolate_milk", () -> new ChocolateMilkItem());
	public static final RegistryObject<Item> HOT_CHOCOLATE_MILK = REGISTRY.register("hot_chocolate_milk", () -> new HotChocolateMilkItem());
	public static final RegistryObject<Item> CHOCOLATE_BALLS = REGISTRY.register("chocolate_balls", () -> new ChocolateBallsItem());
	public static final RegistryObject<Item> PIE_PAN = REGISTRY.register("pie_pan", () -> new PiePanItem());
	public static final RegistryObject<Item> RAW_APPLE_PIE = REGISTRY.register("raw_apple_pie", () -> new RawApplePieItem());
	public static final RegistryObject<Item> RAW_CHOCOLATE_PIE = REGISTRY.register("raw_chocolate_pie", () -> new RawChocolatePieItem());
	public static final RegistryObject<Item> RAW_EMPTY_PIE = REGISTRY.register("raw_empty_pie", () -> new RawEmptyPieItem());
	public static final RegistryObject<Item> RAW_MELON_PIE = REGISTRY.register("raw_melon_pie", () -> new RawMelonPieItem());
	public static final RegistryObject<Item> RAW_PORK_PIE = REGISTRY.register("raw_pork_pie", () -> new RawPorkPieItem());
	public static final RegistryObject<Item> RAW_PUMPKIN_PIE = REGISTRY.register("raw_pumpkin_pie", () -> new RawPumpkinPieItem());
	public static final RegistryObject<Item> MR_CHEESE_ITEM = REGISTRY.register("mr_cheese_item", () -> new MrCheeseItemItem());
	public static final RegistryObject<Item> APPLE_PIE = block(AssortedcuisineModBlocks.APPLE_PIE);
	public static final RegistryObject<Item> CHOCOLATE_PIE = block(AssortedcuisineModBlocks.CHOCOLATE_PIE);
	public static final RegistryObject<Item> MELON_PIE = block(AssortedcuisineModBlocks.MELON_PIE);
	public static final RegistryObject<Item> PORK_PIE = block(AssortedcuisineModBlocks.PORK_PIE);
	public static final RegistryObject<Item> PUMPKIN_PIE = block(AssortedcuisineModBlocks.PUMPKIN_PIE);
	public static final RegistryObject<Item> CHEESE_MUSIC_DISC = REGISTRY.register("cheese_music_disc", () -> new CheeseMusicDiscItem());
	public static final RegistryObject<Item> CHOCOLATE_CAKE = block(AssortedcuisineModBlocks.CHOCOLATE_CAKE);
	public static final RegistryObject<Item> CHOCOLATE_BAR_MOULD = block(AssortedcuisineModBlocks.CHOCOLATE_BAR_MOULD);
	public static final RegistryObject<Item> CHOCOLATE_BAR = REGISTRY.register("chocolate_bar", () -> new ChocolateBarItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
