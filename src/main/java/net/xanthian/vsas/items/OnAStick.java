package net.xanthian.vsas.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;

public class OnAStick {

    public static final Item ACACIA_CARROT_ON_A_STICK = registerItem("onastick/acacia_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item BIRCH_CARROT_ON_A_STICK = registerItem("onastick/birch_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item CRIMSON_CARROT_ON_A_STICK = registerItem("onastick/crimson_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item DARK_OAK_CARROT_ON_A_STICK = registerItem("onastick/dark_oak_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item JUNGLE_CARROT_ON_A_STICK = registerItem("onastick/jungle_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item OAK_CARROT_ON_A_STICK = registerItem("onastick/oak_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item MANGROVE_CARROT_ON_A_STICK = registerItem("onastick/mangrove_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item SPRUCE_CARROT_ON_A_STICK = registerItem("onastick/spruce_carrot_on_a_stick", new VariantCarrotOnAStickItem());
    public static final Item WARPED_CARROT_ON_A_STICK = registerItem("onastick/warped_carrot_on_a_stick", new VariantCarrotOnAStickItem());

    public static final Item ACACIA_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/acacia_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item BIRCH_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/birch_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item CRIMSON_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/crimson_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item DARK_OAK_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/dark_oak_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item JUNGLE_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/jungle_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item OAK_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/oak_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item MANGROVE_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/mangrove_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item SPRUCE_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/spruce_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());
    public static final Item WARPED_WARPED_FUNGUS_ON_A_STICK = registerItem("onastick/warped_warped_fungus_on_a_stick", new VariantFungusOnAStickItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }

    public static void registerOnAStickItems() {
    }
}