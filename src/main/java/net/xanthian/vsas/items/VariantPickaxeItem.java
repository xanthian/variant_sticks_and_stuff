package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vsas.Init;

public class VariantPickaxeItem extends PickaxeItem {
    public VariantPickaxeItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 1, -2.8F, new FabricItemSettings().group(Init.STICKS_AND_STUFF));
    }
}
