package net.xanthian.vsas;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.*;
import net.xanthian.vsas.util.*;

public class Initialise implements ModInitializer {

    public static final String MOD_ID = "vsas";

    @Override
    public void onInitialize() {

        ModItemGroup.registerGroup();

        ActivatorRails.registerActivatorRails();
        Arrows.registerArrowItems();
        Axes.registerAxeItems();
        Bows.registerBowItems();
        Brushes.registerBrushItems();
        Campfires.registerCampfires();
        Crossbows.registerCrossBowItems();
        DetectorRails.registerDetectorRails();
        FishingRods.registerFishingRodItems();
        Grindstones.registerGrindstones();
        Hoes.registerHoeItems();
        Ladders.registerLadders();
        Levers.registerLevers();
        OnAStick.registerOnAStickItems();
        Pickaxes.registerPickaxeItems();
        PoweredRails.registerPoweredRails();
        Rails.registerRails();
        RedstoneTorches.registerRedstoneTorchBlocks();
        Shovels.registerShovelItems();
        SoulCampfires.registerSoulCampfires();
        SoulTorches.registerSoulTorchBlocks();
        Sticks.registerStickItems();
        Swords.registerSwordItems();
        Torches.registerTorchBlocks();

        EntityInit.init();

        LootTableModifiers.modifyLootTables();
        ModPOITypes.init();
        ModRegistries.registerFuels();
        VillagerTrades.registerTrades();

        ResourceManagerHelper.registerBuiltinResourcePack(
                new Identifier(MOD_ID, "minecraft"),
                FabricLoader.getInstance().getModContainer(MOD_ID).orElseThrow(),
                Text.translatable("vsas.resourcepacks.minecraft"),
                ResourcePackActivationType.ALWAYS_ENABLED);
    }
}