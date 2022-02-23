package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;
import net.xanthian.vsas.Group;

public class VariantAxeItem extends AxeItem {
    public VariantAxeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed) {
        super(toolMaterial, attackDamage, attackSpeed, new FabricItemSettings().group(Group.STICKS_AND_STUFF));
    }
}
