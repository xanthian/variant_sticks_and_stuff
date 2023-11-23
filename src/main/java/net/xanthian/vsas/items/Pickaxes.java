package net.xanthian.vsas.items;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.itemtypes.VariantPickaxeItem;
import net.xanthian.vsas.materials.VariantMaterials;

import java.util.Map;

public class Pickaxes {

    public static Map<Identifier, Item> MOD_PICKAXES = Maps.newHashMap();

    // Wood
    public static final Item ACACIA_WOODEN_PICKAXE = registerItem("pickaxes/acacia_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.ACACIA_PLANK));
    public static final Item BAMBOO_WOODEN_PICKAXE = registerItem("pickaxes/bamboo_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.BAMBOO_PLANK));
    public static final Item BIRCH_WOODEN_PICKAXE = registerItem("pickaxes/birch_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.BIRCH_PLANK));
    public static final Item CHERRY_WOODEN_PICKAXE = registerItem("pickaxes/cherry_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.CHERRY_PLANK));
    public static final Item CRIMSON_WOODEN_PICKAXE = registerItem("pickaxes/crimson_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.CRIMSON_PLANK));
    public static final Item DARK_OAK_WOODEN_PICKAXE = registerItem("pickaxes/dark_oak_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.DARK_OAK_PLANK));
    public static final Item JUNGLE_WOODEN_PICKAXE = registerItem("pickaxes/jungle_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.JUNGLE_PLANK));
    //public static final Item OAK_WOODEN_PICKAXE = registerItem("pickaxes/oak_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.OAK_PLANK));
    public static final Item MANGROVE_WOODEN_PICKAXE = registerItem("pickaxes/mangrove_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.MANGROVE_PLANK));
    public static final Item SPRUCE_WOODEN_PICKAXE = registerItem("pickaxes/spruce_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.SPRUCE_PLANK));
    public static final Item WARPED_WOODEN_PICKAXE = registerItem("pickaxes/warped_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.WARPED_PLANK));
    
    // Stone
    public static final Item ACACIA_STONE_PICKAXE = registerItem("pickaxes/acacia_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    public static final Item BAMBOO_STONE_PICKAXE = registerItem("pickaxes/bamboo_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    public static final Item BIRCH_STONE_PICKAXE = registerItem("pickaxes/birch_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    public static final Item CHERRY_STONE_PICKAXE = registerItem("pickaxes/cherry_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    public static final Item CRIMSON_STONE_PICKAXE = registerItem("pickaxes/crimson_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    public static final Item DARK_OAK_STONE_PICKAXE = registerItem("pickaxes/dark_oak_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    public static final Item JUNGLE_STONE_PICKAXE = registerItem("pickaxes/jungle_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    //public static final Item OAK_STONE_PICKAXE = registerItem("pickaxes/oak_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    public static final Item MANGROVE_STONE_PICKAXE = registerItem("pickaxes/mangrove_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    public static final Item SPRUCE_STONE_PICKAXE = registerItem("pickaxes/spruce_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    public static final Item WARPED_STONE_PICKAXE = registerItem("pickaxes/warped_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE));
    // Iron
    public static final Item ACACIA_IRON_PICKAXE = registerItem("pickaxes/acacia_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    public static final Item BAMBOO_IRON_PICKAXE = registerItem("pickaxes/bamboo_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    public static final Item BIRCH_IRON_PICKAXE = registerItem("pickaxes/birch_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    public static final Item CHERRY_IRON_PICKAXE = registerItem("pickaxes/cherry_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    public static final Item CRIMSON_IRON_PICKAXE = registerItem("pickaxes/crimson_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    public static final Item DARK_OAK_IRON_PICKAXE = registerItem("pickaxes/dark_oak_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    public static final Item JUNGLE_IRON_PICKAXE = registerItem("pickaxes/jungle_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    //public static final Item OAK_IRON_PICKAXE = registerItem("pickaxes/oak_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    public static final Item MANGROVE_IRON_PICKAXE = registerItem("pickaxes/mangrove_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    public static final Item SPRUCE_IRON_PICKAXE = registerItem("pickaxes/spruce_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    public static final Item WARPED_IRON_PICKAXE = registerItem("pickaxes/warped_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON));
    // Golden
    public static final Item ACACIA_GOLDEN_PICKAXE = registerItem("pickaxes/acacia_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    public static final Item BAMBOO_GOLDEN_PICKAXE = registerItem("pickaxes/bamboo_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    public static final Item BIRCH_GOLDEN_PICKAXE = registerItem("pickaxes/birch_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    public static final Item CHERRY_GOLDEN_PICKAXE = registerItem("pickaxes/cherry_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    public static final Item CRIMSON_GOLDEN_PICKAXE = registerItem("pickaxes/crimson_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    public static final Item DARK_OAK_GOLDEN_PICKAXE = registerItem("pickaxes/dark_oak_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    public static final Item JUNGLE_GOLDEN_PICKAXE = registerItem("pickaxes/jungle_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    //public static final Item OAK_GOLDEN_PICKAXE = registerItem("pickaxes/oak_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    public static final Item MANGROVE_GOLDEN_PICKAXE = registerItem("pickaxes/mangrove_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    public static final Item SPRUCE_GOLDEN_PICKAXE = registerItem("pickaxes/spruce_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    public static final Item WARPED_GOLDEN_PICKAXE = registerItem("pickaxes/warped_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD));
    // Diamond
    public static final Item ACACIA_DIAMOND_PICKAXE = registerItem("pickaxes/acacia_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    public static final Item BAMBOO_DIAMOND_PICKAXE = registerItem("pickaxes/bamboo_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    public static final Item BIRCH_DIAMOND_PICKAXE = registerItem("pickaxes/birch_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    public static final Item CHERRY_DIAMOND_PICKAXE = registerItem("pickaxes/cherry_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    public static final Item CRIMSON_DIAMOND_PICKAXE = registerItem("pickaxes/crimson_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    public static final Item DARK_OAK_DIAMOND_PICKAXE = registerItem("pickaxes/dark_oak_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    public static final Item JUNGLE_DIAMOND_PICKAXE = registerItem("pickaxes/jungle_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    //public static final Item OAK_DIAMOND_PICKAXE = registerItem("pickaxes/oak_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    public static final Item MANGROVE_DIAMOND_PICKAXE = registerItem("pickaxes/mangrove_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    public static final Item SPRUCE_DIAMOND_PICKAXE = registerItem("pickaxes/spruce_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    public static final Item WARPED_DIAMOND_PICKAXE = registerItem("pickaxes/warped_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND));
    // Netherite
    public static final Item ACACIA_NETHERITE_PICKAXE = registerItem("pickaxes/acacia_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    public static final Item BAMBOO_NETHERITE_PICKAXE = registerItem("pickaxes/bamboo_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    public static final Item BIRCH_NETHERITE_PICKAXE = registerItem("pickaxes/birch_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    public static final Item CHERRY_NETHERITE_PICKAXE = registerItem("pickaxes/cherry_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    public static final Item CRIMSON_NETHERITE_PICKAXE = registerItem("pickaxes/crimson_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    public static final Item DARK_OAK_NETHERITE_PICKAXE = registerItem("pickaxes/dark_oak_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    public static final Item JUNGLE_NETHERITE_PICKAXE = registerItem("pickaxes/jungle_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    //public static final Item OAK_NETHERITE_PICKAXE = registerItem("pickaxes/oak_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    public static final Item MANGROVE_NETHERITE_PICKAXE = registerItem("pickaxes/mangrove_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    public static final Item SPRUCE_NETHERITE_PICKAXE = registerItem("pickaxes/spruce_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    public static final Item WARPED_NETHERITE_PICKAXE = registerItem("pickaxes/warped_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE));
    
    private static Item registerItem(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        MOD_PICKAXES.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerPickaxeItems() {}
}