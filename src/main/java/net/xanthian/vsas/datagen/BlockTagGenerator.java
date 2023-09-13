package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.blocks.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.vsas.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> ACTIVATOR_RAILS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "activator_rails"));
    private static final TagKey<Block> CAMPFIRES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "campfires"));
    private static final TagKey<Block> DETECTOR_RAILS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "detector_rails"));
    private static final TagKey<Block> GRINDSTONES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "grindstones"));
    private static final TagKey<Block> LADDERS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "ladders"));
    private static final TagKey<Block> POWERED_RAILS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "powered_rails"));
    private static final TagKey<Block> RAILS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "rails"));
    private static final TagKey<Block> REDSTONE_TORCHES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "redstone_torches"));
    private static final TagKey<Block> SOUL_CAMPFIRES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "soul_campfires"));
    private static final TagKey<Block> SOUL_TORCHES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "soul_torches"));
    private static final TagKey<Block> TORCHES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "torches"));
    private static final TagKey<Block> WALL_SOUL_TORCHES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID, "wall_soul_torches"));

    private static final TagKey<Block> C_JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        for (Block block : ActivatorRails.MOD_ACTIVATOR_RAILS.values()) {
            getOrCreateTagBuilder(ACTIVATOR_RAILS)
                    .add(block);
        }

        for (Block block : Campfires.MOD_CAMPFIRES.values()) {
            getOrCreateTagBuilder(CAMPFIRES)
                    .add(block);
        }

        for (Block block : DetectorRails.MOD_DETECTOR_RAILS.values()) {
            getOrCreateTagBuilder(DETECTOR_RAILS)
                    .add(block);
        }

        for (Block block : Grindstones.MOD_GRINDSTONES.values()) {
            getOrCreateTagBuilder(GRINDSTONES)
                    .add(block);
        }

        for (Block block : Ladders.MOD_LADDERS.values()) {
            getOrCreateTagBuilder(LADDERS)
                    .add(block);
        }

        for (Block block : PoweredRails.MOD_POWERED_RAILS.values()) {
            getOrCreateTagBuilder(POWERED_RAILS)
                    .add(block);
        }

        for (Block block : Rails.MOD_RAILS.values()) {
            getOrCreateTagBuilder(RAILS)
                    .add(block);
        }

        for (Block block : RedstoneTorches.MOD_REDSTONE_TORCHES.values()) {
            getOrCreateTagBuilder(REDSTONE_TORCHES)
                    .add(block);
        }

        for (Block block : SoulCampfires.MOD_SOUL_CAMPFIRES.values()) {
            getOrCreateTagBuilder(SOUL_CAMPFIRES)
                    .add(block);
        }

        for (Block block : SoulTorches.MOD_SOUL_TORCHES.values()) {
            getOrCreateTagBuilder(SOUL_TORCHES)
                    .add(block);
        }

        for (Block block : Torches.MOD_TORCHES.values()) {
            getOrCreateTagBuilder(TORCHES)
                    .add(block);
        }

        getOrCreateTagBuilder(WALL_SOUL_TORCHES)
                .add(SoulTorches.WALL_ACACIA_SOUL_TORCH)
                .add(SoulTorches.WALL_BIRCH_SOUL_TORCH)
                .add(SoulTorches.WALL_CRIMSON_SOUL_TORCH)
                .add(SoulTorches.WALL_DARK_OAK_SOUL_TORCH)
                .add(SoulTorches.WALL_JUNGLE_SOUL_TORCH)
                .add(SoulTorches.WALL_MANGROVE_SOUL_TORCH)
                .add(SoulTorches.WALL_SPRUCE_SOUL_TORCH)
                .add(SoulTorches.WALL_WARPED_SOUL_TORCH);

        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .addTag(LADDERS)
                .addTag(CAMPFIRES)
                .addTag(SOUL_CAMPFIRES);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .addTag(GRINDSTONES);

        getOrCreateTagBuilder(BlockTags.CAMPFIRES)
                .addTag(CAMPFIRES)
                .addTag(SOUL_CAMPFIRES);

        getOrCreateTagBuilder(BlockTags.CLIMBABLE)
                .addTag(LADDERS);

        getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
                .addTag(SOUL_CAMPFIRES)
                .addTag(SOUL_TORCHES)
                .addTag(WALL_SOUL_TORCHES);

        getOrCreateTagBuilder(BlockTags.RAILS)
                .addTag(ACTIVATOR_RAILS)
                .addTag(DETECTOR_RAILS)
                .addTag(RAILS)
                .addTag(POWERED_RAILS);

        getOrCreateTagBuilder(BlockTags.WALL_POST_OVERRIDE)
                .addTag(REDSTONE_TORCHES)
                .addTag(SOUL_TORCHES)
                .addTag(TORCHES);

        getOrCreateTagBuilder(C_JOB_SITE)
                .addTag(GRINDSTONES);
    }
}