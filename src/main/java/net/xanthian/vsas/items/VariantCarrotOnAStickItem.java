package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.item.OnAStickItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class VariantCarrotOnAStickItem extends OnAStickItem<PigEntity> {
    public VariantCarrotOnAStickItem() {
        super(new FabricItemSettings().maxDamage(25), EntityType.PIG, 7);
    }
    public static TagKey PIG_FEEDER_INGREDIENT_TAG = TagKey.of(Registries.ITEM.getKey(), new Identifier("vsas","carrotonastick"));
}