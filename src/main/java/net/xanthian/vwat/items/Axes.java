package net.xanthian.vwat.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vwat.Init;
import net.xanthian.vwat.materials.VariantMaterials;

public class Axes {

    // Wood
    public static final Item ACACIA_WOODEN_AXE = registerItem("axes/acacia_wooden_axe", new VariantAxeItem(VariantMaterials.ACACIA_PLANK,6F,-3.2F),true);
    public static final Item BIRCH_WOODEN_AXE = registerItem("axes/birch_wooden_axe", new VariantAxeItem(VariantMaterials.BIRCH_PLANK,6F,-3.2F),true);
    public static final Item CRIMSON_WOODEN_AXE = registerItem("axes/crimson_wooden_axe", new VariantAxeItem(VariantMaterials.CRIMSON_PLANK,6F,-3.2F),false);
    public static final Item DARK_OAK_WOODEN_AXE = registerItem("axes/dark_oak_wooden_axe", new VariantAxeItem(VariantMaterials.DARK_OAK_PLANK,6F,-3.2F),true);
    public static final Item JUNGLE_WOODEN_AXE = registerItem("axes/jungle_wooden_axe", new VariantAxeItem(VariantMaterials.JUNGLE_PLANK,6F,-3.2F),true);
    public static final Item OAK_WOODEN_AXE = registerItem("axes/oak_wooden_axe", new VariantAxeItem(VariantMaterials.OAK_PLANK,6F,-3.2F),true);
    public static final Item MANGROVE_WOODEN_AXE = registerItem("axes/mangrove_wooden_axe", new VariantAxeItem(VariantMaterials.MANGROVE_PLANK,6F,-3.2F),true);
    public static final Item SPRUCE_WOODEN_AXE = registerItem("axes/spruce_wooden_axe", new VariantAxeItem(VariantMaterials.SPRUCE_PLANK,6F,-3.2F),true);
    public static final Item WARPED_WOODEN_AXE = registerItem("axes/warped_wooden_axe", new VariantAxeItem(VariantMaterials.WARPED_PLANK,6F,-3.2F),false);
    
    // Stone
    public static final Item ACACIA_STONE_AXE = registerItem("axes/acacia_stone_axe", new VariantAxeItem(ToolMaterials.STONE,7F,-3.2F),false);
    public static final Item BIRCH_STONE_AXE = registerItem("axes/birch_stone_axe", new VariantAxeItem(ToolMaterials.STONE,7F,-3.2F),false);
    public static final Item CRIMSON_STONE_AXE = registerItem("axes/crimson_stone_axe", new VariantAxeItem(ToolMaterials.STONE,7F,-3.2F),false);
    public static final Item DARK_OAK_STONE_AXE = registerItem("axes/dark_oak_stone_axe", new VariantAxeItem(ToolMaterials.STONE,7F,-3.2F),false);
    public static final Item JUNGLE_STONE_AXE = registerItem("axes/jungle_stone_axe", new VariantAxeItem(ToolMaterials.STONE,7F,-3.2F),false);
    public static final Item OAK_STONE_AXE = registerItem("axes/oak_stone_axe", new VariantAxeItem(ToolMaterials.STONE,7F,-3.2F),false);
    public static final Item MANGROVE_STONE_AXE = registerItem("axes/mangrove_stone_axe", new VariantAxeItem(ToolMaterials.STONE,7F,-3.2F),false);
    public static final Item SPRUCE_STONE_AXE = registerItem("axes/spruce_stone_axe", new VariantAxeItem(ToolMaterials.STONE,7F,-3.2F),false);
    public static final Item WARPED_STONE_AXE = registerItem("axes/warped_stone_axe", new VariantAxeItem(ToolMaterials.STONE,7F,-3.2F),false);

    // Iron
    public static final Item ACACIA_IRON_AXE = registerItem("axes/acacia_iron_axe", new VariantAxeItem(ToolMaterials.IRON,6F,-3.1F),false);
    public static final Item BIRCH_IRON_AXE = registerItem("axes/birch_iron_axe", new VariantAxeItem(ToolMaterials.IRON,6F,-3.1F),false);
    public static final Item CRIMSON_IRON_AXE = registerItem("axes/crimson_iron_axe", new VariantAxeItem(ToolMaterials.IRON,6F,-3.1F),false);
    public static final Item DARK_OAK_IRON_AXE = registerItem("axes/dark_oak_iron_axe", new VariantAxeItem(ToolMaterials.IRON,6F,-3.1F),false);
    public static final Item JUNGLE_IRON_AXE = registerItem("axes/jungle_iron_axe", new VariantAxeItem(ToolMaterials.IRON,6F,-3.1F),false);
    public static final Item OAK_IRON_AXE = registerItem("axes/oak_iron_axe", new VariantAxeItem(ToolMaterials.IRON,6F,-3.1F),false);
    public static final Item MANGROVE_IRON_AXE = registerItem("axes/mangrove_iron_axe", new VariantAxeItem(ToolMaterials.IRON,6F,-3.1F),false);
    public static final Item SPRUCE_IRON_AXE = registerItem("axes/spruce_iron_axe", new VariantAxeItem(ToolMaterials.IRON,6F,-3.1F),false);
    public static final Item WARPED_IRON_AXE = registerItem("axes/warped_iron_axe", new VariantAxeItem(ToolMaterials.IRON,6F,-3.1F),false);
    // Golden
    public static final Item ACACIA_GOLDEN_AXE = registerItem("axes/acacia_golden_axe", new VariantAxeItem(ToolMaterials.GOLD,6F,-3F),false);
    public static final Item BIRCH_GOLDEN_AXE = registerItem("axes/birch_golden_axe", new VariantAxeItem(ToolMaterials.GOLD,6F,-3F),false);
    public static final Item CRIMSON_GOLDEN_AXE = registerItem("axes/crimson_golden_axe", new VariantAxeItem(ToolMaterials.GOLD,6F,-3F),false);
    public static final Item DARK_OAK_GOLDEN_AXE = registerItem("axes/dark_oak_golden_axe", new VariantAxeItem(ToolMaterials.GOLD,6F,-3F),false);
    public static final Item JUNGLE_GOLDEN_AXE = registerItem("axes/jungle_golden_axe", new VariantAxeItem(ToolMaterials.GOLD,6F,-3F),false);
    public static final Item OAK_GOLDEN_AXE = registerItem("axes/oak_golden_axe", new VariantAxeItem(ToolMaterials.GOLD,6F,-3F),false);
    public static final Item MANGROVE_GOLDEN_AXE = registerItem("axes/mangrove_golden_axe", new VariantAxeItem(ToolMaterials.GOLD,6F,-3F),false);
    public static final Item SPRUCE_GOLDEN_AXE = registerItem("axes/spruce_golden_axe", new VariantAxeItem(ToolMaterials.GOLD,6F,-3F),false);
    public static final Item WARPED_GOLDEN_AXE = registerItem("axes/warped_golden_axe", new VariantAxeItem(ToolMaterials.GOLD,6F,-3F),false);
    // Diamond
    public static final Item ACACIA_DIAMOND_AXE = registerItem("axes/acacia_diamond_axe", new VariantAxeItem(ToolMaterials.DIAMOND,5F,-3F),false);
    public static final Item BIRCH_DIAMOND_AXE = registerItem("axes/birch_diamond_axe", new VariantAxeItem(ToolMaterials.DIAMOND,5F,-3F),false);
    public static final Item CRIMSON_DIAMOND_AXE = registerItem("axes/crimson_diamond_axe", new VariantAxeItem(ToolMaterials.DIAMOND,5F,-3F),false);
    public static final Item DARK_OAK_DIAMOND_AXE = registerItem("axes/dark_oak_diamond_axe", new VariantAxeItem(ToolMaterials.DIAMOND,5F,-3F),false);
    public static final Item JUNGLE_DIAMOND_AXE = registerItem("axes/jungle_diamond_axe", new VariantAxeItem(ToolMaterials.DIAMOND,5F,-3F),false);
    public static final Item OAK_DIAMOND_AXE = registerItem("axes/oak_diamond_axe", new VariantAxeItem(ToolMaterials.DIAMOND,5F,-3F),false);
    public static final Item MANGROVE_DIAMOND_AXE = registerItem("axes/mangrove_diamond_axe", new VariantAxeItem(ToolMaterials.DIAMOND,5F,-3F),false);
    public static final Item SPRUCE_DIAMOND_AXE = registerItem("axes/spruce_diamond_axe", new VariantAxeItem(ToolMaterials.DIAMOND,5F,-3F),false);
    public static final Item WARPED_DIAMOND_AXE = registerItem("axes/warped_diamond_axe", new VariantAxeItem(ToolMaterials.DIAMOND,5F,-3F),false);
    // Netherite
    public static final Item ACACIA_NETHERITE_AXE = registerItem("axes/acacia_netherite_axe", new VariantAxeItem(ToolMaterials.NETHERITE,5F,-3F),false);
    public static final Item BIRCH_NETHERITE_AXE = registerItem("axes/birch_netherite_axe", new VariantAxeItem(ToolMaterials.NETHERITE,5F,-3F),false);
    public static final Item CRIMSON_NETHERITE_AXE = registerItem("axes/crimson_netherite_axe", new VariantAxeItem(ToolMaterials.NETHERITE,5F,-3F),false);
    public static final Item DARK_OAK_NETHERITE_AXE = registerItem("axes/dark_oak_netherite_axe", new VariantAxeItem(ToolMaterials.NETHERITE,5F,-3F),false);
    public static final Item JUNGLE_NETHERITE_AXE = registerItem("axes/jungle_netherite_axe", new VariantAxeItem(ToolMaterials.NETHERITE,5F,-3F),false);
    public static final Item OAK_NETHERITE_AXE = registerItem("axes/oak_netherite_axe", new VariantAxeItem(ToolMaterials.NETHERITE,5F,-3F),false);
    public static final Item MANGROVE_NETHERITE_AXE = registerItem("axes/mangrove_netherite_axe", new VariantAxeItem(ToolMaterials.NETHERITE,5F,-3F),false);
    public static final Item SPRUCE_NETHERITE_AXE = registerItem("axes/spruce_netherite_axe", new VariantAxeItem(ToolMaterials.NETHERITE,5F,-3F),false);
    public static final Item WARPED_NETHERITE_AXE = registerItem("axes/warped_netherite_axe", new VariantAxeItem(ToolMaterials.NETHERITE,5F,-3F),false);
    
    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 200);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerAxeItems() {}
}