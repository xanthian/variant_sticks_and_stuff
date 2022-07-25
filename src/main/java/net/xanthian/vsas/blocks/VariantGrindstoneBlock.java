package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;


import net.minecraft.block.Blocks;
import net.minecraft.block.GrindstoneBlock;

public class VariantGrindstoneBlock extends GrindstoneBlock {
    protected VariantGrindstoneBlock() {
        super(FabricBlockSettings.copy(Blocks.GRINDSTONE));
    }
}