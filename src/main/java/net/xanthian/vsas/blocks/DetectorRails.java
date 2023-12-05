package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.blocks.blocktypes.VariantDetectorRailBlock;

import java.util.Map;

public class DetectorRails {

    public static Map<Identifier, Block> MOD_DETECTOR_RAILS = Maps.newHashMap();

    public static final Block ACACIA_DETECTOR_RAIL = registerRailBlock("rails/acacia_detector_rail", new VariantDetectorRailBlock());
    public static final Block BAMBOO_DETECTOR_RAIL = registerRailBlock("rails/bamboo_detector_rail", new VariantDetectorRailBlock());
    public static final Block BIRCH_DETECTOR_RAIL = registerRailBlock("rails/birch_detector_rail", new VariantDetectorRailBlock());
    public static final Block CHERRY_DETECTOR_RAIL = registerRailBlock("rails/cherry_detector_rail", new VariantDetectorRailBlock());
    public static final Block CRIMSON_DETECTOR_RAIL = registerRailBlock("rails/crimson_detector_rail", new VariantDetectorRailBlock());
    public static final Block DARK_OAK_DETECTOR_RAIL = registerRailBlock("rails/dark_oak_detector_rail", new VariantDetectorRailBlock());
    public static final Block JUNGLE_DETECTOR_RAIL = registerRailBlock("rails/jungle_detector_rail", new VariantDetectorRailBlock());
    public static final Block MANGROVE_DETECTOR_RAIL = registerRailBlock("rails/mangrove_detector_rail", new VariantDetectorRailBlock());
    public static final Block SPRUCE_DETECTOR_RAIL = registerRailBlock("rails/spruce_detector_rail", new VariantDetectorRailBlock());
    public static final Block WARPED_DETECTOR_RAIL = registerRailBlock("rails/warped_detector_rail", new VariantDetectorRailBlock());

    private static Block registerRailBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        MOD_DETECTOR_RAILS.put(identifier, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }

    public static void registerDetectorRails() {
    }
}