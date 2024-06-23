
package net.juniorwmg.assortedcuisine.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class AssortedcuisineModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("assortedcuisine:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(AssortedcuisineModItems.HEALTH_PACK.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.assortedcuisine.health_pack_info"));
		registration.addIngredientInfo(List.of(new ItemStack(AssortedcuisineModItems.SUPER_HEALTH_PACK.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.assortedcuisine.super_health_pack_info"));
	}
}
