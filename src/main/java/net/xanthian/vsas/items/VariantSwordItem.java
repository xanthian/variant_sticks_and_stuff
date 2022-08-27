package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vsas.Init;

public class VariantSwordItem extends SwordItem {
    public VariantSwordItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 3, -2.4F, new FabricItemSettings().group(Init.STICKS_AND_STUFF));
    }
}
