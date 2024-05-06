package net.thefallequinox.dropoff;

import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.event.GameEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dropoff implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static String MOD_ID = "dropoff";

	public static final TagKey<Block> HANGS = getBlockTag("hangs");
	public static final TagKey<Block> PROTECTED = getBlockTag("protected");
	public static final TagKey<Block> BUOYANT = getBlockTag("buoyant");
	public static final TagKey<Block> FLOATS = getBlockTag("floats");
	public static final TagKey<Block> USE_DEFAULT_STATE = getBlockTag("default_state");

	public static final GameEvent FIRE_SPREAD =	Registry.register(Registries.GAME_EVENT, "fire_spread", new GameEvent(16));
	public static final GameEvent BLOCK_EXPLODED = Registry.register(Registries.GAME_EVENT, "block_exploded", new GameEvent(16));

	public static final TagKey<GameEvent> DISRUPTION = getGameEventTag("disruption");
	public static final TagKey<GameEvent> NEIGHBOR_DISRUPTION = getGameEventTag("neighbor_disruption");
	public static final TagKey<GameEvent> ENTITY_DISRUPTION = getGameEventTag("entity_disruption");
	public static final TagKey<GameEvent> ENTITY_NEIGHBOR_DISRUPTION = getGameEventTag("entity_neighbor_disruption");

	public static Identifier getIdentifier(String name) {
		return new Identifier(MOD_ID, name);
	}

	public static TagKey<Block> getBlockTag(String id) {
		return TagKey.of(RegistryKeys.BLOCK, getIdentifier(id));
	}
	public static TagKey<GameEvent> getGameEventTag(String id) {
		return TagKey.of(RegistryKeys.GAME_EVENT, getIdentifier(id));
	}
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("The bridge builder is dropping-off.");
	}
}