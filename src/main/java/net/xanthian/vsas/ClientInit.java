package net.xanthian.vsas;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import net.xanthian.vsas.config.VsasConfig;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.Bows;
import net.xanthian.vsas.items.Crossbows;
import net.xanthian.vsas.items.FishingRods;
import net.xanthian.vsas.renderer.CampFireRenderer;
import net.xanthian.vsas.renderer.arrows.*;

import static net.xanthian.vsas.renderer.VariantItemsClientRenderer.*;


@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        //Bows
        if (VsasConfig.items == true) {
            if (VsasConfig.weapons == true) {
                if (VsasConfig.bows == true) {
                    registerBowPredicates(Bows.ACACIA_BOW);
                    registerBowPredicates(Bows.BIRCH_BOW);
                    registerBowPredicates(Bows.CRIMSON_BOW);
                    registerBowPredicates(Bows.DARK_OAK_BOW);
                    registerBowPredicates(Bows.JUNGLE_BOW);
                    registerBowPredicates(Bows.OAK_BOW);
                    registerBowPredicates(Bows.MANGROVE_BOW);
                    registerBowPredicates(Bows.SPRUCE_BOW);
                    registerBowPredicates(Bows.WARPED_BOW);

                    // Crossbows
                    registerCrossbowPredicates(Crossbows.ACACIA_CROSSBOW);
                    registerCrossbowPredicates(Crossbows.BIRCH_CROSSBOW);
                    registerCrossbowPredicates(Crossbows.CRIMSON_CROSSBOW);
                    registerCrossbowPredicates(Crossbows.DARK_OAK_CROSSBOW);
                    registerCrossbowPredicates(Crossbows.JUNGLE_CROSSBOW);
                    registerCrossbowPredicates(Crossbows.OAK_CROSSBOW);
                    registerCrossbowPredicates(Crossbows.MANGROVE_CROSSBOW);
                    registerCrossbowPredicates(Crossbows.SPRUCE_CROSSBOW);
                    registerCrossbowPredicates(Crossbows.WARPED_CROSSBOW);
                }
                // Arrows
                if (VsasConfig.arrows == true) {
                    EntityRendererRegistry.register(EntityInit.ACACIA_ARROW, AcaciaArrowRender::new);
                    EntityRendererRegistry.register(EntityInit.BIRCH_ARROW, BirchArrowRender::new);
                    EntityRendererRegistry.register(EntityInit.CRIMSON_ARROW, CrimsonArrowRender::new);
                    EntityRendererRegistry.register(EntityInit.DARK_OAK_ARROW, DarkOakArrowRender::new);
                    EntityRendererRegistry.register(EntityInit.JUNGLE_ARROW, JungleArrowRender::new);
                    EntityRendererRegistry.register(EntityInit.OAK_ARROW, OakArrowRender::new);
                    EntityRendererRegistry.register(EntityInit.MANGROVE_ARROW, MangroveArrowRender::new);
                    EntityRendererRegistry.register(EntityInit.SPRUCE_ARROW, SpruceArrowRender::new);
                    EntityRendererRegistry.register(EntityInit.WARPED_ARROW, WarpedArrowRender::new);
                }
            }

            if (VsasConfig.fishingrods == true) {
                //Fishing Rods
                registerRodPredicates(FishingRods.ACACIA_FISHING_ROD);
                registerRodPredicates(FishingRods.BIRCH_FISHING_ROD);
                registerRodPredicates(FishingRods.CRIMSON_FISHING_ROD);
                registerRodPredicates(FishingRods.DARK_OAK_FISHING_ROD);
                registerRodPredicates(FishingRods.JUNGLE_FISHING_ROD);
                registerRodPredicates(FishingRods.OAK_FISHING_ROD);
                registerRodPredicates(FishingRods.MANGROVE_FISHING_ROD);
                registerRodPredicates(FishingRods.SPRUCE_FISHING_ROD);
                registerRodPredicates(FishingRods.WARPED_FISHING_ROD);
            }
        }
        if (VsasConfig.blocks == true) {
            if (VsasConfig.campfires == true) {
                BlockEntityRendererRegistry.register(EntityInit.VARIANT_CAMPFIRE, CampFireRenderer::new);
            }
        }
    }
}