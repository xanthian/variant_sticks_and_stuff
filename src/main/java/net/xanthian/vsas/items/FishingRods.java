package net.xanthian.vsas.items;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.itemtypes.VariantFishingRodItem;

import java.util.Map;

public class FishingRods {

    public static Map<Identifier, Item> MOD_FISHING_RODS = Maps.newHashMap();

    public static final Item ACACIA_FISHING_ROD = registerItem("fishingrods/acacia_fishing_rod", new VariantFishingRodItem());
    public static final Item BAMBOO_FISHING_ROD = registerItem("fishingrods/bamboo_fishing_rod", new VariantFishingRodItem());
    public static final Item BIRCH_FISHING_ROD = registerItem("fishingrods/birch_fishing_rod", new VariantFishingRodItem());
    public static final Item CHERRY_FISHING_ROD = registerItem("fishingrods/cherry_fishing_rod", new VariantFishingRodItem());
    public static final Item CRIMSON_FISHING_ROD = registerItem("fishingrods/crimson_fishing_rod", new VariantFishingRodItem());
    public static final Item DARK_OAK_FISHING_ROD = registerItem("fishingrods/dark_oak_fishing_rod", new VariantFishingRodItem());
    public static final Item JUNGLE_FISHING_ROD = registerItem("fishingrods/jungle_fishing_rod", new VariantFishingRodItem());
    public static final Item OAK_FISHING_ROD = registerItem("fishingrods/oak_fishing_rod", new VariantFishingRodItem());
    public static final Item MANGROVE_FISHING_ROD = registerItem("fishingrods/mangrove_fishing_rod", new VariantFishingRodItem());

    public static final Item WARPED_FISHING_ROD = registerItem("fishingrods/warped_fishing_rod", new VariantFishingRodItem());

    private static Item registerItem(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        MOD_FISHING_RODS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerFishingRodItems() {
    }
}