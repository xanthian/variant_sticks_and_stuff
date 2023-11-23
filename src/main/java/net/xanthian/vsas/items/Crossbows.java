package net.xanthian.vsas.items;

import com.google.common.collect.Maps;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.itemtypes.VariantCrossbowItem;

import java.util.Map;

public class Crossbows {

    public static Map<Identifier, Item> MOD_CROSSBOWS = Maps.newHashMap();

    public static final CrossbowItem ACACIA_CROSSBOW = registerItem("crossbows/acacia_crossbow", new VariantCrossbowItem());
    public static final CrossbowItem BAMBOO_CROSSBOW = registerItem("crossbows/bamboo_crossbow", new VariantCrossbowItem());
    public static final CrossbowItem BIRCH_CROSSBOW = registerItem("crossbows/birch_crossbow", new VariantCrossbowItem());
    public static final CrossbowItem CHERRY_CROSSBOW = registerItem("crossbows/cherry_crossbow", new VariantCrossbowItem());
    public static final CrossbowItem CRIMSON_CROSSBOW = registerItem("crossbows/crimson_crossbow", new VariantCrossbowItem());
    public static final CrossbowItem DARK_OAK_CROSSBOW = registerItem("crossbows/dark_oak_crossbow", new VariantCrossbowItem());
    public static final CrossbowItem JUNGLE_CROSSBOW = registerItem("crossbows/jungle_crossbow", new VariantCrossbowItem());
    public static final CrossbowItem OAK_CROSSBOW = registerItem("crossbows/oak_crossbow", new VariantCrossbowItem());
    public static final CrossbowItem MANGROVE_CROSSBOW = registerItem("crossbows/mangrove_crossbow", new VariantCrossbowItem());

    public static final CrossbowItem WARPED_CROSSBOW = registerItem("crossbows/warped_crossbow", new VariantCrossbowItem());

    private static CrossbowItem registerItem(String name, CrossbowItem item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        MOD_CROSSBOWS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerCrossBowItems() {
    }
}