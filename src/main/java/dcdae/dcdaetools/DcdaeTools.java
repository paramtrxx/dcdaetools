package dcdae.dcdaetools;

import dcdae.dcdaetools.block.ModBlocks;
import dcdae.dcdaetools.item.ModItemGroups;
import dcdae.dcdaetools.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DcdaeTools implements ModInitializer {
	public static final String MOD_ID = "dcdaetools";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerItems();
		ModBlocks.register();
	}
}