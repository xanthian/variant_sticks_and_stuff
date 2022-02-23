package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;
import net.xanthian.vsas.materials.VariantMaterials;

public class Hoes {

    // Wood
    public static final Item ACACIA_WOODEN_HOE = registerItem("hoes/acacia_wooden_hoe", new VariantHoeItem(VariantMaterials.ACACIA_PLANK,0,-3F),true);
    public static final Item BIRCH_WOODEN_HOE = registerItem("hoes/birch_wooden_hoe", new VariantHoeItem(VariantMaterials.BIRCH_PLANK,0,-3F),true);
    public static final Item CRIMSON_WOODEN_HOE = registerItem("hoes/crimson_wooden_hoe", new VariantHoeItem(VariantMaterials.CRIMSON_PLANK,0,-3F),false);
    public static final Item DARK_OAK_WOODEN_HOE = registerItem("hoes/dark_oak_wooden_hoe", new VariantHoeItem(VariantMaterials.DARK_OAK_PLANK,0,-3F),true);
    public static final Item JUNGLE_WOODEN_HOE = registerItem("hoes/jungle_wooden_hoe", new VariantHoeItem(VariantMaterials.JUNGLE_PLANK,0,-3F),true);
    public static final Item OAK_WOODEN_HOE = registerItem("hoes/oak_wooden_hoe", new VariantHoeItem(VariantMaterials.OAK_PLANK,0,-3F),true);
    public static final Item SPRUCE_WOODEN_HOE = registerItem("hoes/spruce_wooden_hoe", new VariantHoeItem(VariantMaterials.SPRUCE_PLANK,0,-3F),true);
    public static final Item WARPED_WOODEN_HOE = registerItem("hoes/warped_wooden_hoe", new VariantHoeItem(VariantMaterials.WARPED_PLANK,0,-3F),false);
    
    // Stone
    public static final Item ACACIA_STONE_HOE = registerItem("hoes/acacia_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F),false);
    public static final Item BIRCH_STONE_HOE = registerItem("hoes/birch_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F),false);
    public static final Item CRIMSON_STONE_HOE = registerItem("hoes/crimson_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F),false);
    public static final Item DARK_OAK_STONE_HOE = registerItem("hoes/dark_oak_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F),false);
    public static final Item JUNGLE_STONE_HOE = registerItem("hoes/jungle_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F),false);
    public static final Item OAK_STONE_HOE = registerItem("hoes/oak_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F),false);
    public static final Item SPRUCE_STONE_HOE = registerItem("hoes/spruce_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F),false);
    public static final Item WARPED_STONE_HOE = registerItem("hoes/warped_stone_hoe", new VariantHoeItem(ToolMaterials.STONE,-1,-2F),false);

    // Iron
    public static final Item ACACIA_IRON_HOE = registerItem("hoes/acacia_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F),false);
    public static final Item BIRCH_IRON_HOE = registerItem("hoes/birch_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F),false);
    public static final Item CRIMSON_IRON_HOE = registerItem("hoes/crimson_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F),false);
    public static final Item DARK_OAK_IRON_HOE = registerItem("hoes/dark_oak_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F),false);
    public static final Item JUNGLE_IRON_HOE = registerItem("hoes/jungle_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F),false);
    public static final Item OAK_IRON_HOE = registerItem("hoes/oak_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F),false);
    public static final Item SPRUCE_IRON_HOE = registerItem("hoes/spruce_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F),false);
    public static final Item WARPED_IRON_HOE = registerItem("hoes/warped_iron_hoe", new VariantHoeItem(ToolMaterials.IRON,-2,-1F),false);
    // Golden
    public static final Item ACACIA_GOLDEN_HOE = registerItem("hoes/acacia_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F),false);
    public static final Item BIRCH_GOLDEN_HOE = registerItem("hoes/birch_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F),false);
    public static final Item CRIMSON_GOLDEN_HOE = registerItem("hoes/crimson_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F),false);
    public static final Item DARK_OAK_GOLDEN_HOE = registerItem("hoes/dark_oak_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F),false);
    public static final Item JUNGLE_GOLDEN_HOE = registerItem("hoes/jungle_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F),false);
    public static final Item OAK_GOLDEN_HOE = registerItem("hoes/oak_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F),false);
    public static final Item SPRUCE_GOLDEN_HOE = registerItem("hoes/spruce_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F),false);
    public static final Item WARPED_GOLDEN_HOE = registerItem("hoes/warped_golden_hoe", new VariantHoeItem(ToolMaterials.GOLD,0,-3F),false);
    // Diamond
    public static final Item ACACIA_DIAMOND_HOE = registerItem("hoes/acacia_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F),false);
    public static final Item BIRCH_DIAMOND_HOE = registerItem("hoes/birch_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F),false);
    public static final Item CRIMSON_DIAMOND_HOE = registerItem("hoes/crimson_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F),false);
    public static final Item DARK_OAK_DIAMOND_HOE = registerItem("hoes/dark_oak_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F),false);
    public static final Item JUNGLE_DIAMOND_HOE = registerItem("hoes/jungle_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F),false);
    public static final Item OAK_DIAMOND_HOE = registerItem("hoes/oak_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F),false);
    public static final Item SPRUCE_DIAMOND_HOE = registerItem("hoes/spruce_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F),false);
    public static final Item WARPED_DIAMOND_HOE = registerItem("hoes/warped_diamond_hoe", new VariantHoeItem(ToolMaterials.DIAMOND,-3,0F),false);
    // Netherite
    public static final Item ACACIA_NETHERITE_HOE = registerItem("hoes/acacia_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F),false);
    public static final Item BIRCH_NETHERITE_HOE = registerItem("hoes/birch_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F),false);
    public static final Item CRIMSON_NETHERITE_HOE = registerItem("hoes/crimson_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F),false);
    public static final Item DARK_OAK_NETHERITE_HOE = registerItem("hoes/dark_oak_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F),false);
    public static final Item JUNGLE_NETHERITE_HOE = registerItem("hoes/jungle_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F),false);
    public static final Item OAK_NETHERITE_HOE = registerItem("hoes/oak_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F),false);
    public static final Item SPRUCE_NETHERITE_HOE = registerItem("hoes/spruce_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F),false);
    public static final Item WARPED_NETHERITE_HOE = registerItem("hoes/warped_netherite_hoe", new VariantHoeItem(ToolMaterials.NETHERITE,-4,0F),false);
    
    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 200);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerHoeItems() {}
}