
package net.juniorwmg.assortedcuisine.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.juniorwmg.assortedcuisine.procedures.HealthPackStoppedUsingProcedure;

public class HealthPackItem extends Item {
	public HealthPackItem() {
		super(new Item.Properties().stacksTo(4).rarity(Rarity.COMMON));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 13;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entity, int time) {
		HealthPackStoppedUsingProcedure.execute(entity);
	}
}
