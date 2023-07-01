package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.vanilla.VanillaBlockLootTableGenerator;
import net.minecraft.item.Items;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;

import net.xanthian.vsas.blocks.*;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    /**
     Copy from {@link VanillaBlockLootTableGenerator}
     **/

    @Override
    public void generate() {

        addDrop(Campfires.ACACIA_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        addDrop(Campfires.BIRCH_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        addDrop(Campfires.CRIMSON_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        addDrop(Campfires.DARK_OAK_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        addDrop(Campfires.JUNGLE_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        addDrop(Campfires.MANGROVE_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        addDrop(Campfires.OAK_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        addDrop(Campfires.SPRUCE_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        addDrop(Campfires.WARPED_CAMPFIRE, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));

        addDrop(Campfires.ACACIA_SOUL_CAMPFIRE,  (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        addDrop(Campfires.BIRCH_SOUL_CAMPFIRE,  (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        addDrop(Campfires.CRIMSON_SOUL_CAMPFIRE,  (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        addDrop(Campfires.DARK_OAK_SOUL_CAMPFIRE,  (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        addDrop(Campfires.JUNGLE_SOUL_CAMPFIRE,  (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        addDrop(Campfires.MANGROVE_SOUL_CAMPFIRE,  (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        addDrop(Campfires.OAK_SOUL_CAMPFIRE,  (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        addDrop(Campfires.SPRUCE_SOUL_CAMPFIRE,  (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        addDrop(Campfires.WARPED_SOUL_CAMPFIRE,  (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        
        addDrop(Grindstones.ACACIA_GRINDSTONE);
        addDrop(Grindstones.BIRCH_GRINDSTONE);
        addDrop(Grindstones.CRIMSON_GRINDSTONE);
        addDrop(Grindstones.JUNGLE_GRINDSTONE);
        addDrop(Grindstones.MANGROVE_GRINDSTONE);
        addDrop(Grindstones.OAK_GRINDSTONE);
        addDrop(Grindstones.SPRUCE_GRINDSTONE);
        addDrop(Grindstones.WARPED_GRINDSTONE);

        addDrop(Ladders.ACACIA_LADDER);
        addDrop(Ladders.BIRCH_LADDER);
        addDrop(Ladders.CRIMSON_LADDER);
        addDrop(Ladders.JUNGLE_LADDER);
        addDrop(Ladders.MANGROVE_LADDER);
        addDrop(Ladders.OAK_LADDER);
        addDrop(Ladders.SPRUCE_LADDER);
        addDrop(Ladders.WARPED_LADDER);

        addDrop(Levers.ACACIA_LEVER);
        addDrop(Levers.BIRCH_LEVER);
        addDrop(Levers.CRIMSON_LEVER);
        addDrop(Levers.JUNGLE_LEVER);
        addDrop(Levers.MANGROVE_LEVER);
        addDrop(Levers.OAK_LEVER);
        addDrop(Levers.SPRUCE_LEVER);
        addDrop(Levers.WARPED_LEVER);

        addDrop(Rails.ACACIA_ACTIVATOR_RAIL);
        addDrop(Rails.BIRCH_ACTIVATOR_RAIL);
        addDrop(Rails.CRIMSON_ACTIVATOR_RAIL);
        addDrop(Rails.JUNGLE_ACTIVATOR_RAIL);
        addDrop(Rails.MANGROVE_ACTIVATOR_RAIL);
        addDrop(Rails.OAK_ACTIVATOR_RAIL);
        addDrop(Rails.SPRUCE_ACTIVATOR_RAIL);
        addDrop(Rails.WARPED_ACTIVATOR_RAIL);

        addDrop(Rails.ACACIA_DETECTOR_RAIL);
        addDrop(Rails.BIRCH_DETECTOR_RAIL);
        addDrop(Rails.CRIMSON_DETECTOR_RAIL);
        addDrop(Rails.JUNGLE_DETECTOR_RAIL);
        addDrop(Rails.MANGROVE_DETECTOR_RAIL);
        addDrop(Rails.OAK_DETECTOR_RAIL);
        addDrop(Rails.SPRUCE_DETECTOR_RAIL);
        addDrop(Rails.WARPED_DETECTOR_RAIL);

        addDrop(Rails.ACACIA_POWERED_RAIL);
        addDrop(Rails.BIRCH_POWERED_RAIL);
        addDrop(Rails.CRIMSON_POWERED_RAIL);
        addDrop(Rails.JUNGLE_POWERED_RAIL);
        addDrop(Rails.MANGROVE_POWERED_RAIL);
        addDrop(Rails.OAK_POWERED_RAIL);
        addDrop(Rails.SPRUCE_POWERED_RAIL);
        addDrop(Rails.WARPED_POWERED_RAIL);
        
        addDrop(Rails.ACACIA_RAIL);
        addDrop(Rails.BIRCH_RAIL);
        addDrop(Rails.CRIMSON_RAIL);
        addDrop(Rails.JUNGLE_RAIL);
        addDrop(Rails.MANGROVE_RAIL);
        addDrop(Rails.OAK_RAIL);
        addDrop(Rails.SPRUCE_RAIL);
        addDrop(Rails.WARPED_RAIL);

        addDrop(RedstoneTorches.ACACIA_REDSTONE_TORCH);
        addDrop(RedstoneTorches.BIRCH_REDSTONE_TORCH);
        addDrop(RedstoneTorches.CRIMSON_REDSTONE_TORCH);
        addDrop(RedstoneTorches.JUNGLE_REDSTONE_TORCH);
        addDrop(RedstoneTorches.MANGROVE_REDSTONE_TORCH);
        addDrop(RedstoneTorches.OAK_REDSTONE_TORCH);
        addDrop(RedstoneTorches.SPRUCE_REDSTONE_TORCH);
        addDrop(RedstoneTorches.WARPED_REDSTONE_TORCH);

        addDrop(SoulTorches.ACACIA_SOUL_TORCH);
        addDrop(SoulTorches.BIRCH_SOUL_TORCH);
        addDrop(SoulTorches.CRIMSON_SOUL_TORCH);
        addDrop(SoulTorches.JUNGLE_SOUL_TORCH);
        addDrop(SoulTorches.MANGROVE_SOUL_TORCH);
        addDrop(SoulTorches.OAK_SOUL_TORCH);
        addDrop(SoulTorches.SPRUCE_SOUL_TORCH);
        addDrop(SoulTorches.WARPED_SOUL_TORCH);

        addDrop(Torches.ACACIA_TORCH);
        addDrop(Torches.BIRCH_TORCH);
        addDrop(Torches.CRIMSON_TORCH);
        addDrop(Torches.JUNGLE_TORCH);
        addDrop(Torches.MANGROVE_TORCH);
        addDrop(Torches.OAK_TORCH);
        addDrop(Torches.SPRUCE_TORCH);
        addDrop(Torches.WARPED_TORCH);
        
    }
}