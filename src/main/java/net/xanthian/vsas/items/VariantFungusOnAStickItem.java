package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.item.OnAStickItem;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

public class VariantFungusOnAStickItem extends OnAStickItem<StriderEntity> {
    public VariantFungusOnAStickItem() {
        super(new FabricItemSettings().group(Init.STICKS_AND_STUFF).maxDamage(100), EntityType.STRIDER, 1);
    }

    public static TagKey STRIDER_FEEDER_INGREDIENT_TAG = TagKey.of(Registry.ITEM_KEY, new Identifier("vsas", "fungusonastick"));
}