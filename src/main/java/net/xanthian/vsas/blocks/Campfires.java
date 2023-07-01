package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;

public class Campfires {

    public static final Block ACACIA_CAMPFIRE = registerCampfireBlock("campfires/acacia_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block BIRCH_CAMPFIRE = registerCampfireBlock("campfires/birch_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block CRIMSON_CAMPFIRE = registerCampfireBlock("campfires/crimson_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block DARK_OAK_CAMPFIRE = registerCampfireBlock("campfires/dark_oak_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block JUNGLE_CAMPFIRE = registerCampfireBlock("campfires/jungle_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block MANGROVE_CAMPFIRE = registerCampfireBlock("campfires/mangrove_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block OAK_CAMPFIRE = registerCampfireBlock("campfires/oak_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block SPRUCE_CAMPFIRE = registerCampfireBlock("campfires/spruce_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block WARPED_CAMPFIRE = registerCampfireBlock("campfires/warped_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));

    public static final Block ACACIA_SOUL_CAMPFIRE = registerCampfireBlock("campfires/acacia_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block BIRCH_SOUL_CAMPFIRE = registerCampfireBlock("campfires/birch_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block CRIMSON_SOUL_CAMPFIRE = registerCampfireBlock("campfires/crimson_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block DARK_OAK_SOUL_CAMPFIRE = registerCampfireBlock("campfires/dark_oak_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block JUNGLE_SOUL_CAMPFIRE = registerCampfireBlock("campfires/jungle_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block MANGROVE_SOUL_CAMPFIRE = registerCampfireBlock("campfires/mangrove_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block OAK_SOUL_CAMPFIRE = registerCampfireBlock("campfires/oak_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block SPRUCE_SOUL_CAMPFIRE = registerCampfireBlock("campfires/spruce_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block WARPED_SOUL_CAMPFIRE = registerCampfireBlock("campfires/warped_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    private static Block registerCampfireBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }
}