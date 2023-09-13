package net.xanthian.vsas.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import net.xanthian.vsas.items.itemtypes.VariantBowItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(AbstractClientPlayerEntity.class)
public class AbstractClientPlayerEntityMixin {


    @WrapOperation(method = "getFovMultiplier", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    boolean vsas$customBowFOV(ItemStack itemStack, Item item, Operation<Boolean> original) {
        return original.call(itemStack, item) || itemStack.getItem() instanceof VariantBowItem;
    }
}