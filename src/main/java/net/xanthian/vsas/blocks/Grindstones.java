package net.xanthian.vsas.blocks;

import com.google.common.collect.Maps;
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

import java.util.Map;

public class Grindstones {

    public static Map<Identifier, Block> MOD_GRINDSTONES = Maps.newHashMap();

    public static void registerGrindstones() {
        VariantGrindstoneBlock ACACIA_GRINDSTONE = new VariantGrindstoneBlock();
        registerGrindstoneBlock("grindstones/acacia_grindstone", ACACIA_GRINDSTONE);
        VariantGrindstoneBlock BIRCH_GRINDSTONE = new VariantGrindstoneBlock();
        registerGrindstoneBlock("grindstones/birch_grindstone", BIRCH_GRINDSTONE);
        VariantGrindstoneBlock CRIMSON_GRINDSTONE = new VariantGrindstoneBlock();
        registerGrindstoneBlock("grindstones/crimson_grindstone", CRIMSON_GRINDSTONE);
        VariantGrindstoneBlock DARK_OAK_GRINDSTONE = new VariantGrindstoneBlock();
        registerGrindstoneBlock("grindstones/dark_oak_grindstone", DARK_OAK_GRINDSTONE);
        VariantGrindstoneBlock JUNGLE_GRINDSTONE = new VariantGrindstoneBlock();
        registerGrindstoneBlock("grindstones/jungle_grindstone", JUNGLE_GRINDSTONE);
        VariantGrindstoneBlock OAK_GRINDSTONE = new VariantGrindstoneBlock();
        registerGrindstoneBlock("grindstones/oak_grindstone", OAK_GRINDSTONE);
        VariantGrindstoneBlock MANGROVE_GRINDSTONE = new VariantGrindstoneBlock();
        registerGrindstoneBlock("grindstones/mangrove_grindstone", MANGROVE_GRINDSTONE);
        VariantGrindstoneBlock SPRUCE_GRINDSTONE = new VariantGrindstoneBlock();
        registerGrindstoneBlock("grindstones/spruce_grindstone", SPRUCE_GRINDSTONE);
        VariantGrindstoneBlock WARPED_GRINDSTONE = new VariantGrindstoneBlock();
        registerGrindstoneBlock("grindstones/warped_grindstone", WARPED_GRINDSTONE);
    }

    private static void registerGrindstoneBlock(String Id, Block block) {
        Identifier identifier = new Identifier(Init.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Init.STICKS_AND_STUFF)));
        MOD_GRINDSTONES.put(identifier, block);

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
            RegisterBlockRenderLayerMap(block);
    }
    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

    }
}
