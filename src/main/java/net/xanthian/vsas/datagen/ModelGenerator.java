package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.BlockFace;
import net.minecraft.data.client.*;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import net.xanthian.vsas.blocks.*;
import net.xanthian.vsas.items.*;
import net.xanthian.vsas.util.ModModel;
import net.xanthian.vsas.util.ModTextureKey;

import java.util.Optional;

import static net.minecraft.data.client.BlockStateModelGenerator.*;

public class ModelGenerator extends FabricModelProvider {
    public ModelGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        for (Block rail : ActivatorRails.MOD_ACTIVATOR_RAILS.values()) {
            blockStateModelGenerator.registerStraightRail(rail);
        }

        for (Block rail : DetectorRails.MOD_DETECTOR_RAILS.values()) {
            blockStateModelGenerator.registerStraightRail(rail);
        }

        for (Block campfires : Campfires.MOD_CAMPFIRES.values()) {
            createCampfire(blockStateModelGenerator, campfires);
        }

        createGrindstone(blockStateModelGenerator, Grindstones.ACACIA_GRINDSTONE, Blocks.ACACIA_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.BAMBOO_GRINDSTONE, Blocks.BAMBOO_MOSAIC);
        createGrindstone(blockStateModelGenerator, Grindstones.BIRCH_GRINDSTONE, Blocks.BIRCH_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.CHERRY_GRINDSTONE, Blocks.CHERRY_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.CRIMSON_GRINDSTONE, Blocks.CRIMSON_STEM);
        createGrindstone(blockStateModelGenerator, Grindstones.JUNGLE_GRINDSTONE, Blocks.JUNGLE_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.MANGROVE_GRINDSTONE, Blocks.MANGROVE_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.OAK_GRINDSTONE, Blocks.OAK_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.SPRUCE_GRINDSTONE, Blocks.SPRUCE_LOG);
        createGrindstone(blockStateModelGenerator, Grindstones.WARPED_GRINDSTONE, Blocks.WARPED_STEM);

        createLadder(blockStateModelGenerator, Ladders.ACACIA_LADDER, Blocks.ACACIA_PLANKS);
        createLadder(blockStateModelGenerator, Ladders.BAMBOO_LADDER, Blocks.BIRCH_PLANKS);
        createLadder(blockStateModelGenerator, Ladders.BIRCH_LADDER, Blocks.BIRCH_PLANKS);
        createLadder(blockStateModelGenerator, Ladders.CHERRY_LADDER, Blocks.CHERRY_PLANKS);
        createLadder(blockStateModelGenerator, Ladders.CRIMSON_LADDER, Blocks.CRIMSON_PLANKS);
        createLadder(blockStateModelGenerator, Ladders.DARK_OAK_LADDER, Blocks.DARK_OAK_PLANKS);
        createLadder(blockStateModelGenerator, Ladders.JUNGLE_LADDER, Blocks.JUNGLE_PLANKS);
        createLadder(blockStateModelGenerator, Ladders.MANGROVE_LADDER, Blocks.MANGROVE_PLANKS);
        createLadder(blockStateModelGenerator, Ladders.SPRUCE_LADDER, Blocks.SPRUCE_PLANKS);
        createLadder(blockStateModelGenerator, Ladders.WARPED_LADDER, Blocks.WARPED_PLANKS);

        for (Block lever : Levers.MOD_LEVERS.values()) {
            createLever(blockStateModelGenerator, lever);
        }

        for (Block rail : PoweredRails.MOD_POWERED_RAILS.values()) {
            blockStateModelGenerator.registerStraightRail(rail);
        }

        for (Block rail : Rails.MOD_RAILS.values()) {
            blockStateModelGenerator.registerTurnableRail(rail);
        }

        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.ACACIA_REDSTONE_TORCH, RedstoneTorches.WALL_ACACIA_REDSTONE_TORCH);
        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.BAMBOO_REDSTONE_TORCH, RedstoneTorches.WALL_BAMBOO_REDSTONE_TORCH);
        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.BIRCH_REDSTONE_TORCH, RedstoneTorches.WALL_BIRCH_REDSTONE_TORCH);
        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.CHERRY_REDSTONE_TORCH, RedstoneTorches.WALL_CHERRY_REDSTONE_TORCH);
        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.CRIMSON_REDSTONE_TORCH, RedstoneTorches.WALL_CRIMSON_REDSTONE_TORCH);
        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.DARK_OAK_REDSTONE_TORCH, RedstoneTorches.WALL_DARK_OAK_REDSTONE_TORCH);
        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.JUNGLE_REDSTONE_TORCH, RedstoneTorches.WALL_JUNGLE_REDSTONE_TORCH);
        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.MANGROVE_REDSTONE_TORCH, RedstoneTorches.WALL_MANGROVE_REDSTONE_TORCH);
        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.SPRUCE_REDSTONE_TORCH, RedstoneTorches.WALL_SPRUCE_REDSTONE_TORCH);
        createRedstoneTorch(blockStateModelGenerator, RedstoneTorches.WARPED_REDSTONE_TORCH, RedstoneTorches.WALL_WARPED_REDSTONE_TORCH);

        createSoulCampfire(blockStateModelGenerator, SoulCampfires.ACACIA_SOUL_CAMPFIRE, Campfires.ACACIA_CAMPFIRE);
        createSoulCampfire(blockStateModelGenerator, SoulCampfires.BAMBOO_SOUL_CAMPFIRE, Campfires.BAMBOO_CAMPFIRE);
        createSoulCampfire(blockStateModelGenerator, SoulCampfires.BIRCH_SOUL_CAMPFIRE, Campfires.BIRCH_CAMPFIRE);
        createSoulCampfire(blockStateModelGenerator, SoulCampfires.CHERRY_SOUL_CAMPFIRE, Campfires.CHERRY_CAMPFIRE);
        createSoulCampfire(blockStateModelGenerator, SoulCampfires.CRIMSON_SOUL_CAMPFIRE, Campfires.CRIMSON_CAMPFIRE);
        createSoulCampfire(blockStateModelGenerator, SoulCampfires.DARK_OAK_SOUL_CAMPFIRE, Campfires.DARK_OAK_CAMPFIRE);
        createSoulCampfire(blockStateModelGenerator, SoulCampfires.JUNGLE_SOUL_CAMPFIRE, Campfires.JUNGLE_CAMPFIRE);
        createSoulCampfire(blockStateModelGenerator, SoulCampfires.MANGROVE_SOUL_CAMPFIRE, Campfires.MANGROVE_CAMPFIRE);
        createSoulCampfire(blockStateModelGenerator, SoulCampfires.SPRUCE_SOUL_CAMPFIRE, Campfires.SPRUCE_CAMPFIRE);
        createSoulCampfire(blockStateModelGenerator, SoulCampfires.WARPED_SOUL_CAMPFIRE, Campfires.WARPED_CAMPFIRE);

        blockStateModelGenerator.registerTorch(SoulTorches.ACACIA_SOUL_TORCH, SoulTorches.WALL_ACACIA_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.BAMBOO_SOUL_TORCH, SoulTorches.WALL_BAMBOO_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.BIRCH_SOUL_TORCH, SoulTorches.WALL_BIRCH_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.CHERRY_SOUL_TORCH, SoulTorches.WALL_CHERRY_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.CRIMSON_SOUL_TORCH, SoulTorches.WALL_CRIMSON_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.DARK_OAK_SOUL_TORCH, SoulTorches.WALL_DARK_OAK_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.JUNGLE_SOUL_TORCH, SoulTorches.WALL_JUNGLE_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.MANGROVE_SOUL_TORCH, SoulTorches.WALL_MANGROVE_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.SPRUCE_SOUL_TORCH, SoulTorches.WALL_SPRUCE_SOUL_TORCH);
        blockStateModelGenerator.registerTorch(SoulTorches.WARPED_SOUL_TORCH, SoulTorches.WALL_WARPED_SOUL_TORCH);

        blockStateModelGenerator.registerTorch(Torches.ACACIA_TORCH, Torches.WALL_ACACIA_TORCH);
        blockStateModelGenerator.registerTorch(Torches.BAMBOO_TORCH, Torches.WALL_BAMBOO_TORCH);
        blockStateModelGenerator.registerTorch(Torches.BIRCH_TORCH, Torches.WALL_BIRCH_TORCH);
        blockStateModelGenerator.registerTorch(Torches.CHERRY_TORCH, Torches.WALL_CHERRY_TORCH);
        blockStateModelGenerator.registerTorch(Torches.CRIMSON_TORCH, Torches.WALL_CRIMSON_TORCH);
        blockStateModelGenerator.registerTorch(Torches.DARK_OAK_TORCH, Torches.WALL_DARK_OAK_TORCH);
        blockStateModelGenerator.registerTorch(Torches.JUNGLE_TORCH, Torches.WALL_JUNGLE_TORCH);
        blockStateModelGenerator.registerTorch(Torches.MANGROVE_TORCH, Torches.WALL_MANGROVE_TORCH);
        blockStateModelGenerator.registerTorch(Torches.SPRUCE_TORCH, Torches.WALL_SPRUCE_TORCH);
        blockStateModelGenerator.registerTorch(Torches.WARPED_TORCH, Torches.WALL_WARPED_TORCH);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        for (Item arrows : Arrows.MOD_ARROWS.values()) {
            itemModelGenerator.register(arrows, Models.GENERATED);
        }

        for (Item axes : Axes.MOD_AXES.values()) {
            itemModelGenerator.register(axes, Models.HANDHELD);
        }

        for (Item bows : Bows.MOD_BOWS.values()) {
            createBowItem(itemModelGenerator, bows);
        }

        for (Item bows : Crossbows.MOD_CROSSBOWS.values()) {
            createCrossBowItem(itemModelGenerator, bows);
        }

        for (Item hoes : Hoes.MOD_HOES.values()) {
            itemModelGenerator.register(hoes, Models.HANDHELD);
        }

        for (Item onastick : OnAStick.ONASTICK.values()) {
            itemModelGenerator.register(onastick, Models.HANDHELD_ROD);
        }

        for (Item pickaxes : Pickaxes.MOD_PICKAXES.values()) {
            itemModelGenerator.register(pickaxes, Models.HANDHELD);
        }

        for (Item shovels : Shovels.MOD_SHOVELS.values()) {
            itemModelGenerator.register(shovels, Models.HANDHELD);
        }

        for (Item sticks : Sticks.MOD_STICKS.values()) {
            itemModelGenerator.register(sticks, Models.HANDHELD);
        }

        for (Item swords : Swords.MOD_SWORDS.values()) {
            itemModelGenerator.register(swords, Models.HANDHELD);
        }
    }

    public final void createGrindstone(BlockStateModelGenerator blockStateModelGenerator, Block block, Block log) {
        TextureMap textureMap = TextureMap.of(
                        ModTextureKey.PIVOT, TextureMap.getSubId(block, "_pivot"))
                .put(ModTextureKey.ROUND, getMCBlockId("minecraft:block/grindstone_round"))
                .put(TextureKey.SIDE, getMCBlockId("minecraft:block/grindstone_side"))
                .put(TextureKey.PARTICLE, getMCBlockId("minecraft:block/grindstone_side"))
                .put(ModTextureKey.LEG, TextureMap.getId(log));
        ModModel.GRINDSTONE.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create()
                .put(VariantSettings.MODEL, ModelIds.getBlockModelId(block))).coordinate(BlockStateVariantMap.create(Properties.BLOCK_FACE, Properties.HORIZONTAL_FACING).register(BlockFace.FLOOR, Direction.NORTH, BlockStateVariant.create()).register(BlockFace.FLOOR, Direction.EAST, BlockStateVariant.create()
                .put(VariantSettings.Y, VariantSettings.Rotation.R90)).register(BlockFace.FLOOR, Direction.SOUTH, BlockStateVariant.create()
                .put(VariantSettings.Y, VariantSettings.Rotation.R180)).register(BlockFace.FLOOR, Direction.WEST, BlockStateVariant.create()
                .put(VariantSettings.Y, VariantSettings.Rotation.R270)).register(BlockFace.WALL, Direction.NORTH, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R90)).register(BlockFace.WALL, Direction.EAST, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                .put(VariantSettings.Y, VariantSettings.Rotation.R90)).register(BlockFace.WALL, Direction.SOUTH, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                .put(VariantSettings.Y, VariantSettings.Rotation.R180)).register(BlockFace.WALL, Direction.WEST, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                .put(VariantSettings.Y, VariantSettings.Rotation.R270)).register(BlockFace.CEILING, Direction.SOUTH, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R180)).register(BlockFace.CEILING, Direction.WEST, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R90)).register(BlockFace.CEILING, Direction.NORTH, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R180)).register(BlockFace.CEILING, Direction.EAST, BlockStateVariant.create()
                .put(VariantSettings.X, VariantSettings.Rotation.R180).put(VariantSettings.Y, VariantSettings.Rotation.R270))));
    }

    public final void createLadder(BlockStateModelGenerator blockStateModelGenerator, Block block, Block planks) {
        TextureMap textureMap = TextureMap.of(
                        TextureKey.PARTICLE, TextureMap.getId(planks))
                .put(TextureKey.TEXTURE, TextureMap.getId(block));
        Item item = block.asItem();
        if (item != Items.AIR) {
            Models.GENERATED.upload(ModelIds.getItemModelId(item), TextureMap.layer0(block), blockStateModelGenerator.modelCollector);
        }
        ModModel.LADDER.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block, BlockStateVariant.create()
                .put(VariantSettings.MODEL, ModelIds.getBlockModelId(block))).coordinate(createNorthDefaultHorizontalRotationStates()));
    }

    public final void createLever(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier identifier = ModelIds.getBlockModelId(block);
        Identifier identifier2 = ModelIds.getBlockSubModelId(block, "_on");
        blockStateModelGenerator.registerItemModel(block);
        TextureMap textureMap = TextureMap.of(
                        TextureKey.PARTICLE, getMCBlockId("minecraft:block/cobblestone"))
                .put(ModTextureKey.BASE, getMCBlockId("minecraft:block/cobblestone"))
                .put(ModTextureKey.LEVER, TextureMap.getId(block));
        ModModel.LEVER.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        ModModel.LEVER_ON.upload(identifier2, textureMap, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
                .coordinate(createBooleanModelMap(Properties.POWERED, identifier, identifier2))
                .coordinate(BlockStateVariantMap.create(Properties.BLOCK_FACE, Properties.HORIZONTAL_FACING)
                        .register(BlockFace.CEILING, Direction.NORTH, BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R180)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(BlockFace.CEILING, Direction.EAST, BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R180)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(BlockFace.CEILING, Direction.SOUTH, BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R180))
                        .register(BlockFace.CEILING, Direction.WEST, BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R180)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(BlockFace.FLOOR, Direction.NORTH, BlockStateVariant.create())
                        .register(BlockFace.FLOOR, Direction.EAST, BlockStateVariant.create()
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(BlockFace.FLOOR, Direction.SOUTH, BlockStateVariant.create()
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(BlockFace.FLOOR, Direction.WEST, BlockStateVariant.create()
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))
                        .register(BlockFace.WALL, Direction.NORTH, BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R90))
                        .register(BlockFace.WALL, Direction.EAST, BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R90))
                        .register(BlockFace.WALL, Direction.SOUTH, BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R180))
                        .register(BlockFace.WALL, Direction.WEST, BlockStateVariant.create()
                                .put(VariantSettings.X, VariantSettings.Rotation.R90)
                                .put(VariantSettings.Y, VariantSettings.Rotation.R270))));
    }

    public final void createCampfire(BlockStateModelGenerator blockStateModelGenerator, Block block) {
        Identifier identifier = ModelIds.getBlockSubModelId(block, "_off");
        TextureMap textureMap = TextureMap.of(
                        ModTextureKey.LOG, TextureMap.getSubId(block, "_log"))
                .put(TextureKey.FIRE, getMCBlockId("minecraft:block/campfire_fire"))
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_log"))
                .put(TextureKey.LIT_LOG, TextureMap.getSubId(block, "_log_lit"));
        TextureMap textureMap2 = TextureMap.of(
                        ModTextureKey.LOG, TextureMap.getSubId(block, "_log"))
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block, "_log"));
        Identifier identifier2 = ModModel.CAMPFIRE.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        ModModel.CAMPFIRE_OFF.upload(identifier, textureMap2, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerItemModel(block.asItem());
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier
                .create(block).coordinate(createBooleanModelMap(Properties.LIT, identifier2, identifier))
                .coordinate(createSouthDefaultHorizontalRotationStates()));

    }

    public final void createSoulCampfire(BlockStateModelGenerator blockStateModelGenerator, Block block, Block block2) {
        Identifier identifier = ModelIds.getBlockSubModelId(block, "_off");
        TextureMap textureMap = TextureMap.of(
                        ModTextureKey.LOG, TextureMap.getSubId(block2, "_log"))
                .put(TextureKey.FIRE, getMCBlockId("minecraft:block/soul_campfire_fire"))
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block2, "_log"))
                .put(TextureKey.LIT_LOG, TextureMap.getSubId(block, "_log_lit"));
        TextureMap textureMap2 = TextureMap.of(
                        ModTextureKey.LOG, TextureMap.getSubId(block2, "_log"))
                .put(TextureKey.PARTICLE, TextureMap.getSubId(block2, "_log"));
        Identifier identifier2 = ModModel.CAMPFIRE.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        ModModel.CAMPFIRE_OFF.upload(identifier, textureMap2, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.registerItemModel(block.asItem());
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier
                .create(block).coordinate(createBooleanModelMap(Properties.LIT, identifier2, identifier))
                .coordinate(createSouthDefaultHorizontalRotationStates()));
    }

    public final void createRedstoneTorch(BlockStateModelGenerator blockStateModelGenerator, Block block, Block wall) {
        TextureMap textureMap = TextureMap.torch(block);
        TextureMap textureMap2 = TextureMap.torch(TextureMap.getSubId(block, "_off"));
        Identifier identifier = Models.TEMPLATE_TORCH.upload(block, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier2 = Models.TEMPLATE_TORCH.upload(block, "_off", textureMap2, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(block).coordinate(createBooleanModelMap(Properties.LIT, identifier, identifier2)));
        Identifier identifier3 = Models.TEMPLATE_TORCH_WALL.upload(wall, textureMap, blockStateModelGenerator.modelCollector);
        Identifier identifier4 = Models.TEMPLATE_TORCH_WALL.upload(wall, "_off", textureMap2, blockStateModelGenerator.modelCollector);
        blockStateModelGenerator.blockStateCollector.accept(VariantsBlockStateSupplier.create(wall).coordinate(createBooleanModelMap(Properties.LIT, identifier3, identifier4)).coordinate(createEastDefaultHorizontalRotationStates()));
        blockStateModelGenerator.registerItemModel(block);
        blockStateModelGenerator.excludeFromSimpleItemModelGeneration(wall);
    }

    public final void createBowItem(ItemModelGenerator itemModelGenerator, Item bow) {
        Identifier identifier = ModelIds.getItemModelId(bow);
        Model bowModel = new Model(Optional.of(identifier), Optional.empty(), TextureKey.LAYER0);
        Identifier identifier0 = ModelIds.getItemSubModelId(bow, "_pulling_0");
        Identifier identifier1 = ModelIds.getItemSubModelId(bow, "_pulling_1");
        Identifier identifier2 = ModelIds.getItemSubModelId(bow, "_pulling_2");
        TextureMap textureMap = TextureMap.of(TextureKey.LAYER0, TextureMap.getSubId(bow, "_pulling_0"));
        TextureMap textureMap1 = TextureMap.of(TextureKey.LAYER0, TextureMap.getSubId(bow, "_pulling_1"));
        TextureMap textureMap2 = TextureMap.of(TextureKey.LAYER0, TextureMap.getSubId(bow, "_pulling_2"));
        bowModel.upload(identifier0, textureMap, itemModelGenerator.writer);
        bowModel.upload(identifier1, textureMap1, itemModelGenerator.writer);
        bowModel.upload(identifier2, textureMap2, itemModelGenerator.writer);
    }

    public final void createCrossBowItem(ItemModelGenerator itemModelGenerator, Item bow) {
        Identifier identifier = ModelIds.getItemModelId(bow);
        Model bowModel = new Model(Optional.of(identifier), Optional.empty(), TextureKey.LAYER0);
        Identifier identifiera = ModelIds.getItemSubModelId(bow, "_arrow");
        Identifier identifierf = ModelIds.getItemSubModelId(bow, "_firework");
        Identifier identifier0 = ModelIds.getItemSubModelId(bow, "_pulling_0");
        Identifier identifier1 = ModelIds.getItemSubModelId(bow, "_pulling_1");
        Identifier identifier2 = ModelIds.getItemSubModelId(bow, "_pulling_2");
        TextureMap textureMapa = TextureMap.of(TextureKey.LAYER0, TextureMap.getSubId(bow, "_arrow"));
        TextureMap textureMapf = TextureMap.of(TextureKey.LAYER0, TextureMap.getSubId(bow, "_firework"));
        TextureMap textureMap0 = TextureMap.of(TextureKey.LAYER0, TextureMap.getSubId(bow, "_pulling_0"));
        TextureMap textureMap1 = TextureMap.of(TextureKey.LAYER0, TextureMap.getSubId(bow, "_pulling_1"));
        TextureMap textureMap2 = TextureMap.of(TextureKey.LAYER0, TextureMap.getSubId(bow, "_pulling_2"));
        bowModel.upload(identifiera, textureMapa, itemModelGenerator.writer);
        bowModel.upload(identifierf, textureMapf, itemModelGenerator.writer);
        bowModel.upload(identifier0, textureMap0, itemModelGenerator.writer);
        bowModel.upload(identifier1, textureMap1, itemModelGenerator.writer);
        bowModel.upload(identifier2, textureMap2, itemModelGenerator.writer);
    }

    public static Identifier getMCBlockId(String id) {
        return new Identifier(id);
    }
}