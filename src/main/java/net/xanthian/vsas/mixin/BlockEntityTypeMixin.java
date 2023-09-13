package net.xanthian.vsas.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntityType;

import net.xanthian.vsas.blocks.blocktypes.VariantCampfireBlock;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockEntityType.class)
public class BlockEntityTypeMixin {

    @Inject(method = "supports", at = @At("HEAD"), cancellable = true)
    private void supports(BlockState state, CallbackInfoReturnable<Boolean> info) {
        if (BlockEntityType.CAMPFIRE.equals(this) && state.getBlock() instanceof VariantCampfireBlock) {
            info.setReturnValue(true);
        }
    }
}