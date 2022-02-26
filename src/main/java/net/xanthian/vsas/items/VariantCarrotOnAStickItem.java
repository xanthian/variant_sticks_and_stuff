package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.item.OnAStickItem;
import net.xanthian.vsas.Group;

public class VariantCarrotOnAStickItem extends OnAStickItem<PigEntity> {
    public VariantCarrotOnAStickItem() {
        super(new FabricItemSettings().group(Group.STICKS_AND_STUFF).maxDamage(25), EntityType.PIG, 7);
    }
}