package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.BowItem;

public class VariantBowItem extends BowItem {
    public VariantBowItem() {
        super(new FabricItemSettings().maxDamage(384));
    }
}