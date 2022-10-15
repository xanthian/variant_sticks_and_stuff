package net.xanthian.vsas.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.ItemStack;
import net.xanthian.vsas.items.VariantFishingRodItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(FishingBobberEntity.class)
public abstract class FishingBobberEntityMixin {

    /**
     * @author Draylar
    **/

    @Inject(at = @At("HEAD"), method = "removeIfInvalid(Lnet/minecraft/entity/player/PlayerEntity;)Z", cancellable = true)
    private void removeIfInvalid(PlayerEntity playerEntity, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        ItemStack itemStack = playerEntity.getMainHandStack();
        ItemStack itemStack2 = playerEntity.getOffHandStack();
        boolean bl = itemStack.getItem() instanceof VariantFishingRodItem;
        boolean bl2 = itemStack2.getItem() instanceof VariantFishingRodItem;
        if (!playerEntity.isRemoved() && playerEntity.isAlive() && (bl || bl2) &&
                (((FishingBobberEntity)(Object)this).squaredDistanceTo(playerEntity) < 1024.0D)) {
            callbackInfoReturnable.setReturnValue(false);
        }
    }
}