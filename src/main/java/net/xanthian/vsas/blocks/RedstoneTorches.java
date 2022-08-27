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
import net.xanthian.vsas.Init;

public class RedstoneTorches {

    public static void registerRedstoneTorches() {
    VariantRedstoneTorchBlock ACACIA_REDSTONE_TORCH = new VariantRedstoneTorchBlock(); 
    VariantWallRedstoneTorchBlock WALL_ACACIA_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock(); registerTorchBlock("torches/acacia_redstone_torch", ACACIA_REDSTONE_TORCH,"torches/wall_acacia_redstone_torch", WALL_ACACIA_REDSTONE_TORCH);
    VariantRedstoneTorchBlock BIRCH_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    VariantWallRedstoneTorchBlock WALL_BIRCH_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();registerTorchBlock("torches/birch_redstone_torch", BIRCH_REDSTONE_TORCH,"torches/wall_birch_redstone_torch", WALL_BIRCH_REDSTONE_TORCH);
    VariantRedstoneTorchBlock CRIMSON_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    VariantWallRedstoneTorchBlock WALL_CRIMSON_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();registerTorchBlock("torches/crimson_redstone_torch", CRIMSON_REDSTONE_TORCH,"torches/wall_crimson_redstone_torch", WALL_CRIMSON_REDSTONE_TORCH);
    VariantRedstoneTorchBlock DARK_OAK_REDSTONE_TORCH  = new VariantRedstoneTorchBlock();
    VariantWallRedstoneTorchBlock WALL_DARK_OAK_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();registerTorchBlock("torches/dark_oak_redstone_torch", DARK_OAK_REDSTONE_TORCH,"torches/wall_dark_oak_redstone_torch", WALL_DARK_OAK_REDSTONE_TORCH);
    VariantRedstoneTorchBlock JUNGLE_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    VariantWallRedstoneTorchBlock WALL_JUNGLE_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();registerTorchBlock("torches/jungle_redstone_torch", JUNGLE_REDSTONE_TORCH,"torches/wall_jungle_redstone_torch", WALL_JUNGLE_REDSTONE_TORCH);
    VariantRedstoneTorchBlock OAK_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    VariantWallRedstoneTorchBlock WALL_OAK_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();registerTorchBlock("torches/oak_redstone_torch", OAK_REDSTONE_TORCH,"torches/wall_oak_redstone_torch", WALL_OAK_REDSTONE_TORCH);
    VariantRedstoneTorchBlock MANGROVE_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    VariantWallRedstoneTorchBlock WALL_MANGROVE_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();registerTorchBlock("torches/mangrove_redstone_torch", MANGROVE_REDSTONE_TORCH,"torches/wall_mangrove_redstone_torch", WALL_MANGROVE_REDSTONE_TORCH);
    VariantRedstoneTorchBlock SPRUCE_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    VariantWallRedstoneTorchBlock WALL_SPRUCE_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();registerTorchBlock("torches/spruce_redstone_torch", SPRUCE_REDSTONE_TORCH,"torches/wall_spruce_redstone_torch", WALL_SPRUCE_REDSTONE_TORCH);
    VariantRedstoneTorchBlock WARPED_REDSTONE_TORCH = new VariantRedstoneTorchBlock();
    VariantWallRedstoneTorchBlock WALL_WARPED_REDSTONE_TORCH = new VariantWallRedstoneTorchBlock();registerTorchBlock("torches/warped_redstone_torch", WARPED_REDSTONE_TORCH,"torches/wall_warped_redstone_torch", WALL_WARPED_REDSTONE_TORCH);

    }
    private static void registerTorchBlock(String torchName, Block torch, String wallTorchName, Block wallTorch) {
        Registry.register(Registry.BLOCK, new Identifier(Init.MOD_ID, torchName), torch);
        Registry.register(Registry.BLOCK, new Identifier(Init.MOD_ID, wallTorchName), wallTorch);
        Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, torchName), new WallStandingBlockItem(torch, wallTorch, new FabricItemSettings().group(Init.STICKS_AND_STUFF)));

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
            RegisterBlockRenderLayerMap(torch, wallTorch);
    }
    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block, Block wallBlock) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(wallBlock, RenderLayer.getCutout());
    }
}