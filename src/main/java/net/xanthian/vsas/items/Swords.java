package net.xanthian.vsas.items;

import com.google.common.collect.Maps;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.itemtypes.VariantSwordItem;
import net.xanthian.vsas.materials.VariantMaterials;

import java.util.Map;

public class Swords {

    public static Map<Identifier, Item> MOD_SWORDS = Maps.newHashMap();

    // Wood
    public static final Item ACACIA_WOODEN_SWORD = registerItem("swords/acacia_wooden_sword", new VariantSwordItem(VariantMaterials.ACACIA_PLANK));
    public static final Item BAMBOO_WOODEN_SWORD = registerItem("swords/bamboo_wooden_sword", new VariantSwordItem(VariantMaterials.BAMBOO_PLANK));
    public static final Item BIRCH_WOODEN_SWORD = registerItem("swords/birch_wooden_sword", new VariantSwordItem(VariantMaterials.BIRCH_PLANK));
    public static final Item CHERRY_WOODEN_SWORD = registerItem("swords/cherry_wooden_sword", new VariantSwordItem(VariantMaterials.CHERRY_PLANK));
    public static final Item CRIMSON_WOODEN_SWORD = registerItem("swords/crimson_wooden_sword", new VariantSwordItem(VariantMaterials.CRIMSON_PLANK));
    public static final Item DARK_OAK_WOODEN_SWORD = registerItem("swords/dark_oak_wooden_sword", new VariantSwordItem(VariantMaterials.DARK_OAK_PLANK));
    public static final Item JUNGLE_WOODEN_SWORD = registerItem("swords/jungle_wooden_sword", new VariantSwordItem(VariantMaterials.JUNGLE_PLANK));
    //public static final Item OAK_WOODEN_SWORD = registerItem("swords/oak_wooden_sword", new VariantSwordItem(VariantMaterials.OAK_PLANK));
    public static final Item MANGROVE_WOODEN_SWORD = registerItem("swords/mangrove_wooden_sword", new VariantSwordItem(VariantMaterials.MANGROVE_PLANK));
    public static final Item SPRUCE_WOODEN_SWORD = registerItem("swords/spruce_wooden_sword", new VariantSwordItem(VariantMaterials.SPRUCE_PLANK));
    public static final Item WARPED_WOODEN_SWORD = registerItem("swords/warped_wooden_sword", new VariantSwordItem(VariantMaterials.WARPED_PLANK));
    // Stone
    public static final Item ACACIA_STONE_SWORD = registerItem("swords/acacia_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    public static final Item BAMBOO_STONE_SWORD = registerItem("swords/bamboo_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    public static final Item BIRCH_STONE_SWORD = registerItem("swords/birch_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    public static final Item CHERRY_STONE_SWORD = registerItem("swords/cherry_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    public static final Item CRIMSON_STONE_SWORD = registerItem("swords/crimson_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    public static final Item DARK_OAK_STONE_SWORD = registerItem("swords/dark_oak_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    public static final Item JUNGLE_STONE_SWORD = registerItem("swords/jungle_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    //public static final Item OAK_STONE_SWORD = registerItem("swords/oak_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    public static final Item MANGROVE_STONE_SWORD = registerItem("swords/mangrove_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    public static final Item SPRUCE_STONE_SWORD = registerItem("swords/spruce_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    public static final Item WARPED_STONE_SWORD = registerItem("swords/warped_stone_sword", new VariantSwordItem(ToolMaterials.STONE));
    // Iron
    public static final Item ACACIA_IRON_SWORD = registerItem("swords/acacia_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    public static final Item BAMBOO_IRON_SWORD = registerItem("swords/bamboo_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    public static final Item BIRCH_IRON_SWORD = registerItem("swords/birch_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    public static final Item CHERRY_IRON_SWORD = registerItem("swords/cherry_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    public static final Item CRIMSON_IRON_SWORD = registerItem("swords/crimson_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    public static final Item DARK_OAK_IRON_SWORD = registerItem("swords/dark_oak_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    public static final Item JUNGLE_IRON_SWORD = registerItem("swords/jungle_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    //public static final Item OAK_IRON_SWORD = registerItem("swords/oak_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    public static final Item MANGROVE_IRON_SWORD = registerItem("swords/mangrove_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    public static final Item SPRUCE_IRON_SWORD = registerItem("swords/spruce_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    public static final Item WARPED_IRON_SWORD = registerItem("swords/warped_iron_sword", new VariantSwordItem(ToolMaterials.IRON));
    // Golden
    public static final Item ACACIA_GOLDEN_SWORD = registerItem("swords/acacia_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    public static final Item BAMBOO_GOLDEN_SWORD = registerItem("swords/bamboo_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    public static final Item BIRCH_GOLDEN_SWORD = registerItem("swords/birch_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    public static final Item CHERRY_GOLDEN_SWORD = registerItem("swords/cherry_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    public static final Item CRIMSON_GOLDEN_SWORD = registerItem("swords/crimson_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    public static final Item DARK_OAK_GOLDEN_SWORD = registerItem("swords/dark_oak_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    public static final Item JUNGLE_GOLDEN_SWORD = registerItem("swords/jungle_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    //public static final Item OAK_GOLDEN_SWORD = registerItem("swords/oak_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    public static final Item MANGROVE_GOLDEN_SWORD = registerItem("swords/mangrove_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    public static final Item SPRUCE_GOLDEN_SWORD = registerItem("swords/spruce_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    public static final Item WARPED_GOLDEN_SWORD = registerItem("swords/warped_golden_sword", new VariantSwordItem(ToolMaterials.GOLD));
    // Diamond
    public static final Item ACACIA_DIAMOND_SWORD = registerItem("swords/acacia_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    public static final Item BAMBOO_DIAMOND_SWORD = registerItem("swords/bamboo_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    public static final Item BIRCH_DIAMOND_SWORD = registerItem("swords/birch_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    public static final Item CHERRY_DIAMOND_SWORD = registerItem("swords/cherry_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    public static final Item CRIMSON_DIAMOND_SWORD = registerItem("swords/crimson_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    public static final Item DARK_OAK_DIAMOND_SWORD = registerItem("swords/dark_oak_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    public static final Item JUNGLE_DIAMOND_SWORD = registerItem("swords/jungle_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    //public static final Item OAK_DIAMOND_SWORD = registerItem("swords/oak_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    public static final Item MANGROVE_DIAMOND_SWORD = registerItem("swords/mangrove_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    public static final Item SPRUCE_DIAMOND_SWORD = registerItem("swords/spruce_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    public static final Item WARPED_DIAMOND_SWORD = registerItem("swords/warped_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND));
    // Netherite
    public static final Item ACACIA_NETHERITE_SWORD = registerItem("swords/acacia_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    public static final Item BAMBOO_NETHERITE_SWORD = registerItem("swords/bamboo_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    public static final Item BIRCH_NETHERITE_SWORD = registerItem("swords/birch_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    public static final Item CHERRY_NETHERITE_SWORD = registerItem("swords/cherry_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    public static final Item CRIMSON_NETHERITE_SWORD = registerItem("swords/crimson_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    public static final Item DARK_OAK_NETHERITE_SWORD = registerItem("swords/dark_oak_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    public static final Item JUNGLE_NETHERITE_SWORD = registerItem("swords/jungle_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    //public static final Item OAK_NETHERITE_SWORD = registerItem("swords/oak_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    public static final Item MANGROVE_NETHERITE_SWORD = registerItem("swords/mangrove_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    public static final Item SPRUCE_NETHERITE_SWORD = registerItem("swords/spruce_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    public static final Item WARPED_NETHERITE_SWORD = registerItem("swords/warped_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE));
    
    private static Item registerItem(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name);
        MOD_SWORDS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerSwordItems() {}
}