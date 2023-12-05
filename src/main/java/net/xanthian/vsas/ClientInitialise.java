package net.xanthian.vsas;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.Bows;
import net.xanthian.vsas.items.Brushes;
import net.xanthian.vsas.items.Crossbows;
import net.xanthian.vsas.items.FishingRods;
import net.xanthian.vsas.renderer.arrows.*;

import static net.xanthian.vsas.renderer.VariantItemsClientRenderer.*;

@Environment(EnvType.CLIENT)
public class ClientInitialise implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        for (Item bows : Bows.MOD_BOWS.values()) {
            registerBowPredicates(bows);
        }
        for (Item brushes : Brushes.MOD_BRUSHES.values()) {
            registerBrushPredicates(brushes);
        }
        for (Item crossbows : Crossbows.MOD_CROSSBOWS.values()) {
            registerCrossbowPredicates(crossbows);
        }

        EntityRendererRegistry.register(EntityInit.ACACIA_ARROW, AcaciaArrowRender::new);
        EntityRendererRegistry.register(EntityInit.BAMBOO_ARROW, BambooArrowRender::new);
        EntityRendererRegistry.register(EntityInit.BIRCH_ARROW, BirchArrowRender::new);
        EntityRendererRegistry.register(EntityInit.CHERRY_ARROW, CherryArrowRender::new);
        EntityRendererRegistry.register(EntityInit.CRIMSON_ARROW, CrimsonArrowRender::new);
        EntityRendererRegistry.register(EntityInit.DARK_OAK_ARROW, DarkOakArrowRender::new);
        EntityRendererRegistry.register(EntityInit.JUNGLE_ARROW, JungleArrowRender::new);
        EntityRendererRegistry.register(EntityInit.OAK_ARROW, OakArrowRender::new);
        EntityRendererRegistry.register(EntityInit.MANGROVE_ARROW, MangroveArrowRender::new);
        EntityRendererRegistry.register(EntityInit.WARPED_ARROW, WarpedArrowRender::new);

        for (Item rods : FishingRods.MOD_FISHING_RODS.values()) {
            registerRodPredicates(rods);
        }

        for (Block ladders : Ladders.MOD_LADDERS.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(ladders, RenderLayer.getCutout());
        }

        for (Block levers : Levers.MOD_LEVERS.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(levers, RenderLayer.getCutout());
        }

        for (Block grindstones : Grindstones.MOD_GRINDSTONES.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(grindstones, RenderLayer.getCutout());
        }

        for (Block campfires : Campfires.MOD_CAMPFIRES.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(campfires, RenderLayer.getCutout());
        }

        for (Block campfires : SoulCampfires.MOD_SOUL_CAMPFIRES.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(campfires, RenderLayer.getCutout());
        }

        for (Block rails : ActivatorRails.MOD_ACTIVATOR_RAILS.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(rails, RenderLayer.getCutout());
        }

        for (Block rails : DetectorRails.MOD_DETECTOR_RAILS.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(rails, RenderLayer.getCutout());
        }

        for (Block rails : PoweredRails.MOD_POWERED_RAILS.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(rails, RenderLayer.getCutout());
        }

        for (Block rails : Rails.MOD_RAILS.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(rails, RenderLayer.getCutout());
        }

        for (Block redstonetorch : RedstoneTorches.MOD_REDSTONE_TORCHES.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(redstonetorch, RenderLayer.getCutout());
        }

        for (Block soultorch : SoulTorches.MOD_SOUL_TORCHES.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(soultorch, RenderLayer.getCutout());
        }

        for (Block torch : Torches.MOD_TORCHES.values()) {
            BlockRenderLayerMap.INSTANCE.putBlock(torch, RenderLayer.getCutout());
        }
    }
}
