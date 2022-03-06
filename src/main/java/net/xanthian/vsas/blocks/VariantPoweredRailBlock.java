package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.RailShape;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class VariantPoweredRailBlock extends PoweredRailBlock {
    protected VariantPoweredRailBlock() {
        super(FabricBlockSettings.copyOf(Blocks.POWERED_RAIL));
    }

    @Override
    protected boolean isPoweredByOtherRails(World world, BlockPos pos, boolean bl, int distance, RailShape shape) {
        BlockState blockState = world.getBlockState(pos);
        if (!(blockState.getBlock() instanceof PoweredRailBlock)) {
            return false;
        } else {
            RailShape railShape = (RailShape)blockState.get(SHAPE);
            if (shape == RailShape.EAST_WEST && (railShape == RailShape.NORTH_SOUTH || railShape == RailShape.ASCENDING_NORTH || railShape == RailShape.ASCENDING_SOUTH)) {
                return false;
            } else if (shape == RailShape.NORTH_SOUTH && (railShape == RailShape.EAST_WEST || railShape == RailShape.ASCENDING_EAST || railShape == RailShape.ASCENDING_WEST)) {
                return false;
            } else if ((Boolean)blockState.get(POWERED)) {
                return world.isReceivingRedstonePower(pos) ? true : this.isPoweredByOtherRails(world, pos, blockState, bl, distance + 1);
            } else {
                return false;
            }
        }
    }
}