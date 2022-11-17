package net.xanthian.vsas.blocks;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.*;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

public class Ladders {

    public static void registerLadders() {
        VariantLadderBlock ACACIA_LADDER = new VariantLadderBlock();
        registerLadderBlock("ladders/acacia_ladder", ACACIA_LADDER, true);

        VariantLadderBlock BIRCH_LADDER = new VariantLadderBlock();
        registerLadderBlock("ladders/birch_ladder", BIRCH_LADDER, true);

        VariantLadderBlock CRIMSON_LADDER = new VariantLadderBlock();
        registerLadderBlock("ladders/crimson_ladder", CRIMSON_LADDER, false);

        VariantLadderBlock DARK_OAK_LADDER = new VariantLadderBlock();
        registerLadderBlock("ladders/dark_oak_ladder", DARK_OAK_LADDER, true);

        VariantLadderBlock JUNGLE_LADDER = new VariantLadderBlock();
        registerLadderBlock("ladders/jungle_ladder", JUNGLE_LADDER, true);

        VariantLadderBlock OAK_LADDER = new VariantLadderBlock();
        registerLadderBlock("ladders/oak_ladder", OAK_LADDER, true);

        VariantLadderBlock MANGROVE_LADDER = new VariantLadderBlock();
        registerLadderBlock("ladders/mangrove_ladder", MANGROVE_LADDER, true);

        VariantLadderBlock SPRUCE_LADDER = new VariantLadderBlock();
        registerLadderBlock("ladders/spruce_ladder", SPRUCE_LADDER, true);

        VariantLadderBlock WARPED_LADDER = new VariantLadderBlock();
        registerLadderBlock("ladders/warped_ladder", WARPED_LADDER, false);
    }


    private static void registerLadderBlock(String Id, Block block, boolean canBurn) {
        Identifier identifier = new Identifier(Init.MOD_ID, Id.toLowerCase());
        Registry.register(Registry.BLOCK, identifier, block);
        Registry.register(Registry.ITEM, identifier, new BlockItem(block, new FabricItemSettings().group(Init.STICKS_AND_STUFF)));
        if (canBurn) FuelRegistry.INSTANCE.add(block, 300);

        if (FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT)
            RegisterBlockRenderLayerMap(block);
    }

    @Environment(EnvType.CLIENT)
    private static void RegisterBlockRenderLayerMap(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

    }
}