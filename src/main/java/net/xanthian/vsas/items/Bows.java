package net.xanthian.vsas.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;

public class Bows {

    public static final Item ACACIA_BOW = registerItem("bows/acacia_bow", new VariantBowItem());
    public static final Item BIRCH_BOW = registerItem("bows/birch_bow", new VariantBowItem());
    public static final Item CRIMSON_BOW = registerItem("bows/crimson_bow", new VariantBowItem());
    public static final Item DARK_OAK_BOW = registerItem("bows/dark_oak_bow", new VariantBowItem());
    public static final Item JUNGLE_BOW = registerItem("bows/jungle_bow", new VariantBowItem());
    public static final Item OAK_BOW = registerItem("bows/oak_bow", new VariantBowItem());
    public static final Item MANGROVE_BOW = registerItem("bows/mangrove_bow", new VariantBowItem());
    public static final Item SPRUCE_BOW = registerItem("bows/spruce_bow", new VariantBowItem());
    public static final Item WARPED_BOW = registerItem("bows/warped_bow", new VariantBowItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerBowItems() {
    }
}