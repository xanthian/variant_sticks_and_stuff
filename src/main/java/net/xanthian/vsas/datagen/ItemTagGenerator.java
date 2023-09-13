package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
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

    private static final TagKey<Item> ACTIVATOR_RAILS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "activator_rails"));
    private static final TagKey<Item> ARROWS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "arrows"));
    private static final TagKey<Item> AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "axes"));
    private static final TagKey<Item> BOWS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "bows"));
    private static final TagKey<Item> BRUSHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "brushes"));
    private static final TagKey<Item> CAMPFIRES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "campfires"));
    private static final TagKey<Item> CROSSBOWS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "crossbows"));
    private static final TagKey<Item> DETECTOR_RAILS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "detector_rails"));
    private static final TagKey<Item> GRINDSTONES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "grindstones"));
    private static final TagKey<Item> HOES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "hoes"));
    private static final TagKey<Item> LADDERS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "ladders"));
    private static final TagKey<Item> LEVERS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "levers"));
    private static final TagKey<Item> PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "pickaxes"));
    private static final TagKey<Item> POWERED_RAILS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "powered_rails"));
    private static final TagKey<Item> RAILS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "rails"));
    private static final TagKey<Item> REDSTONE_TORCHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "redstone_torches"));
    private static final TagKey<Item> SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "shovels"));
    private static final TagKey<Item> SOUL_CAMPFIRES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "soul_campfires"));
    private static final TagKey<Item> SOUL_TORCHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "soul_torches"));
    private static final TagKey<Item> STICKS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "sticks"));
    private static final TagKey<Item> SWORDS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "swords"));
    private static final TagKey<Item> TORCHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "torches"));

    private static final TagKey<Item> C_BOWS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:bows"));
    private static final TagKey<Item> C_JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        for (Block block : ActivatorRails.MOD_ACTIVATOR_RAILS.values()) {
            getOrCreateTagBuilder(ACTIVATOR_RAILS)
                    .add(block.asItem());
        }

        for (Item item : Arrows.MOD_ARROWS.values()) {
            getOrCreateTagBuilder(ARROWS)
                    .add(item);
        }

        for (Block block : Campfires.MOD_CAMPFIRES.values()) {
            getOrCreateTagBuilder(CAMPFIRES)
                    .add(block.asItem());
        }

        for (Block block : DetectorRails.MOD_DETECTOR_RAILS.values()) {
            getOrCreateTagBuilder(DETECTOR_RAILS)
                    .add(block.asItem());
        }

        for (Block block : Grindstones.MOD_GRINDSTONES.values()) {
            getOrCreateTagBuilder(GRINDSTONES)
                    .add(block.asItem());
        }

        for (Block block : Ladders.MOD_LADDERS.values()) {
            getOrCreateTagBuilder(LADDERS)
                    .add(block.asItem());
        }

        for (Block block : PoweredRails.MOD_POWERED_RAILS.values()) {
            getOrCreateTagBuilder(POWERED_RAILS)
                    .add(block.asItem());
        }

        for (Block block : Rails.MOD_RAILS.values()) {
            getOrCreateTagBuilder(RAILS)
                    .add(block.asItem());
        }

        for (Block block : RedstoneTorches.MOD_REDSTONE_TORCHES.values()) {
            getOrCreateTagBuilder(REDSTONE_TORCHES)
                    .add(block.asItem());
        }

        for (Block block : SoulCampfires.MOD_SOUL_CAMPFIRES.values()) {
            getOrCreateTagBuilder(SOUL_CAMPFIRES)
                    .add(block.asItem());
        }

        for (Block block : SoulTorches.MOD_SOUL_TORCHES.values()) {
            getOrCreateTagBuilder(SOUL_TORCHES)
                    .add(block.asItem());
        }

        for (Block block : Torches.MOD_TORCHES.values()) {
            getOrCreateTagBuilder(TORCHES)
                    .add(block.asItem());
        }

        for (Item item : Axes.MOD_AXES.values()) {
            getOrCreateTagBuilder(AXES)
                    .add(item);
        }

        for (Item item : Bows.MOD_BOWS.values()) {
            getOrCreateTagBuilder(BOWS)
                    .add(item);
        }

        for (Item item : Brushes.MOD_BRUSHES.values()) {
            getOrCreateTagBuilder(BRUSHES)
                    .add(item);
        }

        for (Item item : Crossbows.MOD_CROSSBOWS.values()) {
            getOrCreateTagBuilder(CROSSBOWS)
                    .add(item);
        }

        for (Item item : Hoes.MOD_HOES.values()) {
            getOrCreateTagBuilder(HOES)
                    .add(item);
        }

        for (Block block : Levers.MOD_LEVERS.values()) {
            getOrCreateTagBuilder(LEVERS)
                    .add(block.asItem());
        }

        for (Item item : Pickaxes.MOD_PICKAXES.values()) {
            getOrCreateTagBuilder(PICKAXES)
                    .add(item);
        }

        for (Item item : Shovels.MOD_SHOVELS.values()) {
            getOrCreateTagBuilder(SHOVELS)
                    .add(item);
        }

        for (Item item : Sticks.MOD_STICKS.values()) {
            getOrCreateTagBuilder(STICKS)
                    .add(item);
        }

        for (Item item : Swords.MOD_SWORDS.values()) {
            getOrCreateTagBuilder(SWORDS)
                    .add(item);
        }

        getOrCreateTagBuilder(ItemTags.ARROWS)
                .addTag(ARROWS);

        getOrCreateTagBuilder(ItemTags.AXES)
                .addTag(AXES);

        getOrCreateTagBuilder(C_BOWS)
                .addTag(BOWS)
                .addTag(CROSSBOWS);

        getOrCreateTagBuilder(ItemTags.HOES)
                .addTag(HOES);

        getOrCreateTagBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES)
                .addTag(PICKAXES);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(Ladders.CRIMSON_LADDER.asItem())
                .add(Ladders.WARPED_LADDER.asItem());

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .addTag(PICKAXES);

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(Axes.ACACIA_GOLDEN_AXE)
                .add(Axes.BIRCH_GOLDEN_AXE)
                .add(Axes.CHERRY_GOLDEN_AXE)
                .add(Axes.CRIMSON_GOLDEN_AXE)
                .add(Axes.DARK_OAK_GOLDEN_AXE)
                .add(Axes.JUNGLE_GOLDEN_AXE)
                .add(Axes.MANGROVE_GOLDEN_AXE)
                .add(Axes.SPRUCE_GOLDEN_AXE)
                .add(Axes.WARPED_GOLDEN_AXE)
                .add(Hoes.ACACIA_GOLDEN_HOE)
                .add(Hoes.BIRCH_GOLDEN_HOE)
                .add(Hoes.CHERRY_GOLDEN_HOE)
                .add(Hoes.CRIMSON_GOLDEN_HOE)
                .add(Hoes.DARK_OAK_GOLDEN_HOE)
                .add(Hoes.JUNGLE_GOLDEN_HOE)
                .add(Hoes.MANGROVE_GOLDEN_HOE)
                .add(Hoes.SPRUCE_GOLDEN_HOE)
                .add(Hoes.WARPED_GOLDEN_HOE)
                .add(Pickaxes.ACACIA_GOLDEN_PICKAXE)
                .add(Pickaxes.BIRCH_GOLDEN_PICKAXE)
                .add(Pickaxes.CHERRY_GOLDEN_PICKAXE)
                .add(Pickaxes.CRIMSON_GOLDEN_PICKAXE)
                .add(Pickaxes.DARK_OAK_GOLDEN_PICKAXE)
                .add(Pickaxes.JUNGLE_GOLDEN_PICKAXE)
                .add(Pickaxes.SPRUCE_GOLDEN_PICKAXE)
                .add(Pickaxes.WARPED_GOLDEN_PICKAXE)
                .add(Shovels.ACACIA_GOLDEN_SHOVEL)
                .add(Shovels.BIRCH_GOLDEN_SHOVEL)
                .add(Shovels.CHERRY_GOLDEN_SHOVEL)
                .add(Shovels.CRIMSON_GOLDEN_SHOVEL)
                .add(Shovels.DARK_OAK_GOLDEN_SHOVEL)
                .add(Shovels.JUNGLE_GOLDEN_SHOVEL)
                .add(Shovels.MANGROVE_GOLDEN_SHOVEL)
                .add(Shovels.SPRUCE_GOLDEN_SHOVEL)
                .add(Shovels.WARPED_GOLDEN_SHOVEL)
                .add(Swords.ACACIA_GOLDEN_SWORD)
                .add(Swords.BIRCH_GOLDEN_SWORD)
                .add(Swords.CHERRY_GOLDEN_SWORD)
                .add(Swords.CRIMSON_GOLDEN_SWORD)
                .add(Swords.DARK_OAK_GOLDEN_SWORD)
                .add(Swords.JUNGLE_GOLDEN_SWORD)
                .add(Swords.MANGROVE_GOLDEN_SWORD)
                .add(Swords.SPRUCE_GOLDEN_SWORD)
                .add(Swords.WARPED_GOLDEN_SWORD);

        getOrCreateTagBuilder(ItemTags.PIGLIN_REPELLENTS)
                .addTag(SOUL_CAMPFIRES)
                .addTag(SOUL_TORCHES);

        getOrCreateTagBuilder(ItemTags.RAILS)
                .addTag(ACTIVATOR_RAILS)
                .addTag(DETECTOR_RAILS)
                .addTag(POWERED_RAILS)
                .addTag(RAILS);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .addTag(SHOVELS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .addTag(SWORDS);

        getOrCreateTagBuilder(ItemTags.TOOLS)
                .addTag(AXES)
                .addTag(HOES)
                .addTag(PICKAXES)
                .addTag(SHOVELS)
                .addTag(SWORDS);

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(GRINDSTONES);
    }
}