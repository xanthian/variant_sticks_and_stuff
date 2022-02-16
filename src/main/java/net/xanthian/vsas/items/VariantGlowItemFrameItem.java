package net.xanthian.vsas.items;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.decoration.AbstractDecorationEntity;
import net.minecraft.item.ItemFrameItem;

public class VariantGlowItemFrameItem extends ItemFrameItem {
    public VariantGlowItemFrameItem(EntityType<? extends AbstractDecorationEntity> entityType, Settings settings) {
        super(entityType, settings);
    }
}
