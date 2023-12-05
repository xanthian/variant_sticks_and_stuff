package net.xanthian.vsas.blocks.blocktypes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.PoweredRailBlock;

public class VariantActivatorRailBlock extends PoweredRailBlock {
    public VariantActivatorRailBlock() {
        super(FabricBlockSettings.copyOf(Blocks.ACTIVATOR_RAIL));
    }
}