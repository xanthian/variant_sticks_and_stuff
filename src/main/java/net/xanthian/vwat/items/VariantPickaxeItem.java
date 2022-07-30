package net.xanthian.vwat.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vwat.Group;

public class VariantPickaxeItem extends PickaxeItem {
    public VariantPickaxeItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 1, -2.8F, new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS));
    }
}
