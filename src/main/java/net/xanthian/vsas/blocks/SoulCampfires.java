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
import net.xanthian.vsas.Group;
import net.xanthian.vsas.Init;

public class SoulCampfires {

    public static final VariantSoulCampFireBlock ACACIA_SOUL_CAMPFIRE = new VariantSoulCampFireBlock();
    public static final VariantSoulCampFireBlock BIRCH_SOUL_CAMPFIRE = new VariantSoulCampFireBlock();
    public static final VariantSoulCampFireBlock CRIMSON_SOUL_CAMPFIRE = new VariantSoulCampFireBlock();
    public static final VariantSoulCampFireBlock DARK_OAK_SOUL_CAMPFIRE = new VariantSoulCampFireBlock();
    public static final VariantSoulCampFireBlock JUNGLE_SOUL_CAMPFIRE = new VariantSoulCampFireBlock();
    public static final VariantSoulCampFireBlock OAK_SOUL_CAMPFIRE = new VariantSoulCampFireBlock();
    public static final VariantSoulCampFireBlock SPRUCE_SOUL_CAMPFIRE = new VariantSoulCampFireBlock();
    public static final VariantSoulCampFireBlock WARPED_SOUL_CAMPFIRE = new VariantSoulCampFireBlock();

    public static void registerCampfire() {
        registerSoulCampfireBlock("campfires/acacia_soul_campfire", ACACIA_SOUL_CAMPFIRE);
        registerSoulCampfireBlock("campfires/birch_soul_campfire", BIRCH_SOUL_CAMPFIRE);
        registerSoulCampfireBlock("campfires/crimson_soul_campfire", CRIMSON_SOUL_CAMPFIRE);
        registerSoulCampfireBlock("campfires/dark_oak_soul_campfire", DARK_OAK_SOUL_CAMPFIRE);
        registerSoulCampfireBlock("campfires/jungle_soul_campfire", JUNGLE_SOUL_CAMPFIRE);
        registerSoulCampfireBlock("campfires/oak_soul_campfire", OAK_SOUL_CAMPFIRE);
        registerSoulCampfireBlock("campfires/spruce_soul_campfire", SPRUCE_SOUL_CAMPFIRE);
        registerSoulCampfireBlock("campfires/warped_soul_campfire", WARPED_SOUL_CAMPFIRE);
    }

    private static void registerSoulCampfireBlock(String Id, Block block) {
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
