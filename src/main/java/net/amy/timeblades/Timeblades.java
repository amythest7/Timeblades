package net.amy.timeblades;

import net.amy.timeblades.effect.ModEffects;
import net.amy.timeblades.item.ModItemGroups;
import net.amy.timeblades.item.ModItems;
import net.amy.timeblades.particle.ModParticles;
import net.amy.timeblades.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Timeblades implements ModInitializer {
	public static final String MOD_ID = "timeblades";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModEffects.registerEffects();
		ModParticles.registerParticles();
		ModItemGroups.registerItemGroups();
		ModLootTableModifiers.modifyLootTables();
	}
}