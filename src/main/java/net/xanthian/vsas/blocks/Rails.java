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
    public static final VariantRailBlock SPRUCE_RAIL = new VariantRailBlock();
    public static final VariantRailBlock WARPED_RAIL = new VariantRailBlock();

    public static void registerRails() {
        registerRailBlock("rails/acacia_rail", ACACIA_RAIL);
        registerRailBlock("rails/birch_rail", BIRCH_RAIL);
        registerRailBlock("rails/crimson_rail", CRIMSON_RAIL);
        registerRailBlock("rails/dark_oak_rail", DARK_OAK_RAIL);
        registerRailBlock("rails/jungle_rail", JUNGLE_RAIL);
        registerRailBlock("rails/oak_rail", OAK_RAIL);
        registerRailBlock("rails/spruce_rail", SPRUCE_RAIL);
        registerRailBlock("rails/warped_rail", WARPED_RAIL);
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