package net.xanthian.vsas.blocks;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.Random;

public class VariantTorchBlock extends TorchBlock {

    public VariantTorchBlock(){
        super(FabricBlockSettings.copy(Blocks.TORCH).nonOpaque().noCollision(), ParticleTypes.FLAME);
    }
}