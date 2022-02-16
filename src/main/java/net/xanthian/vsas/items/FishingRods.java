package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;

import java.util.LinkedHashMap;
import java.util.Map;

public class FishingRods {
    private static final Map<Identifier, Item> ITEMS = new LinkedHashMap<>();

    public static final Item ACACIA_FISHING_ROD = registerItem("acacia_fishing_rod", new VariantFishingRodItem(),true);
    public static final Item BIRCH_FISHING_ROD = registerItem("birch_fishing_rod", new VariantFishingRodItem(),true);
    public static final Item CRIMSON_FISHING_ROD = registerItem("crimson_fishing_rod", new VariantFishingRodItem(),false);
    public static final Item DARK_OAK_FISHING_ROD = registerItem("dark_oak_fishing_rod", new VariantFishingRodItem(),true);
    public static final Item JUNGLE_FISHING_ROD = registerItem("jungle_fishing_rod", new VariantFishingRodItem(),true);
    public static final Item OAK_FISHING_ROD = registerItem("oak_fishing_rod", new VariantFishingRodItem(),true);
    public static final Item SPRUCE_FISHING_ROD = registerItem("spruce_fishing_rod", new VariantFishingRodItem(),true);
    public static final Item WARPED_FISHING_ROD = registerItem("warped_fishing_rod", new VariantFishingRodItem(),false);

    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 300);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerFishingRodItems() {
     }

}
