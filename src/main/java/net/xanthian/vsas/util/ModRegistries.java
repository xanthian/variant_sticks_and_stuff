package net.xanthian.vsas.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.xanthian.vsas.blocks.Ladders;
import net.xanthian.vsas.items.*;

public class ModRegistries {

    public static void registerFuels() {
        registerFuel();
    }

    private static void registerFuel() {
        FuelRegistry registry = FuelRegistry.INSTANCE;

        for (Item item : FishingRods.MOD_FISHING_RODS.values()) {
            registry.add(item, 300);
        }

        for (Block block : Ladders.MOD_LADDERS.values()) {
            registry.add(block, 300);
        }

        for (Item item : Bows.MOD_BOWS.values()) {
            registry.add(item, 300);
        }

        for (Item item : Crossbows.MOD_CROSSBOWS.values()) {
            registry.add(item, 300);
        }

        registry.add(Axes.ACACIA_WOODEN_AXE, 200);
        registry.add(Axes.BAMBOO_WOODEN_AXE, 200);
        registry.add(Axes.BIRCH_WOODEN_AXE, 200);
        registry.add(Axes.CHERRY_WOODEN_AXE, 200);
        registry.add(Axes.DARK_OAK_WOODEN_AXE, 200);
        registry.add(Axes.JUNGLE_WOODEN_AXE, 200);
        registry.add(Axes.MANGROVE_WOODEN_AXE, 200);
        registry.add(Axes.SPRUCE_WOODEN_AXE, 200);

        registry.add(Hoes.ACACIA_WOODEN_HOE, 200);
        registry.add(Hoes.BAMBOO_WOODEN_HOE, 200);
        registry.add(Hoes.BIRCH_WOODEN_HOE, 200);
        registry.add(Hoes.CHERRY_WOODEN_HOE, 200);
        registry.add(Hoes.DARK_OAK_WOODEN_HOE, 200);
        registry.add(Hoes.JUNGLE_WOODEN_HOE, 200);
        registry.add(Hoes.MANGROVE_WOODEN_HOE, 200);
        registry.add(Hoes.SPRUCE_WOODEN_HOE, 200);

        registry.add(Pickaxes.ACACIA_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.BAMBOO_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.BIRCH_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.CHERRY_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.DARK_OAK_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.JUNGLE_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.MANGROVE_WOODEN_PICKAXE, 200);
        registry.add(Pickaxes.SPRUCE_WOODEN_PICKAXE, 200);

        registry.add(Shovels.ACACIA_WOODEN_SHOVEL, 200);
        registry.add(Shovels.BAMBOO_WOODEN_SHOVEL, 200);
        registry.add(Shovels.BIRCH_WOODEN_SHOVEL, 200);
        registry.add(Shovels.CHERRY_WOODEN_SHOVEL, 200);
        registry.add(Shovels.DARK_OAK_WOODEN_SHOVEL, 200);
        registry.add(Shovels.JUNGLE_WOODEN_SHOVEL, 200);
        registry.add(Shovels.MANGROVE_WOODEN_SHOVEL, 200);
        registry.add(Shovels.SPRUCE_WOODEN_SHOVEL, 200);

        registry.add(Swords.ACACIA_WOODEN_SWORD, 200);
        registry.add(Swords.BAMBOO_WOODEN_SWORD, 200);
        registry.add(Swords.BIRCH_WOODEN_SWORD, 200);
        registry.add(Swords.CHERRY_WOODEN_SWORD, 200);
        registry.add(Swords.DARK_OAK_WOODEN_SWORD, 200);
        registry.add(Swords.JUNGLE_WOODEN_SWORD, 200);
        registry.add(Swords.MANGROVE_WOODEN_SWORD, 200);
        registry.add(Swords.SPRUCE_WOODEN_SWORD, 200);

        for (Item stick : Sticks.MOD_STICKS.values()) {
            registry.add(stick, 100);
        }
    }
}