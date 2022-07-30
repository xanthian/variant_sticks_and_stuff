package net.xanthian.vwat.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vwat.Group;

public class VariantHoeItem extends HoeItem{
    public VariantHoeItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage,   attackSpeed, new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS));
    }
}
