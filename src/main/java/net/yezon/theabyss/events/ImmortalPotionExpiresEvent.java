package net.yezon.theabyss.events;

import net.yezon.theabyss.TheabyssMod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class ImmortalPotionExpiresEvent {

	public static void executeEvent(Map<String, Object> dependencies) {
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof PlayerEntity) {
			((PlayerEntity) entity).abilities.disableDamage = (false);
			((PlayerEntity) entity).sendPlayerAbilities();
		}
	}
}
