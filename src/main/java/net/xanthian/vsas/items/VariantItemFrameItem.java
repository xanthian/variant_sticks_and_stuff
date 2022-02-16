package net.xanthian.vsas.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.AbstractDecorationEntity;
import net.minecraft.item.ItemFrameItem;

public class VariantItemFrameItem extends ItemFrameItem {
    public VariantItemFrameItem(EntityType<? extends AbstractDecorationEntity> entityType, Settings settings) {
        super(entityType, settings);
    }
}
