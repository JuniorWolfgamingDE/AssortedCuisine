package net.juniorwmg.assortedcuisine.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class SparklingWaterBottleFinishesProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player && !_player.level().isClientSide())
			_player.displayClientMessage(Component.literal("\u00A77\u00A7o*You feel a subtle tickling inside your nose.*"), false);
	}
}
