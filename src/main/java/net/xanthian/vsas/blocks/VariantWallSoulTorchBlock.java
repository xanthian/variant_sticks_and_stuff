package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallTorchBlock;
import net.minecraft.particle.ParticleTypes;

public class VariantWallSoulTorchBlock extends WallTorchBlock {
    public VariantWallSoulTorchBlock() {
        super(FabricBlockSettings.copy(Blocks.SOUL_WALL_TORCH).nonOpaque().noCollision(), ParticleTypes.SOUL_FIRE_FLAME);

    }
}