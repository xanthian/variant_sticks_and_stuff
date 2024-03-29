package net.xanthian.vsas.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

    public class Levers {

        public static void registerLevers() {
            VariantLeverBlock ACACIA_LEVER = new VariantLeverBlock();
            registerLeverBlock("levers/acacia_lever", ACACIA_LEVER);

            VariantLeverBlock BIRCH_LEVER = new VariantLeverBlock();
            registerLeverBlock("levers/birch_lever", BIRCH_LEVER);

            VariantLeverBlock CRIMSON_LEVER = new VariantLeverBlock();
            registerLeverBlock("levers/crimson_lever", CRIMSON_LEVER);

            VariantLeverBlock DARK_OAK_LEVER = new VariantLeverBlock();
            registerLeverBlock("levers/dark_oak_lever", DARK_OAK_LEVER);

            VariantLeverBlock JUNGLE_LEVER = new VariantLeverBlock();
            registerLeverBlock("levers/jungle_lever", JUNGLE_LEVER);

            VariantLeverBlock OAK_LEVER = new VariantLeverBlock();
            registerLeverBlock("levers/oak_lever", OAK_LEVER);

            VariantLeverBlock MANGROVE_LEVER = new VariantLeverBlock();
            registerLeverBlock("levers/mangrove_lever", MANGROVE_LEVER);

            VariantLeverBlock SPRUCE_LEVER = new VariantLeverBlock();
            registerLeverBlock("levers/spruce_lever", SPRUCE_LEVER);

            VariantLeverBlock WARPED_LEVER = new VariantLeverBlock();
            registerLeverBlock("levers/warped_lever", WARPED_LEVER);
        }

        private static void registerLeverBlock(String Id, Block block) {
            Identifier identifier = new Identifier(Init.MOD_ID, Id.toLowerCase());
            Registry.register(Registry.BLOCK, identifier, block);
            Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Init.STICKS_AND_STUFF)));

            if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
                RegisterBlockRenderLayerMap(block);
        }

        @Environment(EnvType.CLIENT)
        private static void RegisterBlockRenderLayerMap(Block block) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }
    }