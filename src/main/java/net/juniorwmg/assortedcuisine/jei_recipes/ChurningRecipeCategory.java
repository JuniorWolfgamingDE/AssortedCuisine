
package net.juniorwmg.assortedcuisine.jei_recipes;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.juniorwmg.assortedcuisine.init.AssortedcuisineModJeiPlugin;
import net.juniorwmg.assortedcuisine.init.AssortedcuisineModBlocks;

import mezz.jei.api.recipe.category.IRecipeCategory;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.constants.VanillaTypes;

public class ChurningRecipeCategory implements IRecipeCategory<ChurningRecipe> {
	public final static ResourceLocation UID = new ResourceLocation("assortedcuisine", "churning");
	public final static ResourceLocation TEXTURE = new ResourceLocation("assortedcuisine", "textures/screens/generic_transform.png");
	private final IDrawable background;
	private final IDrawable icon;

	public ChurningRecipeCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 176, 85);
		this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(AssortedcuisineModBlocks.BUTTER_CHURN.get().asItem()));
	}

	@Override
	public mezz.jei.api.recipe.RecipeType<ChurningRecipe> getRecipeType() {
		return AssortedcuisineModJeiPlugin.Churning_Type;
	}

	@Override
	public Component getTitle() {
		return Component.literal("Churning");
	}

	@Override
	public IDrawable getBackground() {
		return this.background;
	}

	@Override
	public IDrawable getIcon() {
		return this.icon;
	}

	@Override
	public void setRecipe(IRecipeLayoutBuilder builder, ChurningRecipe recipe, IFocusGroup focuses) {
		builder.addSlot(RecipeIngredientRole.INPUT, 21, 35).addIngredients(recipe.getIngredients().get(0));
		builder.addSlot(RecipeIngredientRole.OUTPUT, 89, 35).addItemStack(recipe.getResultItem(null));
	}
}
