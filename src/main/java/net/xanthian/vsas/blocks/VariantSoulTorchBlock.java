package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
import net.minecraft.particle.ParticleTypes;

public class VariantSoulTorchBlock extends TorchBlock {

    public VariantSoulTorchBlock(){
        super(FabricBlockSettings.copy(Blocks.SOUL_TORCH).nonOpaque().noCollision(), ParticleTypes.SOUL_FIRE_FLAME);
    }
}