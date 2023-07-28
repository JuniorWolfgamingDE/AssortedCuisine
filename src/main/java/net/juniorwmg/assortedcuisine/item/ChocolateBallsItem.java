
package net.juniorwmg.assortedcuisine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ChocolateBallsItem extends Item {
	public ChocolateBallsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(2).saturationMod(0.2f).build()));
	}
}
