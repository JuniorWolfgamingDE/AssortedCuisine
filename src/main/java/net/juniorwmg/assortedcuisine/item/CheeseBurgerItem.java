
package net.juniorwmg.assortedcuisine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CheeseBurgerItem extends Item {
	public CheeseBurgerItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(12).saturationMod(0.95f).build()));
	}
}
