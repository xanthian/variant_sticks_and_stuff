package net.xanthian.vsas.items;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.itemtypes.VariantHoeItem;
import net.xanthian.vsas.materials.VariantMaterials;

import java.util.Map;

public class Hoes {

    public static Map<Identifier, Item> MOD_HOES = Maps.newHashMap();

    // Wood
    public static final Item ACACIA_WOODEN_HOE = registerItem("hoes/acacia_wooden_hoe", new VariantHoeItem(VariantMaterials.ACACIA_PLANK,0,-3F));
    public static final Item BAMBOO_WOODEN_HOE = registerItem("hoes/bamboo_wooden_hoe", new VariantHoeItem(VariantMaterials.BAMBOO_PLANK,0,-3F));
    public static final Item BIRCH_WOODEN_HOE = registerItem("hoes/birch_wooden_hoe", new VariantHoeItem(VariantMaterials.BIRCH_PLANK,0,-3F));
    public static final Item CHERRY_WOODEN_HOE = registerItem("hoes/cherry_wooden_hoe", new VariantHoeItem(VariantMaterials.CHERRY_PLANK,0,-3F));
    public static final Item CRIMSON_WOODEN_HOE = registerItem("hoes/crimson_wooden_hoe", new VariantHoeItem(VariantMaterials.CRIMSON_PLANK,0,-3F));
    public static final Item DARK_OAK_WOODEN_HOE = registerItem("hoes/dark_oak_wooden_hoe", new VariantHoeItem(VariantMaterials.DARK_OAK_PLANK,0,-3F));
    public static final Item JUNGLE_WOODEN_HOE = registerItem("hoes/jungle_wooden_hoe", new VariantHoeItem(VariantMaterials.JUNGLE_PLANK,0,-3F));
    //public static final Item OAK_WOODEN_HOE = registerItem("hoes/oak_wooden_hoe", new VariantHoeItem(VariantMaterials.OAK_PLANK,0,-3F));
    public static final Item MANGROVE_WOODEN_HOE = registerItem("hoes/mangrove_wooden_hoe", new VariantHoeItem(VariantMaterials.MANGROVE_PLANK,0,-3F));
    public static final Item SPRUCE_WOODEN_HOE = registerItem("hoes/spruce_wooden_hoe", new VariantHoeItem(VariantMaterials.SPRUCE_PLANK,0,-3F));
    public static final Item WARPED_WOODEN_HOE = registerItem("hoes/warped_wooden_hoe", new VariantHoeItem(VariantMaterials.WARPED_PLANK,0,-3F));
    
    // Stone
    public static final Item ACACIA_STONE_HOE = registerItem("hoes/acacia_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    public static final Item BAMBOO_STONE_HOE = registerItem("hoes/bamboo_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    public static final Item BIRCH_STONE_HOE = registerItem("hoes/birch_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    public static final Item CHERRY_STONE_HOE = registerItem("hoes/cherry_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    public static final Item CRIMSON_STONE_HOE = registerItem("hoes/crimson_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    public static final Item DARK_OAK_STONE_HOE = registerItem("hoes/dark_oak_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    public static final Item JUNGLE_STONE_HOE = registerItem("hoes/jungle_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    //public static final Item OAK_STONE_HOE = registerItem("hoes/oak_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    public static final Item MANGROVE_STONE_HOE = registerItem("hoes/mangrove_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    public static final Item SPRUCE_STONE_HOE = registerItem("hoes/spruce_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    public static final Item WARPED_STONE_HOE = registerItem("hoes/warped_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F));
    // Iron
    public static final Item ACACIA_IRON_HOE = registerItem("hoes/acacia_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    public static final Item BAMBOO_IRON_HOE = registerItem("hoes/bamboo_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    public static final Item BIRCH_IRON_HOE = registerItem("hoes/birch_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    public static final Item CHERRY_IRON_HOE = registerItem("hoes/cherry_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    public static final Item CRIMSON_IRON_HOE = registerItem("hoes/crimson_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    public static final Item DARK_OAK_IRON_HOE = registerItem("hoes/dark_oak_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    public static final Item JUNGLE_IRON_HOE = registerItem("hoes/jungle_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    //public static final Item OAK_IRON_HOE = registerItem("hoes/oak_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    public static final Item MANGROVE_IRON_HOE = registerItem("hoes/mangrove_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    public static final Item SPRUCE_IRON_HOE = registerItem("hoes/spruce_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    public static final Item WARPED_IRON_HOE = registerItem("hoes/warped_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F));
    // Golden
    public static final Item ACACIA_GOLDEN_HOE = registerItem("hoes/acacia_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    public static final Item BAMBOO_GOLDEN_HOE = registerItem("hoes/bamboo_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    public static final Item BIRCH_GOLDEN_HOE = registerItem("hoes/birch_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    public static final Item CHERRY_GOLDEN_HOE = registerItem("hoes/cherry_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    public static final Item CRIMSON_GOLDEN_HOE = registerItem("hoes/crimson_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    public static final Item DARK_OAK_GOLDEN_HOE = registerItem("hoes/dark_oak_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    public static final Item JUNGLE_GOLDEN_HOE = registerItem("hoes/jungle_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    //public static final Item OAK_GOLDEN_HOE = registerItem("hoes/oak_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    public static final Item MANGROVE_GOLDEN_HOE = registerItem("hoes/mangrove_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    public static final Item SPRUCE_GOLDEN_HOE = registerItem("hoes/spruce_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    public static final Item WARPED_GOLDEN_HOE = registerItem("hoes/warped_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F));
    // Diamond
    public static final Item ACACIA_DIAMOND_HOE = registerItem("hoes/acacia_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    public static final Item BAMBOO_DIAMOND_HOE = registerItem("hoes/bamboo_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    public static final Item BIRCH_DIAMOND_HOE = registerItem("hoes/birch_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    public static final Item CHERRY_DIAMOND_HOE = registerItem("hoes/cherry_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    public static final Item CRIMSON_DIAMOND_HOE = registerItem("hoes/crimson_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    public static final Item DARK_OAK_DIAMOND_HOE = registerItem("hoes/dark_oak_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    public static final Item JUNGLE_DIAMOND_HOE = registerItem("hoes/jungle_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    //public static final Item OAK_DIAMOND_HOE = registerItem("hoes/oak_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    public static final Item MANGROVE_DIAMOND_HOE = registerItem("hoes/mangrove_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    public static final Item SPRUCE_DIAMOND_HOE = registerItem("hoes/spruce_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    public static final Item WARPED_DIAMOND_HOE = registerItem("hoes/warped_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F));
    // Netherite
    public static final Item ACACIA_NETHERITE_HOE = registerItem("hoes/acacia_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    public static final Item BAMBOO_NETHERITE_HOE = registerItem("hoes/bamboo_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    public static final Item BIRCH_NETHERITE_HOE = registerItem("hoes/birch_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    public static final Item CHERRY_NETHERITE_HOE = registerItem("hoes/cherry_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    public static final Item CRIMSON_NETHERITE_HOE = registerItem("hoes/crimson_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    public static final Item DARK_OAK_NETHERITE_HOE = registerItem("hoes/dark_oak_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    public static final Item JUNGLE_NETHERITE_HOE = registerItem("hoes/jungle_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    //public static final Item OAK_NETHERITE_HOE = registerItem("hoes/oak_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    public static final Item MANGROVE_NETHERITE_HOE = registerItem("hoes/mangrove_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    public static final Item SPRUCE_NETHERITE_HOE = registerItem("hoes/spruce_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    public static final Item WARPED_NETHERITE_HOE = registerItem("hoes/warped_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F));
    
    private static Item registerItem(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_HOES.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerHoeItems() {}
}