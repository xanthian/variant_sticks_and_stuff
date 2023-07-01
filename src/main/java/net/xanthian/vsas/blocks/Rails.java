package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;

public class Rails {

    public static final Block ACACIA_RAIL = registerRailBlock("rails/acacia_rail", new VariantRailBlock());
    public static final Block BIRCH_RAIL = registerRailBlock("rails/birch_rail", new VariantRailBlock());
    public static final Block CRIMSON_RAIL = registerRailBlock("rails/crimson_rail", new VariantRailBlock());
    public static final Block DARK_OAK_RAIL = registerRailBlock("rails/dark_oak_rail", new VariantRailBlock());
    public static final Block JUNGLE_RAIL = registerRailBlock("rails/jungle_rail", new VariantRailBlock());
    public static final Block MANGROVE_RAIL = registerRailBlock("rails/oak_rail", new VariantRailBlock());
    public static final Block OAK_RAIL = registerRailBlock("rails/mangrove_rail", new VariantRailBlock());
    public static final Block SPRUCE_RAIL = registerRailBlock("rails/spruce_rail", new VariantRailBlock());
    public static final Block WARPED_RAIL = registerRailBlock("rails/warped_rail", new VariantRailBlock());

    public static final Block ACACIA_ACTIVATOR_RAIL = registerRailBlock("rails/acacia_activator_rail", new VariantActivatorRailBlock());
    public static final Block BIRCH_ACTIVATOR_RAIL = registerRailBlock("rails/birch_activator_rail", new VariantActivatorRailBlock());
    public static final Block CRIMSON_ACTIVATOR_RAIL = registerRailBlock("rails/crimson_activator_rail", new VariantActivatorRailBlock());
    public static final Block DARK_OAK_ACTIVATOR_RAIL = registerRailBlock("rails/dark_oak_activator_rail", new VariantActivatorRailBlock());
    public static final Block JUNGLE_ACTIVATOR_RAIL = registerRailBlock("rails/jungle_activator_rail", new VariantActivatorRailBlock());
    public static final Block MANGROVE_ACTIVATOR_RAIL = registerRailBlock("rails/oak_activator_rail", new VariantActivatorRailBlock());
    public static final Block OAK_ACTIVATOR_RAIL = registerRailBlock("rails/mangrove_activator_rail", new VariantActivatorRailBlock());
    public static final Block SPRUCE_ACTIVATOR_RAIL = registerRailBlock("rails/spruce_activator_rail", new VariantActivatorRailBlock());
    public static final Block WARPED_ACTIVATOR_RAIL = registerRailBlock("rails/warped_activator_rail", new VariantActivatorRailBlock());

    public static final Block ACACIA_DETECTOR_RAIL = registerRailBlock("rails/acacia_detector_rail", new VariantDetectorRailBlock());
    public static final Block BIRCH_DETECTOR_RAIL = registerRailBlock("rails/birch_detector_rail", new VariantDetectorRailBlock());
    public static final Block CRIMSON_DETECTOR_RAIL = registerRailBlock("rails/crimson_detector_rail", new VariantDetectorRailBlock());
    public static final Block DARK_OAK_DETECTOR_RAIL = registerRailBlock("rails/dark_oak_detector_rail", new VariantDetectorRailBlock());
    public static final Block JUNGLE_DETECTOR_RAIL = registerRailBlock("rails/jungle_detector_rail", new VariantDetectorRailBlock());
    public static final Block MANGROVE_DETECTOR_RAIL = registerRailBlock("rails/oak_detector_rail", new VariantDetectorRailBlock());
    public static final Block OAK_DETECTOR_RAIL = registerRailBlock("rails/mangrove_detector_rail", new VariantDetectorRailBlock());
    public static final Block SPRUCE_DETECTOR_RAIL = registerRailBlock("rails/spruce_detector_rail", new VariantDetectorRailBlock());
    public static final Block WARPED_DETECTOR_RAIL = registerRailBlock("rails/warped_detector_rail", new VariantDetectorRailBlock());

    public static final Block ACACIA_POWERED_RAIL = registerRailBlock("rails/acacia_powered_rail", new VariantPoweredRailBlock());
    public static final Block BIRCH_POWERED_RAIL = registerRailBlock("rails/birch_powered_rail", new VariantPoweredRailBlock());
    public static final Block CRIMSON_POWERED_RAIL = registerRailBlock("rails/crimson_powered_rail", new VariantPoweredRailBlock());
    public static final Block DARK_OAK_POWERED_RAIL = registerRailBlock("rails/dark_oak_powered_rail", new VariantPoweredRailBlock());
    public static final Block JUNGLE_POWERED_RAIL = registerRailBlock("rails/jungle_powered_rail", new VariantPoweredRailBlock());
    public static final Block MANGROVE_POWERED_RAIL = registerRailBlock("rails/oak_powered_rail", new VariantPoweredRailBlock());
    public static final Block OAK_POWERED_RAIL = registerRailBlock("rails/mangrove_powered_rail", new VariantPoweredRailBlock());
    public static final Block SPRUCE_POWERED_RAIL = registerRailBlock("rails/spruce_powered_rail", new VariantPoweredRailBlock());
    public static final Block WARPED_POWERED_RAIL = registerRailBlock("rails/warped_powered_rail", new VariantPoweredRailBlock());

    private static Block registerRailBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }
}