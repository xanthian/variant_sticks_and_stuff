package net.xanthian.vsas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.fabricmc.api.ModInitializer;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.*;
import net.xanthian.vsas.util.LootTableModifiers;
import net.xanthian.vsas.util.VSASTradeFactory;
import net.xanthian.vsas.util.VillagerTrades;
import org.apache.commons.lang3.tuple.Pair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class Init implements ModInitializer {

	public static final String MOD_ID = "vsas";

	public static Identifier ID(String path) {
		return new Identifier(MOD_ID, path);
	}

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final List<Pair<String, String[]>> woodTypes = Arrays.asList(
			Pair.of("acacia", new String[0]),
			Pair.of("birch", new String[0]),
			Pair.of("crimson", new String[0]),
			Pair.of("dark_oak", new String[0]),
			Pair.of("jungle", new String[0]),
			Pair.of("oak", new String[0]),
			Pair.of("mangrove", new String[0]),
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
		Rails.registerRails();
		Rails.registerActivatorRails();
		//Rails.registerDetectorRails();
		Rails.registerPoweredRails();
		LootTableModifiers.modifyLootTables();
		//VillagerTrades.registerTrades();
	}
}