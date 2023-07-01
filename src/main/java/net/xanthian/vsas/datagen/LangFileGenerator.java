package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.*;
import net.xanthian.vsas.util.ModItemGroup;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(ModItemGroup.VARIANT_STICKS_AND_STUFF, "Variant Sticks & Stuff");

        translationBuilder.add(Campfires.ACACIA_CAMPFIRE, "Acacia Campfire");
        translationBuilder.add(Campfires.BIRCH_CAMPFIRE, "Birch Campfire");
        translationBuilder.add(Campfires.CRIMSON_CAMPFIRE, "Crimson Campfire");
        translationBuilder.add(Campfires.DARK_OAK_CAMPFIRE, "Dark Oak Campfire");
        translationBuilder.add(Campfires.JUNGLE_CAMPFIRE, "Jungle Campfire");
        translationBuilder.add(Campfires.MANGROVE_CAMPFIRE, "Mangrove Campfire");
        translationBuilder.add(Campfires.OAK_CAMPFIRE, "Oak Campfire");
        translationBuilder.add(Campfires.SPRUCE_CAMPFIRE, "Spruce Campfire");
        translationBuilder.add(Campfires.WARPED_CAMPFIRE, "Warped Campfire");

        translationBuilder.add(Campfires.ACACIA_SOUL_CAMPFIRE, "Acacia Soul Campfire");        translationBuilder.add(Campfires.BIRCH_SOUL_CAMPFIRE, "Birch Soul Campfire");
        translationBuilder.add(Campfires.CRIMSON_SOUL_CAMPFIRE, "Crimson Soul Campfire");
        translationBuilder.add(Campfires.DARK_OAK_SOUL_CAMPFIRE, "Dark Oak Soul Campfire");
        translationBuilder.add(Campfires.JUNGLE_SOUL_CAMPFIRE, "Jungle Soul Campfire");
        translationBuilder.add(Campfires.MANGROVE_SOUL_CAMPFIRE, "Mangrove Soul Campfire");
        translationBuilder.add(Campfires.OAK_SOUL_CAMPFIRE, "Oak Soul Campfire");
        translationBuilder.add(Campfires.SPRUCE_SOUL_CAMPFIRE, "Spruce Soul Campfire");
        translationBuilder.add(Campfires.WARPED_SOUL_CAMPFIRE, "Warped Soul Campfire");

        
        translationBuilder.add(Grindstones.ACACIA_GRINDSTONE, "Acacia Grindstone");
        translationBuilder.add(Grindstones.BIRCH_GRINDSTONE, "Birch Grindstone");
        translationBuilder.add(Grindstones.CRIMSON_GRINDSTONE, "Crimson Grindstone");
        translationBuilder.add(Grindstones.DARK_OAK_GRINDSTONE, "Dark Oak Grindstone");
        translationBuilder.add(Grindstones.JUNGLE_GRINDSTONE, "Jungle Grindstone");
        translationBuilder.add(Grindstones.MANGROVE_GRINDSTONE, "Mangrove Grindstone");
        translationBuilder.add(Grindstones.OAK_GRINDSTONE, "Oak Grindstone");
        translationBuilder.add(Grindstones.SPRUCE_GRINDSTONE, "Spruce Grindstone");
        translationBuilder.add(Grindstones.WARPED_GRINDSTONE, "Warped Grindstone");

        translationBuilder.add(Ladders.ACACIA_LADDER, "Acacia Ladder");
        translationBuilder.add(Ladders.BIRCH_LADDER, "Birch Ladder");
        translationBuilder.add(Ladders.CRIMSON_LADDER, "Crimson Ladder");
        translationBuilder.add(Ladders.DARK_OAK_LADDER, "Dark Oak Ladder");
        translationBuilder.add(Ladders.JUNGLE_LADDER, "Jungle Ladder");
        translationBuilder.add(Ladders.MANGROVE_LADDER, "Mangrove Ladder");
        translationBuilder.add(Ladders.OAK_LADDER, "Oak Ladder");
        translationBuilder.add(Ladders.SPRUCE_LADDER, "Spruce Ladder");
        translationBuilder.add(Ladders.WARPED_LADDER, "Warped Ladder");

        translationBuilder.add(Levers.ACACIA_LEVER, "Acacia Lever");
        translationBuilder.add(Levers.BIRCH_LEVER, "Birch Lever");
        translationBuilder.add(Levers.CRIMSON_LEVER, "Crimson Lever");
        translationBuilder.add(Levers.DARK_OAK_LEVER, "Dark Oak Lever");
        translationBuilder.add(Levers.JUNGLE_LEVER, "Jungle Lever");
        translationBuilder.add(Levers.MANGROVE_LEVER, "Mangrove Lever");
        translationBuilder.add(Levers.OAK_LEVER, "Oak Lever");
        translationBuilder.add(Levers.SPRUCE_LEVER, "Spruce Lever");
        translationBuilder.add(Levers.WARPED_LEVER, "Warped Lever");
        
        translationBuilder.add(Rails.ACACIA_ACTIVATOR_RAIL, "Acacia Activator Rail");
        translationBuilder.add(Rails.BIRCH_ACTIVATOR_RAIL, "Birch Activator Rail");
        translationBuilder.add(Rails.CRIMSON_ACTIVATOR_RAIL, "Crimson Activator Rail");
        translationBuilder.add(Rails.DARK_OAK_ACTIVATOR_RAIL, "Dark Oak Activator Rail");
        translationBuilder.add(Rails.JUNGLE_ACTIVATOR_RAIL, "Jungle Activator Rail");
        translationBuilder.add(Rails.MANGROVE_ACTIVATOR_RAIL, "Mangrove Activator Rail");
        translationBuilder.add(Rails.OAK_ACTIVATOR_RAIL, "Oak Activator Rail");
        translationBuilder.add(Rails.SPRUCE_ACTIVATOR_RAIL, "Spruce Activator Rail");
        translationBuilder.add(Rails.WARPED_ACTIVATOR_RAIL, "Warped Activator Rail");

        translationBuilder.add(Rails.ACACIA_DETECTOR_RAIL, "Acacia Detector Rail");
        translationBuilder.add(Rails.BIRCH_DETECTOR_RAIL, "Birch Detector Rail");
        translationBuilder.add(Rails.CRIMSON_DETECTOR_RAIL, "Crimson Detector Rail");
        translationBuilder.add(Rails.DARK_OAK_DETECTOR_RAIL, "Dark Oak Detector Rail");
        translationBuilder.add(Rails.JUNGLE_DETECTOR_RAIL, "Jungle Detector Rail");
        translationBuilder.add(Rails.MANGROVE_DETECTOR_RAIL, "Mangrove Detector Rail");
        translationBuilder.add(Rails.OAK_DETECTOR_RAIL, "Oak Detector Rail");
        translationBuilder.add(Rails.SPRUCE_DETECTOR_RAIL, "Spruce Detector Rail");
        translationBuilder.add(Rails.WARPED_DETECTOR_RAIL, "Warped Detector Rail");

        translationBuilder.add(Rails.ACACIA_POWERED_RAIL, "Acacia Powered Rail");
        translationBuilder.add(Rails.BIRCH_POWERED_RAIL, "Birch Powered Rail");
        translationBuilder.add(Rails.CRIMSON_POWERED_RAIL, "Crimson Powered Rail");
        translationBuilder.add(Rails.DARK_OAK_POWERED_RAIL, "Dark Oak Powered Rail");
        translationBuilder.add(Rails.JUNGLE_POWERED_RAIL, "Jungle Powered Rail");
        translationBuilder.add(Rails.MANGROVE_POWERED_RAIL, "Mangrove Powered Rail");
        translationBuilder.add(Rails.OAK_POWERED_RAIL, "Oak Powered Rail");
        translationBuilder.add(Rails.SPRUCE_POWERED_RAIL, "Spruce Powered Rail");
        translationBuilder.add(Rails.WARPED_POWERED_RAIL, "Warped Powered Rail");

        translationBuilder.add(Rails.ACACIA_RAIL, "Acacia Rail");
        translationBuilder.add(Rails.BIRCH_RAIL, "Birch Rail");
        translationBuilder.add(Rails.CRIMSON_RAIL, "Crimson Rail");
        translationBuilder.add(Rails.DARK_OAK_RAIL, "Dark Oak Rail");
        translationBuilder.add(Rails.JUNGLE_RAIL, "Jungle Rail");
        translationBuilder.add(Rails.MANGROVE_RAIL, "Mangrove Rail");
        translationBuilder.add(Rails.OAK_RAIL, "Oak Rail");
        translationBuilder.add(Rails.SPRUCE_RAIL, "Spruce Rail");
        translationBuilder.add(Rails.WARPED_RAIL, "Warped Rail");

        translationBuilder.add(Torches.ACACIA_TORCH, "Acacia Torch");
        translationBuilder.add(Torches.BIRCH_TORCH, "Birch Torch");
        translationBuilder.add(Torches.CRIMSON_TORCH, "Crimson Torch");
        translationBuilder.add(Torches.DARK_OAK_TORCH, "Dark Oak Torch");
        translationBuilder.add(Torches.JUNGLE_TORCH, "Jungle Torch");
        translationBuilder.add(Torches.MANGROVE_TORCH, "Mangrove Torch");
        translationBuilder.add(Torches.OAK_TORCH, "Oak Torch");
        translationBuilder.add(Torches.SPRUCE_TORCH, "Spruce Torch");
        translationBuilder.add(Torches.WARPED_TORCH, "Warped Torch");

        translationBuilder.add(RedstoneTorches.ACACIA_REDSTONE_TORCH, "Acacia Redstone Torch");
        translationBuilder.add(RedstoneTorches.BIRCH_REDSTONE_TORCH, "Birch Redstone Torch");
        translationBuilder.add(RedstoneTorches.CRIMSON_REDSTONE_TORCH, "Crimson Redstone Torch");
        translationBuilder.add(RedstoneTorches.DARK_OAK_REDSTONE_TORCH, "Dark Oak Redstone Torch");
        translationBuilder.add(RedstoneTorches.JUNGLE_REDSTONE_TORCH, "Jungle Redstone Torch");
        translationBuilder.add(RedstoneTorches.MANGROVE_REDSTONE_TORCH, "Mangrove Redstone Torch");
        translationBuilder.add(RedstoneTorches.OAK_REDSTONE_TORCH, "Oak Redstone Torch");
        translationBuilder.add(RedstoneTorches.SPRUCE_REDSTONE_TORCH, "Spruce Redstone Torch");
        translationBuilder.add(RedstoneTorches.WARPED_REDSTONE_TORCH, "Warped Redstone Torch");

        translationBuilder.add(SoulTorches.ACACIA_SOUL_TORCH, "Acacia Soul Torch");
        translationBuilder.add(SoulTorches.BIRCH_SOUL_TORCH, "Birch Soul Torch");
        translationBuilder.add(SoulTorches.CRIMSON_SOUL_TORCH, "Crimson Soul Torch");
        translationBuilder.add(SoulTorches.DARK_OAK_SOUL_TORCH, "Dark Oak Soul Torch");
        translationBuilder.add(SoulTorches.JUNGLE_SOUL_TORCH, "Jungle Soul Torch");
        translationBuilder.add(SoulTorches.MANGROVE_SOUL_TORCH, "Mangrove Soul Torch");
        translationBuilder.add(SoulTorches.OAK_SOUL_TORCH, "Oak Soul Torch");
        translationBuilder.add(SoulTorches.SPRUCE_SOUL_TORCH, "Spruce Soul Torch");
        translationBuilder.add(SoulTorches.WARPED_SOUL_TORCH, "Warped Soul Torch");

        translationBuilder.add(Arrows.ACACIA_ARROW_ITEM, "Acacia Arrow");
        translationBuilder.add(Arrows.BIRCH_ARROW_ITEM, "Birch Arrow");
        translationBuilder.add(Arrows.CRIMSON_ARROW_ITEM, "Crimson Arrow");
        translationBuilder.add(Arrows.DARK_OAK_ARROW_ITEM, "Dark Oak Arrow");
        translationBuilder.add(Arrows.JUNGLE_ARROW_ITEM, "Jungle Arrow");
        translationBuilder.add(Arrows.MANGROVE_ARROW_ITEM, "Mangrove Arrow");
        translationBuilder.add(Arrows.OAK_ARROW_ITEM, "Oak Arrow");
        translationBuilder.add(Arrows.SPRUCE_ARROW_ITEM, "Spruce Arrow");
        translationBuilder.add(Arrows.WARPED_ARROW_ITEM, "Warped Arrow");

        translationBuilder.add(Bows.ACACIA_BOW, "Acacia Bow");
        translationBuilder.add(Bows.BIRCH_BOW, "Birch Bow");
        translationBuilder.add(Bows.CRIMSON_BOW, "Crimson Bow");
        translationBuilder.add(Bows.DARK_OAK_BOW, "Dark Oak Bow");
        translationBuilder.add(Bows.JUNGLE_BOW, "Jungle Bow");
        translationBuilder.add(Bows.MANGROVE_BOW, "Mangrove Bow");
        translationBuilder.add(Bows.OAK_BOW, "Oak Bow");
        translationBuilder.add(Bows.SPRUCE_BOW, "Spruce Bow");
        translationBuilder.add(Bows.WARPED_BOW, "Warped Bow");

        translationBuilder.add(Crossbows.ACACIA_CROSSBOW, "Acacia Crossbow");
        translationBuilder.add(Crossbows.BIRCH_CROSSBOW, "Birch Crossbow");
        translationBuilder.add(Crossbows.CRIMSON_CROSSBOW, "Crimson Crossbow");
        translationBuilder.add(Crossbows.DARK_OAK_CROSSBOW, "Dark Oak Crossbow");
        translationBuilder.add(Crossbows.JUNGLE_CROSSBOW, "Jungle Crossbow");
        translationBuilder.add(Crossbows.MANGROVE_CROSSBOW, "Mangrove Crossbow");
        translationBuilder.add(Crossbows.OAK_CROSSBOW, "Oak Crossbow");
        translationBuilder.add(Crossbows.SPRUCE_CROSSBOW, "Spruce Crossbow");
        translationBuilder.add(Crossbows.WARPED_CROSSBOW, "Warped Crossbow");

        translationBuilder.add(FishingRods.ACACIA_FISHING_ROD, "Acacia Fishing Rod");
        translationBuilder.add(FishingRods.BIRCH_FISHING_ROD, "Birch Fishing Rod");
        translationBuilder.add(FishingRods.CRIMSON_FISHING_ROD, "Crimson Fishing Rod");
        translationBuilder.add(FishingRods.DARK_OAK_FISHING_ROD, "Dark Oak Fishing Rod");
        translationBuilder.add(FishingRods.JUNGLE_FISHING_ROD, "Jungle Fishing Rod");
        translationBuilder.add(FishingRods.MANGROVE_FISHING_ROD, "Mangrove Fishing Rod");
        translationBuilder.add(FishingRods.OAK_FISHING_ROD, "Oak Fishing Rod");
        translationBuilder.add(FishingRods.SPRUCE_FISHING_ROD, "Spruce Fishing Rod");
        translationBuilder.add(FishingRods.WARPED_FISHING_ROD, "Warped Fishing Rod");

        translationBuilder.add(Sticks.ACACIA_STICK, "Acacia Stick");
        translationBuilder.add(Sticks.BIRCH_STICK, "Birch Stick");
        translationBuilder.add(Sticks.CRIMSON_STICK, "Crimson Stick");
        translationBuilder.add(Sticks.DARK_OAK_STICK, "Dark Oak Stick");
        translationBuilder.add(Sticks.JUNGLE_STICK, "Jungle Stick");
        translationBuilder.add(Sticks.MANGROVE_STICK, "Mangrove Stick");
        translationBuilder.add(Sticks.OAK_STICK, "Oak Stick");
        translationBuilder.add(Sticks.SPRUCE_STICK, "Spruce Stick");
        translationBuilder.add(Sticks.WARPED_STICK, "Warped Stick");

        translationBuilder.add(Axes.ACACIA_WOODEN_AXE, "Acacia Wooden Axe");
        translationBuilder.add(Axes.BIRCH_WOODEN_AXE, "Birch Wooden Axe");
        translationBuilder.add(Axes.CRIMSON_WOODEN_AXE, "Crimson Wooden Axe");
        translationBuilder.add(Axes.DARK_OAK_WOODEN_AXE, "Dark Oak Wooden Axe");
        translationBuilder.add(Axes.JUNGLE_WOODEN_AXE, "Jungle Wooden Axe");
        translationBuilder.add(Axes.MANGROVE_WOODEN_AXE, "Mangrove Wooden Axe");
        translationBuilder.add(Axes.OAK_WOODEN_AXE, "Oak Wooden Axe");
        translationBuilder.add(Axes.SPRUCE_WOODEN_AXE, "Spruce Wooden Axe");
        translationBuilder.add(Axes.WARPED_WOODEN_AXE, "Warped Wooden Axe");

        translationBuilder.add(Axes.ACACIA_STONE_AXE, "Acacia Stone Axe");
        translationBuilder.add(Axes.BIRCH_STONE_AXE, "Birch Stone Axe");
        translationBuilder.add(Axes.CRIMSON_STONE_AXE, "Crimson Stone Axe");
        translationBuilder.add(Axes.DARK_OAK_STONE_AXE, "Dark Oak Stone Axe");
        translationBuilder.add(Axes.JUNGLE_STONE_AXE, "Jungle Stone Axe");
        translationBuilder.add(Axes.MANGROVE_STONE_AXE, "Mangrove Stone Axe");
        translationBuilder.add(Axes.OAK_STONE_AXE, "Oak Stone Axe");
        translationBuilder.add(Axes.SPRUCE_STONE_AXE, "Spruce Stone Axe");
        translationBuilder.add(Axes.WARPED_STONE_AXE, "Warped Stone Axe");

        translationBuilder.add(Axes.ACACIA_IRON_AXE, "Acacia Iron Axe");
        translationBuilder.add(Axes.BIRCH_IRON_AXE, "Birch Iron Axe");
        translationBuilder.add(Axes.CRIMSON_IRON_AXE, "Crimson Iron Axe");
        translationBuilder.add(Axes.DARK_OAK_IRON_AXE, "Dark Oak Iron Axe");
        translationBuilder.add(Axes.JUNGLE_IRON_AXE, "Jungle Iron Axe");
        translationBuilder.add(Axes.MANGROVE_IRON_AXE, "Mangrove Iron Axe");
        translationBuilder.add(Axes.OAK_IRON_AXE, "Oak Iron Axe");
        translationBuilder.add(Axes.SPRUCE_IRON_AXE, "Spruce Iron Axe");
        translationBuilder.add(Axes.WARPED_IRON_AXE, "Warped Iron Axe");

        translationBuilder.add(Axes.ACACIA_GOLDEN_AXE, "Acacia Golden Axe");
        translationBuilder.add(Axes.BIRCH_GOLDEN_AXE, "Birch Golden Axe");
        translationBuilder.add(Axes.CRIMSON_GOLDEN_AXE, "Crimson Golden Axe");
        translationBuilder.add(Axes.DARK_OAK_GOLDEN_AXE, "Dark Oak Golden Axe");
        translationBuilder.add(Axes.JUNGLE_GOLDEN_AXE, "Jungle Golden Axe");
        translationBuilder.add(Axes.MANGROVE_GOLDEN_AXE, "Mangrove Golden Axe");
        translationBuilder.add(Axes.OAK_GOLDEN_AXE, "Oak Golden Axe");
        translationBuilder.add(Axes.SPRUCE_GOLDEN_AXE, "Spruce Golden Axe");
        translationBuilder.add(Axes.WARPED_GOLDEN_AXE, "Warped Golden Axe");

        translationBuilder.add(Axes.ACACIA_DIAMOND_AXE, "Acacia Diamond Axe");
        translationBuilder.add(Axes.BIRCH_DIAMOND_AXE, "Birch Diamond Axe");
        translationBuilder.add(Axes.CRIMSON_DIAMOND_AXE, "Crimson Diamond Axe");
        translationBuilder.add(Axes.DARK_OAK_DIAMOND_AXE, "Dark Oak Diamond Axe");
        translationBuilder.add(Axes.JUNGLE_DIAMOND_AXE, "Jungle Diamond Axe");
        translationBuilder.add(Axes.MANGROVE_DIAMOND_AXE, "Mangrove Diamond Axe");
        translationBuilder.add(Axes.OAK_DIAMOND_AXE, "Oak Diamond Axe");
        translationBuilder.add(Axes.SPRUCE_DIAMOND_AXE, "Spruce Diamond Axe");
        translationBuilder.add(Axes.WARPED_DIAMOND_AXE, "Warped Diamond Axe");

        translationBuilder.add(Axes.ACACIA_NETHERITE_AXE, "Acacia Netherite Axe");
        translationBuilder.add(Axes.BIRCH_NETHERITE_AXE, "Birch Netherite Axe");
        translationBuilder.add(Axes.CRIMSON_NETHERITE_AXE, "Crimson Netherite Axe");
        translationBuilder.add(Axes.DARK_OAK_NETHERITE_AXE, "Dark Oak Netherite Axe");
        translationBuilder.add(Axes.JUNGLE_NETHERITE_AXE, "Jungle Netherite Axe");
        translationBuilder.add(Axes.MANGROVE_NETHERITE_AXE, "Mangrove Netherite Axe");
        translationBuilder.add(Axes.OAK_NETHERITE_AXE, "Oak Netherite Axe");
        translationBuilder.add(Axes.SPRUCE_NETHERITE_AXE, "Spruce Netherite Axe");
        translationBuilder.add(Axes.WARPED_NETHERITE_AXE, "Warped Netherite Axe");

        translationBuilder.add(Hoes.ACACIA_WOODEN_HOE, "Acacia Wooden Hoe");
        translationBuilder.add(Hoes.BIRCH_WOODEN_HOE, "Birch Wooden Hoe");
        translationBuilder.add(Hoes.CRIMSON_WOODEN_HOE, "Crimson Wooden Hoe");
        translationBuilder.add(Hoes.DARK_OAK_WOODEN_HOE, "Dark Oak Wooden Hoe");
        translationBuilder.add(Hoes.JUNGLE_WOODEN_HOE, "Jungle Wooden Hoe");
        translationBuilder.add(Hoes.MANGROVE_WOODEN_HOE, "Mangrove Wooden Hoe");
        translationBuilder.add(Hoes.OAK_WOODEN_HOE, "Oak Wooden Hoe");
        translationBuilder.add(Hoes.SPRUCE_WOODEN_HOE, "Spruce Wooden Hoe");
        translationBuilder.add(Hoes.WARPED_WOODEN_HOE, "Warped Wooden Hoe");

        translationBuilder.add(Hoes.ACACIA_STONE_HOE, "Acacia Stone Hoe");
        translationBuilder.add(Hoes.BIRCH_STONE_HOE, "Birch Stone Hoe");
        translationBuilder.add(Hoes.CRIMSON_STONE_HOE, "Crimson Stone Hoe");
        translationBuilder.add(Hoes.DARK_OAK_STONE_HOE, "Dark Oak Stone Hoe");
        translationBuilder.add(Hoes.JUNGLE_STONE_HOE, "Jungle Stone Hoe");
        translationBuilder.add(Hoes.MANGROVE_STONE_HOE, "Mangrove Stone Hoe");
        translationBuilder.add(Hoes.OAK_STONE_HOE, "Oak Stone Hoe");
        translationBuilder.add(Hoes.SPRUCE_STONE_HOE, "Spruce Stone Hoe");
        translationBuilder.add(Hoes.WARPED_STONE_HOE, "Warped Stone Hoe");

        translationBuilder.add(Hoes.ACACIA_IRON_HOE, "Acacia Iron Hoe");
        translationBuilder.add(Hoes.BIRCH_IRON_HOE, "Birch Iron Hoe");
        translationBuilder.add(Hoes.CRIMSON_IRON_HOE, "Crimson Iron Hoe");
        translationBuilder.add(Hoes.DARK_OAK_IRON_HOE, "Dark Oak Iron Hoe");
        translationBuilder.add(Hoes.JUNGLE_IRON_HOE, "Jungle Iron Hoe");
        translationBuilder.add(Hoes.MANGROVE_IRON_HOE, "Mangrove Iron Hoe");
        translationBuilder.add(Hoes.OAK_IRON_HOE, "Oak Iron Hoe");
        translationBuilder.add(Hoes.SPRUCE_IRON_HOE, "Spruce Iron Hoe");
        translationBuilder.add(Hoes.WARPED_IRON_HOE, "Warped Iron Hoe");

        translationBuilder.add(Hoes.ACACIA_GOLDEN_HOE, "Acacia Golden Hoe");
        translationBuilder.add(Hoes.BIRCH_GOLDEN_HOE, "Birch Golden Hoe");
        translationBuilder.add(Hoes.CRIMSON_GOLDEN_HOE, "Crimson Golden Hoe");
        translationBuilder.add(Hoes.DARK_OAK_GOLDEN_HOE, "Dark Oak Golden Hoe");
        translationBuilder.add(Hoes.JUNGLE_GOLDEN_HOE, "Jungle Golden Hoe");
        translationBuilder.add(Hoes.MANGROVE_GOLDEN_HOE, "Mangrove Golden Hoe");
        translationBuilder.add(Hoes.OAK_GOLDEN_HOE, "Oak Golden Hoe");
        translationBuilder.add(Hoes.SPRUCE_GOLDEN_HOE, "Spruce Golden Hoe");
        translationBuilder.add(Hoes.WARPED_GOLDEN_HOE, "Warped Golden Hoe");

        translationBuilder.add(Hoes.ACACIA_DIAMOND_HOE, "Acacia Diamond Hoe");
        translationBuilder.add(Hoes.BIRCH_DIAMOND_HOE, "Birch Diamond Hoe");
        translationBuilder.add(Hoes.CRIMSON_DIAMOND_HOE, "Crimson Diamond Hoe");
        translationBuilder.add(Hoes.DARK_OAK_DIAMOND_HOE, "Dark Oak Diamond Hoe");
        translationBuilder.add(Hoes.JUNGLE_DIAMOND_HOE, "Jungle Diamond Hoe");
        translationBuilder.add(Hoes.MANGROVE_DIAMOND_HOE, "Mangrove Diamond Hoe");
        translationBuilder.add(Hoes.OAK_DIAMOND_HOE, "Oak Diamond Hoe");
        translationBuilder.add(Hoes.SPRUCE_DIAMOND_HOE, "Spruce Diamond Hoe");
        translationBuilder.add(Hoes.WARPED_DIAMOND_HOE, "Warped Diamond Hoe");

        translationBuilder.add(Hoes.ACACIA_NETHERITE_HOE, "Acacia Netherite Hoe");
        translationBuilder.add(Hoes.BIRCH_NETHERITE_HOE, "Birch Netherite Hoe");
        translationBuilder.add(Hoes.CRIMSON_NETHERITE_HOE, "Crimson Netherite Hoe");
        translationBuilder.add(Hoes.DARK_OAK_NETHERITE_HOE, "Dark Oak Netherite Hoe");
        translationBuilder.add(Hoes.JUNGLE_NETHERITE_HOE, "Jungle Netherite Hoe");
        translationBuilder.add(Hoes.MANGROVE_NETHERITE_HOE, "Mangrove Netherite Hoe");
        translationBuilder.add(Hoes.OAK_NETHERITE_HOE, "Oak Netherite Hoe");
        translationBuilder.add(Hoes.SPRUCE_NETHERITE_HOE, "Spruce Netherite Hoe");
        translationBuilder.add(Hoes.WARPED_NETHERITE_HOE, "Warped Netherite Hoe");

        translationBuilder.add(Pickaxes.ACACIA_WOODEN_PICKAXE, "Acacia Wooden Pickaxe");
        translationBuilder.add(Pickaxes.BIRCH_WOODEN_PICKAXE, "Birch Wooden Pickaxe");
        translationBuilder.add(Pickaxes.CRIMSON_WOODEN_PICKAXE, "Crimson Wooden Pickaxe");
        translationBuilder.add(Pickaxes.DARK_OAK_WOODEN_PICKAXE, "Dark Oak Wooden Pickaxe");
        translationBuilder.add(Pickaxes.JUNGLE_WOODEN_PICKAXE, "Jungle Wooden Pickaxe");
        translationBuilder.add(Pickaxes.MANGROVE_WOODEN_PICKAXE, "Mangrove Wooden Pickaxe");
        translationBuilder.add(Pickaxes.OAK_WOODEN_PICKAXE, "Oak Wooden Pickaxe");
        translationBuilder.add(Pickaxes.SPRUCE_WOODEN_PICKAXE, "Spruce Wooden Pickaxe");
        translationBuilder.add(Pickaxes.WARPED_WOODEN_PICKAXE, "Warped Wooden Pickaxe");

        translationBuilder.add(Pickaxes.ACACIA_STONE_PICKAXE, "Acacia Stone Pickaxe");
        translationBuilder.add(Pickaxes.BIRCH_STONE_PICKAXE, "Birch Stone Pickaxe");
        translationBuilder.add(Pickaxes.CRIMSON_STONE_PICKAXE, "Crimson Stone Pickaxe");
        translationBuilder.add(Pickaxes.DARK_OAK_STONE_PICKAXE, "Dark Oak Stone Pickaxe");
        translationBuilder.add(Pickaxes.JUNGLE_STONE_PICKAXE, "Jungle Stone Pickaxe");
        translationBuilder.add(Pickaxes.MANGROVE_STONE_PICKAXE, "Mangrove Stone Pickaxe");
        translationBuilder.add(Pickaxes.OAK_STONE_PICKAXE, "Oak Stone Pickaxe");
        translationBuilder.add(Pickaxes.SPRUCE_STONE_PICKAXE, "Spruce Stone Pickaxe");
        translationBuilder.add(Pickaxes.WARPED_STONE_PICKAXE, "Warped Stone Pickaxe");

        translationBuilder.add(Pickaxes.ACACIA_IRON_PICKAXE, "Acacia Iron Pickaxe");
        translationBuilder.add(Pickaxes.BIRCH_IRON_PICKAXE, "Birch Iron Pickaxe");
        translationBuilder.add(Pickaxes.CRIMSON_IRON_PICKAXE, "Crimson Iron Pickaxe");
        translationBuilder.add(Pickaxes.DARK_OAK_IRON_PICKAXE, "Dark Oak Iron Pickaxe");
        translationBuilder.add(Pickaxes.JUNGLE_IRON_PICKAXE, "Jungle Iron Pickaxe");
        translationBuilder.add(Pickaxes.MANGROVE_IRON_PICKAXE, "Mangrove Iron Pickaxe");
        translationBuilder.add(Pickaxes.OAK_IRON_PICKAXE, "Oak Iron Pickaxe");
        translationBuilder.add(Pickaxes.SPRUCE_IRON_PICKAXE, "Spruce Iron Pickaxe");
        translationBuilder.add(Pickaxes.WARPED_IRON_PICKAXE, "Warped Iron Pickaxe");

        translationBuilder.add(Pickaxes.ACACIA_GOLDEN_PICKAXE, "Acacia Golden Pickaxe");
        translationBuilder.add(Pickaxes.BIRCH_GOLDEN_PICKAXE, "Birch Golden Pickaxe");
        translationBuilder.add(Pickaxes.CRIMSON_GOLDEN_PICKAXE, "Crimson Golden Pickaxe");
        translationBuilder.add(Pickaxes.DARK_OAK_GOLDEN_PICKAXE, "Dark Oak Golden Pickaxe");
        translationBuilder.add(Pickaxes.JUNGLE_GOLDEN_PICKAXE, "Jungle Golden Pickaxe");
        translationBuilder.add(Pickaxes.MANGROVE_GOLDEN_PICKAXE, "Mangrove Golden Pickaxe");
        translationBuilder.add(Pickaxes.OAK_GOLDEN_PICKAXE, "Oak Golden Pickaxe");
        translationBuilder.add(Pickaxes.SPRUCE_GOLDEN_PICKAXE, "Spruce Golden Pickaxe");
        translationBuilder.add(Pickaxes.WARPED_GOLDEN_PICKAXE, "Warped Golden Pickaxe");

        translationBuilder.add(Pickaxes.ACACIA_DIAMOND_PICKAXE, "Acacia Diamond Pickaxe");
        translationBuilder.add(Pickaxes.BIRCH_DIAMOND_PICKAXE, "Birch Diamond Pickaxe");
        translationBuilder.add(Pickaxes.CRIMSON_DIAMOND_PICKAXE, "Crimson Diamond Pickaxe");
        translationBuilder.add(Pickaxes.DARK_OAK_DIAMOND_PICKAXE, "Dark Oak Diamond Pickaxe");
        translationBuilder.add(Pickaxes.JUNGLE_DIAMOND_PICKAXE, "Jungle Diamond Pickaxe");
        translationBuilder.add(Pickaxes.MANGROVE_DIAMOND_PICKAXE, "Mangrove Diamond Pickaxe");
        translationBuilder.add(Pickaxes.OAK_DIAMOND_PICKAXE, "Oak Diamond Pickaxe");
        translationBuilder.add(Pickaxes.SPRUCE_DIAMOND_PICKAXE, "Spruce Diamond Pickaxe");
        translationBuilder.add(Pickaxes.WARPED_DIAMOND_PICKAXE, "Warped Diamond Pickaxe");

        translationBuilder.add(Pickaxes.ACACIA_NETHERITE_PICKAXE, "Acacia Netherite Pickaxe");
        translationBuilder.add(Pickaxes.BIRCH_NETHERITE_PICKAXE, "Birch Netherite Pickaxe");
        translationBuilder.add(Pickaxes.CRIMSON_NETHERITE_PICKAXE, "Crimson Netherite Pickaxe");
        translationBuilder.add(Pickaxes.DARK_OAK_NETHERITE_PICKAXE, "Dark Oak Netherite Pickaxe");
        translationBuilder.add(Pickaxes.JUNGLE_NETHERITE_PICKAXE, "Jungle Netherite Pickaxe");
        translationBuilder.add(Pickaxes.MANGROVE_NETHERITE_PICKAXE, "Mangrove Netherite Pickaxe");
        translationBuilder.add(Pickaxes.OAK_NETHERITE_PICKAXE, "Oak Netherite Pickaxe");
        translationBuilder.add(Pickaxes.SPRUCE_NETHERITE_PICKAXE, "Spruce Netherite Pickaxe");
        translationBuilder.add(Pickaxes.WARPED_NETHERITE_PICKAXE, "Warped Netherite Pickaxe");

        translationBuilder.add(Shovels.ACACIA_WOODEN_SHOVEL, "Acacia Wooden Shovel");
        translationBuilder.add(Shovels.BIRCH_WOODEN_SHOVEL, "Birch Wooden Shovel");
        translationBuilder.add(Shovels.CRIMSON_WOODEN_SHOVEL, "Crimson Wooden Shovel");
        translationBuilder.add(Shovels.DARK_OAK_WOODEN_SHOVEL, "Dark Oak Wooden Shovel");
        translationBuilder.add(Shovels.JUNGLE_WOODEN_SHOVEL, "Jungle Wooden Shovel");
        translationBuilder.add(Shovels.MANGROVE_WOODEN_SHOVEL, "Mangrove Wooden Shovel");
        translationBuilder.add(Shovels.OAK_WOODEN_SHOVEL, "Oak Wooden Shovel");
        translationBuilder.add(Shovels.SPRUCE_WOODEN_SHOVEL, "Spruce Wooden Shovel");
        translationBuilder.add(Shovels.WARPED_WOODEN_SHOVEL, "Warped Wooden Shovel");

        translationBuilder.add(Shovels.ACACIA_STONE_SHOVEL, "Acacia Stone Shovel");
        translationBuilder.add(Shovels.BIRCH_STONE_SHOVEL, "Birch Stone Shovel");
        translationBuilder.add(Shovels.CRIMSON_STONE_SHOVEL, "Crimson Stone Shovel");
        translationBuilder.add(Shovels.DARK_OAK_STONE_SHOVEL, "Dark Oak Stone Shovel");
        translationBuilder.add(Shovels.JUNGLE_STONE_SHOVEL, "Jungle Stone Shovel");
        translationBuilder.add(Shovels.MANGROVE_STONE_SHOVEL, "Mangrove Stone Shovel");
        translationBuilder.add(Shovels.OAK_STONE_SHOVEL, "Oak Stone Shovel");
        translationBuilder.add(Shovels.SPRUCE_STONE_SHOVEL, "Spruce Stone Shovel");
        translationBuilder.add(Shovels.WARPED_STONE_SHOVEL, "Warped Stone Shovel");

        translationBuilder.add(Shovels.ACACIA_IRON_SHOVEL, "Acacia Iron Shovel");
        translationBuilder.add(Shovels.BIRCH_IRON_SHOVEL, "Birch Iron Shovel");
        translationBuilder.add(Shovels.CRIMSON_IRON_SHOVEL, "Crimson Iron Shovel");
        translationBuilder.add(Shovels.DARK_OAK_IRON_SHOVEL, "Dark Oak Iron Shovel");
        translationBuilder.add(Shovels.JUNGLE_IRON_SHOVEL, "Jungle Iron Shovel");
        translationBuilder.add(Shovels.MANGROVE_IRON_SHOVEL, "Mangrove Iron Shovel");
        translationBuilder.add(Shovels.OAK_IRON_SHOVEL, "Oak Iron Shovel");
        translationBuilder.add(Shovels.SPRUCE_IRON_SHOVEL, "Spruce Iron Shovel");
        translationBuilder.add(Shovels.WARPED_IRON_SHOVEL, "Warped Iron Shovel");

        translationBuilder.add(Shovels.ACACIA_GOLDEN_SHOVEL, "Acacia Golden Shovel");
        translationBuilder.add(Shovels.BIRCH_GOLDEN_SHOVEL, "Birch Golden Shovel");
        translationBuilder.add(Shovels.CRIMSON_GOLDEN_SHOVEL, "Crimson Golden Shovel");
        translationBuilder.add(Shovels.DARK_OAK_GOLDEN_SHOVEL, "Dark Oak Golden Shovel");
        translationBuilder.add(Shovels.JUNGLE_GOLDEN_SHOVEL, "Jungle Golden Shovel");
        translationBuilder.add(Shovels.MANGROVE_GOLDEN_SHOVEL, "Mangrove Golden Shovel");
        translationBuilder.add(Shovels.OAK_GOLDEN_SHOVEL, "Oak Golden Shovel");
        translationBuilder.add(Shovels.SPRUCE_GOLDEN_SHOVEL, "Spruce Golden Shovel");
        translationBuilder.add(Shovels.WARPED_GOLDEN_SHOVEL, "Warped Golden Shovel");

        translationBuilder.add(Shovels.ACACIA_DIAMOND_SHOVEL, "Acacia Diamond Shovel");
        translationBuilder.add(Shovels.BIRCH_DIAMOND_SHOVEL, "Birch Diamond Shovel");
        translationBuilder.add(Shovels.CRIMSON_DIAMOND_SHOVEL, "Crimson Diamond Shovel");
        translationBuilder.add(Shovels.DARK_OAK_DIAMOND_SHOVEL, "Dark Oak Diamond Shovel");
        translationBuilder.add(Shovels.JUNGLE_DIAMOND_SHOVEL, "Jungle Diamond Shovel");
        translationBuilder.add(Shovels.MANGROVE_DIAMOND_SHOVEL, "Mangrove Diamond Shovel");
        translationBuilder.add(Shovels.OAK_DIAMOND_SHOVEL, "Oak Diamond Shovel");
        translationBuilder.add(Shovels.SPRUCE_DIAMOND_SHOVEL, "Spruce Diamond Shovel");
        translationBuilder.add(Shovels.WARPED_DIAMOND_SHOVEL, "Warped Diamond Shovel");

        translationBuilder.add(Shovels.ACACIA_NETHERITE_SHOVEL, "Acacia Netherite Shovel");
        translationBuilder.add(Shovels.BIRCH_NETHERITE_SHOVEL, "Birch Netherite Shovel");
        translationBuilder.add(Shovels.CRIMSON_NETHERITE_SHOVEL, "Crimson Netherite Shovel");
        translationBuilder.add(Shovels.DARK_OAK_NETHERITE_SHOVEL, "Dark Oak Netherite Shovel");
        translationBuilder.add(Shovels.JUNGLE_NETHERITE_SHOVEL, "Jungle Netherite Shovel");
        translationBuilder.add(Shovels.MANGROVE_NETHERITE_SHOVEL, "Mangrove Netherite Shovel");
        translationBuilder.add(Shovels.OAK_NETHERITE_SHOVEL, "Oak Netherite Shovel");
        translationBuilder.add(Shovels.SPRUCE_NETHERITE_SHOVEL, "Spruce Netherite Shovel");
        translationBuilder.add(Shovels.WARPED_NETHERITE_SHOVEL, "Warped Netherite Shovel");

        translationBuilder.add(Swords.ACACIA_WOODEN_SWORD, "Acacia Wooden Sword");
        translationBuilder.add(Swords.BIRCH_WOODEN_SWORD, "Birch Wooden Sword");
        translationBuilder.add(Swords.CRIMSON_WOODEN_SWORD, "Crimson Wooden Sword");
        translationBuilder.add(Swords.DARK_OAK_WOODEN_SWORD, "Dark Oak Wooden Sword");
        translationBuilder.add(Swords.JUNGLE_WOODEN_SWORD, "Jungle Wooden Sword");
        translationBuilder.add(Swords.MANGROVE_WOODEN_SWORD, "Mangrove Wooden Sword");
        translationBuilder.add(Swords.OAK_WOODEN_SWORD, "Oak Wooden Sword");
        translationBuilder.add(Swords.SPRUCE_WOODEN_SWORD, "Spruce Wooden Sword");
        translationBuilder.add(Swords.WARPED_WOODEN_SWORD, "Warped Wooden Sword");

        translationBuilder.add(Swords.ACACIA_STONE_SWORD, "Acacia Stone Sword");
        translationBuilder.add(Swords.BIRCH_STONE_SWORD, "Birch Stone Sword");
        translationBuilder.add(Swords.CRIMSON_STONE_SWORD, "Crimson Stone Sword");
        translationBuilder.add(Swords.DARK_OAK_STONE_SWORD, "Dark Oak Stone Sword");
        translationBuilder.add(Swords.JUNGLE_STONE_SWORD, "Jungle Stone Sword");
        translationBuilder.add(Swords.MANGROVE_STONE_SWORD, "Mangrove Stone Sword");
        translationBuilder.add(Swords.OAK_STONE_SWORD, "Oak Stone Sword");
        translationBuilder.add(Swords.SPRUCE_STONE_SWORD, "Spruce Stone Sword");
        translationBuilder.add(Swords.WARPED_STONE_SWORD, "Warped Stone Sword");

        translationBuilder.add(Swords.ACACIA_IRON_SWORD, "Acacia Iron Sword");
        translationBuilder.add(Swords.BIRCH_IRON_SWORD, "Birch Iron Sword");
        translationBuilder.add(Swords.CRIMSON_IRON_SWORD, "Crimson Iron Sword");
        translationBuilder.add(Swords.DARK_OAK_IRON_SWORD, "Dark Oak Iron Sword");
        translationBuilder.add(Swords.JUNGLE_IRON_SWORD, "Jungle Iron Sword");
        translationBuilder.add(Swords.MANGROVE_IRON_SWORD, "Mangrove Iron Sword");
        translationBuilder.add(Swords.OAK_IRON_SWORD, "Oak Iron Sword");
        translationBuilder.add(Swords.SPRUCE_IRON_SWORD, "Spruce Iron Sword");
        translationBuilder.add(Swords.WARPED_IRON_SWORD, "Warped Iron Sword");

        translationBuilder.add(Swords.ACACIA_GOLDEN_SWORD, "Acacia Golden Sword");
        translationBuilder.add(Swords.BIRCH_GOLDEN_SWORD, "Birch Golden Sword");
        translationBuilder.add(Swords.CRIMSON_GOLDEN_SWORD, "Crimson Golden Sword");
        translationBuilder.add(Swords.DARK_OAK_GOLDEN_SWORD, "Dark Oak Golden Sword");
        translationBuilder.add(Swords.JUNGLE_GOLDEN_SWORD, "Jungle Golden Sword");
        translationBuilder.add(Swords.MANGROVE_GOLDEN_SWORD, "Mangrove Golden Sword");
        translationBuilder.add(Swords.OAK_GOLDEN_SWORD, "Oak Golden Sword");
        translationBuilder.add(Swords.SPRUCE_GOLDEN_SWORD, "Spruce Golden Sword");
        translationBuilder.add(Swords.WARPED_GOLDEN_SWORD, "Warped Golden Sword");

        translationBuilder.add(Swords.ACACIA_DIAMOND_SWORD, "Acacia Diamond Sword");
        translationBuilder.add(Swords.BIRCH_DIAMOND_SWORD, "Birch Diamond Sword");
        translationBuilder.add(Swords.CRIMSON_DIAMOND_SWORD, "Crimson Diamond Sword");
        translationBuilder.add(Swords.DARK_OAK_DIAMOND_SWORD, "Dark Oak Diamond Sword");
        translationBuilder.add(Swords.JUNGLE_DIAMOND_SWORD, "Jungle Diamond Sword");
        translationBuilder.add(Swords.MANGROVE_DIAMOND_SWORD, "Mangrove Diamond Sword");
        translationBuilder.add(Swords.OAK_DIAMOND_SWORD, "Oak Diamond Sword");
        translationBuilder.add(Swords.SPRUCE_DIAMOND_SWORD, "Spruce Diamond Sword");
        translationBuilder.add(Swords.WARPED_DIAMOND_SWORD, "Warped Diamond Sword");

        translationBuilder.add(Swords.ACACIA_NETHERITE_SWORD, "Acacia Netherite Sword");
        translationBuilder.add(Swords.BIRCH_NETHERITE_SWORD, "Birch Netherite Sword");
        translationBuilder.add(Swords.CRIMSON_NETHERITE_SWORD, "Crimson Netherite Sword");
        translationBuilder.add(Swords.DARK_OAK_NETHERITE_SWORD, "Dark Oak Netherite Sword");
        translationBuilder.add(Swords.JUNGLE_NETHERITE_SWORD, "Jungle Netherite Sword");
        translationBuilder.add(Swords.MANGROVE_NETHERITE_SWORD, "Mangrove Netherite Sword");
        translationBuilder.add(Swords.OAK_NETHERITE_SWORD, "Oak Netherite Sword");
        translationBuilder.add(Swords.SPRUCE_NETHERITE_SWORD, "Spruce Netherite Sword");
        translationBuilder.add(Swords.WARPED_NETHERITE_SWORD, "Warped Netherite Sword");

        translationBuilder.add(EntityInit.ACACIA_ARROW, "Acacia Arrow");
        translationBuilder.add(EntityInit.BIRCH_ARROW, "Birch Arrow");
        translationBuilder.add(EntityInit.CRIMSON_ARROW, "Crimson Arrow");
        translationBuilder.add(EntityInit.DARK_OAK_ARROW, "Dark Oak Arrow");
        translationBuilder.add(EntityInit.JUNGLE_ARROW, "Jungle Arrow");
        translationBuilder.add(EntityInit.MANGROVE_ARROW, "Mangrove Arrow");
        translationBuilder.add(EntityInit.OAK_ARROW, "Oak Arrow");
        translationBuilder.add(EntityInit.SPRUCE_ARROW, "Spruce Arrow");
        translationBuilder.add(EntityInit.WARPED_ARROW, "Warped Arrow");

        translationBuilder.add(OnAStick.ACACIA_CARROT_ON_A_STICK, "Acacia Carrot On A Stick");
        translationBuilder.add(OnAStick.BIRCH_CARROT_ON_A_STICK, "Birch Carrot On A Stick");
        translationBuilder.add(OnAStick.CRIMSON_CARROT_ON_A_STICK, "Crimson Carrot On A Stick");
        translationBuilder.add(OnAStick.DARK_OAK_CARROT_ON_A_STICK, "Dark Oak Carrot On A Stick");
        translationBuilder.add(OnAStick.JUNGLE_CARROT_ON_A_STICK, "Jungle Carrot On A Stick");
        translationBuilder.add(OnAStick.MANGROVE_CARROT_ON_A_STICK, "Mangrove Carrot On A Stick");
        translationBuilder.add(OnAStick.OAK_CARROT_ON_A_STICK, "Oak Carrot On A Stick");
        translationBuilder.add(OnAStick.SPRUCE_CARROT_ON_A_STICK, "Spruce Carrot On A Stick");
        translationBuilder.add(OnAStick.WARPED_CARROT_ON_A_STICK, "Warped Carrot On A Stick");

        translationBuilder.add(OnAStick.ACACIA_WARPED_FUNGUS_ON_A_STICK, "Acacia Warped Fungus On A Stick");
        translationBuilder.add(OnAStick.BIRCH_WARPED_FUNGUS_ON_A_STICK, "Birch Warped Fungus On A Stick");
        translationBuilder.add(OnAStick.CRIMSON_WARPED_FUNGUS_ON_A_STICK, "Crimson Warped Fungus On A Stick");
        translationBuilder.add(OnAStick.DARK_OAK_WARPED_FUNGUS_ON_A_STICK, "Dark Oak Warped Fungus On A Stick");
        translationBuilder.add(OnAStick.JUNGLE_WARPED_FUNGUS_ON_A_STICK, "Jungle Warped Fungus On A Stick");
        translationBuilder.add(OnAStick.MANGROVE_WARPED_FUNGUS_ON_A_STICK, "Mangrove Warped Fungus On A Stick");
        translationBuilder.add(OnAStick.OAK_WARPED_FUNGUS_ON_A_STICK, "Oak Warped Fungus On A Stick");
        translationBuilder.add(OnAStick.SPRUCE_WARPED_FUNGUS_ON_A_STICK, "Spruce Warped Fungus On A Stick");
        translationBuilder.add(OnAStick.WARPED_WARPED_FUNGUS_ON_A_STICK, "Warped Warped Fungus On A Stick");
    }
}
