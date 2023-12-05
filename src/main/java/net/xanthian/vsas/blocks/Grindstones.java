package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.blocks.blocktypes.VariantGrindstoneBlock;

import java.util.Map;

public class Grindstones {

    public static Map<Identifier, Block> MOD_GRINDSTONES = Maps.newHashMap();

    public static final Block ACACIA_GRINDSTONE = registerGrindstoneBlock("grindstones/acacia_grindstone", new VariantGrindstoneBlock());
    public static final Block BAMBOO_GRINDSTONE = registerGrindstoneBlock("grindstones/bamboo_grindstone", new VariantGrindstoneBlock());
    public static final Block BIRCH_GRINDSTONE = registerGrindstoneBlock("grindstones/birch_grindstone", new VariantGrindstoneBlock());
    public static final Block CHERRY_GRINDSTONE = registerGrindstoneBlock("grindstones/cherry_grindstone", new VariantGrindstoneBlock());
    public static final Block CRIMSON_GRINDSTONE = registerGrindstoneBlock("grindstones/crimson_grindstone", new VariantGrindstoneBlock());
    public static final Block JUNGLE_GRINDSTONE = registerGrindstoneBlock("grindstones/jungle_grindstone", new VariantGrindstoneBlock());
    public static final Block MANGROVE_GRINDSTONE = registerGrindstoneBlock("grindstones/mangrove_grindstone", new VariantGrindstoneBlock());
    public static final Block OAK_GRINDSTONE = registerGrindstoneBlock("grindstones/oak_grindstone", new VariantGrindstoneBlock());
    public static final Block SPRUCE_GRINDSTONE = registerGrindstoneBlock("grindstones/spruce_grindstone", new VariantGrindstoneBlock());
    public static final Block WARPED_GRINDSTONE = registerGrindstoneBlock("grindstones/warped_grindstone", new VariantGrindstoneBlock());

    private static Block registerGrindstoneBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        MOD_GRINDSTONES.put(identifier, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }

    public static void registerGrindstones() {
    }
}