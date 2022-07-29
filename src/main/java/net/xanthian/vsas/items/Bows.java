package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

import java.util.LinkedHashMap;
import java.util.Map;

public class Bows {
    private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

    public static final Item ACACIA_BOW = registerItem("bows/acacia_bow", new VariantBowItem(), true);
    public static final Item BIRCH_BOW = registerItem("bows/birch_bow", new VariantBowItem(), true);
    public static final Item CRIMSON_BOW = registerItem("bows/crimson_bow", new VariantBowItem(), false);
    public static final Item DARK_OAK_BOW = registerItem("bows/dark_oak_bow", new VariantBowItem(), true);
    public static final Item JUNGLE_BOW = registerItem("bows/jungle_bow", new VariantBowItem(), true);
    public static final Item OAK_BOW = registerItem("bows/oak_bow", new VariantBowItem(), true);
    public static final Item MANGROVE_BOW = registerItem("bows/mangrove_bow", new VariantBowItem(), true);
    public static final Item SPRUCE_BOW = registerItem("bows/spruce_bow", new VariantBowItem(), true);
    public static final Item WARPED_BOW = registerItem("bows/warped_bow", new VariantBowItem(), false);

    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 300);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerBowItems() {
    }
}
