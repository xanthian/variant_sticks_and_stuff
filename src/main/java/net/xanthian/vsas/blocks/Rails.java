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

public class Rails {

    public static final VariantRailBlock ACACIA_RAIL = new VariantRailBlock();
    public static final VariantRailBlock BIRCH_RAIL = new VariantRailBlock();
    public static final VariantRailBlock CRIMSON_RAIL = new VariantRailBlock();
    public static final VariantRailBlock DARK_OAK_RAIL = new VariantRailBlock();
    public static final VariantRailBlock JUNGLE_RAIL = new VariantRailBlock();
    public static final VariantRailBlock OAK_RAIL = new VariantRailBlock();
    public static final VariantRailBlock MANGROVE_RAIL = new VariantRailBlock();
    public static final VariantRailBlock SPRUCE_RAIL = new VariantRailBlock();
    public static final VariantRailBlock WARPED_RAIL = new VariantRailBlock();

    public static final VariantActivatorRailBlock ACACIA_ACTIVATOR_RAIL = new VariantActivatorRailBlock();
    public static final VariantActivatorRailBlock BIRCH_ACTIVATOR_RAIL = new VariantActivatorRailBlock();
    public static final VariantActivatorRailBlock CRIMSON_ACTIVATOR_RAIL = new VariantActivatorRailBlock();
    public static final VariantActivatorRailBlock DARK_OAK_ACTIVATOR_RAIL = new VariantActivatorRailBlock();
    public static final VariantActivatorRailBlock JUNGLE_ACTIVATOR_RAIL = new VariantActivatorRailBlock();
    public static final VariantActivatorRailBlock OAK_ACTIVATOR_RAIL = new VariantActivatorRailBlock();
    public static final VariantActivatorRailBlock MANGROVE_ACTIVATOR_RAIL = new VariantActivatorRailBlock();
    public static final VariantActivatorRailBlock SPRUCE_ACTIVATOR_RAIL = new VariantActivatorRailBlock();
    public static final VariantActivatorRailBlock WARPED_ACTIVATOR_RAIL = new VariantActivatorRailBlock();

    //public static final VariantDetectorRailBlock ACACIA_DETECTOR_RAIL = new VariantDetectorRailBlock();
    //public static final VariantDetectorRailBlock BIRCH_DETECTOR_RAIL = new VariantDetectorRailBlock();
    //public static final VariantDetectorRailBlock CRIMSON_DETECTOR_RAIL = new VariantDetectorRailBlock();
    //public static final VariantDetectorRailBlock DARK_OAK_DETECTOR_RAIL = new VariantDetectorRailBlock();
    //public static final VariantDetectorRailBlock JUNGLE_DETECTOR_RAIL = new VariantDetectorRailBlock();
    //public static final VariantDetectorRailBlock OAK_DETECTOR_RAIL = new VariantDetectorRailBlock();
    //public static final VariantDetectorRailBlock MANGROVE_DETECTOR_RAIL = new VariantDetectorRailBlock();
    //public static final VariantDetectorRailBlock SPRUCE_DETECTOR_RAIL = new VariantDetectorRailBlock();
    //public static final VariantDetectorRailBlock WARPED_DETECTOR_RAIL = new VariantDetectorRailBlock();

    public static final VariantPoweredRailBlock ACACIA_POWERED_RAIL = new VariantPoweredRailBlock();
    public static final VariantPoweredRailBlock BIRCH_POWERED_RAIL = new VariantPoweredRailBlock();
    public static final VariantPoweredRailBlock CRIMSON_POWERED_RAIL = new VariantPoweredRailBlock();
    public static final VariantPoweredRailBlock DARK_OAK_POWERED_RAIL = new VariantPoweredRailBlock();
    public static final VariantPoweredRailBlock JUNGLE_POWERED_RAIL = new VariantPoweredRailBlock();
    public static final VariantPoweredRailBlock OAK_POWERED_RAIL = new VariantPoweredRailBlock();
    public static final VariantPoweredRailBlock MANGROVE_POWERED_RAIL = new VariantPoweredRailBlock();
    public static final VariantPoweredRailBlock SPRUCE_POWERED_RAIL = new VariantPoweredRailBlock();
    public static final VariantPoweredRailBlock WARPED_POWERED_RAIL = new VariantPoweredRailBlock();

    public static void registerRails() {
        registerRailBlock("rails/acacia_rail", ACACIA_RAIL);
        registerRailBlock("rails/birch_rail", BIRCH_RAIL);
        registerRailBlock("rails/crimson_rail", CRIMSON_RAIL);
        registerRailBlock("rails/dark_oak_rail", DARK_OAK_RAIL);
        registerRailBlock("rails/jungle_rail", JUNGLE_RAIL);
        registerRailBlock("rails/oak_rail", OAK_RAIL);
        registerRailBlock("rails/mangrove_rail", MANGROVE_RAIL);
        registerRailBlock("rails/spruce_rail", SPRUCE_RAIL);
        registerRailBlock("rails/warped_rail", WARPED_RAIL);
    }
    public static void registerActivatorRails() {
        registerRailBlock("rails/acacia_activator_rail", ACACIA_ACTIVATOR_RAIL);
        registerRailBlock("rails/birch_activator_rail", BIRCH_ACTIVATOR_RAIL);
        registerRailBlock("rails/crimson_activator_rail", CRIMSON_ACTIVATOR_RAIL);
        registerRailBlock("rails/dark_oak_activator_rail", DARK_OAK_ACTIVATOR_RAIL);
        registerRailBlock("rails/jungle_activator_rail", JUNGLE_ACTIVATOR_RAIL);
        registerRailBlock("rails/oak_activator_rail", OAK_ACTIVATOR_RAIL);
        registerRailBlock("rails/mangrove_activator_rail", MANGROVE_ACTIVATOR_RAIL);
        registerRailBlock("rails/spruce_activator_rail", SPRUCE_ACTIVATOR_RAIL);
        registerRailBlock("rails/warped_activator_rail", WARPED_ACTIVATOR_RAIL);
    }
    //public static void registerDetectorRails() {
        //registerRailBlock("rails/acacia_detector_rail", ACACIA_DETECTOR_RAIL);
        //registerRailBlock("rails/birch_detector_rail", BIRCH_DETECTOR_RAIL);
        //registerRailBlock("rails/crimson_detector_rail", CRIMSON_DETECTOR_RAIL);
        //registerRailBlock("rails/dark_oak_detector_rail", DARK_OAK_DETECTOR_RAIL);
        //registerRailBlock("rails/jungle_detector_rail", JUNGLE_DETECTOR_RAIL);
        //registerRailBlock("rails/oak_detector_rail", OAK_DETECTOR_RAIL);
        //registerRailBlock("rails/mangrove_detector_rail", MANGROVE_DETECTOR_RAIL);
        //registerRailBlock("rails/spruce_detector_rail", SPRUCE_DETECTOR_RAIL);
        //registerRailBlock("rails/warped_detector_rail", WARPED_DETECTOR_RAIL);

        public static void registerPoweredRails() {
        registerRailBlock("rails/acacia_powered_rail", ACACIA_POWERED_RAIL);
        registerRailBlock("rails/birch_powered_rail", BIRCH_POWERED_RAIL);
        registerRailBlock("rails/crimson_powered_rail", CRIMSON_POWERED_RAIL);
        registerRailBlock("rails/dark_oak_powered_rail", DARK_OAK_POWERED_RAIL);
        registerRailBlock("rails/jungle_powered_rail", JUNGLE_POWERED_RAIL);
        registerRailBlock("rails/oak_powered_rail", OAK_POWERED_RAIL);
        registerRailBlock("rails/mangrove_powered_rail", MANGROVE_POWERED_RAIL);
        registerRailBlock("rails/spruce_powered_rail", SPRUCE_POWERED_RAIL);
        registerRailBlock("rails/warped_powered_rail", WARPED_POWERED_RAIL);
    }

    private static void registerRailBlock(String Id, Block block) {
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