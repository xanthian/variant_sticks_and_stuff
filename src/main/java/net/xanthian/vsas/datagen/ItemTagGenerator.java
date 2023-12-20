package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.items.*;
import net.xanthian.vsas.util.ModItemTags;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.vsas.Initialise.MOD_ID;

public class ItemTagGenerator extends FabricTagProvider.ItemTagProvider {

    private static final TagKey<Item> ARROWS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "arrows"));
    private static final TagKey<Item> WOODEN_AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "wooden_axes"));
    private static final TagKey<Item> STONE_AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "stone_axes"));
    private static final TagKey<Item> IRON_AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "iron_axes"));
    private static final TagKey<Item> GOLDEN_AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "golden_axes"));
    private static final TagKey<Item> DIAMOND_AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "diamond_axes"));
    private static final TagKey<Item> NETHERITE_AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "netherite_axes"));
    private static final TagKey<Item> BRUSHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "brushes"));
    private static final TagKey<Item> CAMPFIRES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "campfires"));
    private static final TagKey<Item> GRINDSTONES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "grindstones"));
    private static final TagKey<Item> NETHERITE_HOES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "netherite_hoes"));
    private static final TagKey<Item> LADDERS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "ladders"));
    private static final TagKey<Item> LEVERS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "levers"));
    private static final TagKey<Item> WOODEN_PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "wooden_pickaxes"));
    private static final TagKey<Item> STONE_PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "stone_pickaxes"));
    private static final TagKey<Item> IRON_PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "iron_pickaxes"));
    private static final TagKey<Item> GOLDEN_PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "golden_pickaxes"));
    private static final TagKey<Item> DIAMOND_PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "diamond_pickaxes"));
    private static final TagKey<Item> NETHERITE_PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "netherite_pickaxes"));
    private static final TagKey<Item> REDSTONE_TORCHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "redstone_torches"));
    private static final TagKey<Item> WOODEN_SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "wooden_shovels"));
    private static final TagKey<Item> STONE_SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "stone_shovels"));
    private static final TagKey<Item> IRON_SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "iron_shovels"));
    private static final TagKey<Item> GOLDEN_SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "golden_shovels"));
    private static final TagKey<Item> DIAMOND_SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "diamond_shovels"));
    private static final TagKey<Item> NETHERITE_SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "netherite_shovels"));
    private static final TagKey<Item> SOUL_CAMPFIRES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "soul_campfires"));
    private static final TagKey<Item> SOUL_TORCHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "soul_torches"));
    private static final TagKey<Item> STONE_SWORDS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "stone_swords"));
    private static final TagKey<Item> NETHERITE_SWORDS = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "netherite_swords"));
    private static final TagKey<Item> TORCHES = TagKey.of(Registries.ITEM.getKey(), new Identifier(MOD_ID, "torches"));

    private static final TagKey<Item> ARCHER_AFHA = TagKey.of(Registries.ITEM.getKey(), new Identifier("archers", "auto_fire_hook_attachables"));
    private static final TagKey<Item> DNDO_ELF_SWORDS = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "elf_melee_weapons"));
    private static final TagKey<Item> DNDO_DROW_SWORDS = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "drow_melee_weapons"));
    private static final TagKey<Item> DNDO_ELF_RANGED = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "elf_ranged_weapons"));
    private static final TagKey<Item> DNDO_DROW_RANGED = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "drow_ranged_weapons"));
    private static final TagKey<Item> DNDO_DWARF_COMBAT = TagKey.of(Registries.ITEM.getKey(), new Identifier("digs_dnd_origins", "dwarven_combat_training_weapons"));
    private static final TagKey<Item> EXO_GOLDEN_TOOLS = TagKey.of(Registries.ITEM.getKey(), new Identifier("extraorigins", "golden_tools"));
    private static final TagKey<Item> EXO_NETHERITE_TOOLS = TagKey.of(Registries.ITEM.getKey(), new Identifier("extraorigins", "netherite_tools"));
    private static final TagKey<Item> ORIGINS_RANGED = TagKey.of(Registries.ITEM.getKey(), new Identifier("origins:ranged_weapons"));
    private static final TagKey<Item> RCH_MID = TagKey.of(Registries.ITEM.getKey(), new Identifier("rightclickharvest:mid_tier_hoes"));

    private static final TagKey<Item> FABRIC_SWORDS = TagKey.of(Registries.ITEM.getKey(), new Identifier("fabric:swords"));

    private static final TagKey<Item> C_AXES = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:tools/axes"));
    private static final TagKey<Item> C_BOWS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:bows"));
    private static final TagKey<Item> C_JOB_SITE = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:villager_job_sites"));
    private static final TagKey<Item> C_PICKAXES = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:tools/pickaxes"));
    private static final TagKey<Item> C_SHOVELS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:tools/shovels"));
    private static final TagKey<Item> C_TOOLS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:tools"));
    private static final TagKey<Item> C_WOOD_STICKS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:wood_sticks"));
    private static final TagKey<Item> C_WOODEN_RODS = TagKey.of(Registries.ITEM.getKey(), new Identifier("c:wooden_rods"));

    public ItemTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        for (Block block : ActivatorRails.MOD_ACTIVATOR_RAILS.values()) {
            getOrCreateTagBuilder(ItemTags.RAILS)
                    .add(block.asItem());
        }

        for (Block block : Campfires.MOD_CAMPFIRES.values()) {
            getOrCreateTagBuilder(CAMPFIRES)
                    .add(block.asItem());
        }

        for (Block block : DetectorRails.MOD_DETECTOR_RAILS.values()) {
            getOrCreateTagBuilder(ItemTags.RAILS)
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
            getOrCreateTagBuilder(ItemTags.RAILS)
                    .add(block.asItem());
        }

        for (Block block : Rails.MOD_RAILS.values()) {
            getOrCreateTagBuilder(ItemTags.RAILS)
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

        for (Item item : Arrows.MOD_ARROWS.values()) {
            getOrCreateTagBuilder(ItemTags.ARROWS)
                    .add(item);
            getOrCreateTagBuilder(ARROWS)
                    .add(item);
        }

        for (Item item : Axes.MOD_AXES.values()) {
            getOrCreateTagBuilder(C_AXES)
                    .add(item);
            getOrCreateTagBuilder(C_TOOLS)
                    .add(item);
            getOrCreateTagBuilder(DNDO_DWARF_COMBAT)
                    .add(item);
            getOrCreateTagBuilder(ItemTags.AXES)
                    .add(item);
            getOrCreateTagBuilder(ItemTags.TOOLS)
                    .add(item);
        }

        for (Item item : Bows.MOD_BOWS.values()) {
            getOrCreateTagBuilder(C_BOWS)
                    .add(item);
            getOrCreateTagBuilder(ARCHER_AFHA)
                    .add(item);
            getOrCreateTagBuilder(DNDO_ELF_RANGED)
                    .add(item);
            getOrCreateTagBuilder(ORIGINS_RANGED)
                    .add(item);
        }

        for (Item item : Brushes.MOD_BRUSHES.values()) {
            getOrCreateTagBuilder(BRUSHES)
                    .add(item);
        }

        for (Item item : Crossbows.MOD_CROSSBOWS.values()) {
            getOrCreateTagBuilder(ORIGINS_RANGED)
                    .add(item);
            getOrCreateTagBuilder(DNDO_DROW_RANGED)
                    .add(item);
            getOrCreateTagBuilder(C_BOWS)
                    .add(item);
            getOrCreateTagBuilder(ARCHER_AFHA)
                    .add(item);
        }

        for (Item item : Hoes.MOD_HOES.values()) {
            getOrCreateTagBuilder(ItemTags.HOES)
                    .add(item);
            getOrCreateTagBuilder(ItemTags.TOOLS)
                    .add(item);
        }

        for (Block block : Levers.MOD_LEVERS.values()) {
            getOrCreateTagBuilder(LEVERS)
                    .add(block.asItem());
        }

        for (Item item : Pickaxes.MOD_PICKAXES.values()) {
            getOrCreateTagBuilder(C_PICKAXES)
                    .add(item);
            getOrCreateTagBuilder(C_TOOLS)
                    .add(item);
            getOrCreateTagBuilder(ItemTags.PICKAXES)
                    .add(item);
            getOrCreateTagBuilder(ItemTags.CLUSTER_MAX_HARVESTABLES)
                    .add(item);
            getOrCreateTagBuilder(ItemTags.TOOLS)
                    .add(item);
        }

        for (Item item : Shovels.MOD_SHOVELS.values()) {
            getOrCreateTagBuilder(C_SHOVELS)
                    .add(item);
            getOrCreateTagBuilder(C_TOOLS)
                    .add(item);
            getOrCreateTagBuilder(ItemTags.TOOLS)
                    .add(item);
            getOrCreateTagBuilder(ItemTags.SHOVELS)
                    .add(item);
        }

        for (Item item : Sticks.MOD_STICKS.values()) {
            getOrCreateTagBuilder(ModItemTags.STICKS)
                    .add(item);
            getOrCreateTagBuilder(C_WOOD_STICKS)
                    .add(item);
            getOrCreateTagBuilder(C_WOODEN_RODS)
                    .add(item);
        }
        getOrCreateTagBuilder(C_WOOD_STICKS)
                .add(Items.STICK);
        getOrCreateTagBuilder(C_WOODEN_RODS)
                .add(Items.STICK);

        for (Item item : Swords.MOD_SWORDS.values()) {
            getOrCreateTagBuilder(ItemTags.TOOLS)
                    .add(item);
            getOrCreateTagBuilder(ItemTags.SWORDS)
                    .add(item);
            getOrCreateTagBuilder(DNDO_ELF_SWORDS)
                    .add(item);
            getOrCreateTagBuilder(DNDO_DROW_SWORDS)
                    .add(item);
            getOrCreateTagBuilder(FABRIC_SWORDS)
                    .add(item);
        }

        getOrCreateTagBuilder(STONE_SWORDS)
                .add(Swords.ACACIA_STONE_SWORD)
                .add(Swords.BAMBOO_STONE_SWORD)
                .add(Swords.BIRCH_STONE_SWORD)
                .add(Swords.CHERRY_STONE_SWORD)
                .add(Swords.CRIMSON_STONE_SWORD)
                .add(Swords.DARK_OAK_STONE_SWORD)
                .add(Swords.JUNGLE_STONE_SWORD)
                .add(Swords.MANGROVE_STONE_SWORD)
                .add(Swords.SPRUCE_STONE_SWORD)
                .add(Swords.WARPED_STONE_SWORD);

        getOrCreateTagBuilder(NETHERITE_SWORDS)
                .add(Swords.ACACIA_NETHERITE_SWORD)
                .add(Swords.BAMBOO_NETHERITE_SWORD)
                .add(Swords.BIRCH_NETHERITE_SWORD)
                .add(Swords.CHERRY_NETHERITE_SWORD)
                .add(Swords.CRIMSON_NETHERITE_SWORD)
                .add(Swords.DARK_OAK_NETHERITE_SWORD)
                .add(Swords.JUNGLE_NETHERITE_SWORD)
                .add(Swords.MANGROVE_NETHERITE_SWORD)
                .add(Swords.SPRUCE_NETHERITE_SWORD)
                .add(Swords.WARPED_NETHERITE_SWORD);

        getOrCreateTagBuilder(NETHERITE_HOES)
                .add(Hoes.ACACIA_NETHERITE_HOE)
                .add(Hoes.BAMBOO_NETHERITE_HOE)
                .add(Hoes.BIRCH_NETHERITE_HOE)
                .add(Hoes.CHERRY_NETHERITE_HOE)
                .add(Hoes.CRIMSON_NETHERITE_HOE)
                .add(Hoes.DARK_OAK_NETHERITE_HOE)
                .add(Hoes.JUNGLE_NETHERITE_HOE)
                .add(Hoes.MANGROVE_NETHERITE_HOE)
                .add(Hoes.SPRUCE_NETHERITE_HOE)
                .add(Hoes.WARPED_NETHERITE_HOE);

        getOrCreateTagBuilder(WOODEN_PICKAXES)
                .add(Pickaxes.ACACIA_WOODEN_PICKAXE)
                .add(Pickaxes.BAMBOO_WOODEN_PICKAXE)
                .add(Pickaxes.BIRCH_WOODEN_PICKAXE)
                .add(Pickaxes.CHERRY_WOODEN_PICKAXE)
                .add(Pickaxes.CRIMSON_WOODEN_PICKAXE)
                .add(Pickaxes.DARK_OAK_WOODEN_PICKAXE)
                .add(Pickaxes.JUNGLE_WOODEN_PICKAXE)
                .add(Pickaxes.MANGROVE_WOODEN_PICKAXE)
                .add(Pickaxes.SPRUCE_WOODEN_PICKAXE)
                .add(Pickaxes.WARPED_WOODEN_PICKAXE);

        getOrCreateTagBuilder(STONE_PICKAXES)
                .add(Pickaxes.ACACIA_STONE_PICKAXE)
                .add(Pickaxes.BAMBOO_STONE_PICKAXE)
                .add(Pickaxes.BIRCH_STONE_PICKAXE)
                .add(Pickaxes.CHERRY_STONE_PICKAXE)
                .add(Pickaxes.CRIMSON_STONE_PICKAXE)
                .add(Pickaxes.DARK_OAK_STONE_PICKAXE)
                .add(Pickaxes.JUNGLE_STONE_PICKAXE)
                .add(Pickaxes.MANGROVE_STONE_PICKAXE)
                .add(Pickaxes.SPRUCE_STONE_PICKAXE)
                .add(Pickaxes.WARPED_STONE_PICKAXE);

        getOrCreateTagBuilder(IRON_PICKAXES)
                .add(Pickaxes.ACACIA_IRON_PICKAXE)
                .add(Pickaxes.BAMBOO_IRON_PICKAXE)
                .add(Pickaxes.BIRCH_IRON_PICKAXE)
                .add(Pickaxes.CHERRY_IRON_PICKAXE)
                .add(Pickaxes.CRIMSON_IRON_PICKAXE)
                .add(Pickaxes.DARK_OAK_IRON_PICKAXE)
                .add(Pickaxes.JUNGLE_IRON_PICKAXE)
                .add(Pickaxes.MANGROVE_IRON_PICKAXE)
                .add(Pickaxes.SPRUCE_IRON_PICKAXE)
                .add(Pickaxes.WARPED_IRON_PICKAXE);

        getOrCreateTagBuilder(GOLDEN_PICKAXES)
                .add(Pickaxes.ACACIA_GOLDEN_PICKAXE)
                .add(Pickaxes.BAMBOO_GOLDEN_PICKAXE)
                .add(Pickaxes.BIRCH_GOLDEN_PICKAXE)
                .add(Pickaxes.CHERRY_GOLDEN_PICKAXE)
                .add(Pickaxes.CRIMSON_GOLDEN_PICKAXE)
                .add(Pickaxes.DARK_OAK_GOLDEN_PICKAXE)
                .add(Pickaxes.JUNGLE_GOLDEN_PICKAXE)
                .add(Pickaxes.MANGROVE_GOLDEN_PICKAXE)
                .add(Pickaxes.SPRUCE_GOLDEN_PICKAXE)
                .add(Pickaxes.WARPED_GOLDEN_PICKAXE);

        getOrCreateTagBuilder(DIAMOND_PICKAXES)
                .add(Pickaxes.ACACIA_DIAMOND_PICKAXE)
                .add(Pickaxes.BAMBOO_DIAMOND_PICKAXE)
                .add(Pickaxes.BIRCH_DIAMOND_PICKAXE)
                .add(Pickaxes.CHERRY_DIAMOND_PICKAXE)
                .add(Pickaxes.CRIMSON_DIAMOND_PICKAXE)
                .add(Pickaxes.DARK_OAK_DIAMOND_PICKAXE)
                .add(Pickaxes.JUNGLE_DIAMOND_PICKAXE)
                .add(Pickaxes.MANGROVE_DIAMOND_PICKAXE)
                .add(Pickaxes.SPRUCE_DIAMOND_PICKAXE)
                .add(Pickaxes.WARPED_DIAMOND_PICKAXE);

        getOrCreateTagBuilder(NETHERITE_PICKAXES)
                .add(Pickaxes.ACACIA_NETHERITE_PICKAXE)
                .add(Pickaxes.BAMBOO_NETHERITE_PICKAXE)
                .add(Pickaxes.BIRCH_NETHERITE_PICKAXE)
                .add(Pickaxes.CHERRY_NETHERITE_PICKAXE)
                .add(Pickaxes.CRIMSON_NETHERITE_PICKAXE)
                .add(Pickaxes.DARK_OAK_NETHERITE_PICKAXE)
                .add(Pickaxes.JUNGLE_NETHERITE_PICKAXE)
                .add(Pickaxes.MANGROVE_NETHERITE_PICKAXE)
                .add(Pickaxes.SPRUCE_NETHERITE_PICKAXE)
                .add(Pickaxes.WARPED_NETHERITE_PICKAXE);

        getOrCreateTagBuilder(WOODEN_AXES)
                .add(Axes.ACACIA_WOODEN_AXE)
                .add(Axes.BAMBOO_WOODEN_AXE)
                .add(Axes.BIRCH_WOODEN_AXE)
                .add(Axes.CHERRY_WOODEN_AXE)
                .add(Axes.CRIMSON_WOODEN_AXE)
                .add(Axes.DARK_OAK_WOODEN_AXE)
                .add(Axes.JUNGLE_WOODEN_AXE)
                .add(Axes.MANGROVE_WOODEN_AXE)
                .add(Axes.SPRUCE_WOODEN_AXE)
                .add(Axes.WARPED_WOODEN_AXE);

        getOrCreateTagBuilder(STONE_AXES)
                .add(Axes.ACACIA_STONE_AXE)
                .add(Axes.BAMBOO_STONE_AXE)
                .add(Axes.BIRCH_STONE_AXE)
                .add(Axes.CHERRY_STONE_AXE)
                .add(Axes.CRIMSON_STONE_AXE)
                .add(Axes.DARK_OAK_STONE_AXE)
                .add(Axes.JUNGLE_STONE_AXE)
                .add(Axes.MANGROVE_STONE_AXE)
                .add(Axes.SPRUCE_STONE_AXE)
                .add(Axes.WARPED_STONE_AXE);

        getOrCreateTagBuilder(IRON_AXES)
                .add(Axes.ACACIA_IRON_AXE)
                .add(Axes.BAMBOO_IRON_AXE)
                .add(Axes.BIRCH_IRON_AXE)
                .add(Axes.CHERRY_IRON_AXE)
                .add(Axes.CRIMSON_IRON_AXE)
                .add(Axes.DARK_OAK_IRON_AXE)
                .add(Axes.JUNGLE_IRON_AXE)
                .add(Axes.MANGROVE_IRON_AXE)
                .add(Axes.SPRUCE_IRON_AXE)
                .add(Axes.WARPED_IRON_AXE);

        getOrCreateTagBuilder(GOLDEN_AXES)
                .add(Axes.ACACIA_GOLDEN_AXE)
                .add(Axes.BAMBOO_GOLDEN_AXE)
                .add(Axes.BIRCH_GOLDEN_AXE)
                .add(Axes.CHERRY_GOLDEN_AXE)
                .add(Axes.CRIMSON_GOLDEN_AXE)
                .add(Axes.DARK_OAK_GOLDEN_AXE)
                .add(Axes.JUNGLE_GOLDEN_AXE)
                .add(Axes.MANGROVE_GOLDEN_AXE)
                .add(Axes.SPRUCE_GOLDEN_AXE)
                .add(Axes.WARPED_GOLDEN_AXE);

        getOrCreateTagBuilder(DIAMOND_AXES)
                .add(Axes.ACACIA_DIAMOND_AXE)
                .add(Axes.BAMBOO_DIAMOND_AXE)
                .add(Axes.BIRCH_DIAMOND_AXE)
                .add(Axes.CHERRY_DIAMOND_AXE)
                .add(Axes.CRIMSON_DIAMOND_AXE)
                .add(Axes.DARK_OAK_DIAMOND_AXE)
                .add(Axes.JUNGLE_DIAMOND_AXE)
                .add(Axes.MANGROVE_DIAMOND_AXE)
                .add(Axes.SPRUCE_DIAMOND_AXE)
                .add(Axes.WARPED_DIAMOND_AXE);

        getOrCreateTagBuilder(NETHERITE_AXES)
                .add(Axes.ACACIA_NETHERITE_AXE)
                .add(Axes.BAMBOO_NETHERITE_AXE)
                .add(Axes.BIRCH_NETHERITE_AXE)
                .add(Axes.CHERRY_NETHERITE_AXE)
                .add(Axes.CRIMSON_NETHERITE_AXE)
                .add(Axes.DARK_OAK_NETHERITE_AXE)
                .add(Axes.JUNGLE_NETHERITE_AXE)
                .add(Axes.MANGROVE_NETHERITE_AXE)
                .add(Axes.SPRUCE_NETHERITE_AXE)
                .add(Axes.WARPED_NETHERITE_AXE);

        getOrCreateTagBuilder(WOODEN_SHOVELS)
                .add(Shovels.ACACIA_WOODEN_SHOVEL)
                .add(Shovels.BAMBOO_WOODEN_SHOVEL)
                .add(Shovels.BIRCH_WOODEN_SHOVEL)
                .add(Shovels.CHERRY_WOODEN_SHOVEL)
                .add(Shovels.CRIMSON_WOODEN_SHOVEL)
                .add(Shovels.DARK_OAK_WOODEN_SHOVEL)
                .add(Shovels.JUNGLE_WOODEN_SHOVEL)
                .add(Shovels.MANGROVE_WOODEN_SHOVEL)
                .add(Shovels.SPRUCE_WOODEN_SHOVEL)
                .add(Shovels.WARPED_WOODEN_SHOVEL);

        getOrCreateTagBuilder(STONE_SHOVELS)
                .add(Shovels.ACACIA_STONE_SHOVEL)
                .add(Shovels.BAMBOO_STONE_SHOVEL)
                .add(Shovels.BIRCH_STONE_SHOVEL)
                .add(Shovels.CHERRY_STONE_SHOVEL)
                .add(Shovels.CRIMSON_STONE_SHOVEL)
                .add(Shovels.DARK_OAK_STONE_SHOVEL)
                .add(Shovels.JUNGLE_STONE_SHOVEL)
                .add(Shovels.MANGROVE_STONE_SHOVEL)
                .add(Shovels.SPRUCE_STONE_SHOVEL)
                .add(Shovels.WARPED_STONE_SHOVEL);

        getOrCreateTagBuilder(IRON_SHOVELS)
                .add(Shovels.ACACIA_IRON_SHOVEL)
                .add(Shovels.BAMBOO_IRON_SHOVEL)
                .add(Shovels.BIRCH_IRON_SHOVEL)
                .add(Shovels.CHERRY_IRON_SHOVEL)
                .add(Shovels.CRIMSON_IRON_SHOVEL)
                .add(Shovels.DARK_OAK_IRON_SHOVEL)
                .add(Shovels.JUNGLE_IRON_SHOVEL)
                .add(Shovels.MANGROVE_IRON_SHOVEL)
                .add(Shovels.SPRUCE_IRON_SHOVEL)
                .add(Shovels.WARPED_IRON_SHOVEL);

        getOrCreateTagBuilder(GOLDEN_SHOVELS)
                .add(Shovels.ACACIA_GOLDEN_SHOVEL)
                .add(Shovels.BAMBOO_GOLDEN_SHOVEL)
                .add(Shovels.BIRCH_GOLDEN_SHOVEL)
                .add(Shovels.CHERRY_GOLDEN_SHOVEL)
                .add(Shovels.CRIMSON_GOLDEN_SHOVEL)
                .add(Shovels.DARK_OAK_GOLDEN_SHOVEL)
                .add(Shovels.JUNGLE_GOLDEN_SHOVEL)
                .add(Shovels.MANGROVE_GOLDEN_SHOVEL)
                .add(Shovels.SPRUCE_GOLDEN_SHOVEL)
                .add(Shovels.WARPED_GOLDEN_SHOVEL);

        getOrCreateTagBuilder(DIAMOND_SHOVELS)
                .add(Shovels.ACACIA_DIAMOND_SHOVEL)
                .add(Shovels.BAMBOO_DIAMOND_SHOVEL)
                .add(Shovels.BIRCH_DIAMOND_SHOVEL)
                .add(Shovels.CHERRY_DIAMOND_SHOVEL)
                .add(Shovels.CRIMSON_DIAMOND_SHOVEL)
                .add(Shovels.DARK_OAK_DIAMOND_SHOVEL)
                .add(Shovels.JUNGLE_DIAMOND_SHOVEL)
                .add(Shovels.MANGROVE_DIAMOND_SHOVEL)
                .add(Shovels.SPRUCE_DIAMOND_SHOVEL)
                .add(Shovels.WARPED_DIAMOND_SHOVEL);

        getOrCreateTagBuilder(NETHERITE_SHOVELS)
                .add(Shovels.ACACIA_NETHERITE_SHOVEL)
                .add(Shovels.BAMBOO_NETHERITE_SHOVEL)
                .add(Shovels.BIRCH_NETHERITE_SHOVEL)
                .add(Shovels.CHERRY_NETHERITE_SHOVEL)
                .add(Shovels.CRIMSON_NETHERITE_SHOVEL)
                .add(Shovels.DARK_OAK_NETHERITE_SHOVEL)
                .add(Shovels.JUNGLE_NETHERITE_SHOVEL)
                .add(Shovels.MANGROVE_NETHERITE_SHOVEL)
                .add(Shovels.SPRUCE_NETHERITE_SHOVEL)
                .add(Shovels.WARPED_NETHERITE_SHOVEL);

        getOrCreateTagBuilder(RCH_MID)
                .add(Hoes.ACACIA_GOLDEN_HOE)
                .add(Hoes.BAMBOO_GOLDEN_HOE)
                .add(Hoes.BIRCH_GOLDEN_HOE)
                .add(Hoes.CHERRY_GOLDEN_HOE)
                .add(Hoes.CRIMSON_GOLDEN_HOE)
                .add(Hoes.DARK_OAK_GOLDEN_HOE)
                .add(Hoes.JUNGLE_GOLDEN_HOE)
                .add(Hoes.MANGROVE_GOLDEN_HOE)
                .add(Hoes.SPRUCE_GOLDEN_HOE)
                .add(Hoes.WARPED_GOLDEN_HOE)
                .add(Hoes.ACACIA_DIAMOND_HOE)
                .add(Hoes.BAMBOO_DIAMOND_HOE)
                .add(Hoes.BIRCH_DIAMOND_HOE)
                .add(Hoes.CHERRY_DIAMOND_HOE)
                .add(Hoes.CRIMSON_DIAMOND_HOE)
                .add(Hoes.DARK_OAK_DIAMOND_HOE)
                .add(Hoes.JUNGLE_DIAMOND_HOE)
                .add(Hoes.MANGROVE_DIAMOND_HOE)
                .add(Hoes.SPRUCE_DIAMOND_HOE)
                .add(Hoes.WARPED_DIAMOND_HOE);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .add(Ladders.CRIMSON_LADDER.asItem())
                .add(Ladders.WARPED_LADDER.asItem());

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .addTag(GOLDEN_AXES)
                .add(Hoes.BIRCH_GOLDEN_HOE)
                .add(Hoes.CHERRY_GOLDEN_HOE)
                .add(Hoes.CRIMSON_GOLDEN_HOE)
                .add(Hoes.DARK_OAK_GOLDEN_HOE)
                .add(Hoes.JUNGLE_GOLDEN_HOE)
                .add(Hoes.MANGROVE_GOLDEN_HOE)
                .add(Hoes.SPRUCE_GOLDEN_HOE)
                .add(Hoes.WARPED_GOLDEN_HOE)
                .addTag(GOLDEN_PICKAXES)
                .addTag(GOLDEN_SHOVELS)
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


        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(GRINDSTONES);

        getOrCreateTagBuilder(EXO_GOLDEN_TOOLS)
                .addTag(GOLDEN_AXES)
                .add(Hoes.ACACIA_GOLDEN_HOE)
                .add(Hoes.BIRCH_GOLDEN_HOE)
                .add(Hoes.CHERRY_GOLDEN_HOE)
                .add(Hoes.CRIMSON_GOLDEN_HOE)
                .add(Hoes.DARK_OAK_GOLDEN_HOE)
                .add(Hoes.JUNGLE_GOLDEN_HOE)
                .add(Hoes.MANGROVE_GOLDEN_HOE)
                .add(Hoes.SPRUCE_GOLDEN_HOE)
                .add(Hoes.WARPED_GOLDEN_HOE)
                .addTag(GOLDEN_PICKAXES)
                .addTag(GOLDEN_SHOVELS)
                .add(Swords.ACACIA_GOLDEN_SWORD)
                .add(Swords.BIRCH_GOLDEN_SWORD)
                .add(Swords.CHERRY_GOLDEN_SWORD)
                .add(Swords.CRIMSON_GOLDEN_SWORD)
                .add(Swords.DARK_OAK_GOLDEN_SWORD)
                .add(Swords.JUNGLE_GOLDEN_SWORD)
                .add(Swords.MANGROVE_GOLDEN_SWORD)
                .add(Swords.SPRUCE_GOLDEN_SWORD)
                .add(Swords.WARPED_GOLDEN_SWORD);

        getOrCreateTagBuilder(EXO_NETHERITE_TOOLS)
                .addTag(NETHERITE_AXES)
                .add(Hoes.ACACIA_NETHERITE_HOE)
                .add(Hoes.BIRCH_NETHERITE_HOE)
                .add(Hoes.CHERRY_NETHERITE_HOE)
                .add(Hoes.CRIMSON_NETHERITE_HOE)
                .add(Hoes.DARK_OAK_NETHERITE_HOE)
                .add(Hoes.JUNGLE_NETHERITE_HOE)
                .add(Hoes.MANGROVE_NETHERITE_HOE)
                .add(Hoes.SPRUCE_NETHERITE_HOE)
                .add(Hoes.WARPED_NETHERITE_HOE)
                .addTag(NETHERITE_PICKAXES)
                .addTag(NETHERITE_SHOVELS)
                .add(Swords.ACACIA_NETHERITE_SWORD)
                .add(Swords.BIRCH_NETHERITE_SWORD)
                .add(Swords.CHERRY_NETHERITE_SWORD)
                .add(Swords.CRIMSON_NETHERITE_SWORD)
                .add(Swords.DARK_OAK_NETHERITE_SWORD)
                .add(Swords.JUNGLE_NETHERITE_SWORD)
                .add(Swords.MANGROVE_NETHERITE_SWORD)
                .add(Swords.SPRUCE_NETHERITE_SWORD)
                .add(Swords.WARPED_NETHERITE_SWORD);
    }
}