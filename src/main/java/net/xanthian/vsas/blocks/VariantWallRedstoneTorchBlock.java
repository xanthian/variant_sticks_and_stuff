package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallRedstoneTorchBlock;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.particle.ParticleTypes;

public class VariantWallRedstoneTorchBlock extends WallRedstoneTorchBlock {
    public VariantWallRedstoneTorchBlock() {
        super(FabricBlockSettings.copy(Blocks.REDSTONE_WALL_TORCH).nonOpaque().noCollision());

    }
}