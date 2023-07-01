package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.blocks.*;

import java.util.concurrent.CompletableFuture;

import static net.xanthian.vsas.Initialise.MOD_ID;

public class BlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    private static final TagKey<Block> ACTIVATOR_RAILS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"activator_rails"));
    private static final TagKey<Block> CAMPFIRES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"campfires"));
    private static final TagKey<Block> DETECTOR_RAILS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"detector_rails"));
    private static final TagKey<Block> GRINDSTONES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"grindstones"));
    private static final TagKey<Block> LADDERS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"ladders"));
    private static final TagKey<Block> POWERED_RAILS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"powered_rails"));
    private static final TagKey<Block> RAILS = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"rails"));
    private static final TagKey<Block> REDSTONE_TORCHES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"redstone_torches"));
    private static final TagKey<Block> SOUL_CAMPFIRES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"soul_campfires"));
    private static final TagKey<Block> SOUL_TORCHES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"soul_torches"));
    private static final TagKey<Block> TORCHES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"torches"));
    private static final TagKey<Block> WALL_SOUL_TORCHES = TagKey.of(Registries.BLOCK.getKey(), new Identifier(MOD_ID,"wall_soul_torches"));

    private static final TagKey<Block> MINEABLE_AXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/axe"));
    private static final TagKey<Block> MINEABLE_PICKAXE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:mineable/pickaxe"));
    private static final TagKey<Block> MC_CAMPFIRES = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:campfires"));
    private static final TagKey<Block> CLIMBABLE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:climbable"));
    private static final TagKey<Block> NON_FLAMMABLE_WOOD = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:non_flammable_wood"));
    private static final TagKey<Block> PIGLIN_REPELLENTS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:piglin_repellents"));
    private static final TagKey<Block> MC_RAILS = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:rails"));
    private static final TagKey<Block> WALL_POST_OVERRIDE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("minecraft:wall_post_override"));
    private static final TagKey<Block> JOB_SITE = TagKey.of(Registries.BLOCK.getKey(), new Identifier("c:villager_job_sites"));

    @Override
    protected void configure (RegistryWrapper.WrapperLookup arg){

        getOrCreateTagBuilder(ACTIVATOR_RAILS)
                .add(Rails.ACACIA_ACTIVATOR_RAIL)
                .add(Rails.BIRCH_ACTIVATOR_RAIL)
                .add(Rails.CRIMSON_ACTIVATOR_RAIL)
                .add(Rails.DARK_OAK_ACTIVATOR_RAIL)
                .add(Rails.JUNGLE_ACTIVATOR_RAIL)
                .add(Rails.MANGROVE_ACTIVATOR_RAIL)
                .add(Rails.OAK_ACTIVATOR_RAIL)
                .add(Rails.SPRUCE_ACTIVATOR_RAIL)
                .add(Rails.WARPED_ACTIVATOR_RAIL);

        getOrCreateTagBuilder(CAMPFIRES)
                .add(Campfires.ACACIA_CAMPFIRE)
                .add(Campfires.BIRCH_CAMPFIRE)
                .add(Campfires.CRIMSON_CAMPFIRE)
                .add(Campfires.DARK_OAK_CAMPFIRE)
                .add(Campfires.JUNGLE_CAMPFIRE)
                .add(Campfires.MANGROVE_CAMPFIRE)
                .add(Campfires.OAK_CAMPFIRE)
                .add(Campfires.SPRUCE_CAMPFIRE)
                .add(Campfires.WARPED_CAMPFIRE);

        getOrCreateTagBuilder(DETECTOR_RAILS)
                .add(Rails.ACACIA_DETECTOR_RAIL)
                .add(Rails.BIRCH_DETECTOR_RAIL)
                .add(Rails.CRIMSON_DETECTOR_RAIL)
                .add(Rails.DARK_OAK_DETECTOR_RAIL)
                .add(Rails.JUNGLE_DETECTOR_RAIL)
                .add(Rails.MANGROVE_DETECTOR_RAIL)
                .add(Rails.OAK_DETECTOR_RAIL)
                .add(Rails.SPRUCE_DETECTOR_RAIL)
                .add(Rails.WARPED_DETECTOR_RAIL);

        getOrCreateTagBuilder(GRINDSTONES)
                .add(Grindstones.ACACIA_GRINDSTONE)
                .add(Grindstones.BIRCH_GRINDSTONE)
                .add(Grindstones.CRIMSON_GRINDSTONE)
                .add(Grindstones.DARK_OAK_GRINDSTONE)
                .add(Grindstones.JUNGLE_GRINDSTONE)
                .add(Grindstones.MANGROVE_GRINDSTONE)
                .add(Grindstones.OAK_GRINDSTONE)
                .add(Grindstones.SPRUCE_GRINDSTONE)
                .add(Grindstones.WARPED_GRINDSTONE);

        getOrCreateTagBuilder(LADDERS)
                .add(Ladders.ACACIA_LADDER)
                .add(Ladders.BIRCH_LADDER)
                .add(Ladders.CRIMSON_LADDER)
                .add(Ladders.DARK_OAK_LADDER)
                .add(Ladders.JUNGLE_LADDER)
                .add(Ladders.MANGROVE_LADDER)
                .add(Ladders.OAK_LADDER)
                .add(Ladders.SPRUCE_LADDER)
                .add(Ladders.WARPED_LADDER);

        getOrCreateTagBuilder(POWERED_RAILS)
                .add(Rails.ACACIA_POWERED_RAIL)
                .add(Rails.BIRCH_POWERED_RAIL)
                .add(Rails.CRIMSON_POWERED_RAIL)
                .add(Rails.DARK_OAK_POWERED_RAIL)
                .add(Rails.JUNGLE_POWERED_RAIL)
                .add(Rails.MANGROVE_POWERED_RAIL)
                .add(Rails.OAK_POWERED_RAIL)
                .add(Rails.SPRUCE_POWERED_RAIL)
                .add(Rails.WARPED_POWERED_RAIL);

        getOrCreateTagBuilder(RAILS)
                .add(Rails.ACACIA_RAIL)
                .add(Rails.BIRCH_RAIL)
                .add(Rails.CRIMSON_RAIL)
                .add(Rails.DARK_OAK_RAIL)
                .add(Rails.JUNGLE_RAIL)
                .add(Rails.MANGROVE_RAIL)
                .add(Rails.OAK_RAIL)
                .add(Rails.SPRUCE_RAIL)
                .add(Rails.WARPED_RAIL);

        getOrCreateTagBuilder(REDSTONE_TORCHES)
                .add(RedstoneTorches.ACACIA_REDSTONE_TORCH)
                .add(RedstoneTorches.BIRCH_REDSTONE_TORCH)
                .add(RedstoneTorches.CRIMSON_REDSTONE_TORCH)
                .add(RedstoneTorches.DARK_OAK_REDSTONE_TORCH)
                .add(RedstoneTorches.JUNGLE_REDSTONE_TORCH)
                .add(RedstoneTorches.MANGROVE_REDSTONE_TORCH)
                .add(RedstoneTorches.OAK_REDSTONE_TORCH)
                .add(RedstoneTorches.SPRUCE_REDSTONE_TORCH)
                .add(RedstoneTorches.WARPED_REDSTONE_TORCH);

        getOrCreateTagBuilder(SOUL_CAMPFIRES)
                .add(Campfires.ACACIA_SOUL_CAMPFIRE)
                .add(Campfires.BIRCH_SOUL_CAMPFIRE)
                .add(Campfires.CRIMSON_SOUL_CAMPFIRE)
                .add(Campfires.DARK_OAK_SOUL_CAMPFIRE)
                .add(Campfires.JUNGLE_SOUL_CAMPFIRE)
                .add(Campfires.MANGROVE_SOUL_CAMPFIRE)
                .add(Campfires.OAK_SOUL_CAMPFIRE)
                .add(Campfires.SPRUCE_SOUL_CAMPFIRE)
                .add(Campfires.WARPED_SOUL_CAMPFIRE);

        getOrCreateTagBuilder(SOUL_TORCHES)
                .add(SoulTorches.ACACIA_SOUL_TORCH)
                .add(SoulTorches.BIRCH_SOUL_TORCH)
                .add(SoulTorches.CRIMSON_SOUL_TORCH)
                .add(SoulTorches.DARK_OAK_SOUL_TORCH)
                .add(SoulTorches.JUNGLE_SOUL_TORCH)
                .add(SoulTorches.MANGROVE_SOUL_TORCH)
                .add(SoulTorches.OAK_SOUL_TORCH)
                .add(SoulTorches.SPRUCE_SOUL_TORCH)
                .add(SoulTorches.WARPED_SOUL_TORCH);

        getOrCreateTagBuilder(TORCHES)
                .add(Torches.ACACIA_TORCH)
                .add(Torches.BIRCH_TORCH)
                .add(Torches.CRIMSON_TORCH)
                .add(Torches.DARK_OAK_TORCH)
                .add(Torches.JUNGLE_TORCH)
                .add(Torches.MANGROVE_TORCH)
                .add(Torches.OAK_TORCH)
                .add(Torches.SPRUCE_TORCH)
                .add(Torches.WARPED_TORCH);

        getOrCreateTagBuilder(WALL_SOUL_TORCHES)
                .add(SoulTorches.WALL_ACACIA_SOUL_TORCH)
                .add(SoulTorches.WALL_BIRCH_SOUL_TORCH)
                .add(SoulTorches.WALL_CRIMSON_SOUL_TORCH)
                .add(SoulTorches.WALL_DARK_OAK_SOUL_TORCH)
                .add(SoulTorches.WALL_JUNGLE_SOUL_TORCH)
                .add(SoulTorches.WALL_MANGROVE_SOUL_TORCH)
                .add(SoulTorches.WALL_OAK_SOUL_TORCH)
                .add(SoulTorches.WALL_SPRUCE_SOUL_TORCH)
                .add(SoulTorches.WALL_WARPED_SOUL_TORCH);

        getOrCreateTagBuilder(MINEABLE_AXE)
                .addTag(LADDERS)
                .addTag(CAMPFIRES)
                .addTag(SOUL_CAMPFIRES);

        getOrCreateTagBuilder(MINEABLE_PICKAXE)
                .addTag(GRINDSTONES);

        getOrCreateTagBuilder(MC_CAMPFIRES)
                .addTag(CAMPFIRES)
                .addTag(SOUL_CAMPFIRES);

        getOrCreateTagBuilder(CLIMBABLE)
                .addTag(LADDERS);

        getOrCreateTagBuilder(NON_FLAMMABLE_WOOD)
                .add(Ladders.CRIMSON_LADDER)
                .add(Ladders.WARPED_LADDER);

        getOrCreateTagBuilder(PIGLIN_REPELLENTS)
                .addTag(SOUL_CAMPFIRES)
                .addTag(SOUL_TORCHES)
                .addTag(WALL_SOUL_TORCHES);

        getOrCreateTagBuilder(MC_RAILS)
                .addTag(ACTIVATOR_RAILS)
                .addTag(DETECTOR_RAILS)
                .addTag(RAILS)
                .addTag(POWERED_RAILS);

        getOrCreateTagBuilder(WALL_POST_OVERRIDE)
                .addTag(REDSTONE_TORCHES)
                .addTag(SOUL_TORCHES)
                .addTag(TORCHES);

        getOrCreateTagBuilder(JOB_SITE)
                .addTag(GRINDSTONES);

    }
}