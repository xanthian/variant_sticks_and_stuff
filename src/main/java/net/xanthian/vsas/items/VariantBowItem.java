package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BowItem;
import net.xanthian.vsas.Init;

public class VariantBowItem extends BowItem {
    public VariantBowItem() {
        super(new FabricItemSettings().group(Init.STICKS_AND_STUFF).maxDamage(384));
    }
}