
package net.juniorwmg.assortedcuisine.init;

import net.minecraft.world.item.crafting.RecipeManager;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.juniorwmg.assortedcuisine.jei_recipes.CurdlingRecipeCategory;
import net.juniorwmg.assortedcuisine.jei_recipes.CurdlingRecipe;
import net.juniorwmg.assortedcuisine.jei_recipes.ChurningRecipeCategory;
import net.juniorwmg.assortedcuisine.jei_recipes.ChurningRecipe;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.Objects;
import java.util.List;

@JeiPlugin
public class AssortedcuisineModJeiPlugin implements IModPlugin {
	public static mezz.jei.api.recipe.RecipeType<ChurningRecipe> Churning_Type = new mezz.jei.api.recipe.RecipeType<>(ChurningRecipeCategory.UID, ChurningRecipe.class);
	public static mezz.jei.api.recipe.RecipeType<CurdlingRecipe> Curdling_Type = new mezz.jei.api.recipe.RecipeType<>(CurdlingRecipeCategory.UID, CurdlingRecipe.class);

	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("assortedcuisine:jei_plugin");
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) {
		registration.addRecipeCategories(new ChurningRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
		registration.addRecipeCategories(new CurdlingRecipeCategory(registration.getJeiHelpers().getGuiHelper()));
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		RecipeManager recipeManager = Objects.requireNonNull(Minecraft.getInstance().level).getRecipeManager();
		List<ChurningRecipe> ChurningRecipes = recipeManager.getAllRecipesFor(ChurningRecipe.Type.INSTANCE);
		registration.addRecipes(Churning_Type, ChurningRecipes);
		List<CurdlingRecipe> CurdlingRecipes = recipeManager.getAllRecipesFor(CurdlingRecipe.Type.INSTANCE);
		registration.addRecipes(Curdling_Type, CurdlingRecipes);
	}

	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
		registration.addRecipeCatalyst(new ItemStack(AssortedcuisineModBlocks.BUTTER_CHURN.get().asItem()), Churning_Type);
		registration.addRecipeCatalyst(new ItemStack(AssortedcuisineModBlocks.CHEESE_MAKER.get().asItem()), Curdling_Type);
	}
}
