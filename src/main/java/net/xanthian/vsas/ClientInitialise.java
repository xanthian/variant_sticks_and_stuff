package net.xanthian.vsas;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import net.minecraft.client.render.RenderLayer;
import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.Bows;
import net.xanthian.vsas.items.Crossbows;
import net.xanthian.vsas.items.FishingRods;
import net.xanthian.vsas.renderer.arrows.*;

import static net.xanthian.vsas.renderer.VariantItemsClientRenderer.*;

@Environment(EnvType.CLIENT)
public class ClientInitialise implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        registerBowPredicates(Bows.ACACIA_BOW);
        registerBowPredicates(Bows.BIRCH_BOW);
        registerBowPredicates(Bows.CRIMSON_BOW);
        registerBowPredicates(Bows.DARK_OAK_BOW);
        registerBowPredicates(Bows.JUNGLE_BOW);
        registerBowPredicates(Bows.OAK_BOW);
        registerBowPredicates(Bows.MANGROVE_BOW);
        registerBowPredicates(Bows.SPRUCE_BOW);
        registerBowPredicates(Bows.WARPED_BOW);

        registerCrossbowPredicates(Crossbows.ACACIA_CROSSBOW);
        registerCrossbowPredicates(Crossbows.BIRCH_CROSSBOW);
        registerCrossbowPredicates(Crossbows.CRIMSON_CROSSBOW);
        registerCrossbowPredicates(Crossbows.DARK_OAK_CROSSBOW);
        registerCrossbowPredicates(Crossbows.JUNGLE_CROSSBOW);
        registerCrossbowPredicates(Crossbows.OAK_CROSSBOW);
        registerCrossbowPredicates(Crossbows.MANGROVE_CROSSBOW);
        registerCrossbowPredicates(Crossbows.SPRUCE_CROSSBOW);
        registerCrossbowPredicates(Crossbows.WARPED_CROSSBOW);

        EntityRendererRegistry.register(EntityInit.ACACIA_ARROW, AcaciaArrowRender::new);
        EntityRendererRegistry.register(EntityInit.BIRCH_ARROW, BirchArrowRender::new);
        EntityRendererRegistry.register(EntityInit.CRIMSON_ARROW, CrimsonArrowRender::new);
        EntityRendererRegistry.register(EntityInit.DARK_OAK_ARROW, DarkOakArrowRender::new);
        EntityRendererRegistry.register(EntityInit.JUNGLE_ARROW, JungleArrowRender::new);
        EntityRendererRegistry.register(EntityInit.OAK_ARROW, OakArrowRender::new);
        EntityRendererRegistry.register(EntityInit.MANGROVE_ARROW, MangroveArrowRender::new);
        EntityRendererRegistry.register(EntityInit.SPRUCE_ARROW, SpruceArrowRender::new);
        EntityRendererRegistry.register(EntityInit.WARPED_ARROW, WarpedArrowRender::new);
        
        registerRodPredicates(FishingRods.ACACIA_FISHING_ROD);
        registerRodPredicates(FishingRods.BIRCH_FISHING_ROD);
        registerRodPredicates(FishingRods.CRIMSON_FISHING_ROD);
        registerRodPredicates(FishingRods.DARK_OAK_FISHING_ROD);
        registerRodPredicates(FishingRods.JUNGLE_FISHING_ROD);
        registerRodPredicates(FishingRods.OAK_FISHING_ROD);
        registerRodPredicates(FishingRods.MANGROVE_FISHING_ROD);
        registerRodPredicates(FishingRods.SPRUCE_FISHING_ROD);
        registerRodPredicates(FishingRods.WARPED_FISHING_ROD);
        
        BlockRenderLayerMap.INSTANCE.putBlock(Ladders.ACACIA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Ladders.BIRCH_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Ladders.CRIMSON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Ladders.DARK_OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Ladders.JUNGLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Ladders.MANGROVE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Ladders.OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Ladders.SPRUCE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Ladders.WARPED_LADDER, RenderLayer.getCutout());
        
        BlockRenderLayerMap.INSTANCE.putBlock(Levers.ACACIA_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Levers.BIRCH_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Levers.CRIMSON_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Levers.DARK_OAK_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Levers.JUNGLE_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Levers.MANGROVE_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Levers.OAK_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Levers.SPRUCE_LEVER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Levers.WARPED_LEVER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Grindstones.ACACIA_GRINDSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Grindstones.BIRCH_GRINDSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Grindstones.CRIMSON_GRINDSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Grindstones.DARK_OAK_GRINDSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Grindstones.JUNGLE_GRINDSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Grindstones.MANGROVE_GRINDSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Grindstones.OAK_GRINDSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Grindstones.SPRUCE_GRINDSTONE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Grindstones.WARPED_GRINDSTONE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.ACACIA_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.BIRCH_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.CRIMSON_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.DARK_OAK_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.JUNGLE_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.MANGROVE_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.OAK_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.SPRUCE_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.WARPED_CAMPFIRE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.ACACIA_SOUL_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.BIRCH_SOUL_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.CRIMSON_SOUL_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.DARK_OAK_SOUL_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.JUNGLE_SOUL_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.MANGROVE_SOUL_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.OAK_SOUL_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.SPRUCE_SOUL_CAMPFIRE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Campfires.WARPED_SOUL_CAMPFIRE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Rails.ACACIA_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.BIRCH_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.CRIMSON_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.DARK_OAK_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.JUNGLE_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.MANGROVE_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.OAK_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.SPRUCE_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.WARPED_RAIL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Rails.ACACIA_ACTIVATOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.BIRCH_ACTIVATOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.CRIMSON_ACTIVATOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.DARK_OAK_ACTIVATOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.JUNGLE_ACTIVATOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.MANGROVE_ACTIVATOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.OAK_ACTIVATOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.SPRUCE_ACTIVATOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.WARPED_ACTIVATOR_RAIL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Rails.ACACIA_DETECTOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.BIRCH_DETECTOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.CRIMSON_DETECTOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.DARK_OAK_DETECTOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.JUNGLE_DETECTOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.MANGROVE_DETECTOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.OAK_DETECTOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.SPRUCE_DETECTOR_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.WARPED_DETECTOR_RAIL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Rails.ACACIA_POWERED_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.BIRCH_POWERED_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.CRIMSON_POWERED_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.DARK_OAK_POWERED_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.JUNGLE_POWERED_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.MANGROVE_POWERED_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.OAK_POWERED_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.SPRUCE_POWERED_RAIL, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Rails.WARPED_POWERED_RAIL, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(Torches.ACACIA_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Torches.BIRCH_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Torches.CRIMSON_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Torches.DARK_OAK_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Torches.JUNGLE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Torches.MANGROVE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Torches.OAK_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Torches.SPRUCE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Torches.WARPED_TORCH, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(RedstoneTorches.ACACIA_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RedstoneTorches.BIRCH_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RedstoneTorches.CRIMSON_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RedstoneTorches.DARK_OAK_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RedstoneTorches.JUNGLE_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RedstoneTorches.MANGROVE_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RedstoneTorches.OAK_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RedstoneTorches.SPRUCE_REDSTONE_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(RedstoneTorches.WARPED_REDSTONE_TORCH, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(SoulTorches.ACACIA_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulTorches.BIRCH_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulTorches.CRIMSON_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulTorches.DARK_OAK_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulTorches.JUNGLE_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulTorches.MANGROVE_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulTorches.OAK_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulTorches.SPRUCE_SOUL_TORCH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(SoulTorches.WARPED_SOUL_TORCH, RenderLayer.getCutout());

    }
}