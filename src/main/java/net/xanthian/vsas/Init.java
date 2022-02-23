package net.xanthian.vsas;

import net.fabricmc.api.ModInitializer;
import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Init implements ModInitializer {

	public static final String MOD_ID = "vsas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		EntityInit.init();
		Sticks.registerStickItems();
		Ladders.registerLadders();
		Torches.registerTorchBlocks();
		SoulTorches.registerSoulTorchBlocks();
		RedstoneTorches.registerRedstoneTorchBlocks();
		Levers.registerLevers();
		Campfires.registerCampfire();
		SoulCampfires.registerCampfire();
		Axes.registerAxeItems();
		Hoes.registerHoeItems();
		Pickaxes.registerPickaxeItems();
		Shovels.registerShovelItems();
		Swords.registerSwordItems();
		Grindstones.registerGrindstone();
		Arrows.registerArrowItems();
		Bows.registerBowItems();
		Crossbows.registerCrossBowItems();
		FishingRods.registerFishingRodItems();
	}
}