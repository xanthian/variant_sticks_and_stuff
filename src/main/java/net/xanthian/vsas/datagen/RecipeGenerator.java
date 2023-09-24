package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;

import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.items.*;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        // ACACIA
        offerArrowRecipe(exporter, Arrows.ACACIA_ARROW_ITEM, Sticks.ACACIA_STICK);
        offerWoodenAxeRecipe(exporter, Axes.ACACIA_WOODEN_AXE, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.ACACIA_STONE_AXE, Sticks.ACACIA_STICK);
        offerIronAxeRecipe(exporter, Axes.ACACIA_IRON_AXE, Sticks.ACACIA_STICK);
        offerGoldenAxeRecipe(exporter, Axes.ACACIA_GOLDEN_AXE, Sticks.ACACIA_STICK);
        offerDiamondAxeRecipe(exporter, Axes.ACACIA_DIAMOND_AXE, Sticks.ACACIA_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.ACACIA_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.ACACIA_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.ACACIA_BOW, Sticks.ACACIA_STICK);
        offerBrushRecipe(exporter, Brushes.ACACIA_BRUSH, Sticks.ACACIA_STICK);
        offerCrossbowRecipe(exporter, Crossbows.ACACIA_CROSSBOW, Sticks.ACACIA_STICK);
        offerFishingRodRecipe(exporter, FishingRods.ACACIA_FISHING_ROD, Sticks.ACACIA_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.ACACIA_WOODEN_HOE, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.ACACIA_STONE_HOE, Sticks.ACACIA_STICK);
        offerIronHoeRecipe(exporter, Hoes.ACACIA_IRON_HOE, Sticks.ACACIA_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.ACACIA_GOLDEN_HOE, Sticks.ACACIA_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.ACACIA_DIAMOND_HOE, Sticks.ACACIA_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.ACACIA_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.ACACIA_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.ACACIA_CARROT_ON_A_STICK, FishingRods.ACACIA_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.ACACIA_WARPED_FUNGUS_ON_A_STICK, FishingRods.ACACIA_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.ACACIA_WOODEN_PICKAXE, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.ACACIA_STONE_PICKAXE, Sticks.ACACIA_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.ACACIA_IRON_PICKAXE, Sticks.ACACIA_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.ACACIA_GOLDEN_PICKAXE, Sticks.ACACIA_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.ACACIA_DIAMOND_PICKAXE, Sticks.ACACIA_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.ACACIA_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.ACACIA_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.ACACIA_WOODEN_SHOVEL, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.ACACIA_STONE_SHOVEL, Sticks.ACACIA_STICK);
        offerIronShovelRecipe(exporter, Shovels.ACACIA_IRON_SHOVEL, Sticks.ACACIA_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.ACACIA_GOLDEN_SHOVEL, Sticks.ACACIA_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.ACACIA_DIAMOND_SHOVEL, Sticks.ACACIA_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.ACACIA_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.ACACIA_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.ACACIA_WOODEN_SWORD, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.ACACIA_STONE_SWORD, Sticks.ACACIA_STICK);
        offerIronSwordRecipe(exporter, Swords.ACACIA_IRON_SWORD, Sticks.ACACIA_STICK);
        offerGoldenSwordRecipe(exporter, Swords.ACACIA_GOLDEN_SWORD, Sticks.ACACIA_STICK);
        offerDiamondSwordRecipe(exporter, Swords.ACACIA_DIAMOND_SWORD, Sticks.ACACIA_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.ACACIA_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.ACACIA_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.ACACIA_CAMPFIRE, Blocks.ACACIA_LOG, Sticks.ACACIA_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.ACACIA_SOUL_CAMPFIRE, Blocks.ACACIA_LOG, Sticks.ACACIA_STICK);
        offerGrindstoneRecipe(exporter, Grindstones.ACACIA_GRINDSTONE, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        offerLadderRecipe(exporter, Ladders.ACACIA_LADDER, Sticks.ACACIA_STICK);
        offerLeverRecipe(exporter, Levers.ACACIA_LEVER, Sticks.ACACIA_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.ACACIA_ACTIVATOR_RAIL, RedstoneTorches.ACACIA_REDSTONE_TORCH, Sticks.ACACIA_STICK, Rails.ACACIA_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.ACACIA_DETECTOR_RAIL, Sticks.ACACIA_STICK, Rails.ACACIA_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.ACACIA_POWERED_RAIL, Sticks.ACACIA_STICK, Rails.ACACIA_RAIL);
        offerRailRecipe(exporter, Rails.ACACIA_RAIL, Sticks.ACACIA_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.ACACIA_REDSTONE_TORCH, Sticks.ACACIA_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.ACACIA_SOUL_TORCH, Sticks.ACACIA_STICK);
        offerTorchRecipe(exporter, Torches.ACACIA_TORCH, Sticks.ACACIA_STICK);

        // BAMBOO
        offerArrowRecipe(exporter, Arrows.BAMBOO_ARROW_ITEM, Sticks.BAMBOO_STICK);
        offerWoodenAxeRecipe(exporter, Axes.BAMBOO_WOODEN_AXE, Sticks.BAMBOO_STICK, Blocks.BAMBOO_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.BAMBOO_STONE_AXE, Sticks.BAMBOO_STICK);
        offerIronAxeRecipe(exporter, Axes.BAMBOO_IRON_AXE, Sticks.BAMBOO_STICK);
        offerGoldenAxeRecipe(exporter, Axes.BAMBOO_GOLDEN_AXE, Sticks.BAMBOO_STICK);
        offerDiamondAxeRecipe(exporter, Axes.BAMBOO_DIAMOND_AXE, Sticks.BAMBOO_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.BAMBOO_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.BAMBOO_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.BAMBOO_BOW, Sticks.BAMBOO_STICK);
        offerBrushRecipe(exporter, Brushes.BAMBOO_BRUSH, Sticks.BAMBOO_STICK);
        offerCrossbowRecipe(exporter, Crossbows.BAMBOO_CROSSBOW, Sticks.BAMBOO_STICK);
        offerFishingRodRecipe(exporter, FishingRods.BAMBOO_FISHING_ROD, Sticks.BAMBOO_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.BAMBOO_WOODEN_HOE, Sticks.BAMBOO_STICK, Blocks.BAMBOO_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.BAMBOO_STONE_HOE, Sticks.BAMBOO_STICK);
        offerIronHoeRecipe(exporter, Hoes.BAMBOO_IRON_HOE, Sticks.BAMBOO_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.BAMBOO_GOLDEN_HOE, Sticks.BAMBOO_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.BAMBOO_DIAMOND_HOE, Sticks.BAMBOO_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.BAMBOO_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.BAMBOO_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.BAMBOO_CARROT_ON_A_STICK, FishingRods.BAMBOO_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.BAMBOO_WARPED_FUNGUS_ON_A_STICK, FishingRods.BAMBOO_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.BAMBOO_WOODEN_PICKAXE, Sticks.BAMBOO_STICK, Blocks.BAMBOO_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.BAMBOO_STONE_PICKAXE, Sticks.BAMBOO_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.BAMBOO_IRON_PICKAXE, Sticks.BAMBOO_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.BAMBOO_GOLDEN_PICKAXE, Sticks.BAMBOO_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.BAMBOO_DIAMOND_PICKAXE, Sticks.BAMBOO_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.BAMBOO_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.BAMBOO_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.BAMBOO_WOODEN_SHOVEL, Sticks.BAMBOO_STICK, Blocks.BAMBOO_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.BAMBOO_STONE_SHOVEL, Sticks.BAMBOO_STICK);
        offerIronShovelRecipe(exporter, Shovels.BAMBOO_IRON_SHOVEL, Sticks.BAMBOO_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.BAMBOO_GOLDEN_SHOVEL, Sticks.BAMBOO_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.BAMBOO_DIAMOND_SHOVEL, Sticks.BAMBOO_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.BAMBOO_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.BAMBOO_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.BAMBOO_STICK, Blocks.BAMBOO_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.BAMBOO_WOODEN_SWORD, Sticks.BAMBOO_STICK, Blocks.BAMBOO_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.BAMBOO_STONE_SWORD, Sticks.BAMBOO_STICK);
        offerIronSwordRecipe(exporter, Swords.BAMBOO_IRON_SWORD, Sticks.BAMBOO_STICK);
        offerGoldenSwordRecipe(exporter, Swords.BAMBOO_GOLDEN_SWORD, Sticks.BAMBOO_STICK);
        offerDiamondSwordRecipe(exporter, Swords.BAMBOO_DIAMOND_SWORD, Sticks.BAMBOO_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.BAMBOO_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.BAMBOO_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.BAMBOO_CAMPFIRE, Blocks.BAMBOO_MOSAIC, Sticks.BAMBOO_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.BAMBOO_SOUL_CAMPFIRE, Blocks.BAMBOO_MOSAIC, Sticks.BAMBOO_STICK);
        offerGrindstoneRecipe(exporter, Grindstones.BAMBOO_GRINDSTONE, Sticks.BAMBOO_STICK, Blocks.BAMBOO_PLANKS);
        offerLadderRecipe(exporter, Ladders.BAMBOO_LADDER, Sticks.BAMBOO_STICK);
        offerLeverRecipe(exporter, Levers.BAMBOO_LEVER, Sticks.BAMBOO_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.BAMBOO_ACTIVATOR_RAIL, RedstoneTorches.BAMBOO_REDSTONE_TORCH, Sticks.BAMBOO_STICK, Rails.BAMBOO_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.BAMBOO_DETECTOR_RAIL, Sticks.BAMBOO_STICK, Rails.BAMBOO_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.BAMBOO_POWERED_RAIL, Sticks.BAMBOO_STICK, Rails.BAMBOO_RAIL);
        offerRailRecipe(exporter, Rails.BAMBOO_RAIL, Sticks.BAMBOO_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.BAMBOO_REDSTONE_TORCH, Sticks.BAMBOO_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.BAMBOO_SOUL_TORCH, Sticks.BAMBOO_STICK);
        offerTorchRecipe(exporter, Torches.BAMBOO_TORCH, Sticks.BAMBOO_STICK);

        // BIRCH
        offerArrowRecipe(exporter, Arrows.BIRCH_ARROW_ITEM, Sticks.BIRCH_STICK);
        offerWoodenAxeRecipe(exporter, Axes.BIRCH_WOODEN_AXE, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.BIRCH_STONE_AXE, Sticks.BIRCH_STICK);
        offerIronAxeRecipe(exporter, Axes.BIRCH_IRON_AXE, Sticks.BIRCH_STICK);
        offerGoldenAxeRecipe(exporter, Axes.BIRCH_GOLDEN_AXE, Sticks.BIRCH_STICK);
        offerDiamondAxeRecipe(exporter, Axes.BIRCH_DIAMOND_AXE, Sticks.BIRCH_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.BIRCH_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.BIRCH_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.BIRCH_BOW, Sticks.BIRCH_STICK);
        offerBrushRecipe(exporter, Brushes.BIRCH_BRUSH, Sticks.BIRCH_STICK);
        offerCrossbowRecipe(exporter, Crossbows.BIRCH_CROSSBOW, Sticks.BIRCH_STICK);
        offerFishingRodRecipe(exporter, FishingRods.BIRCH_FISHING_ROD, Sticks.BIRCH_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.BIRCH_WOODEN_HOE, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.BIRCH_STONE_HOE, Sticks.BIRCH_STICK);
        offerIronHoeRecipe(exporter, Hoes.BIRCH_IRON_HOE, Sticks.BIRCH_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.BIRCH_GOLDEN_HOE, Sticks.BIRCH_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.BIRCH_DIAMOND_HOE, Sticks.BIRCH_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.BIRCH_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.BIRCH_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.BIRCH_CARROT_ON_A_STICK, FishingRods.BIRCH_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.BIRCH_WARPED_FUNGUS_ON_A_STICK, FishingRods.BIRCH_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.BIRCH_WOODEN_PICKAXE, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.BIRCH_STONE_PICKAXE, Sticks.BIRCH_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.BIRCH_IRON_PICKAXE, Sticks.BIRCH_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.BIRCH_GOLDEN_PICKAXE, Sticks.BIRCH_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.BIRCH_DIAMOND_PICKAXE, Sticks.BIRCH_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.BIRCH_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.BIRCH_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.BIRCH_WOODEN_SHOVEL, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.BIRCH_STONE_SHOVEL, Sticks.BIRCH_STICK);
        offerIronShovelRecipe(exporter, Shovels.BIRCH_IRON_SHOVEL, Sticks.BIRCH_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.BIRCH_GOLDEN_SHOVEL, Sticks.BIRCH_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.BIRCH_DIAMOND_SHOVEL, Sticks.BIRCH_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.BIRCH_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.BIRCH_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.BIRCH_WOODEN_SWORD, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.BIRCH_STONE_SWORD, Sticks.BIRCH_STICK);
        offerIronSwordRecipe(exporter, Swords.BIRCH_IRON_SWORD, Sticks.BIRCH_STICK);
        offerGoldenSwordRecipe(exporter, Swords.BIRCH_GOLDEN_SWORD, Sticks.BIRCH_STICK);
        offerDiamondSwordRecipe(exporter, Swords.BIRCH_DIAMOND_SWORD, Sticks.BIRCH_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.BIRCH_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.BIRCH_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.BIRCH_CAMPFIRE, Blocks.BIRCH_LOG, Sticks.BIRCH_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.BIRCH_SOUL_CAMPFIRE, Blocks.BIRCH_LOG, Sticks.BIRCH_STICK);
        offerGrindstoneRecipe(exporter, Grindstones.BIRCH_GRINDSTONE, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        offerLadderRecipe(exporter, Ladders.BIRCH_LADDER, Sticks.BIRCH_STICK);
        offerLeverRecipe(exporter, Levers.BIRCH_LEVER, Sticks.BIRCH_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.BIRCH_ACTIVATOR_RAIL, RedstoneTorches.BIRCH_REDSTONE_TORCH, Sticks.BIRCH_STICK, Rails.BIRCH_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.BIRCH_DETECTOR_RAIL, Sticks.BIRCH_STICK, Rails.BIRCH_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.BIRCH_POWERED_RAIL, Sticks.BIRCH_STICK, Rails.BIRCH_RAIL);
        offerRailRecipe(exporter, Rails.BIRCH_RAIL, Sticks.BIRCH_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.BIRCH_REDSTONE_TORCH, Sticks.BIRCH_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.BIRCH_SOUL_TORCH, Sticks.BIRCH_STICK);
        offerTorchRecipe(exporter, Torches.BIRCH_TORCH, Sticks.BIRCH_STICK);

        // CHERRY
        offerArrowRecipe(exporter, Arrows.CHERRY_ARROW_ITEM, Sticks.CHERRY_STICK);
        offerWoodenAxeRecipe(exporter, Axes.CHERRY_WOODEN_AXE, Sticks.CHERRY_STICK, Blocks.CHERRY_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.CHERRY_STONE_AXE, Sticks.CHERRY_STICK);
        offerIronAxeRecipe(exporter, Axes.CHERRY_IRON_AXE, Sticks.CHERRY_STICK);
        offerGoldenAxeRecipe(exporter, Axes.CHERRY_GOLDEN_AXE, Sticks.CHERRY_STICK);
        offerDiamondAxeRecipe(exporter, Axes.CHERRY_DIAMOND_AXE, Sticks.CHERRY_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.CHERRY_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.CHERRY_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.CHERRY_BOW, Sticks.CHERRY_STICK);
        offerBrushRecipe(exporter, Brushes.CHERRY_BRUSH, Sticks.CHERRY_STICK);
        offerCrossbowRecipe(exporter, Crossbows.CHERRY_CROSSBOW, Sticks.CHERRY_STICK);
        offerFishingRodRecipe(exporter, FishingRods.CHERRY_FISHING_ROD, Sticks.CHERRY_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.CHERRY_WOODEN_HOE, Sticks.CHERRY_STICK, Blocks.CHERRY_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.CHERRY_STONE_HOE, Sticks.CHERRY_STICK);
        offerIronHoeRecipe(exporter, Hoes.CHERRY_IRON_HOE, Sticks.CHERRY_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.CHERRY_GOLDEN_HOE, Sticks.CHERRY_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.CHERRY_DIAMOND_HOE, Sticks.CHERRY_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.CHERRY_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.CHERRY_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.CHERRY_CARROT_ON_A_STICK, FishingRods.CHERRY_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.CHERRY_WARPED_FUNGUS_ON_A_STICK, FishingRods.CHERRY_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.CHERRY_WOODEN_PICKAXE, Sticks.CHERRY_STICK, Blocks.CHERRY_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.CHERRY_STONE_PICKAXE, Sticks.CHERRY_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.CHERRY_IRON_PICKAXE, Sticks.CHERRY_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.CHERRY_GOLDEN_PICKAXE, Sticks.CHERRY_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.CHERRY_DIAMOND_PICKAXE, Sticks.CHERRY_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.CHERRY_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.CHERRY_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.CHERRY_WOODEN_SHOVEL, Sticks.CHERRY_STICK, Blocks.CHERRY_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.CHERRY_STONE_SHOVEL, Sticks.CHERRY_STICK);
        offerIronShovelRecipe(exporter, Shovels.CHERRY_IRON_SHOVEL, Sticks.CHERRY_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.CHERRY_GOLDEN_SHOVEL, Sticks.CHERRY_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.CHERRY_DIAMOND_SHOVEL, Sticks.CHERRY_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.CHERRY_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.CHERRY_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.CHERRY_STICK, Blocks.CHERRY_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.CHERRY_WOODEN_SWORD, Sticks.CHERRY_STICK, Blocks.CHERRY_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.CHERRY_STONE_SWORD, Sticks.CHERRY_STICK);
        offerIronSwordRecipe(exporter, Swords.CHERRY_IRON_SWORD, Sticks.CHERRY_STICK);
        offerGoldenSwordRecipe(exporter, Swords.CHERRY_GOLDEN_SWORD, Sticks.CHERRY_STICK);
        offerDiamondSwordRecipe(exporter, Swords.CHERRY_DIAMOND_SWORD, Sticks.CHERRY_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.CHERRY_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.CHERRY_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.CHERRY_CAMPFIRE, Blocks.CHERRY_LOG, Sticks.CHERRY_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.CHERRY_SOUL_CAMPFIRE, Blocks.CHERRY_LOG, Sticks.CHERRY_STICK);
        offerGrindstoneRecipe(exporter, Grindstones.CHERRY_GRINDSTONE, Sticks.CHERRY_STICK, Blocks.CHERRY_PLANKS);
        offerLadderRecipe(exporter, Ladders.CHERRY_LADDER, Sticks.CHERRY_STICK);
        offerLeverRecipe(exporter, Levers.CHERRY_LEVER, Sticks.CHERRY_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.CHERRY_ACTIVATOR_RAIL, RedstoneTorches.CHERRY_REDSTONE_TORCH, Sticks.CHERRY_STICK, Rails.CHERRY_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.CHERRY_DETECTOR_RAIL, Sticks.CHERRY_STICK, Rails.CHERRY_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.CHERRY_POWERED_RAIL, Sticks.CHERRY_STICK, Rails.CHERRY_RAIL);
        offerRailRecipe(exporter, Rails.CHERRY_RAIL, Sticks.CHERRY_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.CHERRY_REDSTONE_TORCH, Sticks.CHERRY_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.CHERRY_SOUL_TORCH, Sticks.CHERRY_STICK);
        offerTorchRecipe(exporter, Torches.CHERRY_TORCH, Sticks.CHERRY_STICK);

        // CRIMSON
        offerArrowRecipe(exporter, Arrows.CRIMSON_ARROW_ITEM, Sticks.CRIMSON_STICK);
        offerWoodenAxeRecipe(exporter, Axes.CRIMSON_WOODEN_AXE, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.CRIMSON_STONE_AXE, Sticks.CRIMSON_STICK);
        offerIronAxeRecipe(exporter, Axes.CRIMSON_IRON_AXE, Sticks.CRIMSON_STICK);
        offerGoldenAxeRecipe(exporter, Axes.CRIMSON_GOLDEN_AXE, Sticks.CRIMSON_STICK);
        offerDiamondAxeRecipe(exporter, Axes.CRIMSON_DIAMOND_AXE, Sticks.CRIMSON_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.CRIMSON_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.CRIMSON_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.CRIMSON_BOW, Sticks.CRIMSON_STICK);
        offerBrushRecipe(exporter, Brushes.CRIMSON_BRUSH, Sticks.CRIMSON_STICK);
        offerCrossbowRecipe(exporter, Crossbows.CRIMSON_CROSSBOW, Sticks.CRIMSON_STICK);
        offerFishingRodRecipe(exporter, FishingRods.CRIMSON_FISHING_ROD, Sticks.CRIMSON_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.CRIMSON_WOODEN_HOE, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.CRIMSON_STONE_HOE, Sticks.CRIMSON_STICK);
        offerIronHoeRecipe(exporter, Hoes.CRIMSON_IRON_HOE, Sticks.CRIMSON_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.CRIMSON_GOLDEN_HOE, Sticks.CRIMSON_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.CRIMSON_DIAMOND_HOE, Sticks.CRIMSON_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.CRIMSON_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.CRIMSON_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.CRIMSON_CARROT_ON_A_STICK, FishingRods.CRIMSON_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.CRIMSON_WARPED_FUNGUS_ON_A_STICK, FishingRods.CRIMSON_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.CRIMSON_WOODEN_PICKAXE, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.CRIMSON_STONE_PICKAXE, Sticks.CRIMSON_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.CRIMSON_IRON_PICKAXE, Sticks.CRIMSON_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.CRIMSON_GOLDEN_PICKAXE, Sticks.CRIMSON_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.CRIMSON_DIAMOND_PICKAXE, Sticks.CRIMSON_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.CRIMSON_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.CRIMSON_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.CRIMSON_WOODEN_SHOVEL, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.CRIMSON_STONE_SHOVEL, Sticks.CRIMSON_STICK);
        offerIronShovelRecipe(exporter, Shovels.CRIMSON_IRON_SHOVEL, Sticks.CRIMSON_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.CRIMSON_GOLDEN_SHOVEL, Sticks.CRIMSON_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.CRIMSON_DIAMOND_SHOVEL, Sticks.CRIMSON_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.CRIMSON_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.CRIMSON_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.CRIMSON_WOODEN_SWORD, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.CRIMSON_STONE_SWORD, Sticks.CRIMSON_STICK);
        offerIronSwordRecipe(exporter, Swords.CRIMSON_IRON_SWORD, Sticks.CRIMSON_STICK);
        offerGoldenSwordRecipe(exporter, Swords.CRIMSON_GOLDEN_SWORD, Sticks.CRIMSON_STICK);
        offerDiamondSwordRecipe(exporter, Swords.CRIMSON_DIAMOND_SWORD, Sticks.CRIMSON_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.CRIMSON_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.CRIMSON_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.CRIMSON_CAMPFIRE, Blocks.CRIMSON_STEM, Sticks.CRIMSON_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.CRIMSON_SOUL_CAMPFIRE, Blocks.CRIMSON_STEM, Sticks.CRIMSON_STICK);
        offerGrindstoneRecipe(exporter, Grindstones.CRIMSON_GRINDSTONE, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        offerLadderRecipe(exporter, Ladders.CRIMSON_LADDER, Sticks.CRIMSON_STICK);
        offerLeverRecipe(exporter, Levers.CRIMSON_LEVER, Sticks.CRIMSON_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.CRIMSON_ACTIVATOR_RAIL, RedstoneTorches.CRIMSON_REDSTONE_TORCH, Sticks.CRIMSON_STICK, Rails.CRIMSON_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.CRIMSON_DETECTOR_RAIL, Sticks.CRIMSON_STICK, Rails.CRIMSON_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.CRIMSON_POWERED_RAIL, Sticks.CRIMSON_STICK, Rails.CRIMSON_RAIL);
        offerRailRecipe(exporter, Rails.CRIMSON_RAIL, Sticks.CRIMSON_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.CRIMSON_REDSTONE_TORCH, Sticks.CRIMSON_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.CRIMSON_SOUL_TORCH, Sticks.CRIMSON_STICK);
        offerTorchRecipe(exporter, Torches.CRIMSON_TORCH, Sticks.CRIMSON_STICK);

        // DARK_OAK
        offerArrowRecipe(exporter, Arrows.DARK_OAK_ARROW_ITEM, Sticks.DARK_OAK_STICK);
        offerWoodenAxeRecipe(exporter, Axes.DARK_OAK_WOODEN_AXE, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.DARK_OAK_STONE_AXE, Sticks.DARK_OAK_STICK);
        offerIronAxeRecipe(exporter, Axes.DARK_OAK_IRON_AXE, Sticks.DARK_OAK_STICK);
        offerGoldenAxeRecipe(exporter, Axes.DARK_OAK_GOLDEN_AXE, Sticks.DARK_OAK_STICK);
        offerDiamondAxeRecipe(exporter, Axes.DARK_OAK_DIAMOND_AXE, Sticks.DARK_OAK_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.DARK_OAK_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.DARK_OAK_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.DARK_OAK_BOW, Sticks.DARK_OAK_STICK);
        offerBrushRecipe(exporter, Brushes.DARK_OAK_BRUSH, Sticks.DARK_OAK_STICK);
        offerCrossbowRecipe(exporter, Crossbows.DARK_OAK_CROSSBOW, Sticks.DARK_OAK_STICK);
        offerFishingRodRecipe(exporter, FishingRods.DARK_OAK_FISHING_ROD, Sticks.DARK_OAK_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.DARK_OAK_WOODEN_HOE, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.DARK_OAK_STONE_HOE, Sticks.DARK_OAK_STICK);
        offerIronHoeRecipe(exporter, Hoes.DARK_OAK_IRON_HOE, Sticks.DARK_OAK_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.DARK_OAK_GOLDEN_HOE, Sticks.DARK_OAK_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.DARK_OAK_DIAMOND_HOE, Sticks.DARK_OAK_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.DARK_OAK_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.DARK_OAK_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.DARK_OAK_CARROT_ON_A_STICK, FishingRods.DARK_OAK_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.DARK_OAK_WARPED_FUNGUS_ON_A_STICK, FishingRods.DARK_OAK_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.DARK_OAK_WOODEN_PICKAXE, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.DARK_OAK_STONE_PICKAXE, Sticks.DARK_OAK_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.DARK_OAK_IRON_PICKAXE, Sticks.DARK_OAK_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.DARK_OAK_GOLDEN_PICKAXE, Sticks.DARK_OAK_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.DARK_OAK_DIAMOND_PICKAXE, Sticks.DARK_OAK_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.DARK_OAK_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.DARK_OAK_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.DARK_OAK_WOODEN_SHOVEL, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.DARK_OAK_STONE_SHOVEL, Sticks.DARK_OAK_STICK);
        offerIronShovelRecipe(exporter, Shovels.DARK_OAK_IRON_SHOVEL, Sticks.DARK_OAK_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.DARK_OAK_GOLDEN_SHOVEL, Sticks.DARK_OAK_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.DARK_OAK_DIAMOND_SHOVEL, Sticks.DARK_OAK_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.DARK_OAK_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.DARK_OAK_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.DARK_OAK_WOODEN_SWORD, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.DARK_OAK_STONE_SWORD, Sticks.DARK_OAK_STICK);
        offerIronSwordRecipe(exporter, Swords.DARK_OAK_IRON_SWORD, Sticks.DARK_OAK_STICK);
        offerGoldenSwordRecipe(exporter, Swords.DARK_OAK_GOLDEN_SWORD, Sticks.DARK_OAK_STICK);
        offerDiamondSwordRecipe(exporter, Swords.DARK_OAK_DIAMOND_SWORD, Sticks.DARK_OAK_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.DARK_OAK_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.DARK_OAK_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.DARK_OAK_CAMPFIRE, Blocks.DARK_OAK_LOG, Sticks.DARK_OAK_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.DARK_OAK_SOUL_CAMPFIRE, Blocks.DARK_OAK_LOG, Sticks.DARK_OAK_STICK);
        //offerGrindstoneRecipe(exporter, Grindstones.DARK_OAK_GRINDSTONE, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        offerLadderRecipe(exporter, Ladders.DARK_OAK_LADDER, Sticks.DARK_OAK_STICK);
        offerLeverRecipe(exporter, Levers.DARK_OAK_LEVER, Sticks.DARK_OAK_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.DARK_OAK_ACTIVATOR_RAIL, RedstoneTorches.DARK_OAK_REDSTONE_TORCH, Sticks.DARK_OAK_STICK, Rails.DARK_OAK_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.DARK_OAK_DETECTOR_RAIL, Sticks.DARK_OAK_STICK, Rails.DARK_OAK_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.DARK_OAK_POWERED_RAIL, Sticks.DARK_OAK_STICK, Rails.DARK_OAK_RAIL);
        offerRailRecipe(exporter, Rails.DARK_OAK_RAIL, Sticks.DARK_OAK_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.DARK_OAK_REDSTONE_TORCH, Sticks.DARK_OAK_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.DARK_OAK_SOUL_TORCH, Sticks.DARK_OAK_STICK);
        offerTorchRecipe(exporter, Torches.DARK_OAK_TORCH, Sticks.DARK_OAK_STICK);

        // JUNGLE
        offerArrowRecipe(exporter, Arrows.JUNGLE_ARROW_ITEM, Sticks.JUNGLE_STICK);
        offerWoodenAxeRecipe(exporter, Axes.JUNGLE_WOODEN_AXE, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.JUNGLE_STONE_AXE, Sticks.JUNGLE_STICK);
        offerIronAxeRecipe(exporter, Axes.JUNGLE_IRON_AXE, Sticks.JUNGLE_STICK);
        offerGoldenAxeRecipe(exporter, Axes.JUNGLE_GOLDEN_AXE, Sticks.JUNGLE_STICK);
        offerDiamondAxeRecipe(exporter, Axes.JUNGLE_DIAMOND_AXE, Sticks.JUNGLE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.JUNGLE_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.JUNGLE_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.JUNGLE_BOW, Sticks.JUNGLE_STICK);
        offerBrushRecipe(exporter, Brushes.JUNGLE_BRUSH, Sticks.JUNGLE_STICK);
        offerCrossbowRecipe(exporter, Crossbows.JUNGLE_CROSSBOW, Sticks.JUNGLE_STICK);
        offerFishingRodRecipe(exporter, FishingRods.JUNGLE_FISHING_ROD, Sticks.JUNGLE_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.JUNGLE_WOODEN_HOE, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.JUNGLE_STONE_HOE, Sticks.JUNGLE_STICK);
        offerIronHoeRecipe(exporter, Hoes.JUNGLE_IRON_HOE, Sticks.JUNGLE_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.JUNGLE_GOLDEN_HOE, Sticks.JUNGLE_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.JUNGLE_DIAMOND_HOE, Sticks.JUNGLE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.JUNGLE_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.JUNGLE_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.JUNGLE_CARROT_ON_A_STICK, FishingRods.JUNGLE_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.JUNGLE_WARPED_FUNGUS_ON_A_STICK, FishingRods.JUNGLE_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.JUNGLE_WOODEN_PICKAXE, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.JUNGLE_STONE_PICKAXE, Sticks.JUNGLE_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.JUNGLE_IRON_PICKAXE, Sticks.JUNGLE_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.JUNGLE_GOLDEN_PICKAXE, Sticks.JUNGLE_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.JUNGLE_DIAMOND_PICKAXE, Sticks.JUNGLE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.JUNGLE_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.JUNGLE_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.JUNGLE_WOODEN_SHOVEL, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.JUNGLE_STONE_SHOVEL, Sticks.JUNGLE_STICK);
        offerIronShovelRecipe(exporter, Shovels.JUNGLE_IRON_SHOVEL, Sticks.JUNGLE_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.JUNGLE_GOLDEN_SHOVEL, Sticks.JUNGLE_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.JUNGLE_DIAMOND_SHOVEL, Sticks.JUNGLE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.JUNGLE_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.JUNGLE_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.JUNGLE_WOODEN_SWORD, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.JUNGLE_STONE_SWORD, Sticks.JUNGLE_STICK);
        offerIronSwordRecipe(exporter, Swords.JUNGLE_IRON_SWORD, Sticks.JUNGLE_STICK);
        offerGoldenSwordRecipe(exporter, Swords.JUNGLE_GOLDEN_SWORD, Sticks.JUNGLE_STICK);
        offerDiamondSwordRecipe(exporter, Swords.JUNGLE_DIAMOND_SWORD, Sticks.JUNGLE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.JUNGLE_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.JUNGLE_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.JUNGLE_CAMPFIRE, Blocks.JUNGLE_LOG, Sticks.JUNGLE_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.JUNGLE_SOUL_CAMPFIRE, Blocks.JUNGLE_LOG, Sticks.JUNGLE_STICK);
        offerGrindstoneRecipe(exporter, Grindstones.JUNGLE_GRINDSTONE, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        offerLadderRecipe(exporter, Ladders.JUNGLE_LADDER, Sticks.JUNGLE_STICK);
        offerLeverRecipe(exporter, Levers.JUNGLE_LEVER, Sticks.JUNGLE_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.JUNGLE_ACTIVATOR_RAIL, RedstoneTorches.JUNGLE_REDSTONE_TORCH, Sticks.JUNGLE_STICK, Rails.JUNGLE_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.JUNGLE_DETECTOR_RAIL, Sticks.JUNGLE_STICK, Rails.JUNGLE_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.JUNGLE_POWERED_RAIL, Sticks.JUNGLE_STICK, Rails.JUNGLE_RAIL);
        offerRailRecipe(exporter, Rails.JUNGLE_RAIL, Sticks.JUNGLE_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.JUNGLE_REDSTONE_TORCH, Sticks.JUNGLE_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.JUNGLE_SOUL_TORCH, Sticks.JUNGLE_STICK);
        offerTorchRecipe(exporter, Torches.JUNGLE_TORCH, Sticks.JUNGLE_STICK);

        // MANGROVE
        offerArrowRecipe(exporter, Arrows.MANGROVE_ARROW_ITEM, Sticks.MANGROVE_STICK);
        offerWoodenAxeRecipe(exporter, Axes.MANGROVE_WOODEN_AXE, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.MANGROVE_STONE_AXE, Sticks.MANGROVE_STICK);
        offerIronAxeRecipe(exporter, Axes.MANGROVE_IRON_AXE, Sticks.MANGROVE_STICK);
        offerGoldenAxeRecipe(exporter, Axes.MANGROVE_GOLDEN_AXE, Sticks.MANGROVE_STICK);
        offerDiamondAxeRecipe(exporter, Axes.MANGROVE_DIAMOND_AXE, Sticks.MANGROVE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.MANGROVE_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.MANGROVE_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.MANGROVE_BOW, Sticks.MANGROVE_STICK);
        offerBrushRecipe(exporter, Brushes.MANGROVE_BRUSH, Sticks.MANGROVE_STICK);
        offerCrossbowRecipe(exporter, Crossbows.MANGROVE_CROSSBOW, Sticks.MANGROVE_STICK);
        offerFishingRodRecipe(exporter, FishingRods.MANGROVE_FISHING_ROD, Sticks.MANGROVE_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.MANGROVE_WOODEN_HOE, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.MANGROVE_STONE_HOE, Sticks.MANGROVE_STICK);
        offerIronHoeRecipe(exporter, Hoes.MANGROVE_IRON_HOE, Sticks.MANGROVE_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.MANGROVE_GOLDEN_HOE, Sticks.MANGROVE_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.MANGROVE_DIAMOND_HOE, Sticks.MANGROVE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.MANGROVE_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.MANGROVE_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.MANGROVE_CARROT_ON_A_STICK, FishingRods.MANGROVE_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.MANGROVE_WARPED_FUNGUS_ON_A_STICK, FishingRods.MANGROVE_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.MANGROVE_WOODEN_PICKAXE, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.MANGROVE_STONE_PICKAXE, Sticks.MANGROVE_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.MANGROVE_IRON_PICKAXE, Sticks.MANGROVE_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.MANGROVE_GOLDEN_PICKAXE, Sticks.MANGROVE_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.MANGROVE_DIAMOND_PICKAXE, Sticks.MANGROVE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.MANGROVE_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.MANGROVE_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.MANGROVE_WOODEN_SHOVEL, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.MANGROVE_STONE_SHOVEL, Sticks.MANGROVE_STICK);
        offerIronShovelRecipe(exporter, Shovels.MANGROVE_IRON_SHOVEL, Sticks.MANGROVE_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.MANGROVE_GOLDEN_SHOVEL, Sticks.MANGROVE_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.MANGROVE_DIAMOND_SHOVEL, Sticks.MANGROVE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.MANGROVE_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.MANGROVE_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.MANGROVE_WOODEN_SWORD, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.MANGROVE_STONE_SWORD, Sticks.MANGROVE_STICK);
        offerIronSwordRecipe(exporter, Swords.MANGROVE_IRON_SWORD, Sticks.MANGROVE_STICK);
        offerGoldenSwordRecipe(exporter, Swords.MANGROVE_GOLDEN_SWORD, Sticks.MANGROVE_STICK);
        offerDiamondSwordRecipe(exporter, Swords.MANGROVE_DIAMOND_SWORD, Sticks.MANGROVE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.MANGROVE_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.MANGROVE_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.MANGROVE_CAMPFIRE, Blocks.MANGROVE_LOG, Sticks.MANGROVE_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.MANGROVE_SOUL_CAMPFIRE, Blocks.MANGROVE_LOG, Sticks.MANGROVE_STICK);
        offerGrindstoneRecipe(exporter, Grindstones.MANGROVE_GRINDSTONE, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        offerLadderRecipe(exporter, Ladders.MANGROVE_LADDER, Sticks.MANGROVE_STICK);
        offerLeverRecipe(exporter, Levers.MANGROVE_LEVER, Sticks.MANGROVE_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.MANGROVE_ACTIVATOR_RAIL, RedstoneTorches.MANGROVE_REDSTONE_TORCH, Sticks.MANGROVE_STICK, Rails.MANGROVE_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.MANGROVE_DETECTOR_RAIL, Sticks.MANGROVE_STICK, Rails.MANGROVE_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.MANGROVE_POWERED_RAIL, Sticks.MANGROVE_STICK, Rails.MANGROVE_RAIL);
        offerRailRecipe(exporter, Rails.MANGROVE_RAIL, Sticks.MANGROVE_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.MANGROVE_REDSTONE_TORCH, Sticks.MANGROVE_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.MANGROVE_SOUL_TORCH, Sticks.MANGROVE_STICK);
        offerTorchRecipe(exporter, Torches.MANGROVE_TORCH, Sticks.MANGROVE_STICK);

        // OAK
        offerArrowRecipe(exporter, Arrows.OAK_ARROW_ITEM, Items.STICK);
        //offerWoodenAxeRecipe(exporter, Axes.OAK_WOODEN_AXE, Items.STICK, Blocks.OAK_PLANKS);
        //offerStoneAxeRecipe(exporter, Axes.OAK_STONE_AXE, Items.STICK);
        //offerIronAxeRecipe(exporter, Axes.OAK_IRON_AXE, Items.STICK);
        //offerGoldenAxeRecipe(exporter, Axes.OAK_GOLDEN_AXE, Items.STICK);
        //offerDiamondAxeRecipe(exporter, Axes.OAK_DIAMOND_AXE, Items.STICK);
        //VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.OAK_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.OAK_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.OAK_BOW, Items.STICK);
        //offerBrushRecipe(exporter, Brushes.OAK_BRUSH, Items.STICK);
        offerCrossbowRecipe(exporter, Crossbows.OAK_CROSSBOW, Items.STICK);
        offerFishingRodRecipe(exporter, FishingRods.OAK_FISHING_ROD, Items.STICK);
        //offerWoodenHoeRecipe(exporter, Hoes.OAK_WOODEN_HOE, Items.STICK, Blocks.OAK_PLANKS);
        //offerStoneHoeRecipe(exporter, Hoes.OAK_STONE_HOE, Items.STICK);
        //offerIronHoeRecipe(exporter, Hoes.OAK_IRON_HOE, Items.STICK);
        //offerGoldenHoeRecipe(exporter, Hoes.OAK_GOLDEN_HOE, Items.STICK);
        //offerDiamondHoeRecipe(exporter, Hoes.OAK_DIAMOND_HOE, Items.STICK);
        //VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.OAK_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.OAK_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.OAK_CARROT_ON_A_STICK, FishingRods.OAK_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.OAK_WARPED_FUNGUS_ON_A_STICK, FishingRods.OAK_FISHING_ROD);
        //offerWoodenPickaxeRecipe(exporter, Pickaxes.OAK_WOODEN_PICKAXE, Items.STICK, Blocks.OAK_PLANKS);
        //offerStonePickaxeRecipe(exporter, Pickaxes.OAK_STONE_PICKAXE, Items.STICK);
        //offerIronPickaxeRecipe(exporter, Pickaxes.OAK_IRON_PICKAXE, Items.STICK);
        //offerGoldenPickaxeRecipe(exporter, Pickaxes.OAK_GOLDEN_PICKAXE, Items.STICK);
        //offerDiamondPickaxeRecipe(exporter, Pickaxes.OAK_DIAMOND_PICKAXE, Items.STICK);
        //VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.OAK_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.OAK_NETHERITE_PICKAXE);
        //offerWoodenShovelRecipe(exporter, Shovels.OAK_WOODEN_SHOVEL, Items.STICK, Blocks.OAK_PLANKS);
        //offerStoneShovelRecipe(exporter, Shovels.OAK_STONE_SHOVEL, Items.STICK);
        //offerIronShovelRecipe(exporter, Shovels.OAK_IRON_SHOVEL, Items.STICK);
        //offerGoldenShovelRecipe(exporter, Shovels.OAK_GOLDEN_SHOVEL, Items.STICK);
        //offerDiamondShovelRecipe(exporter, Shovels.OAK_DIAMOND_SHOVEL, Items.STICK);
        //VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.OAK_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.OAK_NETHERITE_SHOVEL);
        //offerStickRecipe(exporter, Sticks.OAK_STICK, Blocks.OAK_PLANKS);
        //offerWoodenSwordRecipe(exporter, Swords.OAK_WOODEN_SWORD, Items.STICK, Blocks.OAK_PLANKS);
        //offerStoneSwordRecipe(exporter, Swords.OAK_STONE_SWORD, Items.STICK);
        //offerIronSwordRecipe(exporter, Swords.OAK_IRON_SWORD, Items.STICK);
        //offerGoldenSwordRecipe(exporter, Swords.OAK_GOLDEN_SWORD, Items.STICK);
        //offerDiamondSwordRecipe(exporter, Swords.OAK_DIAMOND_SWORD, Items.STICK);
        //VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.OAK_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.OAK_NETHERITE_SWORD);
        //offerCampfireRecipe(exporter, Campfires.OAK_CAMPFIRE, Blocks.OAK_LOG, Items.STICK);
        //offerSoulCampfireRecipe(exporter, SoulCampfires.OAK_SOUL_CAMPFIRE, Blocks.OAK_LOG, Items.STICK);
        offerGrindstoneRecipe(exporter, Grindstones.OAK_GRINDSTONE, Items.STICK, Blocks.OAK_PLANKS);
        //offerLadderRecipe(exporter, Ladders.OAK_LADDER, Items.STICK);
        //offerLeverRecipe(exporter, Levers.OAK_LEVER, Items.STICK);
        //offerActivatorRailRecipe(exporter, ActivatorRails.OAK_ACTIVATOR_RAIL, RedstoneTorches.OAK_REDSTONE_TORCH, Items.STICK, Rails.OAK_RAIL);
        //offerDetectorRailRecipe(exporter, DetectorRails.OAK_DETECTOR_RAIL, Items.STICK, Rails.OAK_RAIL);
        //offerPoweredRailRecipe(exporter, PoweredRails.OAK_POWERED_RAIL, Items.STICK, Rails.OAK_RAIL);
        //offerRailRecipe(exporter, Rails.OAK_RAIL, Items.STICK);
        //offerRedstoneTorchRecipe(exporter, RedstoneTorches.OAK_REDSTONE_TORCH, Items.STICK);
        //offerSoulTorchRecipe(exporter, SoulTorches.OAK_SOUL_TORCH, Items.STICK);
        //offerTorchRecipe(exporter, Torches.OAK_TORCH, Items.STICK);

        // SPRUCE
        //offerArrowRecipe(exporter, Arrows.SPRUCE_ARROW_ITEM, Sticks.SPRUCE_STICK);
        offerWoodenAxeRecipe(exporter, Axes.SPRUCE_WOODEN_AXE, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.SPRUCE_STONE_AXE, Sticks.SPRUCE_STICK);
        offerIronAxeRecipe(exporter, Axes.SPRUCE_IRON_AXE, Sticks.SPRUCE_STICK);
        offerGoldenAxeRecipe(exporter, Axes.SPRUCE_GOLDEN_AXE, Sticks.SPRUCE_STICK);
        offerDiamondAxeRecipe(exporter, Axes.SPRUCE_DIAMOND_AXE, Sticks.SPRUCE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.SPRUCE_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.SPRUCE_NETHERITE_AXE);
        //offerBowRecipe(exporter, Bows.SPRUCE_BOW, Sticks.SPRUCE_STICK);
        offerBrushRecipe(exporter, Brushes.SPRUCE_BRUSH, Sticks.SPRUCE_STICK);
        //offerCrossbowRecipe(exporter, Crossbows.SPRUCE_CROSSBOW, Sticks.SPRUCE_STICK);
        //offerFishingRodRecipe(exporter, FishingRods.SPRUCE_FISHING_ROD, Sticks.SPRUCE_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.SPRUCE_WOODEN_HOE, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.SPRUCE_STONE_HOE, Sticks.SPRUCE_STICK);
        offerIronHoeRecipe(exporter, Hoes.SPRUCE_IRON_HOE, Sticks.SPRUCE_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.SPRUCE_GOLDEN_HOE, Sticks.SPRUCE_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.SPRUCE_DIAMOND_HOE, Sticks.SPRUCE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.SPRUCE_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.SPRUCE_NETHERITE_HOE);
        //offerCarrotOnAStickRecipe(exporter, OnAStick.SPRUCE_CARROT_ON_A_STICK, FishingRods.SPRUCE_FISHING_ROD);
        //offerWarpedFungusOnAStickRecipe(exporter, OnAStick.SPRUCE_WARPED_FUNGUS_ON_A_STICK, FishingRods.SPRUCE_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.SPRUCE_WOODEN_PICKAXE, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.SPRUCE_STONE_PICKAXE, Sticks.SPRUCE_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.SPRUCE_IRON_PICKAXE, Sticks.SPRUCE_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.SPRUCE_GOLDEN_PICKAXE, Sticks.SPRUCE_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.SPRUCE_DIAMOND_PICKAXE, Sticks.SPRUCE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.SPRUCE_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.SPRUCE_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.SPRUCE_WOODEN_SHOVEL, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.SPRUCE_STONE_SHOVEL, Sticks.SPRUCE_STICK);
        offerIronShovelRecipe(exporter, Shovels.SPRUCE_IRON_SHOVEL, Sticks.SPRUCE_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.SPRUCE_GOLDEN_SHOVEL, Sticks.SPRUCE_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.SPRUCE_DIAMOND_SHOVEL, Sticks.SPRUCE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.SPRUCE_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.SPRUCE_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.SPRUCE_WOODEN_SWORD, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.SPRUCE_STONE_SWORD, Sticks.SPRUCE_STICK);
        offerIronSwordRecipe(exporter, Swords.SPRUCE_IRON_SWORD, Sticks.SPRUCE_STICK);
        offerGoldenSwordRecipe(exporter, Swords.SPRUCE_GOLDEN_SWORD, Sticks.SPRUCE_STICK);
        offerDiamondSwordRecipe(exporter, Swords.SPRUCE_DIAMOND_SWORD, Sticks.SPRUCE_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.SPRUCE_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.SPRUCE_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.SPRUCE_CAMPFIRE, Blocks.SPRUCE_LOG, Sticks.SPRUCE_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.SPRUCE_SOUL_CAMPFIRE, Blocks.SPRUCE_LOG, Sticks.SPRUCE_STICK);
        offerGrindstoneRecipe(exporter, Grindstones.SPRUCE_GRINDSTONE, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        offerLadderRecipe(exporter, Ladders.SPRUCE_LADDER, Sticks.SPRUCE_STICK);
        offerLeverRecipe(exporter, Levers.SPRUCE_LEVER, Sticks.SPRUCE_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.SPRUCE_ACTIVATOR_RAIL, RedstoneTorches.SPRUCE_REDSTONE_TORCH, Sticks.SPRUCE_STICK, Rails.SPRUCE_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.SPRUCE_DETECTOR_RAIL, Sticks.SPRUCE_STICK, Rails.SPRUCE_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.SPRUCE_POWERED_RAIL, Sticks.SPRUCE_STICK, Rails.SPRUCE_RAIL);
        offerRailRecipe(exporter, Rails.SPRUCE_RAIL, Sticks.SPRUCE_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.SPRUCE_REDSTONE_TORCH, Sticks.SPRUCE_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.SPRUCE_SOUL_TORCH, Sticks.SPRUCE_STICK);
        offerTorchRecipe(exporter, Torches.SPRUCE_TORCH, Sticks.SPRUCE_STICK);

        // WARPED
        offerArrowRecipe(exporter, Arrows.WARPED_ARROW_ITEM, Sticks.WARPED_STICK);
        offerWoodenAxeRecipe(exporter, Axes.WARPED_WOODEN_AXE, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);
        offerStoneAxeRecipe(exporter, Axes.WARPED_STONE_AXE, Sticks.WARPED_STICK);
        offerIronAxeRecipe(exporter, Axes.WARPED_IRON_AXE, Sticks.WARPED_STICK);
        offerGoldenAxeRecipe(exporter, Axes.WARPED_GOLDEN_AXE, Sticks.WARPED_STICK);
        offerDiamondAxeRecipe(exporter, Axes.WARPED_DIAMOND_AXE, Sticks.WARPED_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Axes.WARPED_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.WARPED_NETHERITE_AXE);
        offerBowRecipe(exporter, Bows.WARPED_BOW, Sticks.WARPED_STICK);
        offerBrushRecipe(exporter, Brushes.WARPED_BRUSH, Sticks.WARPED_STICK);
        offerCrossbowRecipe(exporter, Crossbows.WARPED_CROSSBOW, Sticks.WARPED_STICK);
        offerFishingRodRecipe(exporter, FishingRods.WARPED_FISHING_ROD, Sticks.WARPED_STICK);
        offerWoodenHoeRecipe(exporter, Hoes.WARPED_WOODEN_HOE, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);
        offerStoneHoeRecipe(exporter, Hoes.WARPED_STONE_HOE, Sticks.WARPED_STICK);
        offerIronHoeRecipe(exporter, Hoes.WARPED_IRON_HOE, Sticks.WARPED_STICK);
        offerGoldenHoeRecipe(exporter, Hoes.WARPED_GOLDEN_HOE, Sticks.WARPED_STICK);
        offerDiamondHoeRecipe(exporter, Hoes.WARPED_DIAMOND_HOE, Sticks.WARPED_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Hoes.WARPED_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.WARPED_NETHERITE_HOE);
        offerCarrotOnAStickRecipe(exporter, OnAStick.WARPED_CARROT_ON_A_STICK, FishingRods.WARPED_FISHING_ROD);
        offerWarpedFungusOnAStickRecipe(exporter, OnAStick.WARPED_WARPED_FUNGUS_ON_A_STICK, FishingRods.WARPED_FISHING_ROD);
        offerWoodenPickaxeRecipe(exporter, Pickaxes.WARPED_WOODEN_PICKAXE, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);
        offerStonePickaxeRecipe(exporter, Pickaxes.WARPED_STONE_PICKAXE, Sticks.WARPED_STICK);
        offerIronPickaxeRecipe(exporter, Pickaxes.WARPED_IRON_PICKAXE, Sticks.WARPED_STICK);
        offerGoldenPickaxeRecipe(exporter, Pickaxes.WARPED_GOLDEN_PICKAXE, Sticks.WARPED_STICK);
        offerDiamondPickaxeRecipe(exporter, Pickaxes.WARPED_DIAMOND_PICKAXE, Sticks.WARPED_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Pickaxes.WARPED_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.WARPED_NETHERITE_PICKAXE);
        offerWoodenShovelRecipe(exporter, Shovels.WARPED_WOODEN_SHOVEL, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);
        offerStoneShovelRecipe(exporter, Shovels.WARPED_STONE_SHOVEL, Sticks.WARPED_STICK);
        offerIronShovelRecipe(exporter, Shovels.WARPED_IRON_SHOVEL, Sticks.WARPED_STICK);
        offerGoldenShovelRecipe(exporter, Shovels.WARPED_GOLDEN_SHOVEL, Sticks.WARPED_STICK);
        offerDiamondShovelRecipe(exporter, Shovels.WARPED_DIAMOND_SHOVEL, Sticks.WARPED_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Shovels.WARPED_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.WARPED_NETHERITE_SHOVEL);
        offerStickRecipe(exporter, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);
        offerWoodenSwordRecipe(exporter, Swords.WARPED_WOODEN_SWORD, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);
        offerStoneSwordRecipe(exporter, Swords.WARPED_STONE_SWORD, Sticks.WARPED_STICK);
        offerIronSwordRecipe(exporter, Swords.WARPED_IRON_SWORD, Sticks.WARPED_STICK);
        offerGoldenSwordRecipe(exporter, Swords.WARPED_GOLDEN_SWORD, Sticks.WARPED_STICK);
        offerDiamondSwordRecipe(exporter, Swords.WARPED_DIAMOND_SWORD, Sticks.WARPED_STICK);
        VanillaRecipeProvider.offerNetheriteUpgradeRecipe(exporter, Swords.WARPED_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.WARPED_NETHERITE_SWORD);
        offerCampfireRecipe(exporter, Campfires.WARPED_CAMPFIRE, Blocks.WARPED_STEM, Sticks.WARPED_STICK);
        offerSoulCampfireRecipe(exporter, SoulCampfires.WARPED_SOUL_CAMPFIRE, Blocks.WARPED_STEM, Sticks.WARPED_STICK);
        offerGrindstoneRecipe(exporter, Grindstones.WARPED_GRINDSTONE, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);
        offerLadderRecipe(exporter, Ladders.WARPED_LADDER, Sticks.WARPED_STICK);
        offerLeverRecipe(exporter, Levers.WARPED_LEVER, Sticks.WARPED_STICK);
        offerActivatorRailRecipe(exporter, ActivatorRails.WARPED_ACTIVATOR_RAIL, RedstoneTorches.WARPED_REDSTONE_TORCH, Sticks.WARPED_STICK, Rails.WARPED_RAIL);
        offerDetectorRailRecipe(exporter, DetectorRails.WARPED_DETECTOR_RAIL, Sticks.WARPED_STICK, Rails.WARPED_RAIL);
        offerPoweredRailRecipe(exporter, PoweredRails.WARPED_POWERED_RAIL, Sticks.WARPED_STICK, Rails.WARPED_RAIL);
        offerRailRecipe(exporter, Rails.WARPED_RAIL, Sticks.WARPED_STICK);
        offerRedstoneTorchRecipe(exporter, RedstoneTorches.WARPED_REDSTONE_TORCH, Sticks.WARPED_STICK);
        offerSoulTorchRecipe(exporter, SoulTorches.WARPED_SOUL_TORCH, Sticks.WARPED_STICK);
        offerTorchRecipe(exporter, Torches.WARPED_TORCH, Sticks.WARPED_STICK);


    }

    public static void offerArrowRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, output, 4)
                .input('#', input).input('X', Items.FLINT).input('Y', Items.FEATHER)
                .pattern("X").pattern("#").pattern("Y")
                .criterion("has_feather", VanillaRecipeProvider.conditionsFromItem(Items.FEATHER))
                .criterion("has_flint", VanillaRecipeProvider.conditionsFromItem(Items.FLINT)).offerTo(exporter);
    }
    public static void offerWoodenAxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible axe, ItemConvertible stick, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe)
                .input('#', stick).input('X', plank)
                .pattern("XX").pattern("X#").pattern(" #")
                .criterion("has_stick", VanillaRecipeProvider.conditionsFromItem(stick)).offerTo(exporter);
    }
    public static void offerStoneAxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible axe,  ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe)
                .input('#', stick).input('X', ItemTags.STONE_TOOL_MATERIALS)
                .pattern("XX").pattern("X#").pattern(" #")
                .criterion("has_cobblestone", VanillaRecipeProvider.conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter);
    }
    public static void offerIronAxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible axe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe)
                .input('#', stick).input('X', Items.IRON_INGOT)
                .pattern("XX").pattern("X#").pattern(" #")
                .criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
    }
    public static void offerGoldenAxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible axe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe)
                .input('#', stick).input('X', Items.GOLD_INGOT)
                .pattern("XX").pattern("X#").pattern(" #")
                .criterion("has_gold_ingot", VanillaRecipeProvider.conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter);
    }
    public static void offerDiamondAxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible axe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, axe)
                .input('#', stick).input('X', Items.DIAMOND)
                .pattern("XX").pattern("X#").pattern(" #")
                .criterion("has_diamond", VanillaRecipeProvider.conditionsFromItem(Items.DIAMOND)).offerTo(exporter);
    }
    public static void offerBowRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible bow, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, bow)
                .input('#', stick).input('X', Items.STRING)
                .pattern(" #X").pattern("# X").pattern(" #X")
                .criterion("has_string", VanillaRecipeProvider.conditionsFromItem(Items.STRING)).offerTo(exporter);
    }
    public static void offerBrushRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible brush, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, brush)
                .input('X', Items.FEATHER).input('#', Items.COPPER_INGOT).input('I', stick)
                .pattern("X").pattern("#").pattern("I")
                .criterion("has_copper_ingot", VanillaRecipeProvider.conditionsFromItem(Items.COPPER_INGOT)).offerTo(exporter);
    }
    public static void offerCrossbowRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible xbow, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, xbow)
                .input('~', Items.STRING).input('#', stick).input('&', Items.IRON_INGOT).input('$', Blocks.TRIPWIRE_HOOK)
                .pattern("#&#").pattern("~$~").pattern(" # ")
                .criterion("has_string", VanillaRecipeProvider.conditionsFromItem(Items.STRING)).criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).criterion("has_tripwire_hook", VanillaRecipeProvider.conditionsFromItem(Blocks.TRIPWIRE_HOOK)).offerTo(exporter);
    }
    public static void offerFishingRodRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible rod, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, rod)
                .input('#', stick)
                .input('X', Items.STRING)
                .pattern("  #").pattern(" #X").pattern("# X")
                .criterion("has_string", VanillaRecipeProvider.conditionsFromItem(Items.STRING)).offerTo(exporter);
    }
    public static void offerWoodenHoeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible hoe, ItemConvertible stick, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe)
                .input('#', stick).input('X', plank)
                .pattern("XX").pattern(" #").pattern(" #")
                .criterion("has_stick", VanillaRecipeProvider.conditionsFromItem(stick)).offerTo(exporter);
    }
    public static void offerStoneHoeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible hoe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe)
                .input('#', stick).input('X', ItemTags.STONE_TOOL_MATERIALS)
                .pattern("XX").pattern(" #").pattern(" #")
                .criterion("has_cobblestone", VanillaRecipeProvider.conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter);
    }
    public static void offerIronHoeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible hoe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe)
                .input('#', stick).input('X', Items.IRON_INGOT)
                .pattern("XX").pattern(" #").pattern(" #")
                .criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
    }
    public static void offerGoldenHoeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible hoe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe)
                .input('#', stick).input('X', Items.GOLD_INGOT)
                .pattern("XX").pattern(" #").pattern(" #")
                .criterion("has_gold_ingot", VanillaRecipeProvider.conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter);
    }
    public static void offerDiamondHoeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible hoe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, hoe)
                .input('#', stick).input('X', Items.DIAMOND)
                .pattern("XX").pattern(" #").pattern(" #")
                .criterion("has_diamond", VanillaRecipeProvider.conditionsFromItem(Items.DIAMOND)).offerTo(exporter);
    }
    public static void offerCarrotOnAStickRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible carrotstick, ItemConvertible rod) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, carrotstick)
                .input('#', rod).input('X', Items.CARROT)
                .pattern("# ").pattern(" X")
                .criterion("has_carrot", VanillaRecipeProvider.conditionsFromItem(Items.CARROT)).offerTo(exporter);
    }
    public static void offerWarpedFungusOnAStickRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible fungusstick, ItemConvertible rod) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, fungusstick)
                .input('#', rod).input('X', Items.CARROT)
                .pattern("# ").pattern(" X")
                .criterion("has_carrot", VanillaRecipeProvider.conditionsFromItem(Items.CARROT)).offerTo(exporter);
    }
    public static void offerWoodenPickaxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible pickaxe, ItemConvertible stick, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, pickaxe)
                .input('#', stick).input('X', plank)
                .pattern("XXX").pattern(" # ").pattern(" # ")
                .criterion("has_stick", VanillaRecipeProvider.conditionsFromItem(stick)).offerTo(exporter);
    }
    public static void offerStonePickaxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible pickaxe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, pickaxe)
                .input('#', stick).input('X', ItemTags.STONE_TOOL_MATERIALS)
                .pattern("XXX").pattern(" # ").pattern(" # ")
                .criterion("has_cobblestone", VanillaRecipeProvider.conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter);
    }
    public static void offerIronPickaxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible pickaxe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, pickaxe)
                .input('#', stick).input('X', Items.IRON_INGOT)
                .pattern("XXX").pattern(" # ").pattern(" # ")
                .criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
    }
    public static void offerGoldenPickaxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible pickaxe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, pickaxe)
                .input('#', stick).input('X', Items.GOLD_INGOT)
                .pattern("XXX").pattern(" # ").pattern(" # ")
                .criterion("has_gold_ingot", VanillaRecipeProvider.conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter);
    }
    public static void offerDiamondPickaxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible pickaxe, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, pickaxe)
                .input('#', stick).input('X', Items.DIAMOND)
                .pattern("XXX").pattern(" # ").pattern(" # ")
                .criterion("has_diamond", VanillaRecipeProvider.conditionsFromItem(Items.DIAMOND)).offerTo(exporter);
    }
    public static void offerWoodenShovelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible shovel, ItemConvertible stick, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel)
                .input('#', stick).input('X', plank)
                .pattern("X").pattern("#").pattern("#")
                .criterion("has_stick", VanillaRecipeProvider.conditionsFromItem(stick)).offerTo(exporter);
    }
    public static void offerStoneShovelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible shovel, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel)
                .input('#', stick).input('X', ItemTags.STONE_TOOL_MATERIALS)
                .pattern("X").pattern("#").pattern("#")
                .criterion("has_cobblestone", VanillaRecipeProvider.conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter);
    }
    public static void offerIronShovelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible shovel, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel)
                .input('#', stick).input('X', Items.IRON_INGOT)
                .pattern("X").pattern("#").pattern("#")
                .criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
    }
    public static void offerGoldenShovelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible shovel, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel)
                .input('#', stick).input('X', Items.GOLD_INGOT)
                .pattern("X").pattern("#").pattern("#")
                .criterion("has_gold_ingot", VanillaRecipeProvider.conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter);
    }
    public static void offerDiamondShovelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible shovel, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, shovel)
                .input('#', stick).input('X', Items.DIAMOND)
                .pattern("X").pattern("#").pattern("#")
                .criterion("has_diamond", VanillaRecipeProvider.conditionsFromItem(Items.DIAMOND)).offerTo(exporter);
    }
    public static void offerStickRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible stick, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, stick, 4)
                .input('#', plank)
                .pattern("#").pattern("#")
                .group("sticks")
                .criterion("has_planks", VanillaRecipeProvider.conditionsFromItem(plank)).offerTo(exporter);
    }
    public static void offerWoodenSwordRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible sword, ItemConvertible stick, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, sword)
                .input('#', stick).input('X', plank)
                .pattern("X").pattern("X").pattern("#")
                .criterion("has_stick", VanillaRecipeProvider.conditionsFromItem(stick)).offerTo(exporter);
    }
    public static void offerStoneSwordRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible sword, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, sword)
                .input('#', stick).input('X', ItemTags.STONE_TOOL_MATERIALS)
                .pattern("X").pattern("X").pattern("#")
                .criterion("has_cobblestone", VanillaRecipeProvider.conditionsFromItem(Items.COBBLESTONE)).offerTo(exporter);
    }
    public static void offerIronSwordRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible sword, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, sword)
                .input('#', stick).input('X', Items.IRON_INGOT)
                .pattern("X").pattern("X").pattern("#")
                .criterion("has_iron_ingot", VanillaRecipeProvider.conditionsFromItem(Items.IRON_INGOT)).offerTo(exporter);
    }
    public static void offerGoldenSwordRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible sword, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, sword)
                .input('#', stick).input('X', Items.GOLD_INGOT)
                .pattern("X").pattern("X").pattern("#")
                .criterion("has_gold_ingot", VanillaRecipeProvider.conditionsFromItem(Items.GOLD_INGOT)).offerTo(exporter);
    }
    public static void offerDiamondSwordRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible sword, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, sword)
                .input('#', stick).input('X', Items.DIAMOND)
                .pattern("X").pattern("X").pattern("#")
                .criterion("has_diamond", VanillaRecipeProvider.conditionsFromItem(Items.DIAMOND)).offerTo(exporter);
    }
    public static void offerCampfireRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible campfire, ItemConvertible log, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, campfire)
                .input('L', log).input('S', stick).input('C', ItemTags.COALS)
                .pattern(" S ").pattern("SCS").pattern("LLL")
                .criterion("has_stick", VanillaRecipeProvider.conditionsFromItem(stick)).criterion("has_coal", VanillaRecipeProvider.conditionsFromTag(ItemTags.COALS)).offerTo(exporter);
    }
    public static void offerSoulCampfireRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible soulcampfire, ItemConvertible log, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, soulcampfire)
                .input('L', log).input('S', stick).input('#', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                .pattern(" S ").pattern("S#S").pattern("LLL")
                .criterion("has_soul_sand", VanillaRecipeProvider.conditionsFromTag(ItemTags.SOUL_FIRE_BASE_BLOCKS)).offerTo(exporter);
    }
    public static void offerGrindstoneRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible grindstone, ItemConvertible stick, ItemConvertible plank) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, grindstone)
                .input('I', stick).input('-', Blocks.STONE_SLAB).input('#', plank)
                .pattern("I-I").pattern("# #")
                .criterion("has_stone_slab", VanillaRecipeProvider.conditionsFromItem(Blocks.STONE_SLAB)).offerTo(exporter);
    }
    public static void offerLadderRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible ladder, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ladder, 3)
                .input('#', stick)
                .pattern("# #").pattern("###").pattern("# #")
                .criterion("has_stick", VanillaRecipeProvider.conditionsFromItem(stick)).offerTo(exporter);
    }
    public static void offerLeverRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible lever, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, lever)
                .input('#', Blocks.COBBLESTONE).input('X', stick)
                .pattern("X").pattern("#")
                .criterion("has_cobblestone", VanillaRecipeProvider.conditionsFromItem(Blocks.COBBLESTONE)).offerTo(exporter);
    }
    public static void offerActivatorRailRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible activatorrail, ItemConvertible redstonetorch, ItemConvertible stick, ItemConvertible rail) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, activatorrail, 6)
                .input('#', redstonetorch).input('S', stick).input('X', Items.IRON_INGOT)
                .pattern("XSX").pattern("X#X").pattern("XSX")
                .criterion("has_rail", VanillaRecipeProvider.conditionsFromItem(rail)).offerTo(exporter);
    }
    public static void offerDetectorRailRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible detectorrail, ItemConvertible stick, ItemConvertible rail) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, detectorrail, 6)
                .input('R', Items.REDSTONE).input('#', Blocks.STONE_PRESSURE_PLATE).input('S', stick).input('X', Items.IRON_INGOT)
                .pattern("XSX").pattern("X#X").pattern("XRX")
                .criterion("has_rail", VanillaRecipeProvider.conditionsFromItem(rail)).offerTo(exporter);
    }
    public static void offerPoweredRailRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible poweredrail, ItemConvertible stick, ItemConvertible rail) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, poweredrail, 6)
                .input('R', Items.REDSTONE).input('#', stick).input('X', Items.GOLD_INGOT)
                .pattern("X X").pattern("X#X").pattern("XRX")
                .criterion("has_rail", VanillaRecipeProvider.conditionsFromItem(rail)).offerTo(exporter);
    }
    public static void offerRailRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible rail, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, rail, 16)
                .input('#', stick).input('X', Items.IRON_INGOT)
                .pattern("X X").pattern("X#X").pattern("X X")
                .criterion("has_minecart", VanillaRecipeProvider.conditionsFromItem(Items.MINECART)).offerTo(exporter);
    }
    public static void offerRedstoneTorchRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible redstonetorch, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, redstonetorch)
                .input('#', stick).input('X', Items.REDSTONE)
                .pattern("X").pattern("#")
                .criterion("has_redstone", VanillaRecipeProvider.conditionsFromItem(Items.REDSTONE)).offerTo(exporter);
    }
    public static void offerSoulTorchRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible soultorch, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, soultorch, 4)
                .input('X', Ingredient.ofItems(Items.COAL, Items.CHARCOAL)).input('#', stick).input('S', ItemTags.SOUL_FIRE_BASE_BLOCKS)
                .pattern("X").pattern("#").pattern("S")
                .criterion("has_soul_sand", VanillaRecipeProvider.conditionsFromTag(ItemTags.SOUL_FIRE_BASE_BLOCKS)).offerTo(exporter);
    }
    public static void offerTorchRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible torch, ItemConvertible stick) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, torch, 4)
                .input('#', stick).input('X', Ingredient.ofItems(Items.COAL, Items.CHARCOAL))
                .pattern("X").pattern("#")
                .criterion("has_stone_pickaxe", VanillaRecipeProvider.conditionsFromItem(Items.STONE_PICKAXE)).offerTo(exporter);
    }
}