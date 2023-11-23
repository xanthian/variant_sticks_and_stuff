package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.blocks.blocktypes.VariantRailBlock;

import java.util.Map;

public class Rails {

    public static Map<Identifier, Block> MOD_RAILS = Maps.newHashMap();

    public static final Block ACACIA_RAIL = registerRailBlock("rails/acacia_rail", new VariantRailBlock());
    public static final Block BAMBOO_RAIL = registerRailBlock("rails/bamboo_rail", new VariantRailBlock());
    public static final Block BIRCH_RAIL = registerRailBlock("rails/birch_rail", new VariantRailBlock());
    public static final Block CHERRY_RAIL = registerRailBlock("rails/cherry_rail", new VariantRailBlock());
    public static final Block CRIMSON_RAIL = registerRailBlock("rails/crimson_rail", new VariantRailBlock());
    public static final Block DARK_OAK_RAIL = registerRailBlock("rails/dark_oak_rail", new VariantRailBlock());
    public static final Block JUNGLE_RAIL = registerRailBlock("rails/jungle_rail", new VariantRailBlock());
    public static final Block MANGROVE_RAIL = registerRailBlock("rails/mangrove_rail", new VariantRailBlock());
    public static final Block SPRUCE_RAIL = registerRailBlock("rails/spruce_rail", new VariantRailBlock());
    public static final Block WARPED_RAIL = registerRailBlock("rails/warped_rail", new VariantRailBlock());

    private static Block registerRailBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        MOD_RAILS.put(identifier, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }
}