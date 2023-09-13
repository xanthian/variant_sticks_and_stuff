package net.xanthian.vsas.items.itemtypes;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class VariantSwordItem extends SwordItem {
    public VariantSwordItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 3, -2.4F, new FabricItemSettings());
    }
}