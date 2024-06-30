
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.juniorwmg.assortedcuisine.AssortedcuisineMod;

public class AssortedcuisineModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, AssortedcuisineMod.MODID);
	public static final RegistryObject<SoundEvent> MRCHEESE = REGISTRY.register("mrcheese", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("assortedcuisine", "mrcheese")));
	public static final RegistryObject<SoundEvent> CHEESE_MUSIC_DISC = REGISTRY.register("cheese_music_disc", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("assortedcuisine", "cheese_music_disc")));
}
