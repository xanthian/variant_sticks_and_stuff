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

    @Override
    public void generate() {

        for (Block rail : ActivatorRails.MOD_ACTIVATOR_RAILS.values()) {
            addDrop(rail);
        }

        for (Block campfires : Campfires.MOD_CAMPFIRES.values()) {
            addDrop(campfires, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.CHARCOAL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(2.0f))))));
        }

        for (Block rail : DetectorRails.MOD_DETECTOR_RAILS.values()) {
            addDrop(rail);
        }

        for (Block grindstone : Grindstones.MOD_GRINDSTONES.values()) {
            addDrop(grindstone);
        }

        for (Block ladder : Ladders.MOD_LADDERS.values()) {
            addDrop(ladder);
        }

        for (Block lever : Levers.MOD_LEVERS.values()) {
            addDrop(lever);
        }

        for (Block rail : PoweredRails.MOD_POWERED_RAILS.values()) {
            addDrop(rail);
        }

        for (Block rail : Rails.MOD_RAILS.values()) {
            addDrop(rail);
        }

        for (Block redstonetorch : RedstoneTorches.MOD_REDSTONE_TORCHES.values()) {
            addDrop(redstonetorch);
        }
        for (Block redstonetorch : RedstoneTorches.MOD_REDSTONE_WALL_TORCHES.values()) {
            addDrop(redstonetorch);
        }

        for (Block campfires : SoulCampfires.MOD_SOUL_CAMPFIRES.values()) {
            addDrop(campfires, (Block block) -> VanillaBlockLootTableGenerator.dropsWithSilkTouch(block, this.addSurvivesExplosionCondition(block, ItemEntry.builder(Items.SOUL_SOIL).apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1.0f))))));
        }

        for (Block soultorch : SoulTorches.MOD_SOUL_TORCHES.values()) {
            addDrop(soultorch);
        }
        for (Block soultorch : SoulTorches.MOD_SOUL_WALL_TORCHES.values()) {
            addDrop(soultorch);
        }

        for (Block torch : Torches.MOD_TORCHES.values()) {
            addDrop(torch);
        }
        for (Block torch : Torches.MOD_WALL_TORCHES.values()) {
            addDrop(torch);
        }
    }
}