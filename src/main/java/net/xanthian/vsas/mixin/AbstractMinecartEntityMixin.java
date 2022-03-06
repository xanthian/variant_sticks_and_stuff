package net.xanthian.vsas.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.world.World;
import net.xanthian.vsas.blocks.VariantActivatorRailBlock;
import net.xanthian.vsas.blocks.VariantPoweredRailBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(AbstractMinecartEntity.class)
public abstract class AbstractMinecartEntityMixin extends Entity {

    public AbstractMinecartEntityMixin(EntityType<?> type, World world) {
        super(type, world);

    }
    @Redirect(method = "moveOnRail", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    boolean redirectIsOf(BlockState state, Block block) {
        if (block == Blocks.POWERED_RAIL) {
            return state.isOf(block) || state.getBlock() instanceof VariantPoweredRailBlock;
        }
            return state.isOf(block);
    }
    @Redirect(method = "tick", at = @At(value = "INVOKE", target = "Lnet/minecraft/block/BlockState;isOf(Lnet/minecraft/block/Block;)Z"))
    boolean redirectIsOf2(BlockState state, Block block) {
        if (block == Blocks.ACTIVATOR_RAIL) {
            return state.isOf(block) || state.getBlock() instanceof VariantActivatorRailBlock;
        }
        return state.isOf(block);
    }
}
