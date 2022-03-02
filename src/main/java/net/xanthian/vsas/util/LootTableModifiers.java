package net.xanthian.vsas.util;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.items.Sticks;

public class LootTableModifiers {

    // Leaves
    private static final Identifier ACACIA_LEAVES_ID
            = new Identifier("minecraft", "blocks/acacia_leaves");
    private static final Identifier BIRCH_LEAVES_ID
            = new Identifier("minecraft", "blocks/birch_leaves");
    private static final Identifier DARK_OAK_LEAVES_ID
            = new Identifier("minecraft", "blocks/dark_oak_leaves");
    private static final Identifier JUNGLE_LEAVES_ID
            = new Identifier("minecraft", "blocks/jungle_leaves");
    private static final Identifier OAK_LEAVES_ID
            = new Identifier("minecraft", "blocks/oak_leaves");
    private static final Identifier SPRUCE_LEAVES_ID
            = new Identifier("minecraft", "blocks/spruce_leaves");

    // Chests
    private static final Identifier VILLAGE_CARTOGRAPHER_CHEST
            = new Identifier("minecraft", "chests/village/village_cartographer");
    private static final Identifier VILLAGE_FLETCHER_CHEST
            = new Identifier("minecraft", "chests/village/village_fletcher");
    private static final Identifier VILLAGE_TOOLSMITH_CHEST
            = new Identifier("minecraft", "chests/village/village_toolsmith");

    // Witch
    private static final Identifier WITCH_STICKS
            = new Identifier("minecraft", "entities/witch");

    // Fishing
    private static final Identifier FISH_STICKS
            = new Identifier("minecraft", "gameplay/fishing/junk");

    public static void modifyLootTables() {

        LootTableLoadingCallback.EVENT.register((resourceManager, manager, id, supplier, setter) -> {

            if (ACACIA_LEAVES_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f)) // Drops 2% of the time
                        .with(ItemEntry.builder(Sticks.ACACIA_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (BIRCH_LEAVES_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Sticks.BIRCH_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (DARK_OAK_LEAVES_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Sticks.DARK_OAK_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (JUNGLE_LEAVES_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Sticks.JUNGLE_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (OAK_LEAVES_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Sticks.OAK_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (SPRUCE_LEAVES_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.02f))
                        .with(ItemEntry.builder(Sticks.SPRUCE_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (VILLAGE_CARTOGRAPHER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootNumberProvider.create(0, 1))
                        .with(ItemEntry.builder(Sticks.ACACIA_STICK))
                        .with(ItemEntry.builder(Sticks.BIRCH_STICK))
                        .with(ItemEntry.builder(Sticks.DARK_OAK_STICK))
                        .with(ItemEntry.builder(Sticks.JUNGLE_STICK))
                        .with(ItemEntry.builder(Sticks.OAK_STICK))
                        .with(ItemEntry.builder(Sticks.SPRUCE_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (VILLAGE_FLETCHER_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootNumberProvider.create(0, 1))
                        .with(ItemEntry.builder(Sticks.ACACIA_STICK))
                        .with(ItemEntry.builder(Sticks.BIRCH_STICK))
                        .with(ItemEntry.builder(Sticks.DARK_OAK_STICK))
                        .with(ItemEntry.builder(Sticks.JUNGLE_STICK))
                        .with(ItemEntry.builder(Sticks.OAK_STICK))
                        .with(ItemEntry.builder(Sticks.SPRUCE_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (VILLAGE_TOOLSMITH_CHEST.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootNumberProvider.create(0, 2))
                        .with(ItemEntry.builder(Sticks.ACACIA_STICK))
                        .with(ItemEntry.builder(Sticks.BIRCH_STICK))
                        .with(ItemEntry.builder(Sticks.DARK_OAK_STICK))
                        .with(ItemEntry.builder(Sticks.JUNGLE_STICK))
                        .with(ItemEntry.builder(Sticks.OAK_STICK))
                        .with(ItemEntry.builder(Sticks.SPRUCE_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (WITCH_STICKS.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootNumberProvider.create(0, 3))
                        .with(ItemEntry.builder(Sticks.ACACIA_STICK))
                        .with(ItemEntry.builder(Sticks.BIRCH_STICK))
                        .with(ItemEntry.builder(Sticks.DARK_OAK_STICK))
                        .with(ItemEntry.builder(Sticks.JUNGLE_STICK))
                        .with(ItemEntry.builder(Sticks.OAK_STICK))
                        .with(ItemEntry.builder(Sticks.SPRUCE_STICK));
                supplier.withPool(poolBuilder.build());
            }
            if (FISH_STICKS.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(UniformLootNumberProvider.create(0, 1))
                        .with(ItemEntry.builder(Sticks.ACACIA_STICK))
                        .with(ItemEntry.builder(Sticks.BIRCH_STICK))
                        .with(ItemEntry.builder(Sticks.DARK_OAK_STICK))
                        .with(ItemEntry.builder(Sticks.JUNGLE_STICK))
                        .with(ItemEntry.builder(Sticks.OAK_STICK))
                        .with(ItemEntry.builder(Sticks.SPRUCE_STICK));
                supplier.withPool(poolBuilder.build());
            }
            });

    }
}
