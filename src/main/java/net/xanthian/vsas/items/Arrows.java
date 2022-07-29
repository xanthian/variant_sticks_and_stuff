package net.xanthian.vsas.items;


import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;
import net.xanthian.vsas.items.arrows.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class Arrows {
    private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

    public static final Item ACACIA_ARROW_ITEM = registerItem("arrows/acacia_arrow", new AcaciaArrowItem());
    public static final Item BIRCH_ARROW_ITEM = registerItem("arrows/birch_arrow", new BirchArrowItem());
    public static final Item CRIMSON_ARROW_ITEM = registerItem("arrows/crimson_arrow", new CrimsonArrowItem());
    public static final Item DARK_OAK_ARROW_ITEM = registerItem("arrows/dark_oak_arrow", new DarkOakArrowItem());
    public static final Item JUNGLE_ARROW_ITEM = registerItem("arrows/jungle_arrow", new JungleArrowItem());
    public static final Item OAK_ARROW_ITEM = registerItem("arrows/oak_arrow", new OakArrowItem());
    public static final Item MANGROVE_ARROW_ITEM = registerItem("arrows/mangrove_arrow", new MangroveArrowItem());
    public static final Item SPRUCE_ARROW_ITEM = registerItem("arrows/spruce_arrow", new SpruceArrowItem());
    public static final Item WARPED_ARROW_ITEM = registerItem("arrows/warped_arrow", new WarpedArrowItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerArrowItems() {
    }
}
