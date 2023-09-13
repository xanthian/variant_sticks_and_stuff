package net.xanthian.vsas.items.itemtypes;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BrushItem;

public class VariantBrushItem extends BrushItem {
    public VariantBrushItem() {
        super(new FabricItemSettings().maxDamage(64));
    }
}
