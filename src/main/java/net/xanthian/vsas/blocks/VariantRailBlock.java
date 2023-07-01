package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.*;
import net.minecraft.block.enums.RailShape;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;

public class VariantRailBlock  extends AbstractRailBlock {
    protected VariantRailBlock() {
        super(false, FabricBlockSettings.copyOf(Blocks.RAIL).nonOpaque());
        this.setDefaultState(this.stateManager.getDefaultState().with(Properties.RAIL_SHAPE, RailShape.NORTH_SOUTH).with(Properties.WATERLOGGED, false));
    }

    @Override
    public Property<RailShape> getShapeProperty() {
        return Properties.RAIL_SHAPE;
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        switch (rotation) {
            case CLOCKWISE_180 -> {
                return switch (state.get(Properties.RAIL_SHAPE)) {
                    case ASCENDING_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_WEST);
                    case ASCENDING_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_EAST);
                    case ASCENDING_NORTH -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_SOUTH);
                    case ASCENDING_SOUTH -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_NORTH);
                    case SOUTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_WEST);
                    case SOUTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_EAST);
                    case NORTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_EAST);
                    case NORTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_WEST);
                    default -> state;
                };
            }
            case COUNTERCLOCKWISE_90 -> {
                return switch (state.get(Properties.RAIL_SHAPE)) {
                    case NORTH_SOUTH -> state.with(Properties.RAIL_SHAPE, RailShape.EAST_WEST);
                    case EAST_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_SOUTH);
                    case ASCENDING_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_NORTH);
                    case ASCENDING_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_SOUTH);
                    case ASCENDING_NORTH -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_WEST);
                    case ASCENDING_SOUTH -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_EAST);
                    case SOUTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_EAST);
                    case SOUTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_EAST);
                    case NORTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_WEST);
                    case NORTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_WEST);
                };
            }
            case CLOCKWISE_90 -> {
                return switch (state.get(Properties.RAIL_SHAPE)) {
                    case NORTH_SOUTH -> state.with(Properties.RAIL_SHAPE, RailShape.EAST_WEST);
                    case EAST_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_SOUTH);
                    case ASCENDING_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_SOUTH);
                    case ASCENDING_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_NORTH);
                    case ASCENDING_NORTH -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_EAST);
                    case ASCENDING_SOUTH -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_WEST);
                    case SOUTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_WEST);
                    case SOUTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_WEST);
                    case NORTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_EAST);
                    case NORTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_EAST);
                };
            }
        }
        return state;
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        RailShape railShape = state.get(Properties.RAIL_SHAPE);
        switch (mirror) {
            case LEFT_RIGHT -> {
                return switch (railShape) {
                    case ASCENDING_NORTH -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_SOUTH);
                    case ASCENDING_SOUTH -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_NORTH);
                    case SOUTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_EAST);
                    case SOUTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_WEST);
                    case NORTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_WEST);
                    case NORTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_EAST);
                    default -> state;
                };
            }
            case FRONT_BACK -> {
                return switch (railShape) {
                    case ASCENDING_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_WEST);
                    case ASCENDING_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.ASCENDING_EAST);
                    case SOUTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_WEST);
                    case SOUTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.SOUTH_EAST);
                    case NORTH_WEST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_EAST);
                    case NORTH_EAST -> state.with(Properties.RAIL_SHAPE, RailShape.NORTH_WEST);
                    default -> state;
                };
            }
        }
        return super.mirror(state, mirror);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(Properties.RAIL_SHAPE, Properties.WATERLOGGED);
    }
}