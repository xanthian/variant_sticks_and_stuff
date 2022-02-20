package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.minecraft.block.CampfireBlock;

public class VariantCampfireBlock extends CampfireBlock {
    public VariantCampfireBlock() {
        super(true, 1, FabricBlockSettings.copy(Blocks.SOUL_CAMPFIRE));
    }
}
