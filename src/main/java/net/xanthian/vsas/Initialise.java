package net.xanthian.vsas;

import net.fabricmc.api.ModInitializer;

import net.xanthian.vsas.blocks.RedstoneTorches;
import net.xanthian.vsas.blocks.SoulTorches;
import net.xanthian.vsas.blocks.Torches;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.*;
import net.xanthian.vsas.util.*;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "vsas";

	@Override
	public void onInitialize() {
		ModItemGroup.registerGroup();

		Arrows.registerArrowItems();
		Axes.registerAxeItems();
		Bows.registerBowItems();
		Crossbows.registerCrossBowItems();
		FishingRods.registerFishingRodItems();
		Hoes.registerHoeItems();
		OnAStick.registerOnAStickItems();
		Pickaxes.registerPickaxeItems();
		Shovels.registerShovelItems();
		RedstoneTorches.registerRedstoneTorchBlocks();
		SoulTorches.registerSoulTorchBlocks();
		Sticks.registerStickItems();
		Swords.registerSwordItems();
		Torches.registerTorchBlocks();

		EntityInit.init();

		LootTableModifiers.modifyLootTables();
		ModPOITypes.init();
		ModRegistries.registerFuels();
		VillagerTrades.registerTrades();
	}
}