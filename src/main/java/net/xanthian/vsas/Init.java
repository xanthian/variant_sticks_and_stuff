package net.xanthian.vsas;

import net.fabricmc.api.ModInitializer;

import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.*;
import net.xanthian.vsas.util.Recipes;
import org.apache.commons.lang3.tuple.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;

public class Init implements ModInitializer {

	public static final String MOD_ID = "vsas";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final List<Pair<String, String[]>> woodTypes = Arrays.asList(
			Pair.of("acacia", new String[0]),
			Pair.of("birch", new String[0]),
			Pair.of("crimson", new String[0]),
			Pair.of("dark_oak", new String[0]),
			Pair.of("jungle", new String[0]),
			Pair.of("oak", new String[0]),
			Pair.of("spruce", new String[0]),
			Pair.of("warped", new String[0]));

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
		OnAStick.registerOnAStickItems();
	}
}