package net.xanthian.vsas.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.minecraft.item.Item;
import net.minecraft.item.Items;

import net.xanthian.vsas.items.itemtypes.VariantCrossbowItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.item.ItemStack;

@Environment(EnvType.CLIENT)
@Mixin(HeldItemRenderer.class)
public class HeldItemRendererMixin {

    @WrapOperation(method = "renderFirstPersonItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private boolean vsas$renderCustomXBows(ItemStack stack, Item item, Operation<Boolean> original) {
        if (item == Items.CROSSBOW) {
            return original.call(stack, item) || stack.getItem() instanceof VariantCrossbowItem;
        } else {
            return original.call(stack, item);
        }
    }
}