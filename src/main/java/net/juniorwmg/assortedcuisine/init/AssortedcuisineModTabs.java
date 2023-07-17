
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AssortedcuisineModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("assortedcuisine", "assorted_cuisine"),
				builder -> builder.title(Component.translatable("item_group.assortedcuisine.assorted_cuisine")).icon(() -> new ItemStack(Items.DRAGON_BREATH)).displayItems((parameters, tabData) -> {
					tabData.accept(AssortedcuisineModItems.DRAGON_FRUIT.get());
				})

		);
	}
}
