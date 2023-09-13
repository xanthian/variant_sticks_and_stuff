package net.xanthian.vsas.blocks.blocktypes;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Blocks;
import net.minecraft.block.DetectorRailBlock;

public class VariantDetectorRailBlock extends DetectorRailBlock {
    public VariantDetectorRailBlock() {
        super(FabricBlockSettings.copyOf(Blocks.DETECTOR_RAIL));
    }
}