package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.blocks.blocktypes.VariantTorchBlock;
import net.xanthian.vsas.blocks.blocktypes.VariantWallTorchBlock;

import java.util.Map;

public class Torches {

    public static Map<Identifier, Block> MOD_TORCHES = Maps.newHashMap();
    public static Map<Identifier, Block> MOD_WALL_TORCHES = Maps.newHashMap();
    public static final Block ACACIA_TORCH = new VariantTorchBlock();
    public static final Block WALL_ACACIA_TORCH = new VariantWallTorchBlock();
    public static final Block BAMBOO_TORCH = new VariantTorchBlock();
    public static final Block WALL_BAMBOO_TORCH = new VariantWallTorchBlock();
    public static final Block BIRCH_TORCH = new VariantTorchBlock();
    public static final Block WALL_BIRCH_TORCH = new VariantWallTorchBlock();
    public static final Block CHERRY_TORCH = new VariantTorchBlock();
    public static final Block WALL_CHERRY_TORCH = new VariantWallTorchBlock();
    public static final Block CRIMSON_TORCH = new VariantTorchBlock();
    public static final Block WALL_CRIMSON_TORCH = new VariantWallTorchBlock();
    public static final Block DARK_OAK_TORCH = new VariantTorchBlock();
    public static final Block WALL_DARK_OAK_TORCH = new VariantWallTorchBlock();
    public static final Block JUNGLE_TORCH = new VariantTorchBlock();
    public static final Block WALL_JUNGLE_TORCH = new VariantWallTorchBlock();
    public static final Block MANGROVE_TORCH = new VariantTorchBlock();
    public static final Block WALL_MANGROVE_TORCH = new VariantWallTorchBlock();
    public static final Block SPRUCE_TORCH = new VariantTorchBlock();
    public static final Block WALL_SPRUCE_TORCH = new VariantWallTorchBlock();
    public static final Block WARPED_TORCH = new VariantTorchBlock();
    public static final Block WALL_WARPED_TORCH = new VariantWallTorchBlock();

    public static void registerTorchBlocks() {
        initTorchBlock("torches/acacia_torch", ACACIA_TORCH, "torches/wall_acacia_torch", WALL_ACACIA_TORCH);
        initTorchBlock("torches/bamboo_torch", BAMBOO_TORCH, "torches/wall_bamboo_torch", WALL_BAMBOO_TORCH);
        initTorchBlock("torches/birch_torch", BIRCH_TORCH, "torches/wall_birch_torch", WALL_BIRCH_TORCH);
        initTorchBlock("torches/cherry_torch", CHERRY_TORCH, "torches/wall_cherry_torch", WALL_CHERRY_TORCH);
        initTorchBlock("torches/crimson_torch", CRIMSON_TORCH, "torches/wall_crimson_torch", WALL_CRIMSON_TORCH);
        initTorchBlock("torches/dark_oak_torch", DARK_OAK_TORCH, "torches/wall_dark_oak_torch", WALL_DARK_OAK_TORCH);
        initTorchBlock("torches/jungle_torch", JUNGLE_TORCH, "torches/wall_jungle_torch", WALL_JUNGLE_TORCH);
        initTorchBlock("torches/mangrove_torch", MANGROVE_TORCH, "torches/wall_mangrove_torch", WALL_MANGROVE_TORCH);
        initTorchBlock("torches/spruce_torch", SPRUCE_TORCH, "torches/wall_spruce_torch", WALL_SPRUCE_TORCH);
        initTorchBlock("torches/warped_torch", WARPED_TORCH, "torches/wall_warped_torch", WALL_WARPED_TORCH);
    }

    private static void initTorchBlock(String torchName, Block torch, String wallTorchName, Block wallTorch) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, torchName);
        Identifier identifier2 = new Identifier(Initialise.MOD_ID, wallTorchName);
        MOD_TORCHES.put(identifier, torch);
        MOD_WALL_TORCHES.put(identifier2, wallTorch);
        Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, torchName), torch);
        Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, wallTorchName), wallTorch);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, torchName), new VerticallyAttachableBlockItem(torch, wallTorch, new FabricItemSettings(), Direction.DOWN));
    }
}