package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLConstructModEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;

import net.minecraft.world.item.crafting.RecipeSerializer;

import net.juniorwmg.assortedcuisine.jei_recipes.CurdlingRecipe;
import net.juniorwmg.assortedcuisine.jei_recipes.ChurningRecipe;
import net.juniorwmg.assortedcuisine.AssortedcuisineMod;

@Mod.EventBusSubscriber(modid = AssortedcuisineMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AssortedcuisineModRecipeTypes {
	public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, "assortedcuisine");

	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		event.enqueueWork(() -> {
			SERIALIZERS.register(bus);
			SERIALIZERS.register("churning", () -> ChurningRecipe.Serializer.INSTANCE);
			SERIALIZERS.register("curdling", () -> CurdlingRecipe.Serializer.INSTANCE);
		});
	}
}
