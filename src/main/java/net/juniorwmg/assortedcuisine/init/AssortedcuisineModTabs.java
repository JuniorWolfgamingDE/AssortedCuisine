
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AssortedcuisineModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("assortedcuisine", "assorted_cuisine"),
				builder -> builder.title(Component.translatable("item_group.assortedcuisine.assorted_cuisine")).icon(() -> new ItemStack(AssortedcuisineModItems.SLURM_SODA.get())).displayItems((parameters, tabData) -> {
					tabData.accept(AssortedcuisineModItems.DRAGON_FRUIT.get());
					tabData.accept(AssortedcuisineModItems.APPLE_SODA.get());
					tabData.accept(AssortedcuisineModItems.GOLDEN_APPLE_SODA.get());
					tabData.accept(AssortedcuisineModItems.COCOA_SODA.get());
					tabData.accept(AssortedcuisineModItems.ROOT_SODA.get());
					tabData.accept(AssortedcuisineModItems.DIAMOND_SODA.get());
					tabData.accept(AssortedcuisineModItems.SHROOM_SODA.get());
					tabData.accept(AssortedcuisineModItems.PUMPKIN_SODA.get());
					tabData.accept(AssortedcuisineModItems.CREAM_PUMPKIN_SODA.get());
					tabData.accept(AssortedcuisineModItems.SPIKED_PUMPKIN_SODA.get());
					tabData.accept(AssortedcuisineModItems.SLURM_SODA.get());
					tabData.accept(AssortedcuisineModItems.CARBON_DIOXIDE_CYLINDER.get());
					tabData.accept(AssortedcuisineModItems.FILLED_CARBON_DIOXIDE_CYLINDER.get());
					tabData.accept(AssortedcuisineModItems.SPARKLING_WATER_BOTTLE.get());
					tabData.accept(AssortedcuisineModItems.SUPER_SUGAR.get());
					tabData.accept(AssortedcuisineModItems.SUGAR_SWEETS.get());
					tabData.accept(AssortedcuisineModItems.SUPER_SUGAR_SWEETS.get());
					tabData.accept(AssortedcuisineModItems.BANDAGE.get());
					tabData.accept(AssortedcuisineModItems.HEALTH_PACK.get());
					tabData.accept(AssortedcuisineModItems.SUPER_HEALTH_PACK.get());
					tabData.accept(AssortedcuisineModItems.BUTTER.get());
					tabData.accept(AssortedcuisineModBlocks.BUTTER_CHURN.get().asItem());
				})

		);
	}
}
