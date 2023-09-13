package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
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
import net.xanthian.vsas.blocks.blocktypes.VariantCampfireBlock;

import java.util.Map;

public class SoulCampfires {

    public static Map<Identifier, Block> MOD_SOUL_CAMPFIRES = Maps.newHashMap();

    public static final Block ACACIA_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/acacia_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block BAMBOO_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/bamboo_soul_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block BIRCH_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/birch_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block CHERRY_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/cherry_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block CRIMSON_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/crimson_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block DARK_OAK_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/dark_oak_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block JUNGLE_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/jungle_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block MANGROVE_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/mangrove_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block SPRUCE_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/spruce_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));
    public static final Block WARPED_SOUL_CAMPFIRE = registerSoulCampfireBlock("campfires/warped_soul_campfire", new VariantCampfireBlock(2, FabricBlockSettings.copyOf(Blocks.SOUL_CAMPFIRE)));

    private static Block registerSoulCampfireBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        registerBlockItem(name, block);
        MOD_SOUL_CAMPFIRES.put(identifier, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        Item item = Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        return item;
    }
}