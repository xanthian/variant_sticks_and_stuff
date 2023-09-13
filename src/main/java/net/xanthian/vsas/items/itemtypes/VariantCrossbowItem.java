package net.xanthian.vsas.items.itemtypes;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.CrossbowItem;
import net.minecraft.item.ItemStack;

public class VariantCrossbowItem extends CrossbowItem {
    public VariantCrossbowItem() {
        super(new FabricItemSettings().maxDamage(465));
    }

    @Override
    public boolean isUsedOnRelease(ItemStack stack) {
        return stack.getItem() instanceof CrossbowItem;
    }
}