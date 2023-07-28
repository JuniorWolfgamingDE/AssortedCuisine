
package net.juniorwmg.assortedcuisine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MrCheeseItemItem extends Item {
	public MrCheeseItemItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
