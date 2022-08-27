package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.item.OnAStickItem;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

public class VariantCarrotOnAStickItem extends OnAStickItem<PigEntity> {
    public VariantCarrotOnAStickItem() {
        super(new FabricItemSettings().group(Init.STICKS_AND_STUFF).maxDamage(25), EntityType.PIG, 7);
    }
    public static TagKey PIG_FEEDER_INGREDIENT_TAG = TagKey.of(Registry.ITEM_KEY,new Identifier("vsas","carrotonastick"));
}