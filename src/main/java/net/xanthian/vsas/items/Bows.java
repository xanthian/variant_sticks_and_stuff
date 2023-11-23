package net.xanthian.vsas.items;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.itemtypes.VariantBowItem;

import java.util.Map;

public class Bows {

    public static Map<Identifier, Item> MOD_BOWS = Maps.newHashMap();

    public static final Item ACACIA_BOW = registerItem("bows/acacia_bow", new VariantBowItem());
    public static final Item BAMBOO_BOW = registerItem("bows/bamboo_bow", new VariantBowItem());
    public static final Item BIRCH_BOW = registerItem("bows/birch_bow", new VariantBowItem());
    public static final Item CHERRY_BOW = registerItem("bows/cherry_bow", new VariantBowItem());
    public static final Item CRIMSON_BOW = registerItem("bows/crimson_bow", new VariantBowItem());
    public static final Item DARK_OAK_BOW = registerItem("bows/dark_oak_bow", new VariantBowItem());
    public static final Item JUNGLE_BOW = registerItem("bows/jungle_bow", new VariantBowItem());
    public static final Item OAK_BOW = registerItem("bows/oak_bow", new VariantBowItem());

    public static final Item MANGROVE_BOW = registerItem("bows/mangrove_bow", new VariantBowItem());
    public static final Item WARPED_BOW = registerItem("bows/warped_bow", new VariantBowItem());

    private static Item registerItem(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        MOD_BOWS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerBowItems() {
    }
}