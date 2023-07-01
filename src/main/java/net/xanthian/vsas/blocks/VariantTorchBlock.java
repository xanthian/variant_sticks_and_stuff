package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;

public class VariantTorchBlock extends TorchBlock {

    public VariantTorchBlock(){
        super(FabricBlockSettings.copy(Blocks.TORCH).nonOpaque().noCollision(), ParticleTypes.FLAME);
    }
}