package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.blocks.blocktypes.VariantLeverBlock;

import java.util.Map;

public class Levers {

    public static Map<Identifier, Block> MOD_LEVERS = Maps.newHashMap();

    public static final Block ACACIA_LEVER = registerLeverBlock("levers/acacia_lever", new VariantLeverBlock());
    public static final Block BAMBOO_LEVER = registerLeverBlock("levers/bamboo_lever", new VariantLeverBlock());
    public static final Block BIRCH_LEVER = registerLeverBlock("levers/birch_lever", new VariantLeverBlock());
    public static final Block CHERRY_LEVER = registerLeverBlock("levers/cherry_lever", new VariantLeverBlock());
    public static final Block CRIMSON_LEVER = registerLeverBlock("levers/crimson_lever", new VariantLeverBlock());
    public static final Block DARK_OAK_LEVER = registerLeverBlock("levers/dark_oak_lever", new VariantLeverBlock());
    public static final Block JUNGLE_LEVER = registerLeverBlock("levers/jungle_lever", new VariantLeverBlock());
    public static final Block MANGROVE_LEVER = registerLeverBlock("levers/mangrove_lever", new VariantLeverBlock());
    public static final Block SPRUCE_LEVER = registerLeverBlock("levers/spruce_lever", new VariantLeverBlock());
    public static final Block WARPED_LEVER = registerLeverBlock("levers/warped_lever", new VariantLeverBlock());

    private static Block registerLeverBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        MOD_LEVERS.put(identifier, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }
}