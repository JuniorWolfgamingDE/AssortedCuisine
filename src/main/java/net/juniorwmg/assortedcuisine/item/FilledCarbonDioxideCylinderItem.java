
package net.juniorwmg.assortedcuisine.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.juniorwmg.assortedcuisine.init.AssortedcuisineModItems;

public class FilledCarbonDioxideCylinderItem extends Item {
	public FilledCarbonDioxideCylinderItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return true;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
		return new ItemStack(AssortedcuisineModItems.CARBON_DIOXIDE_CYLINDER.get());
	}
}
