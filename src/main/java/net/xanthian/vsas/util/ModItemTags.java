package net.xanthian.vsas.util;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;


public class ModItemTags {

    public static final TagKey<Item> STICKS = register("sticks");

    private static TagKey<Item> register(String name) {
        return TagKey.of(RegistryKeys.ITEM, new Identifier(Initialise.MOD_ID, name));
    }
}