package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Blocks;
import net.minecraft.block.LeverBlock;

public class VariantLeverBlock extends LeverBlock {
    protected VariantLeverBlock() {
        super(FabricBlockSettings.copy(Blocks.LEVER));
    }
}