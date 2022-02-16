package net.xanthian.vsas.entity;

import net.minecraft.entity.decoration.GlowItemFrameEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class VariantGlowItemFrameEntity extends GlowItemFrameEntity {
    public VariantGlowItemFrameEntity(World world, BlockPos blockPos, Direction direction) {
        super(world, blockPos, direction);
    }
}
