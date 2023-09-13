package net.xanthian.vsas;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;

import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

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
		Brushes.registerBrushItems();
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

		ResourceManagerHelper.registerBuiltinResourcePack(
				new Identifier(MOD_ID, "minecraft"),
				FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
				Text.translatable("vsas.resourcepacks.minecraft"),
				ResourcePackActivationType.ALWAYS_ENABLED);
	}
}