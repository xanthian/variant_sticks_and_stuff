package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;
import net.xanthian.vsas.items.arrows.AcaciaArrowItem;

import java.util.LinkedHashMap;
import java.util.Map;

public class Arrows {
    private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

    public static final Item ACACIA_ARROW_ITEM = registerItem("arrows/acacia_arrow", new AcaciaArrowItem());
    //public static final Item BIRCH_ARROW = registerItem("arrows/birch_arrow", new VariantArrowItem());
    //public static final Item CRIMSON_ARROW = registerItem("arrows/crimson_arrow", new VariantArrowItem());
    //public static final Item DARK_OAK_ARROW = registerItem("arrows/dark_oak_arrow", new VariantArrowItem());
    //public static final Item JUNGLE_ARROW = registerItem("arrows/jungle_arrow", new VariantArrowItem());
    //public static final Item OAK_ARROW = registerItem("arrows/oak_arrow", new VariantArrowItem());
    //public static final Item SPRUCE_ARROW = registerItem("arrows/spruce_arrow", new VariantArrowItem());
    //public static final Item WARPED_ARROW = registerItem("arrows/warped_arrow", new VariantArrowItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerArrowItems() {
    }
}
