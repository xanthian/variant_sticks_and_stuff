package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.items.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.vsas.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {
    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Item> ACTIVATOR_RAILS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"activator_rails"));
    private static final TagKey<Item> ARROWS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"arrows"));
    private static final TagKey<Item> AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"axes"));
    private static final TagKey<Item> BOWS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"bows"));
    private static final TagKey<Item> CAMPFIRES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"campfires"));
    private static final TagKey<Item> CROSSBOWS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"crossbows"));
    private static final TagKey<Item> DETECTOR_RAILS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"detector_rails"));
    private static final TagKey<Item> GRINDSTONES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"grindstones"));
    private static final TagKey<Item> HOES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"hoes"));
    private static final TagKey<Item> LADDERS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"ladders"));
    private static final TagKey<Item> LEVERS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"levers"));
    private static final TagKey<Item> PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"pickaxes"));
    private static final TagKey<Item> POWERED_RAILS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"powered_rails"));
    private static final TagKey<Item> RAILS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"rails"));
    private static final TagKey<Item> REDSTONE_TORCHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"redstone_torches"));
    private static final TagKey<Item> SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"shovels"));
    private static final TagKey<Item> SOUL_CAMPFIRES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"soul_campfires"));
    private static final TagKey<Item> SOUL_TORCHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"soul_torches"));
    private static final TagKey<Item> STICKS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"sticks"));
    private static final TagKey<Item> SWORDS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"swords"));
    private static final TagKey<Item> TORCHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID,"torches"));

    private static final TagKey<Item> MC_ARROWS = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:arrows"));
    private static final TagKey<Item> MC_AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:axes"));
    private static final TagKey<Item> C_BOWS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:bows"));
    private static final TagKey<Item> CLUSTER_MAX_HARVESTABLES = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:cluster_max_harvestables"));
    private static final TagKey<Item> MC_HOES = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:hoes"));
    private static final TagKey<Item> NON_FLAMMABLE_WOOD = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:non_flammable_wood"));
    private static final TagKey<Item> MC_PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:pickaxes"));
    private static final TagKey<Item> PIGLIN_LOVED = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:piglin_loved"));
    private static final TagKey<Item> PIGLIN_REPELLENTS = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:piglin_repellents"));
    private static final TagKey<Item> MC_RAILS = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:rails"));
    private static final TagKey<Item> MC_SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:shovels"));
    private static final TagKey<Item> MC_SWORDS = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:swords"));
    private static final TagKey<Item> MC_TOOLS = TagKey.of(Registries.ITEM.getKey(), new Identifier("minecraft:tools"));
    private static final TagKey<Item> JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

        @Override
        protected void configure (RegistryWrapper.WrapperLookup arg){

            getOrCreateTagBuilder(ACTIVATOR_RAILS)
                    .add(Rails.ACACIA_ACTIVATOR_RAIL.asItem())
                    .add(Rails.BIRCH_ACTIVATOR_RAIL.asItem())
                    .add(Rails.CRIMSON_ACTIVATOR_RAIL.asItem())
                    .add(Rails.DARK_OAK_ACTIVATOR_RAIL.asItem())
                    .add(Rails.JUNGLE_ACTIVATOR_RAIL.asItem())
                    .add(Rails.MANGROVE_ACTIVATOR_RAIL.asItem())
                    .add(Rails.OAK_ACTIVATOR_RAIL.asItem())
                    .add(Rails.SPRUCE_ACTIVATOR_RAIL.asItem())
                    .add(Rails.WARPED_ACTIVATOR_RAIL.asItem());

            getOrCreateTagBuilder(ARROWS)
                    .add(Arrows.ACACIA_ARROW_ITEM)
                    .add(Arrows.BIRCH_ARROW_ITEM)
                    .add(Arrows.CRIMSON_ARROW_ITEM)
                    .add(Arrows.DARK_OAK_ARROW_ITEM)
                    .add(Arrows.JUNGLE_ARROW_ITEM)
                    .add(Arrows.MANGROVE_ARROW_ITEM)
                    .add(Arrows.OAK_ARROW_ITEM)
                    .add(Arrows.SPRUCE_ARROW_ITEM)
                    .add(Arrows.WARPED_ARROW_ITEM);
            
            getOrCreateTagBuilder(AXES)
                    .add(Axes.ACACIA_WOODEN_AXE)
                    .add(Axes.ACACIA_STONE_AXE)
                    .add(Axes.ACACIA_IRON_AXE)
                    .add(Axes.ACACIA_GOLDEN_AXE)
                    .add(Axes.ACACIA_DIAMOND_AXE)
                    .add(Axes.ACACIA_NETHERITE_AXE)
                    .add(Axes.BIRCH_WOODEN_AXE)
                    .add(Axes.BIRCH_STONE_AXE)
                    .add(Axes.BIRCH_IRON_AXE)
                    .add(Axes.BIRCH_GOLDEN_AXE)
                    .add(Axes.BIRCH_DIAMOND_AXE)
                    .add(Axes.BIRCH_NETHERITE_AXE)
                    .add(Axes.CRIMSON_WOODEN_AXE)
                    .add(Axes.CRIMSON_STONE_AXE)
                    .add(Axes.CRIMSON_IRON_AXE)
                    .add(Axes.CRIMSON_GOLDEN_AXE)
                    .add(Axes.CRIMSON_DIAMOND_AXE)
                    .add(Axes.CRIMSON_NETHERITE_AXE)
                    .add(Axes.DARK_OAK_WOODEN_AXE)
                    .add(Axes.DARK_OAK_STONE_AXE)
                    .add(Axes.DARK_OAK_IRON_AXE)
                    .add(Axes.DARK_OAK_GOLDEN_AXE)
                    .add(Axes.DARK_OAK_DIAMOND_AXE)
                    .add(Axes.DARK_OAK_NETHERITE_AXE)
                    .add(Axes.JUNGLE_WOODEN_AXE)
                    .add(Axes.JUNGLE_STONE_AXE)
                    .add(Axes.JUNGLE_IRON_AXE)
                    .add(Axes.JUNGLE_GOLDEN_AXE)
                    .add(Axes.JUNGLE_DIAMOND_AXE)
                    .add(Axes.JUNGLE_NETHERITE_AXE)
                    .add(Axes.MANGROVE_WOODEN_AXE)
                    .add(Axes.MANGROVE_STONE_AXE)
                    .add(Axes.MANGROVE_IRON_AXE)
                    .add(Axes.MANGROVE_GOLDEN_AXE)
                    .add(Axes.MANGROVE_DIAMOND_AXE)
                    .add(Axes.MANGROVE_NETHERITE_AXE)
                    .add(Axes.OAK_WOODEN_AXE)
                    .add(Axes.OAK_STONE_AXE)
                    .add(Axes.OAK_IRON_AXE)
                    .add(Axes.OAK_GOLDEN_AXE)
                    .add(Axes.OAK_DIAMOND_AXE)
                    .add(Axes.OAK_NETHERITE_AXE)
                    .add(Axes.SPRUCE_WOODEN_AXE)
                    .add(Axes.SPRUCE_STONE_AXE)
                    .add(Axes.SPRUCE_IRON_AXE)
                    .add(Axes.SPRUCE_GOLDEN_AXE)
                    .add(Axes.SPRUCE_DIAMOND_AXE)
                    .add(Axes.SPRUCE_NETHERITE_AXE)
                    .add(Axes.WARPED_WOODEN_AXE)
                    .add(Axes.WARPED_STONE_AXE)
                    .add(Axes.WARPED_IRON_AXE)
                    .add(Axes.WARPED_GOLDEN_AXE)
                    .add(Axes.WARPED_DIAMOND_AXE)
                    .add(Axes.WARPED_NETHERITE_AXE);

            getOrCreateTagBuilder(BOWS)
                    .add(Bows.ACACIA_BOW)
                    .add(Bows.BIRCH_BOW)
                    .add(Bows.CRIMSON_BOW)
                    .add(Bows.DARK_OAK_BOW)
                    .add(Bows.JUNGLE_BOW)
                    .add(Bows.MANGROVE_BOW)
                    .add(Bows.OAK_BOW)
                    .add(Bows.SPRUCE_BOW)
                    .add(Bows.WARPED_BOW);

            getOrCreateTagBuilder(CROSSBOWS)
                    .add(Crossbows.ACACIA_CROSSBOW)
                    .add(Crossbows.BIRCH_CROSSBOW)
                    .add(Crossbows.CRIMSON_CROSSBOW)
                    .add(Crossbows.DARK_OAK_CROSSBOW)
                    .add(Crossbows.JUNGLE_CROSSBOW)
                    .add(Crossbows.MANGROVE_CROSSBOW)
                    .add(Crossbows.OAK_CROSSBOW)
                    .add(Crossbows.SPRUCE_CROSSBOW)
                    .add(Crossbows.WARPED_CROSSBOW);

            getOrCreateTagBuilder(CAMPFIRES)
                    .add(Campfires.ACACIA_CAMPFIRE.asItem())
                    .add(Campfires.BIRCH_CAMPFIRE.asItem())
                    .add(Campfires.CRIMSON_CAMPFIRE.asItem())
                    .add(Campfires.DARK_OAK_CAMPFIRE.asItem())
                    .add(Campfires.JUNGLE_CAMPFIRE.asItem())
                    .add(Campfires.MANGROVE_CAMPFIRE.asItem())
                    .add(Campfires.OAK_CAMPFIRE.asItem())
                    .add(Campfires.SPRUCE_CAMPFIRE.asItem())
                    .add(Campfires.WARPED_CAMPFIRE.asItem());

            getOrCreateTagBuilder(DETECTOR_RAILS)
                    .add(Rails.ACACIA_DETECTOR_RAIL.asItem())
                    .add(Rails.BIRCH_DETECTOR_RAIL.asItem())
                    .add(Rails.CRIMSON_DETECTOR_RAIL.asItem())
                    .add(Rails.DARK_OAK_DETECTOR_RAIL.asItem())
                    .add(Rails.JUNGLE_DETECTOR_RAIL.asItem())
                    .add(Rails.MANGROVE_DETECTOR_RAIL.asItem())
                    .add(Rails.OAK_DETECTOR_RAIL.asItem())
                    .add(Rails.SPRUCE_DETECTOR_RAIL.asItem())
                    .add(Rails.WARPED_DETECTOR_RAIL.asItem());

            getOrCreateTagBuilder(HOES)
                    .add(Hoes.ACACIA_WOODEN_HOE)
                    .add(Hoes.ACACIA_STONE_HOE)
                    .add(Hoes.ACACIA_IRON_HOE)
                    .add(Hoes.ACACIA_GOLDEN_HOE)
                    .add(Hoes.ACACIA_DIAMOND_HOE)
                    .add(Hoes.ACACIA_NETHERITE_HOE)
                    .add(Hoes.BIRCH_WOODEN_HOE)
                    .add(Hoes.BIRCH_STONE_HOE)
                    .add(Hoes.BIRCH_IRON_HOE)
                    .add(Hoes.BIRCH_GOLDEN_HOE)
                    .add(Hoes.BIRCH_DIAMOND_HOE)
                    .add(Hoes.BIRCH_NETHERITE_HOE)
                    .add(Hoes.CRIMSON_WOODEN_HOE)
                    .add(Hoes.CRIMSON_STONE_HOE)
                    .add(Hoes.CRIMSON_IRON_HOE)
                    .add(Hoes.CRIMSON_GOLDEN_HOE)
                    .add(Hoes.CRIMSON_DIAMOND_HOE)
                    .add(Hoes.CRIMSON_NETHERITE_HOE)
                    .add(Hoes.DARK_OAK_WOODEN_HOE)
                    .add(Hoes.DARK_OAK_STONE_HOE)
                    .add(Hoes.DARK_OAK_IRON_HOE)
                    .add(Hoes.DARK_OAK_GOLDEN_HOE)
                    .add(Hoes.DARK_OAK_DIAMOND_HOE)
                    .add(Hoes.DARK_OAK_NETHERITE_HOE)
                    .add(Hoes.JUNGLE_WOODEN_HOE)
                    .add(Hoes.JUNGLE_STONE_HOE)
                    .add(Hoes.JUNGLE_IRON_HOE)
                    .add(Hoes.JUNGLE_GOLDEN_HOE)
                    .add(Hoes.JUNGLE_DIAMOND_HOE)
                    .add(Hoes.JUNGLE_NETHERITE_HOE)
                    .add(Hoes.MANGROVE_WOODEN_HOE)
                    .add(Hoes.MANGROVE_STONE_HOE)
                    .add(Hoes.MANGROVE_IRON_HOE)
                    .add(Hoes.MANGROVE_GOLDEN_HOE)
                    .add(Hoes.MANGROVE_DIAMOND_HOE)
                    .add(Hoes.MANGROVE_NETHERITE_HOE)
                    .add(Hoes.OAK_WOODEN_HOE)
                    .add(Hoes.OAK_STONE_HOE)
                    .add(Hoes.OAK_IRON_HOE)
                    .add(Hoes.OAK_GOLDEN_HOE)
                    .add(Hoes.OAK_DIAMOND_HOE)
                    .add(Hoes.OAK_NETHERITE_HOE)
                    .add(Hoes.SPRUCE_WOODEN_HOE)
                    .add(Hoes.SPRUCE_STONE_HOE)
                    .add(Hoes.SPRUCE_IRON_HOE)
                    .add(Hoes.SPRUCE_GOLDEN_HOE)
                    .add(Hoes.SPRUCE_DIAMOND_HOE)
                    .add(Hoes.SPRUCE_NETHERITE_HOE)
                    .add(Hoes.WARPED_WOODEN_HOE)
                    .add(Hoes.WARPED_STONE_HOE)
                    .add(Hoes.WARPED_IRON_HOE)
                    .add(Hoes.WARPED_GOLDEN_HOE)
                    .add(Hoes.WARPED_DIAMOND_HOE)
                    .add(Hoes.WARPED_NETHERITE_HOE);
            
            getOrCreateTagBuilder(GRINDSTONES)
                    .add(Grindstones.ACACIA_GRINDSTONE.asItem())
                    .add(Grindstones.BIRCH_GRINDSTONE.asItem())
                    .add(Grindstones.CRIMSON_GRINDSTONE.asItem())
                    .add(Grindstones.DARK_OAK_GRINDSTONE.asItem())
                    .add(Grindstones.JUNGLE_GRINDSTONE.asItem())
                    .add(Grindstones.MANGROVE_GRINDSTONE.asItem())
                    .add(Grindstones.OAK_GRINDSTONE.asItem())
                    .add(Grindstones.SPRUCE_GRINDSTONE.asItem())
                    .add(Grindstones.WARPED_GRINDSTONE.asItem());

            getOrCreateTagBuilder(LADDERS)
                    .add(Ladders.ACACIA_LADDER.asItem())
                    .add(Ladders.BIRCH_LADDER.asItem())
                    .add(Ladders.CRIMSON_LADDER.asItem())
                    .add(Ladders.DARK_OAK_LADDER.asItem())
                    .add(Ladders.JUNGLE_LADDER.asItem())
                    .add(Ladders.MANGROVE_LADDER.asItem())
                    .add(Ladders.OAK_LADDER.asItem())
                    .add(Ladders.SPRUCE_LADDER.asItem())
                    .add(Ladders.WARPED_LADDER.asItem());

            getOrCreateTagBuilder(LEVERS)
                    .add(Levers.ACACIA_LEVER.asItem())
                    .add(Levers.BIRCH_LEVER.asItem())
                    .add(Levers.CRIMSON_LEVER.asItem())
                    .add(Levers.DARK_OAK_LEVER.asItem())
                    .add(Levers.JUNGLE_LEVER.asItem())
                    .add(Levers.MANGROVE_LEVER.asItem())
                    .add(Levers.OAK_LEVER.asItem())
                    .add(Levers.SPRUCE_LEVER.asItem())
                    .add(Levers.WARPED_LEVER.asItem());

            getOrCreateTagBuilder(PICKAXES)
                    .add(Pickaxes.ACACIA_WOODEN_PICKAXE)
                    .add(Pickaxes.ACACIA_STONE_PICKAXE)
                    .add(Pickaxes.ACACIA_IRON_PICKAXE)
                    .add(Pickaxes.ACACIA_GOLDEN_PICKAXE)
                    .add(Pickaxes.ACACIA_DIAMOND_PICKAXE)
                    .add(Pickaxes.ACACIA_NETHERITE_PICKAXE)
                    .add(Pickaxes.BIRCH_WOODEN_PICKAXE)
                    .add(Pickaxes.BIRCH_STONE_PICKAXE)
                    .add(Pickaxes.BIRCH_IRON_PICKAXE)
                    .add(Pickaxes.BIRCH_GOLDEN_PICKAXE)
                    .add(Pickaxes.BIRCH_DIAMOND_PICKAXE)
                    .add(Pickaxes.BIRCH_NETHERITE_PICKAXE)
                    .add(Pickaxes.CRIMSON_WOODEN_PICKAXE)
                    .add(Pickaxes.CRIMSON_STONE_PICKAXE)
                    .add(Pickaxes.CRIMSON_IRON_PICKAXE)
                    .add(Pickaxes.CRIMSON_GOLDEN_PICKAXE)
                    .add(Pickaxes.CRIMSON_DIAMOND_PICKAXE)
                    .add(Pickaxes.CRIMSON_NETHERITE_PICKAXE)
                    .add(Pickaxes.DARK_OAK_WOODEN_PICKAXE)
                    .add(Pickaxes.DARK_OAK_STONE_PICKAXE)
                    .add(Pickaxes.DARK_OAK_IRON_PICKAXE)
                    .add(Pickaxes.DARK_OAK_GOLDEN_PICKAXE)
                    .add(Pickaxes.DARK_OAK_DIAMOND_PICKAXE)
                    .add(Pickaxes.DARK_OAK_NETHERITE_PICKAXE)
                    .add(Pickaxes.JUNGLE_WOODEN_PICKAXE)
                    .add(Pickaxes.JUNGLE_STONE_PICKAXE)
                    .add(Pickaxes.JUNGLE_IRON_PICKAXE)
                    .add(Pickaxes.JUNGLE_GOLDEN_PICKAXE)
                    .add(Pickaxes.JUNGLE_DIAMOND_PICKAXE)
                    .add(Pickaxes.JUNGLE_NETHERITE_PICKAXE)
                    .add(Pickaxes.MANGROVE_WOODEN_PICKAXE)
                    .add(Pickaxes.MANGROVE_STONE_PICKAXE)
                    .add(Pickaxes.MANGROVE_IRON_PICKAXE)
                    .add(Pickaxes.MANGROVE_GOLDEN_PICKAXE)
                    .add(Pickaxes.MANGROVE_DIAMOND_PICKAXE)
                    .add(Pickaxes.MANGROVE_NETHERITE_PICKAXE)
                    .add(Pickaxes.OAK_WOODEN_PICKAXE)
                    .add(Pickaxes.OAK_STONE_PICKAXE)
                    .add(Pickaxes.OAK_IRON_PICKAXE)
                    .add(Pickaxes.OAK_GOLDEN_PICKAXE)
                    .add(Pickaxes.OAK_DIAMOND_PICKAXE)
                    .add(Pickaxes.OAK_NETHERITE_PICKAXE)
                    .add(Pickaxes.SPRUCE_WOODEN_PICKAXE)
                    .add(Pickaxes.SPRUCE_STONE_PICKAXE)
                    .add(Pickaxes.SPRUCE_IRON_PICKAXE)
                    .add(Pickaxes.SPRUCE_GOLDEN_PICKAXE)
                    .add(Pickaxes.SPRUCE_DIAMOND_PICKAXE)
                    .add(Pickaxes.SPRUCE_NETHERITE_PICKAXE)
                    .add(Pickaxes.WARPED_WOODEN_PICKAXE)
                    .add(Pickaxes.WARPED_STONE_PICKAXE)
                    .add(Pickaxes.WARPED_IRON_PICKAXE)
                    .add(Pickaxes.WARPED_GOLDEN_PICKAXE)
                    .add(Pickaxes.WARPED_DIAMOND_PICKAXE)
                    .add(Pickaxes.WARPED_NETHERITE_PICKAXE);

            getOrCreateTagBuilder(POWERED_RAILS)
                    .add(Rails.ACACIA_POWERED_RAIL.asItem())
                    .add(Rails.BIRCH_POWERED_RAIL.asItem())
                    .add(Rails.CRIMSON_POWERED_RAIL.asItem())
                    .add(Rails.DARK_OAK_POWERED_RAIL.asItem())
                    .add(Rails.JUNGLE_POWERED_RAIL.asItem())
                    .add(Rails.MANGROVE_POWERED_RAIL.asItem())
                    .add(Rails.OAK_POWERED_RAIL.asItem())
                    .add(Rails.SPRUCE_POWERED_RAIL.asItem())
                    .add(Rails.WARPED_POWERED_RAIL.asItem());

            getOrCreateTagBuilder(RAILS)
                    .add(Rails.ACACIA_RAIL.asItem())
                    .add(Rails.BIRCH_RAIL.asItem())
                    .add(Rails.CRIMSON_RAIL.asItem())
                    .add(Rails.DARK_OAK_RAIL.asItem())
                    .add(Rails.JUNGLE_RAIL.asItem())
                    .add(Rails.MANGROVE_RAIL.asItem())
                    .add(Rails.OAK_RAIL.asItem())
                    .add(Rails.SPRUCE_RAIL.asItem())
                    .add(Rails.WARPED_RAIL.asItem());

            getOrCreateTagBuilder(REDSTONE_TORCHES)
                    .add(RedstoneTorches.ACACIA_REDSTONE_TORCH.asItem())
                    .add(RedstoneTorches.BIRCH_REDSTONE_TORCH.asItem())
                    .add(RedstoneTorches.CRIMSON_REDSTONE_TORCH.asItem())
                    .add(RedstoneTorches.DARK_OAK_REDSTONE_TORCH.asItem())
                    .add(RedstoneTorches.JUNGLE_REDSTONE_TORCH.asItem())
                    .add(RedstoneTorches.MANGROVE_REDSTONE_TORCH.asItem())
                    .add(RedstoneTorches.OAK_REDSTONE_TORCH.asItem())
                    .add(RedstoneTorches.SPRUCE_REDSTONE_TORCH.asItem())
                    .add(RedstoneTorches.WARPED_REDSTONE_TORCH.asItem());

            getOrCreateTagBuilder(SHOVELS)
                    .add(Shovels.ACACIA_WOODEN_SHOVEL)
                    .add(Shovels.ACACIA_STONE_SHOVEL)
                    .add(Shovels.ACACIA_IRON_SHOVEL)
                    .add(Shovels.ACACIA_GOLDEN_SHOVEL)
                    .add(Shovels.ACACIA_DIAMOND_SHOVEL)
                    .add(Shovels.ACACIA_NETHERITE_SHOVEL)
                    .add(Shovels.BIRCH_WOODEN_SHOVEL)
                    .add(Shovels.BIRCH_STONE_SHOVEL)
                    .add(Shovels.BIRCH_IRON_SHOVEL)
                    .add(Shovels.BIRCH_GOLDEN_SHOVEL)
                    .add(Shovels.BIRCH_DIAMOND_SHOVEL)
                    .add(Shovels.BIRCH_NETHERITE_SHOVEL)
                    .add(Shovels.CRIMSON_WOODEN_SHOVEL)
                    .add(Shovels.CRIMSON_STONE_SHOVEL)
                    .add(Shovels.CRIMSON_IRON_SHOVEL)
                    .add(Shovels.CRIMSON_GOLDEN_SHOVEL)
                    .add(Shovels.CRIMSON_DIAMOND_SHOVEL)
                    .add(Shovels.CRIMSON_NETHERITE_SHOVEL)
                    .add(Shovels.DARK_OAK_WOODEN_SHOVEL)
                    .add(Shovels.DARK_OAK_STONE_SHOVEL)
                    .add(Shovels.DARK_OAK_IRON_SHOVEL)
                    .add(Shovels.DARK_OAK_GOLDEN_SHOVEL)
                    .add(Shovels.DARK_OAK_DIAMOND_SHOVEL)
                    .add(Shovels.DARK_OAK_NETHERITE_SHOVEL)
                    .add(Shovels.JUNGLE_WOODEN_SHOVEL)
                    .add(Shovels.JUNGLE_STONE_SHOVEL)
                    .add(Shovels.JUNGLE_IRON_SHOVEL)
                    .add(Shovels.JUNGLE_GOLDEN_SHOVEL)
                    .add(Shovels.JUNGLE_DIAMOND_SHOVEL)
                    .add(Shovels.JUNGLE_NETHERITE_SHOVEL)
                    .add(Shovels.MANGROVE_WOODEN_SHOVEL)
                    .add(Shovels.MANGROVE_STONE_SHOVEL)
                    .add(Shovels.MANGROVE_IRON_SHOVEL)
                    .add(Shovels.MANGROVE_GOLDEN_SHOVEL)
                    .add(Shovels.MANGROVE_DIAMOND_SHOVEL)
                    .add(Shovels.MANGROVE_NETHERITE_SHOVEL)
                    .add(Shovels.OAK_WOODEN_SHOVEL)
                    .add(Shovels.OAK_STONE_SHOVEL)
                    .add(Shovels.OAK_IRON_SHOVEL)
                    .add(Shovels.OAK_GOLDEN_SHOVEL)
                    .add(Shovels.OAK_DIAMOND_SHOVEL)
                    .add(Shovels.OAK_NETHERITE_SHOVEL)
                    .add(Shovels.SPRUCE_WOODEN_SHOVEL)
                    .add(Shovels.SPRUCE_STONE_SHOVEL)
                    .add(Shovels.SPRUCE_IRON_SHOVEL)
                    .add(Shovels.SPRUCE_GOLDEN_SHOVEL)
                    .add(Shovels.SPRUCE_DIAMOND_SHOVEL)
                    .add(Shovels.SPRUCE_NETHERITE_SHOVEL)
                    .add(Shovels.WARPED_WOODEN_SHOVEL)
                    .add(Shovels.WARPED_STONE_SHOVEL)
                    .add(Shovels.WARPED_IRON_SHOVEL)
                    .add(Shovels.WARPED_GOLDEN_SHOVEL)
                    .add(Shovels.WARPED_DIAMOND_SHOVEL)
                    .add(Shovels.WARPED_NETHERITE_SHOVEL);

            getOrCreateTagBuilder(SOUL_CAMPFIRES)
                    .add(Campfires.ACACIA_SOUL_CAMPFIRE.asItem())
                    .add(Campfires.BIRCH_SOUL_CAMPFIRE.asItem())
                    .add(Campfires.CRIMSON_SOUL_CAMPFIRE.asItem())
                    .add(Campfires.DARK_OAK_SOUL_CAMPFIRE.asItem())
                    .add(Campfires.JUNGLE_SOUL_CAMPFIRE.asItem())
                    .add(Campfires.MANGROVE_SOUL_CAMPFIRE.asItem())
                    .add(Campfires.OAK_SOUL_CAMPFIRE.asItem())
                    .add(Campfires.SPRUCE_SOUL_CAMPFIRE.asItem())
                    .add(Campfires.WARPED_SOUL_CAMPFIRE.asItem());

            getOrCreateTagBuilder(SOUL_TORCHES)
                    .add(SoulTorches.ACACIA_SOUL_TORCH.asItem())
                    .add(SoulTorches.BIRCH_SOUL_TORCH.asItem())
                    .add(SoulTorches.CRIMSON_SOUL_TORCH.asItem())
                    .add(SoulTorches.DARK_OAK_SOUL_TORCH.asItem())
                    .add(SoulTorches.JUNGLE_SOUL_TORCH.asItem())
                    .add(SoulTorches.MANGROVE_SOUL_TORCH.asItem())
                    .add(SoulTorches.OAK_SOUL_TORCH.asItem())
                    .add(SoulTorches.SPRUCE_SOUL_TORCH.asItem())
                    .add(SoulTorches.WARPED_SOUL_TORCH.asItem());

            getOrCreateTagBuilder(STICKS)
                    .add(Sticks.ACACIA_STICK.asItem())
                    .add(Sticks.BIRCH_STICK.asItem())
                    .add(Sticks.CRIMSON_STICK.asItem())
                    .add(Sticks.DARK_OAK_STICK.asItem())
                    .add(Sticks.JUNGLE_STICK.asItem())
                    .add(Sticks.MANGROVE_STICK.asItem())
                    .add(Sticks.OAK_STICK.asItem())
                    .add(Sticks.SPRUCE_STICK.asItem())
                    .add(Sticks.WARPED_STICK.asItem());

            getOrCreateTagBuilder(SWORDS)
                    .add(Swords.ACACIA_WOODEN_SWORD)
                    .add(Swords.ACACIA_STONE_SWORD)
                    .add(Swords.ACACIA_IRON_SWORD)
                    .add(Swords.ACACIA_GOLDEN_SWORD)
                    .add(Swords.ACACIA_DIAMOND_SWORD)
                    .add(Swords.ACACIA_NETHERITE_SWORD)
                    .add(Swords.BIRCH_WOODEN_SWORD)
                    .add(Swords.BIRCH_STONE_SWORD)
                    .add(Swords.BIRCH_IRON_SWORD)
                    .add(Swords.BIRCH_GOLDEN_SWORD)
                    .add(Swords.BIRCH_DIAMOND_SWORD)
                    .add(Swords.BIRCH_NETHERITE_SWORD)
                    .add(Swords.CRIMSON_WOODEN_SWORD)
                    .add(Swords.CRIMSON_STONE_SWORD)
                    .add(Swords.CRIMSON_IRON_SWORD)
                    .add(Swords.CRIMSON_GOLDEN_SWORD)
                    .add(Swords.CRIMSON_DIAMOND_SWORD)
                    .add(Swords.CRIMSON_NETHERITE_SWORD)
                    .add(Swords.DARK_OAK_WOODEN_SWORD)
                    .add(Swords.DARK_OAK_STONE_SWORD)
                    .add(Swords.DARK_OAK_IRON_SWORD)
                    .add(Swords.DARK_OAK_GOLDEN_SWORD)
                    .add(Swords.DARK_OAK_DIAMOND_SWORD)
                    .add(Swords.DARK_OAK_NETHERITE_SWORD)
                    .add(Swords.JUNGLE_WOODEN_SWORD)
                    .add(Swords.JUNGLE_STONE_SWORD)
                    .add(Swords.JUNGLE_IRON_SWORD)
                    .add(Swords.JUNGLE_GOLDEN_SWORD)
                    .add(Swords.JUNGLE_DIAMOND_SWORD)
                    .add(Swords.JUNGLE_NETHERITE_SWORD)
                    .add(Swords.MANGROVE_WOODEN_SWORD)
                    .add(Swords.MANGROVE_STONE_SWORD)
                    .add(Swords.MANGROVE_IRON_SWORD)
                    .add(Swords.MANGROVE_GOLDEN_SWORD)
                    .add(Swords.MANGROVE_DIAMOND_SWORD)
                    .add(Swords.MANGROVE_NETHERITE_SWORD)
                    .add(Swords.OAK_WOODEN_SWORD)
                    .add(Swords.OAK_STONE_SWORD)
                    .add(Swords.OAK_IRON_SWORD)
                    .add(Swords.OAK_GOLDEN_SWORD)
                    .add(Swords.OAK_DIAMOND_SWORD)
                    .add(Swords.OAK_NETHERITE_SWORD)
                    .add(Swords.SPRUCE_WOODEN_SWORD)
                    .add(Swords.SPRUCE_STONE_SWORD)
                    .add(Swords.SPRUCE_IRON_SWORD)
                    .add(Swords.SPRUCE_GOLDEN_SWORD)
                    .add(Swords.SPRUCE_DIAMOND_SWORD)
                    .add(Swords.SPRUCE_NETHERITE_SWORD)
                    .add(Swords.WARPED_WOODEN_SWORD)
                    .add(Swords.WARPED_STONE_SWORD)
                    .add(Swords.WARPED_IRON_SWORD)
                    .add(Swords.WARPED_GOLDEN_SWORD)
                    .add(Swords.WARPED_DIAMOND_SWORD)
                    .add(Swords.WARPED_NETHERITE_SWORD);

            getOrCreateTagBuilder(TORCHES)
                    .add(Torches.ACACIA_TORCH.asItem())
                    .add(Torches.BIRCH_TORCH.asItem())
                    .add(Torches.CRIMSON_TORCH.asItem())
                    .add(Torches.DARK_OAK_TORCH.asItem())
                    .add(Torches.JUNGLE_TORCH.asItem())
                    .add(Torches.MANGROVE_TORCH.asItem())
                    .add(Torches.OAK_TORCH.asItem())
                    .add(Torches.SPRUCE_TORCH.asItem())
                    .add(Torches.WARPED_TORCH.asItem());

            getOrCreateTagBuilder(MC_ARROWS)
                    .addTag(ARROWS);

            getOrCreateTagBuilder(MC_AXES)
                    .addTag(AXES);

            getOrCreateTagBuilder(C_BOWS)
                    .addTag(BOWS)
                    .addTag(CROSSBOWS);

            getOrCreateTagBuilder(MC_HOES)
                    .addTag(HOES);

            getOrCreateTagBuilder(CLUSTER_MAX_HARVESTABLES)
                    .addTag(PICKAXES);
            
            getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                    .add(Ladders.CRIMSON_LADDER.asItem())
                    .add(Ladders.WARPED_LADDER.asItem());

            getOrCreateTagBuilder(MC_PICKAXES)
                    .addTag(PICKAXES);

            getOrCreateTagBuilder(PIGLIN_LOVED)
                    .add(Axes.ACACIA_GOLDEN_AXE)
                    .add(Axes.BIRCH_GOLDEN_AXE)
                    .add(Axes.CRIMSON_GOLDEN_AXE)
                    .add(Axes.DARK_OAK_GOLDEN_AXE)
                    .add(Axes.JUNGLE_GOLDEN_AXE)
                    .add(Axes.MANGROVE_GOLDEN_AXE)
                    .add(Axes.OAK_GOLDEN_AXE)
                    .add(Axes.SPRUCE_GOLDEN_AXE)
                    .add(Axes.WARPED_GOLDEN_AXE)
                    .add(Hoes.ACACIA_GOLDEN_HOE)
                    .add(Hoes.BIRCH_GOLDEN_HOE)
                    .add(Hoes.CRIMSON_GOLDEN_HOE)
                    .add(Hoes.DARK_OAK_GOLDEN_HOE)
                    .add(Hoes.JUNGLE_GOLDEN_HOE)
                    .add(Hoes.MANGROVE_GOLDEN_HOE)
                    .add(Hoes.OAK_GOLDEN_HOE)
                    .add(Hoes.SPRUCE_GOLDEN_HOE)
                    .add(Hoes.WARPED_GOLDEN_HOE)
                    .add(Pickaxes.ACACIA_GOLDEN_PICKAXE)
                    .add(Pickaxes.BIRCH_GOLDEN_PICKAXE)
                    .add(Pickaxes.CRIMSON_GOLDEN_PICKAXE)
                    .add(Pickaxes.DARK_OAK_GOLDEN_PICKAXE)
                    .add(Pickaxes.JUNGLE_GOLDEN_PICKAXE)
                    .add(Pickaxes.MANGROVE_GOLDEN_PICKAXE)
                    .add(Pickaxes.OAK_GOLDEN_PICKAXE)
                    .add(Pickaxes.SPRUCE_GOLDEN_PICKAXE)
                    .add(Pickaxes.WARPED_GOLDEN_PICKAXE)
                    .add(Shovels.ACACIA_GOLDEN_SHOVEL)
                    .add(Shovels.BIRCH_GOLDEN_SHOVEL)
                    .add(Shovels.CRIMSON_GOLDEN_SHOVEL)
                    .add(Shovels.DARK_OAK_GOLDEN_SHOVEL)
                    .add(Shovels.JUNGLE_GOLDEN_SHOVEL)
                    .add(Shovels.MANGROVE_GOLDEN_SHOVEL)
                    .add(Shovels.OAK_GOLDEN_SHOVEL)
                    .add(Shovels.SPRUCE_GOLDEN_SHOVEL)
                    .add(Shovels.WARPED_GOLDEN_SHOVEL)
                    .add(Swords.ACACIA_GOLDEN_SWORD)
                    .add(Swords.BIRCH_GOLDEN_SWORD)
                    .add(Swords.CRIMSON_GOLDEN_SWORD)
                    .add(Swords.DARK_OAK_GOLDEN_SWORD)
                    .add(Swords.JUNGLE_GOLDEN_SWORD)
                    .add(Swords.MANGROVE_GOLDEN_SWORD)
                    .add(Swords.OAK_GOLDEN_SWORD)
                    .add(Swords.SPRUCE_GOLDEN_SWORD)
                    .add(Swords.WARPED_GOLDEN_SWORD);

            getOrCreateTagBuilder(PIGLIN_REPELLENTS)
                    .addTag(SOUL_CAMPFIRES)
                    .addTag(SOUL_TORCHES);

            getOrCreateTagBuilder(MC_RAILS)
                    .addTag(ACTIVATOR_RAILS)
                    .addTag(DETECTOR_RAILS)
                    .addTag(POWERED_RAILS)
                    .addTag(RAILS);

            getOrCreateTagBuilder(MC_SHOVELS)
                    .addTag(SHOVELS);

            getOrCreateTagBuilder(MC_SWORDS)
                    .addTag(SWORDS);

            getOrCreateTagBuilder(MC_TOOLS)
                    .addTag(AXES)
                    .addTag(HOES)
                    .addTag(PICKAXES)
                    .addTag(SHOVELS)
                    .addTag(SWORDS);

            getOrCreateTagBuilder(JOB_SITE)
                    .addTag(GRINDSTONES);
        }
    }