package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class VariantPickaxeItem extends PickaxeItem {
    public VariantPickaxeItem(ToolMaterial toolMaterial) {
        super(toolMaterial, 1, -2.8F, new FabricItemSettings());
    }
}