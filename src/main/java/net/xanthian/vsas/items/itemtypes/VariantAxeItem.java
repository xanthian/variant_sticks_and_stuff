package net.xanthian.vsas.items.itemtypes;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class VariantAxeItem extends AxeItem {
    public VariantAxeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings());
    }
}