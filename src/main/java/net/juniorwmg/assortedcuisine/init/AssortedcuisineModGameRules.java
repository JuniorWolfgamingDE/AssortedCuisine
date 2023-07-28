
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AssortedcuisineModGameRules {
	public static final GameRules.Key<GameRules.BooleanValue> BUTTER_DEBUG_TICK_MESSAGE = GameRules.register("butterDebugTickMessage", GameRules.Category.CHAT, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> BUTTER_DEBUG_CHEESE_MESSAGE = GameRules.register("butterDebugCheeseMessage", GameRules.Category.CHAT, GameRules.BooleanValue.create(false));
}
