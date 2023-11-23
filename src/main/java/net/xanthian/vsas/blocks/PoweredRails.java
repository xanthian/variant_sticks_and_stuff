package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.blocks.blocktypes.VariantPoweredRailBlock;

import java.util.Map;

public class PoweredRails {

    public static Map<Identifier, Block> MOD_POWERED_RAILS = Maps.newHashMap();

    public static final Block ACACIA_POWERED_RAIL = registerRailBlock("rails/acacia_powered_rail", new VariantPoweredRailBlock());
    public static final Block BAMBOO_POWERED_RAIL = registerRailBlock("rails/bamboo_powered_rail", new VariantPoweredRailBlock());
    public static final Block BIRCH_POWERED_RAIL = registerRailBlock("rails/birch_powered_rail", new VariantPoweredRailBlock());
    public static final Block CHERRY_POWERED_RAIL = registerRailBlock("rails/cherry_powered_rail", new VariantPoweredRailBlock());
    public static final Block CRIMSON_POWERED_RAIL = registerRailBlock("rails/crimson_powered_rail", new VariantPoweredRailBlock());
    public static final Block DARK_OAK_POWERED_RAIL = registerRailBlock("rails/dark_oak_powered_rail", new VariantPoweredRailBlock());
    public static final Block JUNGLE_POWERED_RAIL = registerRailBlock("rails/jungle_powered_rail", new VariantPoweredRailBlock());
    public static final Block MANGROVE_POWERED_RAIL = registerRailBlock("rails/mangrove_powered_rail", new VariantPoweredRailBlock());
    public static final Block SPRUCE_POWERED_RAIL = registerRailBlock("rails/spruce_powered_rail", new VariantPoweredRailBlock());
    public static final Block WARPED_POWERED_RAIL = registerRailBlock("rails/warped_powered_rail", new VariantPoweredRailBlock());

    private static Block registerRailBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        MOD_POWERED_RAILS.put(identifier, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }
}