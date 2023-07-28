
package net.juniorwmg.assortedcuisine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawChocolatePieItem extends Item {
	public RawChocolatePieItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
