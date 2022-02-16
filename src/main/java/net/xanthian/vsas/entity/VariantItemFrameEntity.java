package net.xanthian.vsas.entity;

import net.minecraft.entity.decoration.ItemFrameEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;

public class VariantItemFrameEntity extends ItemFrameEntity {
    public VariantItemFrameEntity(World world, BlockPos pos, Direction facing) {
        super(world, pos, facing);
    }
}