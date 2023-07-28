
package net.juniorwmg.assortedcuisine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawPorkPieItem extends Item {
	public RawPorkPieItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
