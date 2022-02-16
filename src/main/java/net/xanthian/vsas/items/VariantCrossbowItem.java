package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.CrossbowItem;
import net.xanthian.vsas.Group;

public class VariantCrossbowItem extends CrossbowItem {
    public VariantCrossbowItem() {
        super(new FabricItemSettings().group(Group.STICKS_AND_STUFF).maxDamage(465));
    }
}
