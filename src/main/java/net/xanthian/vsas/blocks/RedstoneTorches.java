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
import net.xanthian.vsas.blocks.blocktypes.VariantRedstoneTorchBlock;
import net.xanthian.vsas.blocks.blocktypes.VariantWallRedstoneTorchBlock;

import java.util.Map;

public class RedstoneTorches {

    public static Map<Identifier, Block> MOD_REDSTONE_TORCHES = Maps.newHashMap();

    public static final Block ACACIA_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_ACACIA_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();
    public static final Block BAMBOO_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_BAMBOO_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();
    public static final Block BIRCH_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_BIRCH_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();
    public static final Block CHERRY_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_CHERRY_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();
    public static final Block CRIMSON_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_CRIMSON_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();
    public static final Block DARK_OAK_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_DARK_OAK_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();
    public static final Block JUNGLE_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_JUNGLE_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();
    public static final Block MANGROVE_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_MANGROVE_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();

    public static final Block SPRUCE_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_SPRUCE_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();
    public static final Block WARPED_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    public static final Block WALL_WARPED_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();

    public static void registerRedstoneTorchBlocks() {
        initTorchBlock("torches/acacia_redstone_torch", ACACIA_REDSTONE_TORCH, "torches/wall_acacia_redstone_torch", WALL_ACACIA_REDSTONE_TORCH);
        initTorchBlock("torches/bamboo_redstone_torch", BAMBOO_REDSTONE_TORCH, "torches/wall_bamboo_redstone_torch", WALL_BAMBOO_REDSTONE_TORCH);
        initTorchBlock("torches/birch_redstone_torch", BIRCH_REDSTONE_TORCH, "torches/wall_birch_redstone_torch", WALL_BIRCH_REDSTONE_TORCH);
        initTorchBlock("torches/cherry_redstone_torch", CHERRY_REDSTONE_TORCH, "torches/wall_cherry_redstone_torch", WALL_CHERRY_REDSTONE_TORCH);
        initTorchBlock("torches/crimson_redstone_torch", CRIMSON_REDSTONE_TORCH, "torches/wall_crimson_redstone_torch", WALL_CRIMSON_REDSTONE_TORCH);
        initTorchBlock("torches/dark_oak_redstone_torch", DARK_OAK_REDSTONE_TORCH, "torches/wall_dark_oak_redstone_torch", WALL_DARK_OAK_REDSTONE_TORCH);
        initTorchBlock("torches/jungle_redstone_torch", JUNGLE_REDSTONE_TORCH, "torches/wall_jungle_redstone_torch", WALL_JUNGLE_REDSTONE_TORCH);
        initTorchBlock("torches/mangrove_redstone_torch", MANGROVE_REDSTONE_TORCH, "torches/wall_mangrove_redstone_torch", WALL_MANGROVE_REDSTONE_TORCH);
        initTorchBlock("torches/spruce_redstone_torch", SPRUCE_REDSTONE_TORCH, "torches/wall_spruce_redstone_torch", WALL_SPRUCE_REDSTONE_TORCH);
        initTorchBlock("torches/warped_redstone_torch", WARPED_REDSTONE_TORCH, "torches/wall_warped_redstone_torch", WALL_WARPED_REDSTONE_TORCH);
    }

    private static void initTorchBlock(String torchName, Block torch, String wallTorchName, Block wallTorch) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, torchName.toLowerCase());
        MOD_REDSTONE_TORCHES.put(identifier, torch);
        Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, torchName), torch);
        Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, wallTorchName), wallTorch);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, torchName), new VerticallyAttachableBlockItem(torch, wallTorch, new FabricItemSettings(), Direction.DOWN));
    }
}