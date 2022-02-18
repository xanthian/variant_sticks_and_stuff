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
import net.xanthian.vsas.Group;
import net.xanthian.vsas.Init;

    public class Levers {

        public static final VariantLeverBlock ACACIA_LEVER = new VariantLeverBlock();
        public static final VariantLeverBlock BIRCH_LEVER = new VariantLeverBlock();
        public static final VariantLeverBlock CRIMSON_LEVER = new VariantLeverBlock();
        public static final VariantLeverBlock DARK_OAK_LEVER = new VariantLeverBlock();
        public static final VariantLeverBlock JUNGLE_LEVER = new VariantLeverBlock();
        public static final VariantLeverBlock OAK_LEVER = new VariantLeverBlock();
        public static final VariantLeverBlock SPRUCE_LEVER = new VariantLeverBlock();
        public static final VariantLeverBlock WARPED_LEVER = new VariantLeverBlock();

        public static void registerLevers() {
            registerLeverBlock("levers/acacia_lever", ACACIA_LEVER);
            registerLeverBlock("levers/birch_lever", BIRCH_LEVER);
            registerLeverBlock("levers/crimson_lever", CRIMSON_LEVER);
            registerLeverBlock("levers/dark_oak_lever", DARK_OAK_LEVER);
            registerLeverBlock("levers/jungle_lever", JUNGLE_LEVER);
            registerLeverBlock("levers/oak_lever", OAK_LEVER);
            registerLeverBlock("levers/spruce_lever", SPRUCE_LEVER);
            registerLeverBlock("levers/warped_lever", WARPED_LEVER);
        }

        private static void registerLeverBlock(String Id, Block block) {
            Identifier identifier = new Identifier(Init.MOD_ID, Id.toLowerCase());
            Registry.register(Registry.BLOCK, identifier, block);
            Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Group.STICKS_AND_STUFF)));

            if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
                RegisterBlockRenderLayerMap(block);
        }

        @Environment(EnvType.CLIENT)
        private static void RegisterBlockRenderLayerMap(Block block) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

        }
    }
