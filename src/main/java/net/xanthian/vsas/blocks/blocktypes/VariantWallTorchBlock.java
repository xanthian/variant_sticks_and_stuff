package net.xanthian.vsas.blocks.blocktypes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.particle.ParticleTypes;

public class VariantWallTorchBlock extends WallTorchBlock {
    public VariantWallTorchBlock() {
        super(FabricBlockSettings.copy(Blocks.WALL_TORCH).nonOpaque().noCollision(), ParticleTypes.FLAME);
    }
}