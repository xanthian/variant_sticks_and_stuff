package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;

public class VariantWallTorchBlock extends WallTorchBlock {
    public VariantWallTorchBlock() {
        super(FabricBlockSettings.copy(Blocks.WALL_TORCH).nonOpaque().noCollision(), ParticleTypes.FLAME);
    }
}