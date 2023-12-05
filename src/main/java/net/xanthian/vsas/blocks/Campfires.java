package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.blocks.blocktypes.VariantCampfireBlock;

import java.util.Map;

public class Campfires {

    public static Map<Identifier, Block> MOD_CAMPFIRES = Maps.newHashMap();

    public static final Block ACACIA_CAMPFIRE = registerCampfireBlock("campfires/acacia_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block BAMBOO_CAMPFIRE = registerCampfireBlock("campfires/bamboo_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block BIRCH_CAMPFIRE = registerCampfireBlock("campfires/birch_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block CHERRY_CAMPFIRE = registerCampfireBlock("campfires/cherry_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block CRIMSON_CAMPFIRE = registerCampfireBlock("campfires/crimson_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block DARK_OAK_CAMPFIRE = registerCampfireBlock("campfires/dark_oak_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block JUNGLE_CAMPFIRE = registerCampfireBlock("campfires/jungle_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block MANGROVE_CAMPFIRE = registerCampfireBlock("campfires/mangrove_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block SPRUCE_CAMPFIRE = registerCampfireBlock("campfires/spruce_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));
    public static final Block WARPED_CAMPFIRE = registerCampfireBlock("campfires/warped_campfire", new VariantCampfireBlock(1, FabricBlockSettings.copyOf(Blocks.CAMPFIRE)));

    private static Block registerCampfireBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        MOD_CAMPFIRES.put(identifier, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }

    public static void registerCampfires() {
    }
}