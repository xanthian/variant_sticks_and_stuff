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

public class SoulTorches {

    public static final VariantSoulTorchBlock ACACIA_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final VariantWallSoulTorchBlock WALL_ACACIA_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final VariantSoulTorchBlock BIRCH_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final VariantWallSoulTorchBlock WALL_BIRCH_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final VariantSoulTorchBlock CRIMSON_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final VariantWallSoulTorchBlock WALL_CRIMSON_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final VariantSoulTorchBlock DARK_OAK_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final VariantWallSoulTorchBlock WALL_DARK_OAK_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final VariantSoulTorchBlock JUNGLE_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final VariantWallSoulTorchBlock WALL_JUNGLE_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final VariantSoulTorchBlock OAK_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final VariantWallSoulTorchBlock WALL_OAK_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final VariantSoulTorchBlock SPRUCE_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final VariantWallSoulTorchBlock WALL_SPRUCE_SOUL_TORCH = new VariantWallSoulTorchBlock();
    public static final VariantSoulTorchBlock WARPED_SOUL_TORCH = new VariantSoulTorchBlock();
    public static final VariantWallSoulTorchBlock WALL_WARPED_SOUL_TORCH = new VariantWallSoulTorchBlock();

    public static void registerSoulTorchBlocks() {
        initTorchBlock("torches/acacia_soul_torch", ACACIA_SOUL_TORCH,"torches/wall_acacia_soul_torch", WALL_ACACIA_SOUL_TORCH);
        initTorchBlock("torches/birch_soul_torch", BIRCH_SOUL_TORCH,"torches/wall_birch_soul_torch", WALL_BIRCH_SOUL_TORCH);
        initTorchBlock("torches/crimson_soul_torch", CRIMSON_SOUL_TORCH,"torches/wall_crimson_soul_torch", WALL_CRIMSON_SOUL_TORCH);
        initTorchBlock("torches/dark_oak_soul_torch", DARK_OAK_SOUL_TORCH,"torches/wall_dark_oak_soul_torch", WALL_DARK_OAK_SOUL_TORCH);
        initTorchBlock("torches/jungle_soul_torch", JUNGLE_SOUL_TORCH,"torches/wall_jungle_soul_torch", WALL_JUNGLE_SOUL_TORCH);
        initTorchBlock("torches/oak_soul_torch", OAK_SOUL_TORCH,"torches/wall_oak_soul_torch", WALL_OAK_SOUL_TORCH);
        initTorchBlock("torches/spruce_soul_torch", SPRUCE_SOUL_TORCH,"torches/wall_spruce_soul_torch", WALL_SPRUCE_SOUL_TORCH);
        initTorchBlock("torches/warped_soul_torch", WARPED_SOUL_TORCH,"torches/wall_warped_soul_torch", WALL_WARPED_SOUL_TORCH);
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