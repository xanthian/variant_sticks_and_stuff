package net.xanthian.vsas.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.WallStandingBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Group;
import net.xanthian.vsas.Init;

public class Torches {

    public static final VariantTorchBlock ACACIA_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_ACACIA_TORCH = new VariantWallTorchBlock();
    public static final VariantTorchBlock BIRCH_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_BIRCH_TORCH = new VariantWallTorchBlock();
    public static final VariantTorchBlock CRIMSON_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_CRIMSON_TORCH = new VariantWallTorchBlock();
    public static final VariantTorchBlock DARK_OAK_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_DARK_OAK_TORCH = new VariantWallTorchBlock();
    public static final VariantTorchBlock JUNGLE_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_JUNGLE_TORCH = new VariantWallTorchBlock();
    public static final VariantTorchBlock OAK_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_OAK_TORCH = new VariantWallTorchBlock();
    public static final VariantTorchBlock MANGROVE_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_MANGROVE_TORCH = new VariantWallTorchBlock();
    public static final VariantTorchBlock SPRUCE_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_SPRUCE_TORCH = new VariantWallTorchBlock();
    public static final VariantTorchBlock WARPED_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_WARPED_TORCH = new VariantWallTorchBlock();

    public static void registerTorchBlocks() {
        initTorchBlock("torches/acacia_torch", ACACIA_TORCH,"torches/wall_acacia_torch", WALL_ACACIA_TORCH);
        initTorchBlock("torches/birch_torch", BIRCH_TORCH,"torches/wall_birch_torch", WALL_BIRCH_TORCH);
        initTorchBlock("torches/crimson_torch", CRIMSON_TORCH,"torches/wall_crimson_torch", WALL_CRIMSON_TORCH);
        initTorchBlock("torches/dark_oak_torch", DARK_OAK_TORCH,"torches/wall_dark_oak_torch", WALL_DARK_OAK_TORCH);
        initTorchBlock("torches/jungle_torch", JUNGLE_TORCH,"torches/wall_jungle_torch", WALL_JUNGLE_TORCH);
        initTorchBlock("torches/oak_torch", OAK_TORCH,"torches/wall_oak_torch", WALL_OAK_TORCH);
        initTorchBlock("torches/mangrove_torch", MANGROVE_TORCH,"torches/wall_mangrove_torch", WALL_MANGROVE_TORCH);
        initTorchBlock("torches/spruce_torch", SPRUCE_TORCH,"torches/wall_spruce_torch", WALL_SPRUCE_TORCH);
        initTorchBlock("torches/warped_torch", WARPED_TORCH,"torches/wall_warped_torch", WALL_WARPED_TORCH);
    }

    private static void initTorchBlock(String torchName, Block torch, String wallTorchName, Block wallTorch) {
        Registry.register(Registry.BLOCK, new Identifier(Init.MOD_ID, torchName), torch);
        Registry.register(Registry.BLOCK, new Identifier(Init.MOD_ID, wallTorchName), wallTorch);
        Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, torchName), new WallStandingBlockItem(torch, wallTorch, new FabricItemSettings().group(Group.STICKS_AND_STUFF)));

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
            RegisterBlockRenderLayerMap(torch, wallTorch);
    }
    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block, Block wallBlock) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(wallBlock, RenderLayer.getCutout());
    }
}