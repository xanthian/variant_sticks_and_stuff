package net.xanthian.vsas.blocks.blocktypes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Blocks;
import net.minecraft.block.WallRedstoneTorchBlock;

public class VariantWallRedstoneTorchBlock extends WallRedstoneTorchBlock {
    public VariantWallRedstoneTorchBlock() {
        super(FabricBlockSettings.copy(Blocks.REDSTONE_WALL_TORCH).nonOpaque().noCollision());

    }
}