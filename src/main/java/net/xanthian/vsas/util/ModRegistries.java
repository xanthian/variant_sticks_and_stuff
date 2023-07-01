package net.xanthian.vsas.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.xanthian.vsas.items.*;
import net.xanthian.vsas.blocks.*;

public class ModRegistries {

    public static void registerFuels() {
        registerFuel();
    }
    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

/**
 Copy from {@link AbstractFurnaceBlockEntity#createFuelTimeMap()}
 **/

        registry.add(FishingRods.ACACIA_FISHING_ROD, 300);
        registry.add(FishingRods.BIRCH_FISHING_ROD, 300);
        registry.add(FishingRods.DARK_OAK_FISHING_ROD, 300);
        registry.add(FishingRods.JUNGLE_FISHING_ROD, 300);
        registry.add(FishingRods.MANGROVE_FISHING_ROD, 300);
        registry.add(FishingRods.OAK_FISHING_ROD, 300);
        registry.add(FishingRods.SPRUCE_FISHING_ROD, 300);

        registry.add(Ladders.ACACIA_LADDER, 300);
        registry.add(Ladders.BIRCH_LADDER, 300);
        registry.add(Ladders.DARK_OAK_LADDER, 300);
        registry.add(Ladders.JUNGLE_LADDER, 300);
        registry.add(Ladders.MANGROVE_LADDER, 300);
        registry.add(Ladders.OAK_LADDER, 300);
        registry.add(Ladders.SPRUCE_LADDER, 300);

        registry.add(Bows.ACACIA_BOW, 300);
        registry.add(Bows.BIRCH_BOW, 300);
        registry.add(Bows.DARK_OAK_BOW, 300);
        registry.add(Bows.JUNGLE_BOW, 300);
        registry.add(Bows.MANGROVE_BOW, 300);
        registry.add(Bows.OAK_BOW, 300);
        registry.add(Bows.SPRUCE_BOW, 300);

        registry.add(Crossbows.ACACIA_CROSSBOW, 300);
        registry.add(Crossbows.BIRCH_CROSSBOW, 300);
        registry.add(Crossbows.DARK_OAK_CROSSBOW, 300);
        registry.add(Crossbows.JUNGLE_CROSSBOW, 300);
        registry.add(Crossbows.MANGROVE_CROSSBOW, 300);
        registry.add(Crossbows.OAK_CROSSBOW, 300);
        registry.add(Crossbows.SPRUCE_CROSSBOW, 300);

        registry.add(Axes.ACACIA_WOODEN_AXE, 200);
        registry.add(Axes.BIRCH_WOODEN_AXE, 200);
        registry.add(Axes.DARK_OAK_WOODEN_AXE, 200);
        registry.add(Axes.JUNGLE_WOODEN_AXE, 200);
        registry.add(Axes.MANGROVE_WOODEN_AXE, 200);
        registry.add(Axes.OAK_WOODEN_AXE, 200);
        registry.add(Axes.SPRUCE_WOODEN_AXE, 200);
        
        registry.add(Hoes.ACACIA_WOODEN_HOE, 200);
        registry.add(Hoes.BIRCH_WOODEN_HOE, 200);
        registry.add(Hoes.DARK_OAK_WOODEN_HOE, 200);
        registry.add(Hoes.JUNGLE_WOODEN_HOE, 200);
        registry.add(Hoes.MANGROVE_WOODEN_HOE, 200);
        registry.add(Hoes.OAK_WOODEN_HOE, 200);
        registry.add(Hoes.SPRUCE_WOODEN_HOE, 200);

        registry.add(Pickaxes.ACACIA_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.BIRCH_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.DARK_OAK_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.JUNGLE_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.MANGROVE_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.OAK_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.SPRUCE_WOODEN_PICKAXE, 200);

        registry.add(Shovels.ACACIA_WOODEN_SHOVEL, 200);
        registry.add(Shovels.BIRCH_WOODEN_SHOVEL, 200);
        registry.add(Shovels.DARK_OAK_WOODEN_SHOVEL, 200);
        registry.add(Shovels.JUNGLE_WOODEN_SHOVEL, 200);
        registry.add(Shovels.MANGROVE_WOODEN_SHOVEL, 200);
        registry.add(Shovels.OAK_WOODEN_SHOVEL, 200);
        registry.add(Shovels.SPRUCE_WOODEN_SHOVEL, 200);

        registry.add(Swords.ACACIA_WOODEN_SWORD, 200);
        registry.add(Swords.BIRCH_WOODEN_SWORD, 200);
        registry.add(Swords.DARK_OAK_WOODEN_SWORD, 200);
        registry.add(Swords.JUNGLE_WOODEN_SWORD, 200);
        registry.add(Swords.MANGROVE_WOODEN_SWORD, 200);
        registry.add(Swords.OAK_WOODEN_SWORD, 200);
        registry.add(Swords.SPRUCE_WOODEN_SWORD, 200);

        registry.add(Sticks.ACACIA_STICK, 100);
        registry.add(Sticks.BIRCH_STICK, 100);
        registry.add(Sticks.DARK_OAK_STICK, 100);
        registry.add(Sticks.JUNGLE_STICK, 100);
        registry.add(Sticks.MANGROVE_STICK, 100);
        registry.add(Sticks.OAK_STICK, 100);
        registry.add(Sticks.SPRUCE_STICK, 100);
    }
}