package net.xanthian.vsas.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Group;
import net.xanthian.vsas.Init;

public class Grindstones {


    public static final VariantGrindstoneBlock ACACIA_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock BIRCH_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock CRIMSON_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock DARK_OAK_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock JUNGLE_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock OAK_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock SPRUCE_GRINDSTONE = new VariantGrindstoneBlock();
    public static final VariantGrindstoneBlock WARPED_GRINDSTONE = new VariantGrindstoneBlock();

    public static void registerGrindstone() {
        registerGrindstoneBlock("grindstones/acacia_grindstone", ACACIA_GRINDSTONE);
        registerGrindstoneBlock("grindstones/birch_grindstone", BIRCH_GRINDSTONE);
        registerGrindstoneBlock("grindstones/crimson_grindstone", CRIMSON_GRINDSTONE);
        registerGrindstoneBlock("grindstones/dark_oak_grindstone", DARK_OAK_GRINDSTONE);
        registerGrindstoneBlock("grindstones/jungle_grindstone", JUNGLE_GRINDSTONE);
        registerGrindstoneBlock("grindstones/oak_grindstone", OAK_GRINDSTONE);
        registerGrindstoneBlock("grindstones/spruce_grindstone", SPRUCE_GRINDSTONE);
        registerGrindstoneBlock("grindstones/warped_grindstone", WARPED_GRINDSTONE);
    }

    private static void registerGrindstoneBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Init.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Group.STICKS_AND_STUFF)));

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
            RegisterBlockRenderLayerMap(block);
//        PointOfInterestHelper.register(new Identifier("weaponsmith"),1,1, ACACIA_GRINDSTONE,BIRCH_GRINDSTONE);
    }

    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

    }
}
