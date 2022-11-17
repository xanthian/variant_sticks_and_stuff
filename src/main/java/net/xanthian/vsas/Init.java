package net.xanthian.vsas;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.config.VsasConfig;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.*;
import net.xanthian.vsas.util.LootTableModifiers;
import net.xanthian.vsas.util.ModPOITypes;
import net.xanthian.vsas.util.VillagerTrades;
import org.apache.commons.lang3.tuple.Pair;

import java.util.*;


public class Init implements ModInitializer {

	public static final String MOD_ID = "vsas";

	public static final ItemGroup STICKS_AND_STUFF = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "sticks_and_stuff"),
			() -> new ItemStack(Sticks.ACACIA_STICK));

	public static List<Pair<String, String[]>> woodTypes  = Lists.newArrayList();

	@Override
	public void onInitialize() {

		woodTypes.add(Pair.of("acacia", new String[0]));
		woodTypes.add(Pair.of("birch", new String[0]));
		woodTypes.add(Pair.of("crimson", new String[0]));
		woodTypes.add(Pair.of("dark_oak", new String[0]));
		woodTypes.add(Pair.of("jungle", new String[0]));
		woodTypes.add(Pair.of("oak", new String[0]));
		woodTypes.add(Pair.of("mangrove", new String[0]));
		woodTypes.add(Pair.of("spruce", new String[0]));
		woodTypes.add(Pair.of("warped", new String[0]));

		VsasConfig.registerConfigs();
		Sticks.registerStickItems();
		LootTableModifiers.modifyLootTables();
		if (VsasConfig.villagers == true) {
			VillagerTrades.registerTrades();
		}

		// Blocks
		if (VsasConfig.blocks == true) {
			if (VsasConfig.campfires == true) {
				Campfires.RegisterCampfires();
				Campfires.registerSoulCampfires();
			}
			if (VsasConfig.grindstones == true) {
				Grindstones.registerGrindstones();
			}
			if (VsasConfig.ladders == true) {
				Ladders.registerLadders();
			}
			if (VsasConfig.levers == true) {
				Levers.registerLevers();
			}
			if (VsasConfig.rails == true) {
				Rails.registerRails();
				Rails.registerActivatorRails();
				Rails.registerDetectorRails();
				Rails.registerPoweredRails();
			}
			if (VsasConfig.torches == true) {
				Torches.registerTorches();
				SoulTorches.registerSoulTorches();
				RedstoneTorches.registerRedstoneTorches();
			}
		}

		// Items
		if (VsasConfig.items == true) {
			if (VsasConfig.fishingrods == true) {
				FishingRods.registerFishingRodItems();
			}
			if (VsasConfig.onastick == true) {
				OnAStick.registerCarrotOnAStick();
				OnAStick.registerFungusOnAStick();
			}
			if (VsasConfig.tools == true) {
				if (VsasConfig.axes == true) {
					Axes.registerAxeItems();
				}
				if (VsasConfig.hoes == true) {
					Hoes.registerHoeItems();
				}
				if (VsasConfig.pickaxes == true) {
					Pickaxes.registerPickaxeItems();
				}
				if (VsasConfig.shovels == true) {
					Shovels.registerShovelItems();
				}
			}
			if (VsasConfig.weapons == true) {
				if (VsasConfig.arrows == true) {
					Arrows.registerArrowItems();
				}
				if (VsasConfig.bows == true) {
					Bows.registerBowItems();
					Crossbows.registerCrossBowItems();
				}
				if (VsasConfig.swords == true) {
					Swords.registerSwordItems();
				}
			}
		}
		EntityInit.init();
		ModPOITypes.init();
	}
}