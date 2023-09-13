package net.xanthian.vsas.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.GrindstoneScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;

import net.xanthian.vsas.blocks.blocktypes.VariantGrindstoneBlock;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(GrindstoneScreenHandler.class)
public abstract class GrindstoneScreenHandlerMixin {

    @Shadow
    @Final
    private ScreenHandlerContext context;

    @Inject(method = "canUse", at = @At("HEAD"), cancellable = true)
    private void canUse(PlayerEntity player, CallbackInfoReturnable<Boolean> info) {
        if (context.get((world, pos) -> world.getBlockState(pos).getBlock() instanceof VariantGrindstoneBlock, true)) {
            info.setReturnValue(true);
        }
    }
}