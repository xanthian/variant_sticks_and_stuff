package net.xanthian.vsas.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

public class Campfires {

    public static void RegisterCampfires() {
        VariantCampFireBlock ACACIA_CAMPFIRE = new VariantCampFireBlock(1);
        registerCampfireBlock("campfires/acacia_campfire", ACACIA_CAMPFIRE);

        VariantCampFireBlock BIRCH_CAMPFIRE = new VariantCampFireBlock(1);
        registerCampfireBlock("campfires/birch_campfire", BIRCH_CAMPFIRE);

        VariantCampFireBlock CRIMSON_CAMPFIRE = new VariantCampFireBlock(1);
        registerCampfireBlock("campfires/crimson_campfire", CRIMSON_CAMPFIRE);

        VariantCampFireBlock DARK_OAK_CAMPFIRE = new VariantCampFireBlock(1);
        registerCampfireBlock("campfires/dark_oak_campfire", DARK_OAK_CAMPFIRE);

        VariantCampFireBlock JUNGLE_CAMPFIRE = new VariantCampFireBlock(1);
        registerCampfireBlock("campfires/jungle_campfire", JUNGLE_CAMPFIRE);

        VariantCampFireBlock OAK_CAMPFIRE = new VariantCampFireBlock(1);
        registerCampfireBlock("campfires/oak_campfire", OAK_CAMPFIRE);

        VariantCampFireBlock MANGROVE_CAMPFIRE = new VariantCampFireBlock(1);
        registerCampfireBlock("campfires/mangrove_campfire", MANGROVE_CAMPFIRE);

        VariantCampFireBlock SPRUCE_CAMPFIRE = new VariantCampFireBlock(1);
        registerCampfireBlock("campfires/spruce_campfire", SPRUCE_CAMPFIRE);

        VariantCampFireBlock WARPED_CAMPFIRE = new VariantCampFireBlock(1);
        registerCampfireBlock("campfires/warped_campfire", WARPED_CAMPFIRE);
    }

    public static void registerSoulCampfires() {
        VariantCampFireBlock ACACIA_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
        registerCampfireBlock("campfires/acacia_soul_campfire", ACACIA_SOUL_CAMPFIRE);

        VariantCampFireBlock BIRCH_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
        registerCampfireBlock("campfires/birch_soul_campfire", BIRCH_SOUL_CAMPFIRE);

        VariantCampFireBlock CRIMSON_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
        registerCampfireBlock("campfires/crimson_soul_campfire", CRIMSON_SOUL_CAMPFIRE);

        VariantCampFireBlock DARK_OAK_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
        registerCampfireBlock("campfires/dark_oak_soul_campfire", DARK_OAK_SOUL_CAMPFIRE);

        VariantCampFireBlock JUNGLE_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
        registerCampfireBlock("campfires/jungle_soul_campfire", JUNGLE_SOUL_CAMPFIRE);

        VariantCampFireBlock OAK_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
        registerCampfireBlock("campfires/oak_soul_campfire", OAK_SOUL_CAMPFIRE);

        VariantCampFireBlock MANGROVE_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
        registerCampfireBlock("campfires/mangrove_soul_campfire", MANGROVE_SOUL_CAMPFIRE);

        VariantCampFireBlock SPRUCE_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
        registerCampfireBlock("campfires/spruce_soul_campfire", SPRUCE_SOUL_CAMPFIRE);

        VariantCampFireBlock WARPED_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
        registerCampfireBlock("campfires/warped_soul_campfire", WARPED_SOUL_CAMPFIRE);
    }

    private static void registerCampfireBlock(String Id, Block block) {
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