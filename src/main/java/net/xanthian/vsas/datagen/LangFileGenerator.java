package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.*;

public class LangFileGenerator extends FabricLanguageProvider {
    public LangFileGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add("vsas:resourcepacks.minecraft", "VSAS Item Rename");

        // BLOCKS
        for (Block block : ActivatorRails.MOD_ACTIVATOR_RAILS.values()) {
            translationBuilder.add(block, generateBlockDisplayName("rails/", block));
        }

        for (Block block : Campfires.MOD_CAMPFIRES.values()) {
            translationBuilder.add(block, generateBlockDisplayName("campfires/", block));
        }

        for (Block block : DetectorRails.MOD_DETECTOR_RAILS.values()) {
            translationBuilder.add(block, generateBlockDisplayName("rails/", block));
        }

        for (Block block : Grindstones.MOD_GRINDSTONES.values()) {
            translationBuilder.add(block, generateBlockDisplayName("grindstones/", block));
        }

        for (Block block : Ladders.MOD_LADDERS.values()) {
            translationBuilder.add(block, generateBlockDisplayName("ladders/", block));
        }

        for (Block block : Levers.MOD_LEVERS.values()) {
            translationBuilder.add(block, generateBlockDisplayName("levers/", block));
        }

        for (Block block : PoweredRails.MOD_POWERED_RAILS.values()) {
            translationBuilder.add(block, generateBlockDisplayName("rails/", block));
        }

        for (Block block : Rails.MOD_RAILS.values()) {
            translationBuilder.add(block, generateBlockDisplayName("rails/", block));
        }

        for (Block block : RedstoneTorches.MOD_REDSTONE_TORCHES.values()) {
            translationBuilder.add(block, generateBlockDisplayName("torches/", block));
        }

        for (Block block : SoulCampfires.MOD_SOUL_CAMPFIRES.values()) {
            translationBuilder.add(block, generateBlockDisplayName("campfires/", block));
        }

        for (Block block : SoulTorches.MOD_SOUL_TORCHES.values()) {
            translationBuilder.add(block, generateBlockDisplayName("torches/", block));
        }

        for (Block block : Torches.MOD_TORCHES.values()) {
            translationBuilder.add(block, generateBlockDisplayName("torches/", block));
        }

        // ITEMS
        for (Item item : Arrows.MOD_ARROWS.values()) {
            translationBuilder.add(item, generateItemDisplayName("arrows/", item));
        }

        for (Item item : Axes.MOD_AXES.values()) {
            translationBuilder.add(item, generateItemDisplayName("axes/", item));
        }

        for (Item item : Bows.MOD_BOWS.values()) {
            translationBuilder.add(item, generateItemDisplayName("bows/", item));
        }

        for (Item item : Brushes.MOD_BRUSHES.values()) {
            translationBuilder.add(item, generateItemDisplayName("brushes/", item));
        }

        for (Item item : Crossbows.MOD_CROSSBOWS.values()) {
            translationBuilder.add(item, generateItemDisplayName("crossbows/", item));
        }

        for (Item item : FishingRods.MOD_FISHING_RODS.values()) {
            translationBuilder.add(item, generateItemDisplayName("fishingrods/", item));
        }

        for (Item item : Hoes.MOD_HOES.values()) {
            translationBuilder.add(item, generateItemDisplayName("hoes/", item));
        }

        for (Item item : OnAStick.ONASTICK.values()) {
            translationBuilder.add(item, generateItemDisplayName("onastick/", item));
        }

        for (Item item : Pickaxes.MOD_PICKAXES.values()) {
            translationBuilder.add(item, generateItemDisplayName("pickaxes/", item));
        }

        for (Item item : Shovels.MOD_SHOVELS.values()) {
            translationBuilder.add(item, generateItemDisplayName("shovels/", item));
        }

        for (Item item : Sticks.MOD_STICKS.values()) {
            translationBuilder.add(item, generateItemDisplayName("sticks/", item));
        }

        for (Item item : Swords.MOD_SWORDS.values()) {
            translationBuilder.add(item, generateItemDisplayName("swords/", item));
        }

        translationBuilder.add(EntityInit.ACACIA_ARROW, "Acacia Arrow");
        translationBuilder.add(EntityInit.BAMBOO_ARROW, "Bamboo Arrow");
        translationBuilder.add(EntityInit.BIRCH_ARROW, "Birch Arrow");
        translationBuilder.add(EntityInit.CHERRY_ARROW, "Cherry Arrow");
        translationBuilder.add(EntityInit.CRIMSON_ARROW, "Crimson Arrow");
        translationBuilder.add(EntityInit.DARK_OAK_ARROW, "Dark Oak Arrow");
        translationBuilder.add(EntityInit.JUNGLE_ARROW, "Jungle Arrow");
        translationBuilder.add(EntityInit.MANGROVE_ARROW, "Mangrove Arrow");
        translationBuilder.add(EntityInit.OAK_ARROW, "Oak Arrow");
        translationBuilder.add(EntityInit.WARPED_ARROW, "Warped Arrow");
    }

    public static String generateBlockDisplayName(String prefix, Block block) {
        Identifier name = Registries.BLOCK.getId(block);
        String blockName = name.getPath();
        // Check if the block name starts with the specified prefix
        if (blockName.startsWith(prefix)) {
            // Remove the prefix
            String typeName = blockName.substring(prefix.length());
            // Replace underscores with spaces and capitalize the first letter
            String[] parts = typeName.split("_");
            StringBuilder displayName = new StringBuilder();
            for (String part : parts) {
                displayName.append(Character.toUpperCase(part.charAt(0)))
                        .append(part.substring(1))
                        .append(" ");
            }
            return displayName.toString().trim();
        }
        // Return a default value or handle cases where the prefix doesn't match
        return "Unknown Block";
    }

    public static String generateItemDisplayName(String prefix, Item item) {
        Identifier name = Registries.ITEM.getId(item);
        String itemName = name.getPath();
        if (itemName.startsWith(prefix)) {
            String typeName = itemName.substring(prefix.length());
            String[] parts = typeName.split("_");
            StringBuilder displayName = new StringBuilder();
            for (String part : parts) {
                displayName.append(Character.toUpperCase(part.charAt(0)))
                        .append(part.substring(1))
                        .append(" ");
            }
            return displayName.toString().trim();
        }
        return "Unknown Item";
    }
}