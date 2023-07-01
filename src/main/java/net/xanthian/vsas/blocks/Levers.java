package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;

public class Levers {

    public static final Block ACACIA_LEVER = registerLeverBlock("levers/acacia_lever", new VariantLeverBlock());
    public static final Block BIRCH_LEVER = registerLeverBlock("levers/birch_lever", new VariantLeverBlock());
    public static final Block CRIMSON_LEVER = registerLeverBlock("levers/crimson_lever", new VariantLeverBlock());
    public static final Block DARK_OAK_LEVER = registerLeverBlock("levers/dark_oak_lever", new VariantLeverBlock());
    public static final Block JUNGLE_LEVER = registerLeverBlock("levers/jungle_lever", new VariantLeverBlock());
    public static final Block MANGROVE_LEVER = registerLeverBlock("levers/oak_lever", new VariantLeverBlock());
    public static final Block OAK_LEVER = registerLeverBlock("levers/mangrove_lever", new VariantLeverBlock());
    public static final Block SPRUCE_LEVER = registerLeverBlock("levers/spruce_lever", new VariantLeverBlock());
    public static final Block WARPED_LEVER = registerLeverBlock("levers/warped_lever", new VariantLeverBlock());

    private static Block registerLeverBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }
}