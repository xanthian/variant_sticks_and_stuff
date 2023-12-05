package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.blocks.blocktypes.VariantLadderBlock;

import java.util.Map;

public class Ladders {

    public static Map<Identifier, Block> MOD_LADDERS = Maps.newHashMap();

    public static final Block ACACIA_LADDER = registerLadderBlock("ladders/acacia_ladder", new VariantLadderBlock());
    public static final Block BAMBOO_LADDER = registerLadderBlock("ladders/bamboo_ladder", new VariantLadderBlock());
    public static final Block BIRCH_LADDER = registerLadderBlock("ladders/birch_ladder", new VariantLadderBlock());
    public static final Block CHERRY_LADDER = registerLadderBlock("ladders/cherry_ladder", new VariantLadderBlock());
    public static final Block CRIMSON_LADDER = registerLadderBlock("ladders/crimson_ladder", new VariantLadderBlock());
    public static final Block DARK_OAK_LADDER = registerLadderBlock("ladders/dark_oak_ladder", new VariantLadderBlock());
    public static final Block JUNGLE_LADDER = registerLadderBlock("ladders/jungle_ladder", new VariantLadderBlock());
    public static final Block MANGROVE_LADDER = registerLadderBlock("ladders/mangrove_ladder", new VariantLadderBlock());
    public static final Block SPRUCE_LADDER = registerLadderBlock("ladders/spruce_ladder", new VariantLadderBlock());
    public static final Block WARPED_LADDER = registerLadderBlock("ladders/warped_ladder", new VariantLadderBlock());

    private static Block registerLadderBlock(String name, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
        MOD_LADDERS.put(identifier, block);
        return Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, name), block);
    }

    public static void registerLadders() {
    }
}