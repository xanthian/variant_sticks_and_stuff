package net.xanthian.vsas.items;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.itemtypes.VariantBrushItem;

import java.util.Map;

public class Brushes {

    public static Map<Identifier, Item> MOD_BRUSHES = Maps.newHashMap();

    public static final Item ACACIA_BRUSH = registerItem("brushes/acacia_brush", new VariantBrushItem());
    public static final Item BAMBOO_BRUSH = registerItem("brushes/bamboo_brush", new VariantBrushItem());
    public static final Item BIRCH_BRUSH = registerItem("brushes/birch_brush", new VariantBrushItem());
    public static final Item CHERRY_BRUSH = registerItem("brushes/cherry_brush", new VariantBrushItem());
    public static final Item CRIMSON_BRUSH = registerItem("brushes/crimson_brush", new VariantBrushItem());
    public static final Item DARK_OAK_BRUSH = registerItem("brushes/dark_oak_brush", new VariantBrushItem());
    public static final Item JUNGLE_BRUSH = registerItem("brushes/jungle_brush", new VariantBrushItem());
    public static final Item MANGROVE_BRUSH = registerItem("brushes/mangrove_brush", new VariantBrushItem());

    public static final Item SPRUCE_BRUSH = registerItem("brushes/spruce_brush", new VariantBrushItem());
    public static final Item WARPED_BRUSH = registerItem("brushes/warped_brush", new VariantBrushItem());
    
    private static Item registerItem(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        MOD_BRUSHES.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerBrushItems() {
    }
}
