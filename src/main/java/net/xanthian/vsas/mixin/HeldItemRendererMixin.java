package net.xanthian.vsas.mixin;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.xanthian.vsas.items.VariantCrossbowItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.At;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.item.ItemStack;

@Environment(EnvType.CLIENT)
@Mixin(HeldItemRenderer.class)
public class HeldItemRendererMixin {

    @Redirect(method = "renderFirstPersonItem", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z", ordinal = 1))
    boolean redirectIsOf(ItemStack instance, Item item) {
        if (item == Items.CROSSBOW) {
            return instance.isOf(item) || instance.getItem() instanceof VariantCrossbowItem;
        }
        return instance.isOf(item);
    }
}