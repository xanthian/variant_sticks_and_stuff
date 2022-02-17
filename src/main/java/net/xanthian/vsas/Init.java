package net.xanthian.vsas;

import net.fabricmc.api.ModInitializer;
import net.xanthian.vsas.blocks.Grindstones;
import net.xanthian.vsas.blocks.Ladders;
import net.xanthian.vsas.blocks.SoulTorches;
import net.xanthian.vsas.blocks.Torches;
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
		FishingRods.registerFishingRodItems();
		Bows.registerBowItems();
		Crossbows.registerCrossBowItems();
		Torches.registerTorchBlocks();
		SoulTorches.registerSoulTorchBlocks();
		Swords.registerSwordItems();
		Grindstones.registerGrindstone();
	}
}