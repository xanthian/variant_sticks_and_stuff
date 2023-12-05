package net.xanthian.vsas.blocks.blocktypes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.LadderBlock;

public class VariantLadderBlock extends LadderBlock {
    public VariantLadderBlock() {
        super(FabricBlockSettings.copy(Blocks.LADDER).nonOpaque());

    }

}