package net.juniorwmg.assortedcuisine.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEntityUseItemEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.juniorwmg.assortedcuisine.network.AssortedcuisineModVariables;
import net.juniorwmg.assortedcuisine.init.AssortedcuisineModItems;
import net.juniorwmg.assortedcuisine.init.AssortedcuisineModGameRules;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MrCheeseCheckProcedure {
	@SubscribeEvent
	public static void onUseItemFinish(LivingEntityUseItemEvent.Finish event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getItem());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		execute(null, world, x, y, z, entity, itemstack);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (itemstack.getItem() == AssortedcuisineModItems.CHEESE.get()) {
			{
				double _setval = (entity.getCapability(AssortedcuisineModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AssortedcuisineModVariables.PlayerVariables())).cheese_eaten + 1;
				entity.getCapability(AssortedcuisineModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cheese_eaten = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (world.getLevelData().getGameRules().getBoolean(AssortedcuisineModGameRules.BUTTER_DEBUG_CHEESE_MESSAGE) == true) {
				if (entity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(
							Component.literal(("\u00A78\u00A7oCheese-counter: " + (entity.getCapability(AssortedcuisineModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AssortedcuisineModVariables.PlayerVariables())).cheese_eaten)), false);
			}
			if ((entity.getCapability(AssortedcuisineModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AssortedcuisineModVariables.PlayerVariables())).cheese_eaten >= 3456) {
				if (!(entity instanceof ServerPlayer _plr4 && _plr4.level() instanceof ServerLevel
						&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("assortedcuisine:mr_cheese"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("assortedcuisine:mr_cheese"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("assortedcuisine:mrcheese")), SoundSource.MASTER, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("assortedcuisine:mrcheese")), SoundSource.MASTER, 1, 1, false);
						}
					}
				}
			}
		}
	}
}
