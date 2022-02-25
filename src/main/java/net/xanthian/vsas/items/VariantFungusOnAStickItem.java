package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.item.OnAStickItem;
import net.xanthian.vsas.Group;

public class VariantFungusOnAStickItem extends OnAStickItem<StriderEntity> {
    public VariantFungusOnAStickItem() {
        super(new FabricItemSettings().group(Group.STICKS_AND_STUFF), EntityType.STRIDER, 1);
    }
}
