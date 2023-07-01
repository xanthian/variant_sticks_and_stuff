package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.data.client.*;

import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.items.*;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);

    }

    /**
     Copy from {@link BlockStateModelGenerator#register()}
     **/

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Ladders.ACACIA_LADDER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Ladders.BIRCH_LADDER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Ladders.CRIMSON_LADDER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Ladders.DARK_OAK_LADDER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Ladders.JUNGLE_LADDER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Ladders.MANGROVE_LADDER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Ladders.OAK_LADDER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Ladders.SPRUCE_LADDER);
        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(Ladders.WARPED_LADDER);

        blockStateModelGenerator.registerItemModel(Ladders.ACACIA_LADDER);
        blockStateModelGenerator.registerItemModel(Ladders.BIRCH_LADDER);
        blockStateModelGenerator.registerItemModel(Ladders.CRIMSON_LADDER);
        blockStateModelGenerator.registerItemModel(Ladders.DARK_OAK_LADDER);
        blockStateModelGenerator.registerItemModel(Ladders.JUNGLE_LADDER);
        blockStateModelGenerator.registerItemModel(Ladders.MANGROVE_LADDER);
        blockStateModelGenerator.registerItemModel(Ladders.OAK_LADDER);
        blockStateModelGenerator.registerItemModel(Ladders.SPRUCE_LADDER);
        blockStateModelGenerator.registerItemModel(Ladders.WARPED_LADDER);

        blockStateModelGenerator.registerItemModel(Levers.ACACIA_LEVER);
        blockStateModelGenerator.registerItemModel(Levers.BIRCH_LEVER);
        blockStateModelGenerator.registerItemModel(Levers.CRIMSON_LEVER);
        blockStateModelGenerator.registerItemModel(Levers.DARK_OAK_LEVER);
        blockStateModelGenerator.registerItemModel(Levers.JUNGLE_LEVER);
        blockStateModelGenerator.registerItemModel(Levers.MANGROVE_LEVER);
        blockStateModelGenerator.registerItemModel(Levers.OAK_LEVER);
        blockStateModelGenerator.registerItemModel(Levers.SPRUCE_LEVER);
        blockStateModelGenerator.registerItemModel(Levers.WARPED_LEVER);

        blockStateModelGenerator.registerTurnableRail(Rails.ACACIA_RAIL);
        blockStateModelGenerator.registerTurnableRail(Rails.BIRCH_RAIL);
        blockStateModelGenerator.registerTurnableRail(Rails.CRIMSON_RAIL);
        blockStateModelGenerator.registerTurnableRail(Rails.DARK_OAK_RAIL);
        blockStateModelGenerator.registerTurnableRail(Rails.JUNGLE_RAIL);
        blockStateModelGenerator.registerTurnableRail(Rails.MANGROVE_RAIL);
        blockStateModelGenerator.registerTurnableRail(Rails.OAK_RAIL);
        blockStateModelGenerator.registerTurnableRail(Rails.SPRUCE_RAIL);
        blockStateModelGenerator.registerTurnableRail(Rails.WARPED_RAIL);

        blockStateModelGenerator.registerStraightRail(Rails.ACACIA_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.BIRCH_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.CRIMSON_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.DARK_OAK_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.JUNGLE_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.MANGROVE_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.OAK_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.SPRUCE_ACTIVATOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.WARPED_ACTIVATOR_RAIL);

        blockStateModelGenerator.registerStraightRail(Rails.ACACIA_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.BIRCH_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.CRIMSON_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.DARK_OAK_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.JUNGLE_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.MANGROVE_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.OAK_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.SPRUCE_DETECTOR_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.WARPED_DETECTOR_RAIL);

        blockStateModelGenerator.registerStraightRail(Rails.ACACIA_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.BIRCH_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.CRIMSON_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.DARK_OAK_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.JUNGLE_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.MANGROVE_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.OAK_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.SPRUCE_POWERED_RAIL);
        blockStateModelGenerator.registerStraightRail(Rails.WARPED_POWERED_RAIL);

        blockStateModelGenerator.registerItemModel(RedstoneTorches.ACACIA_REDSTONE_TORCH);
        blockStateModelGenerator.registerItemModel(RedstoneTorches.BIRCH_REDSTONE_TORCH);
        blockStateModelGenerator.registerItemModel(RedstoneTorches.CRIMSON_REDSTONE_TORCH);
        blockStateModelGenerator.registerItemModel(RedstoneTorches.DARK_OAK_REDSTONE_TORCH);
        blockStateModelGenerator.registerItemModel(RedstoneTorches.JUNGLE_REDSTONE_TORCH);
        blockStateModelGenerator.registerItemModel(RedstoneTorches.MANGROVE_REDSTONE_TORCH);
        blockStateModelGenerator.registerItemModel(RedstoneTorches.OAK_REDSTONE_TORCH);
        blockStateModelGenerator.registerItemModel(RedstoneTorches.SPRUCE_REDSTONE_TORCH);
        blockStateModelGenerator.registerItemModel(RedstoneTorches.WARPED_REDSTONE_TORCH);
        
        blockStateModelGenerator.registerTorch(SoulTorches.ACACIA_SOUL_TORCH, SoulTorches.WALL_ACACIA_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.BIRCH_SOUL_TORCH, SoulTorches.WALL_BIRCH_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.CRIMSON_SOUL_TORCH, SoulTorches.WALL_CRIMSON_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.DARK_OAK_SOUL_TORCH, SoulTorches.WALL_DARK_OAK_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.JUNGLE_SOUL_TORCH, SoulTorches.WALL_JUNGLE_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.MANGROVE_SOUL_TORCH, SoulTorches.WALL_MANGROVE_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.OAK_SOUL_TORCH, SoulTorches.WALL_OAK_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.SPRUCE_SOUL_TORCH, SoulTorches.WALL_SPRUCE_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.WARPED_SOUL_TORCH, SoulTorches.WALL_WARPED_SOUL_TORCH);
        
        blockStateModelGenerator.registerTorch(Torches.ACACIA_TORCH, Torches.WALL_ACACIA_TORCH);
        blockStateModelGenerator.registerTorch(Torches.BIRCH_TORCH, Torches.WALL_BIRCH_TORCH);
        blockStateModelGenerator.registerTorch(Torches.CRIMSON_TORCH, Torches.WALL_CRIMSON_TORCH);
        blockStateModelGenerator.registerTorch(Torches.DARK_OAK_TORCH, Torches.WALL_DARK_OAK_TORCH);
        blockStateModelGenerator.registerTorch(Torches.JUNGLE_TORCH, Torches.WALL_JUNGLE_TORCH);
        blockStateModelGenerator.registerTorch(Torches.MANGROVE_TORCH, Torches.WALL_MANGROVE_TORCH);
        blockStateModelGenerator.registerTorch(Torches.OAK_TORCH, Torches.WALL_OAK_TORCH);
        blockStateModelGenerator.registerTorch(Torches.SPRUCE_TORCH, Torches.WALL_SPRUCE_TORCH);
        blockStateModelGenerator.registerTorch(Torches.WARPED_TORCH, Torches.WALL_WARPED_TORCH);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(Arrows.ACACIA_ARROW_ITEM, Models.GENERATED);
        itemModelGenerator.register(Arrows.BIRCH_ARROW_ITEM, Models.GENERATED);
        itemModelGenerator.register(Arrows.CRIMSON_ARROW_ITEM, Models.GENERATED);
        itemModelGenerator.register(Arrows.DARK_OAK_ARROW_ITEM, Models.GENERATED);
        itemModelGenerator.register(Arrows.JUNGLE_ARROW_ITEM, Models.GENERATED);
        itemModelGenerator.register(Arrows.MANGROVE_ARROW_ITEM, Models.GENERATED);
        itemModelGenerator.register(Arrows.OAK_ARROW_ITEM, Models.GENERATED);
        itemModelGenerator.register(Arrows.SPRUCE_ARROW_ITEM, Models.GENERATED);
        itemModelGenerator.register(Arrows.WARPED_ARROW_ITEM, Models.GENERATED);

        itemModelGenerator.register(Axes.ACACIA_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(Axes.BIRCH_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(Axes.CRIMSON_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(Axes.DARK_OAK_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(Axes.JUNGLE_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(Axes.MANGROVE_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(Axes.OAK_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(Axes.SPRUCE_WOODEN_AXE, Models.HANDHELD);
        itemModelGenerator.register(Axes.WARPED_WOODEN_AXE, Models.HANDHELD);

        itemModelGenerator.register(Campfires.ACACIA_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.BIRCH_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.CRIMSON_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.DARK_OAK_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.JUNGLE_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.MANGROVE_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.OAK_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.SPRUCE_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.WARPED_CAMPFIRE.asItem(), Models.GENERATED);
        
        itemModelGenerator.register(OnAStick.ACACIA_CARROT_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.BIRCH_CARROT_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.CRIMSON_CARROT_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.DARK_OAK_CARROT_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.JUNGLE_CARROT_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.MANGROVE_CARROT_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.OAK_CARROT_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.SPRUCE_CARROT_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.WARPED_CARROT_ON_A_STICK, Models.HANDHELD_ROD);

        itemModelGenerator.register(OnAStick.ACACIA_WARPED_FUNGUS_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.BIRCH_WARPED_FUNGUS_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.CRIMSON_WARPED_FUNGUS_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.DARK_OAK_WARPED_FUNGUS_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.JUNGLE_WARPED_FUNGUS_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.MANGROVE_WARPED_FUNGUS_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.OAK_WARPED_FUNGUS_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.SPRUCE_WARPED_FUNGUS_ON_A_STICK, Models.HANDHELD_ROD);
        itemModelGenerator.register(OnAStick.WARPED_WARPED_FUNGUS_ON_A_STICK, Models.HANDHELD_ROD);

        itemModelGenerator.register(Pickaxes.ACACIA_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(Pickaxes.BIRCH_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(Pickaxes.CRIMSON_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(Pickaxes.DARK_OAK_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(Pickaxes.JUNGLE_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(Pickaxes.MANGROVE_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(Pickaxes.OAK_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(Pickaxes.SPRUCE_WOODEN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(Pickaxes.WARPED_WOODEN_PICKAXE, Models.HANDHELD);

        itemModelGenerator.register(Shovels.ACACIA_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Shovels.BIRCH_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Shovels.CRIMSON_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Shovels.DARK_OAK_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Shovels.JUNGLE_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Shovels.MANGROVE_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Shovels.OAK_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Shovels.SPRUCE_WOODEN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(Shovels.WARPED_WOODEN_SHOVEL, Models.HANDHELD);

        itemModelGenerator.register(Campfires.ACACIA_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.BIRCH_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.CRIMSON_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.DARK_OAK_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.JUNGLE_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.MANGROVE_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.OAK_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.SPRUCE_SOUL_CAMPFIRE.asItem(), Models.GENERATED);
        itemModelGenerator.register(Campfires.WARPED_SOUL_CAMPFIRE.asItem(), Models.GENERATED);

        itemModelGenerator.register(Sticks.ACACIA_STICK, Models.HANDHELD);
        itemModelGenerator.register(Sticks.BIRCH_STICK, Models.HANDHELD);
        itemModelGenerator.register(Sticks.CRIMSON_STICK, Models.HANDHELD);
        itemModelGenerator.register(Sticks.DARK_OAK_STICK, Models.HANDHELD);
        itemModelGenerator.register(Sticks.JUNGLE_STICK, Models.HANDHELD);
        itemModelGenerator.register(Sticks.MANGROVE_STICK, Models.HANDHELD);
        itemModelGenerator.register(Sticks.OAK_STICK, Models.HANDHELD);
        itemModelGenerator.register(Sticks.SPRUCE_STICK, Models.HANDHELD);
        itemModelGenerator.register(Sticks.WARPED_STICK, Models.HANDHELD);

        itemModelGenerator.register(Swords.ACACIA_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Swords.BIRCH_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Swords.CRIMSON_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Swords.DARK_OAK_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Swords.JUNGLE_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Swords.MANGROVE_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Swords.OAK_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Swords.SPRUCE_WOODEN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(Swords.WARPED_WOODEN_SWORD, Models.HANDHELD);

    }
}