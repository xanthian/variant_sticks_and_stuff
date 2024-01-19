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
import net.xanthian.vsas.blocks.blocktypes.VariantSoulTorchBlock;
import net.xanthian.vsas.blocks.blocktypes.VariantWallSoulTorchBlock;

import java.util.Map;

public class SoulTorches {

    public static final Block ACACIA_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_ACACIA_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final Block BAMBOO_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_BAMBOO_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final Block BIRCH_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_BIRCH_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final Block CHERRY_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_CHERRY_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final Block CRIMSON_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_CRIMSON_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final Block DARK_OAK_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_DARK_OAK_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final Block JUNGLE_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_JUNGLE_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final Block MANGROVE_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_MANGROVE_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final Block SPRUCE_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_SPRUCE_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final Block WARPED_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final Block WALL_WARPED_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static Map<Identifier, Block> MOD_SOUL_TORCHES = Maps.newHashMap();

    public static void registerSoulTorchBlocks() {
        initTorchBlock("torches/acacia_soul_torch", ACACIA_SOUL_TORCH, "torches/wall_acacia_soul_torch", WALL_ACACIA_SOUL_TORCH);
        initTorchBlock("torches/bamboo_soul_torch", BAMBOO_SOUL_TORCH, "torches/wall_bamboo_soul_torch", WALL_BAMBOO_SOUL_TORCH);
        initTorchBlock("torches/birch_soul_torch", BIRCH_SOUL_TORCH, "torches/wall_birch_soul_torch", WALL_BIRCH_SOUL_TORCH);
        initTorchBlock("torches/cherry_soul_torch", CHERRY_SOUL_TORCH, "torches/wall_cherry_soul_torch", WALL_CHERRY_SOUL_TORCH);
        initTorchBlock("torches/crimson_soul_torch", CRIMSON_SOUL_TORCH, "torches/wall_crimson_soul_torch", WALL_CRIMSON_SOUL_TORCH);
        initTorchBlock("torches/dark_oak_soul_torch", DARK_OAK_SOUL_TORCH, "torches/wall_dark_oak_soul_torch", WALL_DARK_OAK_SOUL_TORCH);
        initTorchBlock("torches/jungle_soul_torch", JUNGLE_SOUL_TORCH, "torches/wall_jungle_soul_torch", WALL_JUNGLE_SOUL_TORCH);
        initTorchBlock("torches/mangrove_soul_torch", MANGROVE_SOUL_TORCH, "torches/wall_mangrove_soul_torch", WALL_MANGROVE_SOUL_TORCH);
        initTorchBlock("torches/spruce_soul_torch", SPRUCE_SOUL_TORCH, "torches/wall_spruce_soul_torch", WALL_SPRUCE_SOUL_TORCH);
        initTorchBlock("torches/warped_soul_torch", WARPED_SOUL_TORCH, "torches/wall_warped_soul_torch", WALL_WARPED_SOUL_TORCH);
    }

    private static void initTorchBlock(String torchName, Block torch, String wallTorchName, Block wallTorch) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, torchName);
        Identifier identifier2 = new Identifier(Initialise.MOD_ID, wallTorchName);
        MOD_SOUL_TORCHES.put(identifier, torch);
        MOD_SOUL_TORCHES.put(identifier2, wallTorch);
        Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, torchName), torch);
        Registry.register(Registries.BLOCK, new Identifier(Initialise.MOD_ID, wallTorchName), wallTorch);
        Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, torchName), new VerticallyAttachableBlockItem(torch, wallTorch, new FabricItemSettings(), Direction.DOWN));
    }
}