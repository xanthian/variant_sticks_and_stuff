package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vsas.Group;

public class VariantSwordItem extends SwordItem {
    public VariantSwordItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 3, 2.4f, new FabricItemSettings().group(Group.STICKS_AND_STUFF));
    }
}
