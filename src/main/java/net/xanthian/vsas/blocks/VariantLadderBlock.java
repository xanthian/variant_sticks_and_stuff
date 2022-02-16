package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;

public class VariantLadderBlock extends net.minecraft.block.LadderBlock {
    public VariantLadderBlock() {
        super(FabricBlockSettings.copy(Blocks.LADDER).nonOpaque());
    }
}