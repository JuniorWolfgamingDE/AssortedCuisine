
package net.juniorwmg.assortedcuisine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ChocolateMilkItem extends Item {
	public ChocolateMilkItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}
}
