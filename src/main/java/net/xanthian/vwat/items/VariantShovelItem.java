package net.xanthian.vwat.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vwat.Group;

public class VariantShovelItem extends ShovelItem {
    public VariantShovelItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 1.5F, -3F, new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS));
    }
}
