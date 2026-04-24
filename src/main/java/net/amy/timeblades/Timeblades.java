package net.amy.timeblades;

import net.amy.timeblades.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class Timeblades implements ModInitializer {
	public static final String MOD_ID = "timeblades";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}