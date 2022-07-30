package net.xanthian.vwat.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vwat.Group;

public class VariantSwordItem extends SwordItem {
    public VariantSwordItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 3, -2.4F, new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS));
    }
}
