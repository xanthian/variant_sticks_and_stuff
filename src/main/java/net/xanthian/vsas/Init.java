package net.xanthian.vsas;

import net.fabricmc.api.ModInitializer;
import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.items.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Init implements ModInitializer {

	public static final String MOD_ID = "vsas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		Sticks.registerStickItems();
		Ladders.registerLadders();
		Torches.registerTorchBlocks();
		SoulTorches.registerSoulTorchBlocks();
		RedstoneTorches.registerRedstoneTorchBlocks();
		Levers.registerLevers();
		Campfires.registerCampfire();
		Swords.registerSwordItems();
		Grindstones.registerGrindstone();
		FishingRods.registerFishingRodItems();
		Bows.registerBowItems();
		Crossbows.registerCrossBowItems();
	}
}