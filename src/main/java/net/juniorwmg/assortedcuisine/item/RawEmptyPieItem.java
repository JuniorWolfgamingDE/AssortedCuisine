
package net.juniorwmg.assortedcuisine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawEmptyPieItem extends Item {
	public RawEmptyPieItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
