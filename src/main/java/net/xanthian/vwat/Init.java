package net.xanthian.vwat;

import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import net.xanthian.vwat.items.*;
import net.xanthian.vwat.util.LootTableModifiers;
import org.apache.commons.lang3.tuple.Pair;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;


public class Init implements ModInitializer {

	public static final String MOD_ID = "vwat";

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
		Sticks.registerStickItems();
		Axes.registerAxeItems();
		Hoes.registerHoeItems();
		Pickaxes.registerPickaxeItems();
		Shovels.registerShovelItems();
		Swords.registerSwordItems();
		LootTableModifiers.modifyLootTables();
	}
}