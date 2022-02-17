package net.xanthian.vsas.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.screen.GrindstoneScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.xanthian.vsas.blocks.VariantGrindstoneBlock;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(GrindstoneScreenHandler.class)
public abstract class GrindstoneScreenHandlerMixin {

    @Shadow
    @Final
    private ScreenHandlerContext context;

    /**
     * @author Olivia
     */
    @Overwrite
    public boolean canUse(PlayerEntity player) {
        return this.context.get((world, pos) -> world.getBlockState(pos).getBlock() instanceof VariantGrindstoneBlock, true);
    }
}