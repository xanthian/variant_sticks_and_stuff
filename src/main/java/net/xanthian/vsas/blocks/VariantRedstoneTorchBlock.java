package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneTorchBlock;

public class VariantRedstoneTorchBlock extends RedstoneTorchBlock {

    public VariantRedstoneTorchBlock(){
        super(FabricBlockSettings.copy(Blocks.REDSTONE_TORCH).nonOpaque().noCollision());
    }
}