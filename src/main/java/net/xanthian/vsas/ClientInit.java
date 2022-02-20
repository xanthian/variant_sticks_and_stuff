package net.xanthian.vsas;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.Bows;
import net.xanthian.vsas.items.Crossbows;
import net.xanthian.vsas.items.FishingRods;
import net.xanthian.vsas.renderer.arrows.*;

import static net.xanthian.vsas.renderer.VariantItemsClientRenderer.*;


@Environment(EnvType.CLIENT)
public class ClientInit implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        //Bows
        registerBowPredicates(Bows.ACACIA_BOW);
        registerBowPredicates(Bows.BIRCH_BOW);
        registerBowPredicates(Bows.CRIMSON_BOW);
        registerBowPredicates(Bows.DARK_OAK_BOW);
        registerBowPredicates(Bows.JUNGLE_BOW);
        registerBowPredicates(Bows.OAK_BOW);
        registerBowPredicates(Bows.SPRUCE_BOW);
        registerBowPredicates(Bows.WARPED_BOW);

        //Fishing Rods
        registerRodPredicates(FishingRods.ACACIA_FISHING_ROD);
        registerRodPredicates(FishingRods.BIRCH_FISHING_ROD);
        registerRodPredicates(FishingRods.CRIMSON_FISHING_ROD);
        registerRodPredicates(FishingRods.DARK_OAK_FISHING_ROD);
        registerRodPredicates(FishingRods.JUNGLE_FISHING_ROD);
        registerRodPredicates(FishingRods.OAK_FISHING_ROD);
        registerRodPredicates(FishingRods.SPRUCE_FISHING_ROD);
        registerRodPredicates(FishingRods.WARPED_FISHING_ROD);

        // Crossbows
        registerCrossbowPredicates(Crossbows.ACACIA_CROSSBOW);
        registerCrossbowPredicates(Crossbows.BIRCH_CROSSBOW);
        registerCrossbowPredicates(Crossbows.CRIMSON_CROSSBOW);
        registerCrossbowPredicates(Crossbows.DARK_OAK_CROSSBOW);
        registerCrossbowPredicates(Crossbows.JUNGLE_CROSSBOW);
        registerCrossbowPredicates(Crossbows.OAK_CROSSBOW);
        registerCrossbowPredicates(Crossbows.SPRUCE_CROSSBOW);
        registerCrossbowPredicates(Crossbows.WARPED_CROSSBOW);

        // Arrows
        EntityRendererRegistry.register(EntityInit.ACACIA_ARROW, AcaciaArrowRender::new);
    }
}
