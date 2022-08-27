package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vsas.Init;

public class VariantHoeItem extends HoeItem{
    public VariantHoeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage,   attackSpeed, new FabricItemSettings().group(Init.STICKS_AND_STUFF));
    }
}
