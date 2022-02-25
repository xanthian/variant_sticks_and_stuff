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

    public static final Item ACACIA_CARROT_ON_A_STICK = registerItem("onastick/acacia_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item BIRCH_CARROT_ON_A_STICK = registerItem("onastick/birch_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item CRIMSON_CARROT_ON_A_STICK = registerItem("onastick/crimson_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item DARK_OAK_CARROT_ON_A_STICK = registerItem("onastick/dark_oak_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item JUNGLE_CARROT_ON_A_STICK = registerItem("onastick/jungle_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item OAK_CARROT_ON_A_STICK = registerItem("onastick/oak_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item SPRUCE_CARROT_ON_A_STICK = registerItem("onastick/spruce_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item WARPED_CARROT_ON_A_STICK = registerItem("onastick/warped_carrot_on_a_stick", new VariantCarrotOnAStickItem());

    public static final Item ACACIA_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/acacia_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item BIRCH_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/birch_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item CRIMSON_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/crimson_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item DARK_OAK_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/dark_oak_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item JUNGLE_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/jungle_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item OAK_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/oak_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item SPRUCE_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/spruce_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item WARPED_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/warped_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerOnAStickItems() {
    }
}
