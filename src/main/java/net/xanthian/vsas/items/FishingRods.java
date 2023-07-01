package net.xanthian.vsas.items;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;

public class FishingRods {

    public static final Item ACACIA_FISHING_ROD = registerItem("fishingrods/acacia_fishing_rod", new VariantFishingRodItem());
    public static final Item BIRCH_FISHING_ROD = registerItem("fishingrods/birch_fishing_rod", new VariantFishingRodItem());
    public static final Item CRIMSON_FISHING_ROD = registerItem("fishingrods/crimson_fishing_rod", new VariantFishingRodItem());
    public static final Item DARK_OAK_FISHING_ROD = registerItem("fishingrods/dark_oak_fishing_rod", new VariantFishingRodItem());
    public static final Item JUNGLE_FISHING_ROD = registerItem("fishingrods/jungle_fishing_rod", new VariantFishingRodItem());
    public static final Item OAK_FISHING_ROD = registerItem("fishingrods/oak_fishing_rod", new VariantFishingRodItem());
    public static final Item MANGROVE_FISHING_ROD = registerItem("fishingrods/mangrove_fishing_rod", new VariantFishingRodItem());
    public static final Item SPRUCE_FISHING_ROD = registerItem("fishingrods/spruce_fishing_rod", new VariantFishingRodItem());
    public static final Item WARPED_FISHING_ROD = registerItem("fishingrods/warped_fishing_rod", new VariantFishingRodItem());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerFishingRodItems() {
    }
}