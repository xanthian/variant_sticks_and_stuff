package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

import java.util.LinkedHashMap;
import java.util.Map;

public class Crossbows {
    private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

    public static final Item ACACIA_CROSSBOW = registerItem("crossbows/acacia_crossbow", new VariantCrossbowItem(), true);
    public static final Item BIRCH_CROSSBOW = registerItem("crossbows/birch_crossbow", new VariantCrossbowItem(), true);
    public static final Item CRIMSON_CROSSBOW = registerItem("crossbows/crimson_crossbow", new VariantCrossbowItem(), false);
    public static final Item DARK_OAK_CROSSBOW = registerItem("crossbows/dark_oak_crossbow", new VariantCrossbowItem(), true);
    public static final Item JUNGLE_CROSSBOW = registerItem("crossbows/jungle_crossbow", new VariantCrossbowItem(), true);
    public static final Item OAK_CROSSBOW = registerItem("crossbows/oak_crossbow", new VariantCrossbowItem(), true);
    public static final Item SPRUCE_CROSSBOW = registerItem("crossbows/spruce_crossbow", new VariantCrossbowItem(), true);
    public static final Item WARPED_CROSSBOW = registerItem("crossbows/warped_crossbow", new VariantCrossbowItem(), false);

    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 300);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerCrossBowItems() {
    }
}
