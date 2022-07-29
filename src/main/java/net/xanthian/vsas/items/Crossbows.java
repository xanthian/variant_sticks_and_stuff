package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

import java.util.LinkedHashMap;
import java.util.Map;

public class Crossbows {
    private static final Map<Identifier, VariantCrossbowItem> ITEMS = new LinkedHashMap<>();

    public static final VariantCrossbowItem ACACIA_CROSSBOW = registerItem("crossbows/acacia_crossbow", new VariantCrossbowItem(), true);
    public static final VariantCrossbowItem BIRCH_CROSSBOW = registerItem("crossbows/birch_crossbow", new VariantCrossbowItem(), true);
    public static final VariantCrossbowItem CRIMSON_CROSSBOW = registerItem("crossbows/crimson_crossbow", new VariantCrossbowItem(), false);
    public static final VariantCrossbowItem DARK_OAK_CROSSBOW = registerItem("crossbows/dark_oak_crossbow", new VariantCrossbowItem(), true);
    public static final VariantCrossbowItem JUNGLE_CROSSBOW = registerItem("crossbows/jungle_crossbow", new VariantCrossbowItem(), true);
    public static final VariantCrossbowItem OAK_CROSSBOW = registerItem("crossbows/oak_crossbow", new VariantCrossbowItem(), true);
    public static final VariantCrossbowItem MANGROVE_CROSSBOW = registerItem("crossbows/mangrove_crossbow", new VariantCrossbowItem(), true);
    public static final VariantCrossbowItem SPRUCE_CROSSBOW = registerItem("crossbows/spruce_crossbow", new VariantCrossbowItem(), true);
    public static final VariantCrossbowItem WARPED_CROSSBOW = registerItem("crossbows/warped_crossbow", new VariantCrossbowItem(), false);

    private static VariantCrossbowItem registerItem(String name, VariantCrossbowItem item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 300);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerCrossBowItems() {
    }
}
