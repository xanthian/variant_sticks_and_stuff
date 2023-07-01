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

        RecipeGenerator.offerArrowRecipe(exporter, Arrows.ACACIA_ARROW_ITEM, Sticks.ACACIA_STICK);
        RecipeGenerator.offerArrowRecipe(exporter, Arrows.BIRCH_ARROW_ITEM, Sticks.BIRCH_STICK);
        RecipeGenerator.offerArrowRecipe(exporter, Arrows.CRIMSON_ARROW_ITEM, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerArrowRecipe(exporter, Arrows.DARK_OAK_ARROW_ITEM, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerArrowRecipe(exporter, Arrows.JUNGLE_ARROW_ITEM, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerArrowRecipe(exporter, Arrows.MANGROVE_ARROW_ITEM, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerArrowRecipe(exporter, Arrows.OAK_ARROW_ITEM, Sticks.OAK_STICK);
        RecipeGenerator.offerArrowRecipe(exporter, Arrows.SPRUCE_ARROW_ITEM, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerArrowRecipe(exporter, Arrows.WARPED_ARROW_ITEM, Sticks.WARPED_STICK);

        RecipeGenerator.offerWoodenAxeRecipe(exporter, Axes.ACACIA_WOODEN_AXE, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerWoodenAxeRecipe(exporter, Axes.BIRCH_WOODEN_AXE, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerWoodenAxeRecipe(exporter, Axes.CRIMSON_WOODEN_AXE, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerWoodenAxeRecipe(exporter, Axes.DARK_OAK_WOODEN_AXE, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerWoodenAxeRecipe(exporter, Axes.JUNGLE_WOODEN_AXE, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerWoodenAxeRecipe(exporter, Axes.MANGROVE_WOODEN_AXE, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerWoodenAxeRecipe(exporter, Axes.OAK_WOODEN_AXE, Sticks.OAK_STICK, Blocks.OAK_PLANKS);
        RecipeGenerator.offerWoodenAxeRecipe(exporter, Axes.SPRUCE_WOODEN_AXE, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerWoodenAxeRecipe(exporter, Axes.WARPED_WOODEN_AXE, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);

        RecipeGenerator.offerStoneAxeRecipe(exporter, Axes.ACACIA_STONE_AXE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerStoneAxeRecipe(exporter, Axes.BIRCH_STONE_AXE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerStoneAxeRecipe(exporter, Axes.CRIMSON_STONE_AXE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerStoneAxeRecipe(exporter, Axes.DARK_OAK_STONE_AXE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerStoneAxeRecipe(exporter, Axes.JUNGLE_STONE_AXE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerStoneAxeRecipe(exporter, Axes.MANGROVE_STONE_AXE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerStoneAxeRecipe(exporter, Axes.OAK_STONE_AXE, Sticks.OAK_STICK);
        RecipeGenerator.offerStoneAxeRecipe(exporter, Axes.SPRUCE_STONE_AXE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerStoneAxeRecipe(exporter, Axes.WARPED_STONE_AXE, Sticks.WARPED_STICK);
        
        RecipeGenerator.offerIronAxeRecipe(exporter, Axes.ACACIA_IRON_AXE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerIronAxeRecipe(exporter, Axes.BIRCH_IRON_AXE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerIronAxeRecipe(exporter, Axes.CRIMSON_IRON_AXE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerIronAxeRecipe(exporter, Axes.DARK_OAK_IRON_AXE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerIronAxeRecipe(exporter, Axes.JUNGLE_IRON_AXE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerIronAxeRecipe(exporter, Axes.MANGROVE_IRON_AXE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerIronAxeRecipe(exporter, Axes.OAK_IRON_AXE, Sticks.OAK_STICK);
        RecipeGenerator.offerIronAxeRecipe(exporter, Axes.SPRUCE_IRON_AXE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerIronAxeRecipe(exporter, Axes.WARPED_IRON_AXE, Sticks.WARPED_STICK);

        RecipeGenerator.offerGoldenAxeRecipe(exporter, Axes.ACACIA_GOLDEN_AXE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerGoldenAxeRecipe(exporter, Axes.BIRCH_GOLDEN_AXE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerGoldenAxeRecipe(exporter, Axes.CRIMSON_GOLDEN_AXE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerGoldenAxeRecipe(exporter, Axes.DARK_OAK_GOLDEN_AXE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerGoldenAxeRecipe(exporter, Axes.JUNGLE_GOLDEN_AXE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerGoldenAxeRecipe(exporter, Axes.MANGROVE_GOLDEN_AXE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerGoldenAxeRecipe(exporter, Axes.OAK_GOLDEN_AXE, Sticks.OAK_STICK);
        RecipeGenerator.offerGoldenAxeRecipe(exporter, Axes.SPRUCE_GOLDEN_AXE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerGoldenAxeRecipe(exporter, Axes.WARPED_GOLDEN_AXE, Sticks.WARPED_STICK);

        RecipeGenerator.offerDiamondAxeRecipe(exporter, Axes.ACACIA_DIAMOND_AXE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerDiamondAxeRecipe(exporter, Axes.BIRCH_DIAMOND_AXE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerDiamondAxeRecipe(exporter, Axes.CRIMSON_DIAMOND_AXE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerDiamondAxeRecipe(exporter, Axes.DARK_OAK_DIAMOND_AXE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerDiamondAxeRecipe(exporter, Axes.JUNGLE_DIAMOND_AXE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerDiamondAxeRecipe(exporter, Axes.MANGROVE_DIAMOND_AXE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerDiamondAxeRecipe(exporter, Axes.OAK_DIAMOND_AXE, Sticks.OAK_STICK);
        RecipeGenerator.offerDiamondAxeRecipe(exporter, Axes.SPRUCE_DIAMOND_AXE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerDiamondAxeRecipe(exporter, Axes.WARPED_DIAMOND_AXE, Sticks.WARPED_STICK);

        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Axes.ACACIA_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.ACACIA_NETHERITE_AXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Axes.BIRCH_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.BIRCH_NETHERITE_AXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Axes.CRIMSON_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.CRIMSON_NETHERITE_AXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Axes.DARK_OAK_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.DARK_OAK_NETHERITE_AXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Axes.JUNGLE_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.JUNGLE_NETHERITE_AXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Axes.MANGROVE_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.MANGROVE_NETHERITE_AXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Axes.OAK_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.OAK_NETHERITE_AXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Axes.SPRUCE_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.SPRUCE_NETHERITE_AXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Axes.WARPED_DIAMOND_AXE, RecipeCategory.TOOLS, Axes.WARPED_NETHERITE_AXE);

        RecipeGenerator.offerBowRecipe(exporter, Bows.ACACIA_BOW, Sticks.ACACIA_STICK);
        RecipeGenerator.offerBowRecipe(exporter, Bows.BIRCH_BOW, Sticks.BIRCH_STICK);
        RecipeGenerator.offerBowRecipe(exporter, Bows.CRIMSON_BOW, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerBowRecipe(exporter, Bows.DARK_OAK_BOW, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerBowRecipe(exporter, Bows.JUNGLE_BOW, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerBowRecipe(exporter, Bows.MANGROVE_BOW, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerBowRecipe(exporter, Bows.OAK_BOW, Sticks.OAK_STICK);
        RecipeGenerator.offerBowRecipe(exporter, Bows.SPRUCE_BOW, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerBowRecipe(exporter, Bows.WARPED_BOW, Sticks.WARPED_STICK);

        RecipeGenerator.offerCrossbowRecipe(exporter, Crossbows.ACACIA_CROSSBOW, Sticks.ACACIA_STICK);
        RecipeGenerator.offerCrossbowRecipe(exporter, Crossbows.BIRCH_CROSSBOW, Sticks.BIRCH_STICK);
        RecipeGenerator.offerCrossbowRecipe(exporter, Crossbows.CRIMSON_CROSSBOW, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerCrossbowRecipe(exporter, Crossbows.DARK_OAK_CROSSBOW, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerCrossbowRecipe(exporter, Crossbows.JUNGLE_CROSSBOW, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerCrossbowRecipe(exporter, Crossbows.MANGROVE_CROSSBOW, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerCrossbowRecipe(exporter, Crossbows.OAK_CROSSBOW, Sticks.OAK_STICK);
        RecipeGenerator.offerCrossbowRecipe(exporter, Crossbows.SPRUCE_CROSSBOW, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerCrossbowRecipe(exporter, Crossbows.WARPED_CROSSBOW, Sticks.WARPED_STICK);

        RecipeGenerator.offerFishingRodRecipe(exporter, FishingRods.ACACIA_FISHING_ROD, Sticks.ACACIA_STICK);
        RecipeGenerator.offerFishingRodRecipe(exporter, FishingRods.BIRCH_FISHING_ROD, Sticks.BIRCH_STICK);
        RecipeGenerator.offerFishingRodRecipe(exporter, FishingRods.CRIMSON_FISHING_ROD, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerFishingRodRecipe(exporter, FishingRods.DARK_OAK_FISHING_ROD, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerFishingRodRecipe(exporter, FishingRods.JUNGLE_FISHING_ROD, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerFishingRodRecipe(exporter, FishingRods.MANGROVE_FISHING_ROD, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerFishingRodRecipe(exporter, FishingRods.OAK_FISHING_ROD, Sticks.OAK_STICK);
        RecipeGenerator.offerFishingRodRecipe(exporter, FishingRods.SPRUCE_FISHING_ROD, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerFishingRodRecipe(exporter, FishingRods.WARPED_FISHING_ROD, Sticks.WARPED_STICK);

        RecipeGenerator.offerWoodenHoeRecipe(exporter, Hoes.ACACIA_WOODEN_HOE, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerWoodenHoeRecipe(exporter, Hoes.BIRCH_WOODEN_HOE, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerWoodenHoeRecipe(exporter, Hoes.CRIMSON_WOODEN_HOE, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerWoodenHoeRecipe(exporter, Hoes.DARK_OAK_WOODEN_HOE, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerWoodenHoeRecipe(exporter, Hoes.JUNGLE_WOODEN_HOE, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerWoodenHoeRecipe(exporter, Hoes.MANGROVE_WOODEN_HOE, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerWoodenHoeRecipe(exporter, Hoes.OAK_WOODEN_HOE, Sticks.OAK_STICK, Blocks.OAK_PLANKS);
        RecipeGenerator.offerWoodenHoeRecipe(exporter, Hoes.SPRUCE_WOODEN_HOE, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerWoodenHoeRecipe(exporter, Hoes.WARPED_WOODEN_HOE, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);

        RecipeGenerator.offerStoneHoeRecipe(exporter, Hoes.ACACIA_STONE_HOE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerStoneHoeRecipe(exporter, Hoes.BIRCH_STONE_HOE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerStoneHoeRecipe(exporter, Hoes.CRIMSON_STONE_HOE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerStoneHoeRecipe(exporter, Hoes.DARK_OAK_STONE_HOE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerStoneHoeRecipe(exporter, Hoes.JUNGLE_STONE_HOE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerStoneHoeRecipe(exporter, Hoes.MANGROVE_STONE_HOE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerStoneHoeRecipe(exporter, Hoes.OAK_STONE_HOE, Sticks.OAK_STICK);
        RecipeGenerator.offerStoneHoeRecipe(exporter, Hoes.SPRUCE_STONE_HOE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerStoneHoeRecipe(exporter, Hoes.WARPED_STONE_HOE, Sticks.WARPED_STICK);
        
        RecipeGenerator.offerIronHoeRecipe(exporter, Hoes.ACACIA_IRON_HOE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerIronHoeRecipe(exporter, Hoes.BIRCH_IRON_HOE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerIronHoeRecipe(exporter, Hoes.CRIMSON_IRON_HOE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerIronHoeRecipe(exporter, Hoes.DARK_OAK_IRON_HOE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerIronHoeRecipe(exporter, Hoes.JUNGLE_IRON_HOE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerIronHoeRecipe(exporter, Hoes.MANGROVE_IRON_HOE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerIronHoeRecipe(exporter, Hoes.OAK_IRON_HOE, Sticks.OAK_STICK);
        RecipeGenerator.offerIronHoeRecipe(exporter, Hoes.SPRUCE_IRON_HOE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerIronHoeRecipe(exporter, Hoes.WARPED_IRON_HOE, Sticks.WARPED_STICK);

        RecipeGenerator.offerGoldenHoeRecipe(exporter, Hoes.ACACIA_GOLDEN_HOE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerGoldenHoeRecipe(exporter, Hoes.BIRCH_GOLDEN_HOE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerGoldenHoeRecipe(exporter, Hoes.CRIMSON_GOLDEN_HOE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerGoldenHoeRecipe(exporter, Hoes.DARK_OAK_GOLDEN_HOE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerGoldenHoeRecipe(exporter, Hoes.JUNGLE_GOLDEN_HOE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerGoldenHoeRecipe(exporter, Hoes.MANGROVE_GOLDEN_HOE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerGoldenHoeRecipe(exporter, Hoes.OAK_GOLDEN_HOE, Sticks.OAK_STICK);
        RecipeGenerator.offerGoldenHoeRecipe(exporter, Hoes.SPRUCE_GOLDEN_HOE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerGoldenHoeRecipe(exporter, Hoes.WARPED_GOLDEN_HOE, Sticks.WARPED_STICK);

        RecipeGenerator.offerDiamondHoeRecipe(exporter, Hoes.ACACIA_DIAMOND_HOE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerDiamondHoeRecipe(exporter, Hoes.BIRCH_DIAMOND_HOE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerDiamondHoeRecipe(exporter, Hoes.CRIMSON_DIAMOND_HOE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerDiamondHoeRecipe(exporter, Hoes.DARK_OAK_DIAMOND_HOE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerDiamondHoeRecipe(exporter, Hoes.JUNGLE_DIAMOND_HOE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerDiamondHoeRecipe(exporter, Hoes.MANGROVE_DIAMOND_HOE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerDiamondHoeRecipe(exporter, Hoes.OAK_DIAMOND_HOE, Sticks.OAK_STICK);
        RecipeGenerator.offerDiamondHoeRecipe(exporter, Hoes.SPRUCE_DIAMOND_HOE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerDiamondHoeRecipe(exporter, Hoes.WARPED_DIAMOND_HOE, Sticks.WARPED_STICK);

        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Hoes.ACACIA_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.ACACIA_NETHERITE_HOE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Hoes.BIRCH_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.BIRCH_NETHERITE_HOE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Hoes.CRIMSON_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.CRIMSON_NETHERITE_HOE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Hoes.DARK_OAK_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.DARK_OAK_NETHERITE_HOE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Hoes.JUNGLE_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.JUNGLE_NETHERITE_HOE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Hoes.MANGROVE_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.MANGROVE_NETHERITE_HOE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Hoes.OAK_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.OAK_NETHERITE_HOE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Hoes.SPRUCE_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.SPRUCE_NETHERITE_HOE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Hoes.WARPED_DIAMOND_HOE, RecipeCategory.TOOLS, Hoes.WARPED_NETHERITE_HOE);

        RecipeGenerator.offerCarrotOnAStickRecipe(exporter, OnAStick.ACACIA_CARROT_ON_A_STICK, FishingRods.ACACIA_FISHING_ROD);
        RecipeGenerator.offerCarrotOnAStickRecipe(exporter, OnAStick.BIRCH_CARROT_ON_A_STICK, FishingRods.BIRCH_FISHING_ROD);
        RecipeGenerator.offerCarrotOnAStickRecipe(exporter, OnAStick.CRIMSON_CARROT_ON_A_STICK, FishingRods.CRIMSON_FISHING_ROD);
        RecipeGenerator.offerCarrotOnAStickRecipe(exporter, OnAStick.DARK_OAK_CARROT_ON_A_STICK, FishingRods.DARK_OAK_FISHING_ROD);
        RecipeGenerator.offerCarrotOnAStickRecipe(exporter, OnAStick.JUNGLE_CARROT_ON_A_STICK, FishingRods.JUNGLE_FISHING_ROD);
        RecipeGenerator.offerCarrotOnAStickRecipe(exporter, OnAStick.MANGROVE_CARROT_ON_A_STICK, FishingRods.MANGROVE_FISHING_ROD);
        RecipeGenerator.offerCarrotOnAStickRecipe(exporter, OnAStick.OAK_CARROT_ON_A_STICK, FishingRods.OAK_FISHING_ROD);
        RecipeGenerator.offerCarrotOnAStickRecipe(exporter, OnAStick.SPRUCE_CARROT_ON_A_STICK, FishingRods.SPRUCE_FISHING_ROD);
        RecipeGenerator.offerCarrotOnAStickRecipe(exporter, OnAStick.WARPED_CARROT_ON_A_STICK, FishingRods.WARPED_FISHING_ROD);

        RecipeGenerator.offerWarpedFungusOnAStickRecipe(exporter, OnAStick.ACACIA_WARPED_FUNGUS_ON_A_STICK, FishingRods.ACACIA_FISHING_ROD);
        RecipeGenerator.offerWarpedFungusOnAStickRecipe(exporter, OnAStick.BIRCH_WARPED_FUNGUS_ON_A_STICK, FishingRods.BIRCH_FISHING_ROD);
        RecipeGenerator.offerWarpedFungusOnAStickRecipe(exporter, OnAStick.CRIMSON_WARPED_FUNGUS_ON_A_STICK, FishingRods.CRIMSON_FISHING_ROD);
        RecipeGenerator.offerWarpedFungusOnAStickRecipe(exporter, OnAStick.DARK_OAK_WARPED_FUNGUS_ON_A_STICK, FishingRods.DARK_OAK_FISHING_ROD);
        RecipeGenerator.offerWarpedFungusOnAStickRecipe(exporter, OnAStick.JUNGLE_WARPED_FUNGUS_ON_A_STICK, FishingRods.JUNGLE_FISHING_ROD);
        RecipeGenerator.offerWarpedFungusOnAStickRecipe(exporter, OnAStick.MANGROVE_WARPED_FUNGUS_ON_A_STICK, FishingRods.MANGROVE_FISHING_ROD);
        RecipeGenerator.offerWarpedFungusOnAStickRecipe(exporter, OnAStick.OAK_WARPED_FUNGUS_ON_A_STICK, FishingRods.OAK_FISHING_ROD);
        RecipeGenerator.offerWarpedFungusOnAStickRecipe(exporter, OnAStick.SPRUCE_WARPED_FUNGUS_ON_A_STICK, FishingRods.SPRUCE_FISHING_ROD);
        RecipeGenerator.offerWarpedFungusOnAStickRecipe(exporter, OnAStick.WARPED_WARPED_FUNGUS_ON_A_STICK, FishingRods.WARPED_FISHING_ROD);

        RecipeGenerator.offerWoodenPickaxeRecipe(exporter, Pickaxes.ACACIA_WOODEN_PICKAXE, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerWoodenPickaxeRecipe(exporter, Pickaxes.BIRCH_WOODEN_PICKAXE, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerWoodenPickaxeRecipe(exporter, Pickaxes.CRIMSON_WOODEN_PICKAXE, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerWoodenPickaxeRecipe(exporter, Pickaxes.DARK_OAK_WOODEN_PICKAXE, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerWoodenPickaxeRecipe(exporter, Pickaxes.JUNGLE_WOODEN_PICKAXE, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerWoodenPickaxeRecipe(exporter, Pickaxes.MANGROVE_WOODEN_PICKAXE, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerWoodenPickaxeRecipe(exporter, Pickaxes.OAK_WOODEN_PICKAXE, Sticks.OAK_STICK, Blocks.OAK_PLANKS);
        RecipeGenerator.offerWoodenPickaxeRecipe(exporter, Pickaxes.SPRUCE_WOODEN_PICKAXE, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerWoodenPickaxeRecipe(exporter, Pickaxes.WARPED_WOODEN_PICKAXE, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);

        RecipeGenerator.offerStonePickaxeRecipe(exporter, Pickaxes.ACACIA_STONE_PICKAXE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerStonePickaxeRecipe(exporter, Pickaxes.BIRCH_STONE_PICKAXE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerStonePickaxeRecipe(exporter, Pickaxes.CRIMSON_STONE_PICKAXE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerStonePickaxeRecipe(exporter, Pickaxes.DARK_OAK_STONE_PICKAXE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerStonePickaxeRecipe(exporter, Pickaxes.JUNGLE_STONE_PICKAXE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerStonePickaxeRecipe(exporter, Pickaxes.MANGROVE_STONE_PICKAXE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerStonePickaxeRecipe(exporter, Pickaxes.OAK_STONE_PICKAXE, Sticks.OAK_STICK);
        RecipeGenerator.offerStonePickaxeRecipe(exporter, Pickaxes.SPRUCE_STONE_PICKAXE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerStonePickaxeRecipe(exporter, Pickaxes.WARPED_STONE_PICKAXE, Sticks.WARPED_STICK);

        RecipeGenerator.offerIronPickaxeRecipe(exporter, Pickaxes.ACACIA_IRON_PICKAXE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerIronPickaxeRecipe(exporter, Pickaxes.BIRCH_IRON_PICKAXE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerIronPickaxeRecipe(exporter, Pickaxes.CRIMSON_IRON_PICKAXE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerIronPickaxeRecipe(exporter, Pickaxes.DARK_OAK_IRON_PICKAXE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerIronPickaxeRecipe(exporter, Pickaxes.JUNGLE_IRON_PICKAXE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerIronPickaxeRecipe(exporter, Pickaxes.MANGROVE_IRON_PICKAXE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerIronPickaxeRecipe(exporter, Pickaxes.OAK_IRON_PICKAXE, Sticks.OAK_STICK);
        RecipeGenerator.offerIronPickaxeRecipe(exporter, Pickaxes.SPRUCE_IRON_PICKAXE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerIronPickaxeRecipe(exporter, Pickaxes.WARPED_IRON_PICKAXE, Sticks.WARPED_STICK);

        RecipeGenerator.offerGoldenPickaxeRecipe(exporter, Pickaxes.ACACIA_GOLDEN_PICKAXE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerGoldenPickaxeRecipe(exporter, Pickaxes.BIRCH_GOLDEN_PICKAXE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerGoldenPickaxeRecipe(exporter, Pickaxes.CRIMSON_GOLDEN_PICKAXE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerGoldenPickaxeRecipe(exporter, Pickaxes.DARK_OAK_GOLDEN_PICKAXE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerGoldenPickaxeRecipe(exporter, Pickaxes.JUNGLE_GOLDEN_PICKAXE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerGoldenPickaxeRecipe(exporter, Pickaxes.MANGROVE_GOLDEN_PICKAXE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerGoldenPickaxeRecipe(exporter, Pickaxes.OAK_GOLDEN_PICKAXE, Sticks.OAK_STICK);
        RecipeGenerator.offerGoldenPickaxeRecipe(exporter, Pickaxes.SPRUCE_GOLDEN_PICKAXE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerGoldenPickaxeRecipe(exporter, Pickaxes.WARPED_GOLDEN_PICKAXE, Sticks.WARPED_STICK);

        RecipeGenerator.offerDiamondPickaxeRecipe(exporter, Pickaxes.ACACIA_DIAMOND_PICKAXE, Sticks.ACACIA_STICK);
        RecipeGenerator.offerDiamondPickaxeRecipe(exporter, Pickaxes.BIRCH_DIAMOND_PICKAXE, Sticks.BIRCH_STICK);
        RecipeGenerator.offerDiamondPickaxeRecipe(exporter, Pickaxes.CRIMSON_DIAMOND_PICKAXE, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerDiamondPickaxeRecipe(exporter, Pickaxes.DARK_OAK_DIAMOND_PICKAXE, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerDiamondPickaxeRecipe(exporter, Pickaxes.JUNGLE_DIAMOND_PICKAXE, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerDiamondPickaxeRecipe(exporter, Pickaxes.MANGROVE_DIAMOND_PICKAXE, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerDiamondPickaxeRecipe(exporter, Pickaxes.OAK_DIAMOND_PICKAXE, Sticks.OAK_STICK);
        RecipeGenerator.offerDiamondPickaxeRecipe(exporter, Pickaxes.SPRUCE_DIAMOND_PICKAXE, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerDiamondPickaxeRecipe(exporter, Pickaxes.WARPED_DIAMOND_PICKAXE, Sticks.WARPED_STICK);

        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Pickaxes.ACACIA_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.ACACIA_NETHERITE_PICKAXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Pickaxes.BIRCH_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.BIRCH_NETHERITE_PICKAXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Pickaxes.CRIMSON_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.CRIMSON_NETHERITE_PICKAXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Pickaxes.DARK_OAK_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.DARK_OAK_NETHERITE_PICKAXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Pickaxes.JUNGLE_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.JUNGLE_NETHERITE_PICKAXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Pickaxes.MANGROVE_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.MANGROVE_NETHERITE_PICKAXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Pickaxes.OAK_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.OAK_NETHERITE_PICKAXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Pickaxes.SPRUCE_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.SPRUCE_NETHERITE_PICKAXE);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Pickaxes.WARPED_DIAMOND_PICKAXE, RecipeCategory.TOOLS, Pickaxes.WARPED_NETHERITE_PICKAXE);

        RecipeGenerator.offerWoodenShovelRecipe(exporter, Shovels.ACACIA_WOODEN_SHOVEL, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerWoodenShovelRecipe(exporter, Shovels.BIRCH_WOODEN_SHOVEL, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerWoodenShovelRecipe(exporter, Shovels.CRIMSON_WOODEN_SHOVEL, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerWoodenShovelRecipe(exporter, Shovels.DARK_OAK_WOODEN_SHOVEL, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerWoodenShovelRecipe(exporter, Shovels.JUNGLE_WOODEN_SHOVEL, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerWoodenShovelRecipe(exporter, Shovels.MANGROVE_WOODEN_SHOVEL, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerWoodenShovelRecipe(exporter, Shovels.OAK_WOODEN_SHOVEL, Sticks.OAK_STICK, Blocks.OAK_PLANKS);
        RecipeGenerator.offerWoodenShovelRecipe(exporter, Shovels.SPRUCE_WOODEN_SHOVEL, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerWoodenShovelRecipe(exporter, Shovels.WARPED_WOODEN_SHOVEL, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);

        RecipeGenerator.offerStoneShovelRecipe(exporter, Shovels.ACACIA_STONE_SHOVEL, Sticks.ACACIA_STICK);
        RecipeGenerator.offerStoneShovelRecipe(exporter, Shovels.BIRCH_STONE_SHOVEL, Sticks.BIRCH_STICK);
        RecipeGenerator.offerStoneShovelRecipe(exporter, Shovels.CRIMSON_STONE_SHOVEL, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerStoneShovelRecipe(exporter, Shovels.DARK_OAK_STONE_SHOVEL, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerStoneShovelRecipe(exporter, Shovels.JUNGLE_STONE_SHOVEL, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerStoneShovelRecipe(exporter, Shovels.MANGROVE_STONE_SHOVEL, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerStoneShovelRecipe(exporter, Shovels.OAK_STONE_SHOVEL, Sticks.OAK_STICK);
        RecipeGenerator.offerStoneShovelRecipe(exporter, Shovels.SPRUCE_STONE_SHOVEL, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerStoneShovelRecipe(exporter, Shovels.WARPED_STONE_SHOVEL, Sticks.WARPED_STICK);

        RecipeGenerator.offerIronShovelRecipe(exporter, Shovels.ACACIA_IRON_SHOVEL, Sticks.ACACIA_STICK);
        RecipeGenerator.offerIronShovelRecipe(exporter, Shovels.BIRCH_IRON_SHOVEL, Sticks.BIRCH_STICK);
        RecipeGenerator.offerIronShovelRecipe(exporter, Shovels.CRIMSON_IRON_SHOVEL, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerIronShovelRecipe(exporter, Shovels.DARK_OAK_IRON_SHOVEL, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerIronShovelRecipe(exporter, Shovels.JUNGLE_IRON_SHOVEL, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerIronShovelRecipe(exporter, Shovels.MANGROVE_IRON_SHOVEL, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerIronShovelRecipe(exporter, Shovels.OAK_IRON_SHOVEL, Sticks.OAK_STICK);
        RecipeGenerator.offerIronShovelRecipe(exporter, Shovels.SPRUCE_IRON_SHOVEL, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerIronShovelRecipe(exporter, Shovels.WARPED_IRON_SHOVEL, Sticks.WARPED_STICK);

        RecipeGenerator.offerGoldenShovelRecipe(exporter, Shovels.ACACIA_GOLDEN_SHOVEL, Sticks.ACACIA_STICK);
        RecipeGenerator.offerGoldenShovelRecipe(exporter, Shovels.BIRCH_GOLDEN_SHOVEL, Sticks.BIRCH_STICK);
        RecipeGenerator.offerGoldenShovelRecipe(exporter, Shovels.CRIMSON_GOLDEN_SHOVEL, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerGoldenShovelRecipe(exporter, Shovels.DARK_OAK_GOLDEN_SHOVEL, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerGoldenShovelRecipe(exporter, Shovels.JUNGLE_GOLDEN_SHOVEL, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerGoldenShovelRecipe(exporter, Shovels.MANGROVE_GOLDEN_SHOVEL, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerGoldenShovelRecipe(exporter, Shovels.OAK_GOLDEN_SHOVEL, Sticks.OAK_STICK);
        RecipeGenerator.offerGoldenShovelRecipe(exporter, Shovels.SPRUCE_GOLDEN_SHOVEL, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerGoldenShovelRecipe(exporter, Shovels.WARPED_GOLDEN_SHOVEL, Sticks.WARPED_STICK);

        RecipeGenerator.offerDiamondShovelRecipe(exporter, Shovels.ACACIA_DIAMOND_SHOVEL, Sticks.ACACIA_STICK);
        RecipeGenerator.offerDiamondShovelRecipe(exporter, Shovels.BIRCH_DIAMOND_SHOVEL, Sticks.BIRCH_STICK);
        RecipeGenerator.offerDiamondShovelRecipe(exporter, Shovels.CRIMSON_DIAMOND_SHOVEL, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerDiamondShovelRecipe(exporter, Shovels.DARK_OAK_DIAMOND_SHOVEL, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerDiamondShovelRecipe(exporter, Shovels.JUNGLE_DIAMOND_SHOVEL, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerDiamondShovelRecipe(exporter, Shovels.MANGROVE_DIAMOND_SHOVEL, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerDiamondShovelRecipe(exporter, Shovels.OAK_DIAMOND_SHOVEL, Sticks.OAK_STICK);
        RecipeGenerator.offerDiamondShovelRecipe(exporter, Shovels.SPRUCE_DIAMOND_SHOVEL, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerDiamondShovelRecipe(exporter, Shovels.WARPED_DIAMOND_SHOVEL, Sticks.WARPED_STICK);

        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Shovels.ACACIA_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.ACACIA_NETHERITE_SHOVEL);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Shovels.BIRCH_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.BIRCH_NETHERITE_SHOVEL);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Shovels.CRIMSON_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.CRIMSON_NETHERITE_SHOVEL);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Shovels.DARK_OAK_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.DARK_OAK_NETHERITE_SHOVEL);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Shovels.JUNGLE_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.JUNGLE_NETHERITE_SHOVEL);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Shovels.MANGROVE_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.MANGROVE_NETHERITE_SHOVEL);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Shovels.OAK_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.OAK_NETHERITE_SHOVEL);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Shovels.SPRUCE_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.SPRUCE_NETHERITE_SHOVEL);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Shovels.WARPED_DIAMOND_SHOVEL, RecipeCategory.TOOLS, Shovels.WARPED_NETHERITE_SHOVEL);

        RecipeGenerator.offerStickRecipe(exporter, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerStickRecipe(exporter, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerStickRecipe(exporter, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerStickRecipe(exporter, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerStickRecipe(exporter, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerStickRecipe(exporter, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerStickRecipe(exporter, Sticks.OAK_STICK, Blocks.OAK_PLANKS);
        RecipeGenerator.offerStickRecipe(exporter, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerStickRecipe(exporter, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);
        
        RecipeGenerator.offerWoodenSwordRecipe(exporter, Swords.ACACIA_WOODEN_SWORD, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerWoodenSwordRecipe(exporter, Swords.BIRCH_WOODEN_SWORD, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerWoodenSwordRecipe(exporter, Swords.CRIMSON_WOODEN_SWORD, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerWoodenSwordRecipe(exporter, Swords.DARK_OAK_WOODEN_SWORD, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerWoodenSwordRecipe(exporter, Swords.JUNGLE_WOODEN_SWORD, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerWoodenSwordRecipe(exporter, Swords.MANGROVE_WOODEN_SWORD, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerWoodenSwordRecipe(exporter, Swords.OAK_WOODEN_SWORD, Sticks.OAK_STICK, Blocks.OAK_PLANKS);
        RecipeGenerator.offerWoodenSwordRecipe(exporter, Swords.SPRUCE_WOODEN_SWORD, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerWoodenSwordRecipe(exporter, Swords.WARPED_WOODEN_SWORD, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);

        RecipeGenerator.offerStoneSwordRecipe(exporter, Swords.ACACIA_STONE_SWORD, Sticks.ACACIA_STICK);
        RecipeGenerator.offerStoneSwordRecipe(exporter, Swords.BIRCH_STONE_SWORD, Sticks.BIRCH_STICK);
        RecipeGenerator.offerStoneSwordRecipe(exporter, Swords.CRIMSON_STONE_SWORD, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerStoneSwordRecipe(exporter, Swords.DARK_OAK_STONE_SWORD, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerStoneSwordRecipe(exporter, Swords.JUNGLE_STONE_SWORD, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerStoneSwordRecipe(exporter, Swords.MANGROVE_STONE_SWORD, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerStoneSwordRecipe(exporter, Swords.OAK_STONE_SWORD, Sticks.OAK_STICK);
        RecipeGenerator.offerStoneSwordRecipe(exporter, Swords.SPRUCE_STONE_SWORD, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerStoneSwordRecipe(exporter, Swords.WARPED_STONE_SWORD, Sticks.WARPED_STICK);

        RecipeGenerator.offerIronSwordRecipe(exporter, Swords.ACACIA_IRON_SWORD, Sticks.ACACIA_STICK);
        RecipeGenerator.offerIronSwordRecipe(exporter, Swords.BIRCH_IRON_SWORD, Sticks.BIRCH_STICK);
        RecipeGenerator.offerIronSwordRecipe(exporter, Swords.CRIMSON_IRON_SWORD, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerIronSwordRecipe(exporter, Swords.DARK_OAK_IRON_SWORD, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerIronSwordRecipe(exporter, Swords.JUNGLE_IRON_SWORD, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerIronSwordRecipe(exporter, Swords.MANGROVE_IRON_SWORD, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerIronSwordRecipe(exporter, Swords.OAK_IRON_SWORD, Sticks.OAK_STICK);
        RecipeGenerator.offerIronSwordRecipe(exporter, Swords.SPRUCE_IRON_SWORD, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerIronSwordRecipe(exporter, Swords.WARPED_IRON_SWORD, Sticks.WARPED_STICK);

        RecipeGenerator.offerGoldenSwordRecipe(exporter, Swords.ACACIA_GOLDEN_SWORD, Sticks.ACACIA_STICK);
        RecipeGenerator.offerGoldenSwordRecipe(exporter, Swords.BIRCH_GOLDEN_SWORD, Sticks.BIRCH_STICK);
        RecipeGenerator.offerGoldenSwordRecipe(exporter, Swords.CRIMSON_GOLDEN_SWORD, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerGoldenSwordRecipe(exporter, Swords.DARK_OAK_GOLDEN_SWORD, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerGoldenSwordRecipe(exporter, Swords.JUNGLE_GOLDEN_SWORD, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerGoldenSwordRecipe(exporter, Swords.MANGROVE_GOLDEN_SWORD, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerGoldenSwordRecipe(exporter, Swords.OAK_GOLDEN_SWORD, Sticks.OAK_STICK);
        RecipeGenerator.offerGoldenSwordRecipe(exporter, Swords.SPRUCE_GOLDEN_SWORD, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerGoldenSwordRecipe(exporter, Swords.WARPED_GOLDEN_SWORD, Sticks.WARPED_STICK);

        RecipeGenerator.offerDiamondSwordRecipe(exporter, Swords.ACACIA_DIAMOND_SWORD, Sticks.ACACIA_STICK);
        RecipeGenerator.offerDiamondSwordRecipe(exporter, Swords.BIRCH_DIAMOND_SWORD, Sticks.BIRCH_STICK);
        RecipeGenerator.offerDiamondSwordRecipe(exporter, Swords.CRIMSON_DIAMOND_SWORD, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerDiamondSwordRecipe(exporter, Swords.DARK_OAK_DIAMOND_SWORD, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerDiamondSwordRecipe(exporter, Swords.JUNGLE_DIAMOND_SWORD, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerDiamondSwordRecipe(exporter, Swords.MANGROVE_DIAMOND_SWORD, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerDiamondSwordRecipe(exporter, Swords.OAK_DIAMOND_SWORD, Sticks.OAK_STICK);
        RecipeGenerator.offerDiamondSwordRecipe(exporter, Swords.SPRUCE_DIAMOND_SWORD, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerDiamondSwordRecipe(exporter, Swords.WARPED_DIAMOND_SWORD, Sticks.WARPED_STICK);

        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Swords.ACACIA_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.ACACIA_NETHERITE_SWORD);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Swords.BIRCH_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.BIRCH_NETHERITE_SWORD);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Swords.CRIMSON_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.CRIMSON_NETHERITE_SWORD);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Swords.DARK_OAK_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.DARK_OAK_NETHERITE_SWORD);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Swords.JUNGLE_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.JUNGLE_NETHERITE_SWORD);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Swords.MANGROVE_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.MANGROVE_NETHERITE_SWORD);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Swords.OAK_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.OAK_NETHERITE_SWORD);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Swords.SPRUCE_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.SPRUCE_NETHERITE_SWORD);
        VanillaRecipeProvider.offerLegacyNetheriteUpgradeRecipe(exporter, Swords.WARPED_DIAMOND_SWORD, RecipeCategory.TOOLS, Swords.WARPED_NETHERITE_SWORD);

        RecipeGenerator.offerCampfireRecipe(exporter, Campfires.ACACIA_CAMPFIRE, Blocks.ACACIA_LOG, Sticks.ACACIA_STICK);
        RecipeGenerator.offerCampfireRecipe(exporter, Campfires.BIRCH_CAMPFIRE, Blocks.BIRCH_LOG, Sticks.BIRCH_STICK);
        RecipeGenerator.offerCampfireRecipe(exporter, Campfires.CRIMSON_CAMPFIRE, Blocks.CRIMSON_STEM, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerCampfireRecipe(exporter, Campfires.DARK_OAK_CAMPFIRE, Blocks.DARK_OAK_LOG, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerCampfireRecipe(exporter, Campfires.JUNGLE_CAMPFIRE, Blocks.JUNGLE_LOG, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerCampfireRecipe(exporter, Campfires.MANGROVE_CAMPFIRE, Blocks.MANGROVE_LOG, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerCampfireRecipe(exporter, Campfires.OAK_CAMPFIRE, Blocks.OAK_LOG, Sticks.OAK_STICK);
        RecipeGenerator.offerCampfireRecipe(exporter, Campfires.SPRUCE_CAMPFIRE, Blocks.SPRUCE_LOG, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerCampfireRecipe(exporter, Campfires.WARPED_CAMPFIRE, Blocks.WARPED_STEM, Sticks.WARPED_STICK);

        RecipeGenerator.offerSoulCampfireRecipe(exporter, Campfires.ACACIA_SOUL_CAMPFIRE, Blocks.ACACIA_LOG, Sticks.ACACIA_STICK);
        RecipeGenerator.offerSoulCampfireRecipe(exporter, Campfires.BIRCH_SOUL_CAMPFIRE, Blocks.BIRCH_LOG, Sticks.BIRCH_STICK);
        RecipeGenerator.offerSoulCampfireRecipe(exporter, Campfires.CRIMSON_SOUL_CAMPFIRE, Blocks.CRIMSON_STEM, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerSoulCampfireRecipe(exporter, Campfires.DARK_OAK_SOUL_CAMPFIRE, Blocks.DARK_OAK_LOG, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerSoulCampfireRecipe(exporter, Campfires.JUNGLE_SOUL_CAMPFIRE, Blocks.JUNGLE_LOG, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerSoulCampfireRecipe(exporter, Campfires.MANGROVE_SOUL_CAMPFIRE, Blocks.MANGROVE_LOG, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerSoulCampfireRecipe(exporter, Campfires.OAK_SOUL_CAMPFIRE, Blocks.OAK_LOG, Sticks.OAK_STICK);
        RecipeGenerator.offerSoulCampfireRecipe(exporter, Campfires.SPRUCE_SOUL_CAMPFIRE, Blocks.SPRUCE_LOG, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerSoulCampfireRecipe(exporter, Campfires.WARPED_SOUL_CAMPFIRE, Blocks.WARPED_STEM, Sticks.WARPED_STICK);

        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.ACACIA_GRINDSTONE, Sticks.ACACIA_STICK, Blocks.ACACIA_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.BIRCH_GRINDSTONE, Sticks.BIRCH_STICK, Blocks.BIRCH_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.CRIMSON_GRINDSTONE, Sticks.CRIMSON_STICK, Blocks.CRIMSON_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.DARK_OAK_GRINDSTONE, Sticks.DARK_OAK_STICK, Blocks.DARK_OAK_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.JUNGLE_GRINDSTONE, Sticks.JUNGLE_STICK, Blocks.JUNGLE_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.MANGROVE_GRINDSTONE, Sticks.MANGROVE_STICK, Blocks.MANGROVE_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.OAK_GRINDSTONE, Sticks.OAK_STICK, Blocks.OAK_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.SPRUCE_GRINDSTONE, Sticks.SPRUCE_STICK, Blocks.SPRUCE_PLANKS);
        RecipeGenerator.offerGrindstoneRecipe(exporter, Grindstones.WARPED_GRINDSTONE, Sticks.WARPED_STICK, Blocks.WARPED_PLANKS);

        RecipeGenerator.offerLadderRecipe(exporter, Ladders.ACACIA_LADDER, Sticks.ACACIA_STICK);
        RecipeGenerator.offerLadderRecipe(exporter, Ladders.BIRCH_LADDER, Sticks.BIRCH_STICK);
        RecipeGenerator.offerLadderRecipe(exporter, Ladders.CRIMSON_LADDER, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerLadderRecipe(exporter, Ladders.DARK_OAK_LADDER, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerLadderRecipe(exporter, Ladders.JUNGLE_LADDER, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerLadderRecipe(exporter, Ladders.MANGROVE_LADDER, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerLadderRecipe(exporter, Ladders.OAK_LADDER, Sticks.OAK_STICK);
        RecipeGenerator.offerLadderRecipe(exporter, Ladders.SPRUCE_LADDER, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerLadderRecipe(exporter, Ladders.WARPED_LADDER, Sticks.WARPED_STICK);

        RecipeGenerator.offerLeverRecipe(exporter, Levers.ACACIA_LEVER, Sticks.ACACIA_STICK);
        RecipeGenerator.offerLeverRecipe(exporter, Levers.BIRCH_LEVER, Sticks.BIRCH_STICK);
        RecipeGenerator.offerLeverRecipe(exporter, Levers.CRIMSON_LEVER, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerLeverRecipe(exporter, Levers.DARK_OAK_LEVER, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerLeverRecipe(exporter, Levers.JUNGLE_LEVER, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerLeverRecipe(exporter, Levers.MANGROVE_LEVER, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerLeverRecipe(exporter, Levers.OAK_LEVER, Sticks.OAK_STICK);
        RecipeGenerator.offerLeverRecipe(exporter, Levers.SPRUCE_LEVER, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerLeverRecipe(exporter, Levers.WARPED_LEVER, Sticks.WARPED_STICK);

        RecipeGenerator.offerActivatorRailRecipe(exporter, Rails.ACACIA_ACTIVATOR_RAIL, RedstoneTorches.ACACIA_REDSTONE_TORCH, Sticks.ACACIA_STICK, Rails.ACACIA_RAIL);
        RecipeGenerator.offerActivatorRailRecipe(exporter, Rails.BIRCH_ACTIVATOR_RAIL, RedstoneTorches.BIRCH_REDSTONE_TORCH, Sticks.BIRCH_STICK, Rails.BIRCH_RAIL);
        RecipeGenerator.offerActivatorRailRecipe(exporter, Rails.CRIMSON_ACTIVATOR_RAIL, RedstoneTorches.CRIMSON_REDSTONE_TORCH, Sticks.CRIMSON_STICK, Rails.CRIMSON_RAIL);
        RecipeGenerator.offerActivatorRailRecipe(exporter, Rails.DARK_OAK_ACTIVATOR_RAIL, RedstoneTorches.DARK_OAK_REDSTONE_TORCH, Sticks.DARK_OAK_STICK, Rails.DARK_OAK_RAIL);
        RecipeGenerator.offerActivatorRailRecipe(exporter, Rails.JUNGLE_ACTIVATOR_RAIL, RedstoneTorches.JUNGLE_REDSTONE_TORCH, Sticks.JUNGLE_STICK, Rails.JUNGLE_RAIL);
        RecipeGenerator.offerActivatorRailRecipe(exporter, Rails.MANGROVE_ACTIVATOR_RAIL, RedstoneTorches.MANGROVE_REDSTONE_TORCH, Sticks.MANGROVE_STICK, Rails.MANGROVE_RAIL);
        RecipeGenerator.offerActivatorRailRecipe(exporter, Rails.OAK_ACTIVATOR_RAIL, RedstoneTorches.OAK_REDSTONE_TORCH, Sticks.OAK_STICK, Rails.OAK_RAIL);
        RecipeGenerator.offerActivatorRailRecipe(exporter, Rails.SPRUCE_ACTIVATOR_RAIL, RedstoneTorches.SPRUCE_REDSTONE_TORCH, Sticks.SPRUCE_STICK, Rails.SPRUCE_RAIL);
        RecipeGenerator.offerActivatorRailRecipe(exporter, Rails.WARPED_ACTIVATOR_RAIL, RedstoneTorches.WARPED_REDSTONE_TORCH, Sticks.WARPED_STICK, Rails.WARPED_RAIL);

        RecipeGenerator.offerDetectorRailRecipe(exporter, Rails.ACACIA_DETECTOR_RAIL, Sticks.ACACIA_STICK, Rails.ACACIA_RAIL);
        RecipeGenerator.offerDetectorRailRecipe(exporter, Rails.BIRCH_DETECTOR_RAIL, Sticks.BIRCH_STICK, Rails.BIRCH_RAIL);
        RecipeGenerator.offerDetectorRailRecipe(exporter, Rails.CRIMSON_DETECTOR_RAIL, Sticks.CRIMSON_STICK, Rails.CRIMSON_RAIL);
        RecipeGenerator.offerDetectorRailRecipe(exporter, Rails.DARK_OAK_DETECTOR_RAIL, Sticks.DARK_OAK_STICK, Rails.DARK_OAK_RAIL);
        RecipeGenerator.offerDetectorRailRecipe(exporter, Rails.JUNGLE_DETECTOR_RAIL, Sticks.JUNGLE_STICK, Rails.JUNGLE_RAIL);
        RecipeGenerator.offerDetectorRailRecipe(exporter, Rails.MANGROVE_DETECTOR_RAIL, Sticks.MANGROVE_STICK, Rails.MANGROVE_RAIL);
        RecipeGenerator.offerDetectorRailRecipe(exporter, Rails.OAK_DETECTOR_RAIL, Sticks.OAK_STICK, Rails.OAK_RAIL);
        RecipeGenerator.offerDetectorRailRecipe(exporter, Rails.SPRUCE_DETECTOR_RAIL, Sticks.SPRUCE_STICK, Rails.SPRUCE_RAIL);
        RecipeGenerator.offerDetectorRailRecipe(exporter, Rails.WARPED_DETECTOR_RAIL, Sticks.WARPED_STICK, Rails.WARPED_RAIL);

        RecipeGenerator.offerPoweredRailRecipe(exporter, Rails.ACACIA_POWERED_RAIL, Sticks.ACACIA_STICK, Rails.ACACIA_RAIL);
        RecipeGenerator.offerPoweredRailRecipe(exporter, Rails.BIRCH_POWERED_RAIL, Sticks.BIRCH_STICK, Rails.BIRCH_RAIL);
        RecipeGenerator.offerPoweredRailRecipe(exporter, Rails.CRIMSON_POWERED_RAIL, Sticks.CRIMSON_STICK, Rails.CRIMSON_RAIL);
        RecipeGenerator.offerPoweredRailRecipe(exporter, Rails.DARK_OAK_POWERED_RAIL, Sticks.DARK_OAK_STICK, Rails.DARK_OAK_RAIL);
        RecipeGenerator.offerPoweredRailRecipe(exporter, Rails.JUNGLE_POWERED_RAIL, Sticks.JUNGLE_STICK, Rails.JUNGLE_RAIL);
        RecipeGenerator.offerPoweredRailRecipe(exporter, Rails.MANGROVE_POWERED_RAIL, Sticks.MANGROVE_STICK, Rails.MANGROVE_RAIL);
        RecipeGenerator.offerPoweredRailRecipe(exporter, Rails.OAK_POWERED_RAIL, Sticks.OAK_STICK, Rails.OAK_RAIL);
        RecipeGenerator.offerPoweredRailRecipe(exporter, Rails.SPRUCE_POWERED_RAIL, Sticks.SPRUCE_STICK, Rails.SPRUCE_RAIL);
        RecipeGenerator.offerPoweredRailRecipe(exporter, Rails.WARPED_POWERED_RAIL, Sticks.WARPED_STICK, Rails.WARPED_RAIL);

        RecipeGenerator.offerRailRecipe(exporter, Rails.ACACIA_RAIL, Sticks.ACACIA_STICK);
        RecipeGenerator.offerRailRecipe(exporter, Rails.BIRCH_RAIL, Sticks.BIRCH_STICK);
        RecipeGenerator.offerRailRecipe(exporter, Rails.CRIMSON_RAIL, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerRailRecipe(exporter, Rails.DARK_OAK_RAIL, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerRailRecipe(exporter, Rails.JUNGLE_RAIL, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerRailRecipe(exporter, Rails.MANGROVE_RAIL, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerRailRecipe(exporter, Rails.OAK_RAIL, Sticks.OAK_STICK);
        RecipeGenerator.offerRailRecipe(exporter, Rails.SPRUCE_RAIL, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerRailRecipe(exporter, Rails.WARPED_RAIL, Sticks.WARPED_STICK);

        RecipeGenerator.offerRedstoneTorchRecipe(exporter, RedstoneTorches.ACACIA_REDSTONE_TORCH, Sticks.ACACIA_STICK);
        RecipeGenerator.offerRedstoneTorchRecipe(exporter, RedstoneTorches.BIRCH_REDSTONE_TORCH, Sticks.BIRCH_STICK);
        RecipeGenerator.offerRedstoneTorchRecipe(exporter, RedstoneTorches.CRIMSON_REDSTONE_TORCH, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerRedstoneTorchRecipe(exporter, RedstoneTorches.DARK_OAK_REDSTONE_TORCH, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerRedstoneTorchRecipe(exporter, RedstoneTorches.JUNGLE_REDSTONE_TORCH, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerRedstoneTorchRecipe(exporter, RedstoneTorches.MANGROVE_REDSTONE_TORCH, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerRedstoneTorchRecipe(exporter, RedstoneTorches.OAK_REDSTONE_TORCH, Sticks.OAK_STICK);
        RecipeGenerator.offerRedstoneTorchRecipe(exporter, RedstoneTorches.SPRUCE_REDSTONE_TORCH, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerRedstoneTorchRecipe(exporter, RedstoneTorches.WARPED_REDSTONE_TORCH, Sticks.WARPED_STICK);

        RecipeGenerator.offerSoulTorchRecipe(exporter, SoulTorches.ACACIA_SOUL_TORCH, Sticks.ACACIA_STICK);
        RecipeGenerator.offerSoulTorchRecipe(exporter, SoulTorches.BIRCH_SOUL_TORCH, Sticks.BIRCH_STICK);
        RecipeGenerator.offerSoulTorchRecipe(exporter, SoulTorches.CRIMSON_SOUL_TORCH, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerSoulTorchRecipe(exporter, SoulTorches.DARK_OAK_SOUL_TORCH, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerSoulTorchRecipe(exporter, SoulTorches.JUNGLE_SOUL_TORCH, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerSoulTorchRecipe(exporter, SoulTorches.MANGROVE_SOUL_TORCH, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerSoulTorchRecipe(exporter, SoulTorches.OAK_SOUL_TORCH, Sticks.OAK_STICK);
        RecipeGenerator.offerSoulTorchRecipe(exporter, SoulTorches.SPRUCE_SOUL_TORCH, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerSoulTorchRecipe(exporter, SoulTorches.WARPED_SOUL_TORCH, Sticks.WARPED_STICK);

        RecipeGenerator.offerTorchRecipe(exporter, Torches.ACACIA_TORCH, Sticks.ACACIA_STICK);
        RecipeGenerator.offerTorchRecipe(exporter, Torches.BIRCH_TORCH, Sticks.BIRCH_STICK);
        RecipeGenerator.offerTorchRecipe(exporter, Torches.CRIMSON_TORCH, Sticks.CRIMSON_STICK);
        RecipeGenerator.offerTorchRecipe(exporter, Torches.DARK_OAK_TORCH, Sticks.DARK_OAK_STICK);
        RecipeGenerator.offerTorchRecipe(exporter, Torches.JUNGLE_TORCH, Sticks.JUNGLE_STICK);
        RecipeGenerator.offerTorchRecipe(exporter, Torches.MANGROVE_TORCH, Sticks.MANGROVE_STICK);
        RecipeGenerator.offerTorchRecipe(exporter, Torches.OAK_TORCH, Sticks.OAK_STICK);
        RecipeGenerator.offerTorchRecipe(exporter, Torches.SPRUCE_TORCH, Sticks.SPRUCE_STICK);
        RecipeGenerator.offerTorchRecipe(exporter, Torches.WARPED_TORCH, Sticks.WARPED_STICK);
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
    public static void offerStoneAxeRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible axe, ItemConvertible stick) {
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