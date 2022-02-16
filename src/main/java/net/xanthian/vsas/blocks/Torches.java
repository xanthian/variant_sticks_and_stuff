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
    public static final VariantTorchBlock SPRUCE_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_SPRUCE_TORCH = new VariantWallTorchBlock();
    public static final VariantTorchBlock WARPED_TORCH = new VariantTorchBlock();
    public static final VariantWallTorchBlock WALL_WARPED_TORCH = new VariantWallTorchBlock();

    public static void registerTorchBlocks() {
        initTorchBlock("acacia_torch", ACACIA_TORCH, WALL_ACACIA_TORCH);
        initTorchBlock("birch_torch", BIRCH_TORCH, WALL_BIRCH_TORCH);
        initTorchBlock("crimson_torch", CRIMSON_TORCH, WALL_CRIMSON_TORCH);
        initTorchBlock("dark_oak_torch", DARK_OAK_TORCH, WALL_DARK_OAK_TORCH);
        initTorchBlock("jungle_torch", JUNGLE_TORCH, WALL_JUNGLE_TORCH);
        initTorchBlock("oak_torch", OAK_TORCH, WALL_OAK_TORCH);
        initTorchBlock("spruce_torch", SPRUCE_TORCH, WALL_SPRUCE_TORCH);
        initTorchBlock("warped_torch", WARPED_TORCH, WALL_WARPED_TORCH);
    }

    private static void initTorchBlock(String id, Block block, Block wallBlock) {
        Registry.register(Registry.BLOCK, new Identifier(Init.MOD_ID, id), block);
        Registry.register(Registry.BLOCK, new Identifier(Init.MOD_ID, "wall_" + id), wallBlock);
        Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, id), new WallStandingBlockItem(block, wallBlock, new FabricItemSettings().group(Group.STICKS_AND_STUFF)));

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
            RegisterBlockRenderLayerMap(block, wallBlock);
    }
    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block, Block wallBlock) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(wallBlock, RenderLayer.getCutout());
    }
}