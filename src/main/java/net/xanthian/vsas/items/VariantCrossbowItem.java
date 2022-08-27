package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;
import net.xanthian.vsas.Init;

public class VariantCrossbowItem extends CrossbowItem {
    public VariantCrossbowItem() {
        super(new FabricItemSettings().group(Init.STICKS_AND_STUFF).maxDamage(465));
    }

    @Override
    public boolean isUsedOnRelease(ItemStack stack) {
        return stack.getItem() instanceof VariantCrossbowItem;
    }
}