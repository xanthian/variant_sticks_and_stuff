package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vsas.Init;

public class VariantShovelItem extends ShovelItem {
    public VariantShovelItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 1.5F, -3F, new FabricItemSettings().group(Init.STICKS_AND_STUFF));
    }
}
