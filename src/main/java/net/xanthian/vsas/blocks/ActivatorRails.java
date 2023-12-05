package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.blocks.blocktypes.VariantActivatorRailBlock;

import java.util.Map;

public class ActivatorRails {

    public static Map<Identifier, Block> MOD_ACTIVATOR_RAILS = Maps.newHashMap();

    public static final Block ACACIA_ACTIVATOR_RAIL = registerRailBlock("rails/acacia_activator_rail", new VariantActivatorRailBlock());
    public static final Block BAMBOO_ACTIVATOR_RAIL = registerRailBlock("rails/bamboo_activator_rail", new VariantActivatorRailBlock());
    public static final Block BIRCH_ACTIVATOR_RAIL = registerRailBlock("rails/birch_activator_rail", new VariantActivatorRailBlock());
    public static final Block CHERRY_ACTIVATOR_RAIL = registerRailBlock("rails/cherry_activator_rail", new VariantActivatorRailBlock());
    public static final Block CRIMSON_ACTIVATOR_RAIL = registerRailBlock("rails/crimson_activator_rail", new VariantActivatorRailBlock());
    public static final Block DARK_OAK_ACTIVATOR_RAIL = registerRailBlock("rails/dark_oak_activator_rail", new VariantActivatorRailBlock());
    public static final Block JUNGLE_ACTIVATOR_RAIL = registerRailBlock("rails/jungle_activator_rail", new VariantActivatorRailBlock());
    public static final Block MANGROVE_ACTIVATOR_RAIL = registerRailBlock("rails/mangrove_activator_rail", new VariantActivatorRailBlock());
    public static final Block SPRUCE_ACTIVATOR_RAIL = registerRailBlock("rails/spruce_activator_rail", new VariantActivatorRailBlock());
    public static final Block WARPED_ACTIVATOR_RAIL = registerRailBlock("rails/warped_activator_rail", new VariantActivatorRailBlock());

    private static Block registerRailBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
        MOD_ACTIVATOR_RAILS.put(identifier, block);
        return Registry.register(Registries.BLOCK, identifier, block);
    }

    public static void registerActivatorRails() {
    }
}