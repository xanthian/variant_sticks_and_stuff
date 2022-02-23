package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vsas.Group;

public class VariantPickaxeItem extends AxeItem {
    public VariantPickaxeItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 1F, -3F, new FabricItemSettings().group(Group.STICKS_AND_STUFF));
    }
}
