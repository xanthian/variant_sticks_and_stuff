package net.xanthian.vsas.blocks.blocktypes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.TorchBlock;
import net.minecraft.particle.ParticleTypes;

public class VariantTorchBlock extends TorchBlock {

    public VariantTorchBlock() {
        super(FabricBlockSettings.copy(Blocks.TORCH).nonOpaque().noCollision(), ParticleTypes.FLAME);
    }
}