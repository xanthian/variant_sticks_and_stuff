package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.item.OnAStickItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class VariantFungusOnAStickItem extends OnAStickItem<StriderEntity> {
    public VariantFungusOnAStickItem() {
        super(new FabricItemSettings().maxDamage(100), EntityType.STRIDER, 1);
    }

    public static TagKey STRIDER_FEEDER_INGREDIENT_TAG = TagKey.of(Registries.ITEM.getKey(), new Identifier("vsas", "fungusonastick"));
}