package net.xanthian.vsas.items;


import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

import java.util.LinkedHashMap;
import java.util.Map;

public class OnAStick {
    private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

    // Carrot
    public static void registerCarrotOnAStick() {
        Item ACACIA_CARROT_ON_A_STICK = registerItem("onastick/acacia_carrot_on_a_stick", new VariantCarrotOnAStickItem());
        Item BIRCH_CARROT_ON_A_STICK = registerItem("onastick/birch_carrot_on_a_stick", new VariantCarrotOnAStickItem());
        Item CRIMSON_CARROT_ON_A_STICK = registerItem("onastick/crimson_carrot_on_a_stick", new VariantCarrotOnAStickItem());
        Item DARK_OAK_CARROT_ON_A_STICK = registerItem("onastick/dark_oak_carrot_on_a_stick", new VariantCarrotOnAStickItem());
        Item JUNGLE_CARROT_ON_A_STICK = registerItem("onastick/jungle_carrot_on_a_stick", new VariantCarrotOnAStickItem());
        Item OAK_CARROT_ON_A_STICK = registerItem("onastick/oak_carrot_on_a_stick", new VariantCarrotOnAStickItem());
        Item MANGROVE_CARROT_ON_A_STICK = registerItem("onastick/mangrove_carrot_on_a_stick", new VariantCarrotOnAStickItem());
        Item SPRUCE_CARROT_ON_A_STICK = registerItem("onastick/spruce_carrot_on_a_stick", new VariantCarrotOnAStickItem());
        Item WARPED_CARROT_ON_A_STICK = registerItem("onastick/warped_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    }

    // Fungus
    public static void registerFungusOnAStick() {
        Item ACACIA_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/acacia_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
        Item BIRCH_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/birch_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
        Item CRIMSON_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/crimson_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
        Item DARK_OAK_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/dark_oak_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
        Item JUNGLE_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/jungle_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
        Item OAK_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/oak_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
        Item MANGROVE_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/mangrove_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
        Item SPRUCE_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/spruce_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
        Item WARPED_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/warped_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
}