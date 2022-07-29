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

public class Campfires {

    public static final VariantCampFireBlock ACACIA_CAMPFIRE = new VariantCampFireBlock(1);
    public static final VariantCampFireBlock BIRCH_CAMPFIRE = new VariantCampFireBlock(1);
    public static final VariantCampFireBlock CRIMSON_CAMPFIRE = new VariantCampFireBlock(1);
    public static final VariantCampFireBlock DARK_OAK_CAMPFIRE = new VariantCampFireBlock(1);
    public static final VariantCampFireBlock JUNGLE_CAMPFIRE = new VariantCampFireBlock(1);
    public static final VariantCampFireBlock OAK_CAMPFIRE = new VariantCampFireBlock(1);
    public static final VariantCampFireBlock MANGROVE_CAMPFIRE = new VariantCampFireBlock(1);
    public static final VariantCampFireBlock SPRUCE_CAMPFIRE = new VariantCampFireBlock(1);
    public static final VariantCampFireBlock WARPED_CAMPFIRE = new VariantCampFireBlock(1);

    public static final VariantCampFireBlock ACACIA_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
    public static final VariantCampFireBlock BIRCH_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
    public static final VariantCampFireBlock CRIMSON_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
    public static final VariantCampFireBlock DARK_OAK_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
    public static final VariantCampFireBlock JUNGLE_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
    public static final VariantCampFireBlock OAK_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
    public static final VariantCampFireBlock MANGROVE_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
    public static final VariantCampFireBlock SPRUCE_SOUL_CAMPFIRE = new VariantCampFireBlock(2);
    public static final VariantCampFireBlock WARPED_SOUL_CAMPFIRE = new VariantCampFireBlock(2);

    public static void registerCampfire() {
        registerCampfireBlock("campfires/acacia_campfire", ACACIA_CAMPFIRE);
        registerCampfireBlock("campfires/birch_campfire", BIRCH_CAMPFIRE);
        registerCampfireBlock("campfires/crimson_campfire", CRIMSON_CAMPFIRE);
        registerCampfireBlock("campfires/dark_oak_campfire", DARK_OAK_CAMPFIRE);
        registerCampfireBlock("campfires/jungle_campfire", JUNGLE_CAMPFIRE);
        registerCampfireBlock("campfires/oak_campfire", OAK_CAMPFIRE);
        registerCampfireBlock("campfires/mangrove_campfire", MANGROVE_CAMPFIRE);
        registerCampfireBlock("campfires/spruce_campfire", SPRUCE_CAMPFIRE);
        registerCampfireBlock("campfires/warped_campfire", WARPED_CAMPFIRE);

        registerCampfireBlock("campfires/acacia_soul_campfire", ACACIA_SOUL_CAMPFIRE);
        registerCampfireBlock("campfires/birch_soul_campfire", BIRCH_SOUL_CAMPFIRE);
        registerCampfireBlock("campfires/crimson_soul_campfire", CRIMSON_SOUL_CAMPFIRE);
        registerCampfireBlock("campfires/dark_oak_soul_campfire", DARK_OAK_SOUL_CAMPFIRE);
        registerCampfireBlock("campfires/jungle_soul_campfire", JUNGLE_SOUL_CAMPFIRE);
        registerCampfireBlock("campfires/oak_soul_campfire", OAK_SOUL_CAMPFIRE);
        registerCampfireBlock("campfires/mangrove_soul_campfire", MANGROVE_SOUL_CAMPFIRE);
        registerCampfireBlock("campfires/spruce_soul_campfire", SPRUCE_SOUL_CAMPFIRE);
        registerCampfireBlock("campfires/warped_soul_campfire", WARPED_SOUL_CAMPFIRE);
    }

    private static void registerCampfireBlock(String Id, Block block) {
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
