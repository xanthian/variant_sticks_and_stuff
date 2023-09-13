package net.xanthian.vsas.items;

import com.google.common.collect.Maps;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.arrows.*;

import java.util.Map;

public class Arrows {
    public static Map<Identifier, Item> MOD_ARROWS = Maps.newHashMap();

    public static final ArrowItem ACACIA_ARROW_ITEM = registerItem("arrows/acacia_arrow", new AcaciaArrowItem());
    public static final ArrowItem BAMBOO_ARROW_ITEM = registerItem("arrows/bamboo_arrow", new BambooArrowItem());
    public static final ArrowItem BIRCH_ARROW_ITEM = registerItem("arrows/birch_arrow", new BirchArrowItem());
    public static final ArrowItem CHERRY_ARROW_ITEM = registerItem("arrows/cherry_arrow", new CherryArrowItem());
    public static final ArrowItem CRIMSON_ARROW_ITEM = registerItem("arrows/crimson_arrow", new CrimsonArrowItem());
    public static final ArrowItem DARK_OAK_ARROW_ITEM = registerItem("arrows/dark_oak_arrow", new DarkOakArrowItem());
    public static final ArrowItem JUNGLE_ARROW_ITEM = registerItem("arrows/jungle_arrow", new JungleArrowItem());
    public static final ArrowItem OAK_ARROW_ITEM = registerItem("arrows/oak_arrow", new OakArrowItem());

    public static final ArrowItem MANGROVE_ARROW_ITEM = registerItem("arrows/mangrove_arrow", new MangroveArrowItem());
    public static final ArrowItem WARPED_ARROW_ITEM = registerItem("arrows/warped_arrow", new WarpedArrowItem());

    private static ArrowItem registerItem(String name, ArrowItem item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_ARROWS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerArrowItems() {
    }
}