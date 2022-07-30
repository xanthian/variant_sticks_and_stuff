package net.xanthian.vwat.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vwat.Init;
import net.xanthian.vwat.materials.VariantMaterials;

public class Pickaxes {

    // Wood
    public static final Item ACACIA_WOODEN_PICKAXE = registerItem("pickaxes/acacia_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.ACACIA_PLANK),true);
    public static final Item BIRCH_WOODEN_PICKAXE = registerItem("pickaxes/birch_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.BIRCH_PLANK),true);
    public static final Item CRIMSON_WOODEN_PICKAXE = registerItem("pickaxes/crimson_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.CRIMSON_PLANK),false);
    public static final Item DARK_OAK_WOODEN_PICKAXE = registerItem("pickaxes/dark_oak_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.DARK_OAK_PLANK),true);
    public static final Item JUNGLE_WOODEN_PICKAXE = registerItem("pickaxes/jungle_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.JUNGLE_PLANK),true);
    public static final Item OAK_WOODEN_PICKAXE = registerItem("pickaxes/oak_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.OAK_PLANK),true);
    public static final Item MANGROVE_WOODEN_PICKAXE = registerItem("pickaxes/mangrove_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.MANGROVE_PLANK),true);
    public static final Item SPRUCE_WOODEN_PICKAXE = registerItem("pickaxes/spruce_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.SPRUCE_PLANK),true);
    public static final Item WARPED_WOODEN_PICKAXE = registerItem("pickaxes/warped_wooden_pickaxe", new VariantPickaxeItem(VariantMaterials.WARPED_PLANK),false);
    
    // Stone
    public static final Item ACACIA_STONE_PICKAXE = registerItem("pickaxes/acacia_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE),false);
    public static final Item BIRCH_STONE_PICKAXE = registerItem("pickaxes/birch_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE),false);
    public static final Item CRIMSON_STONE_PICKAXE = registerItem("pickaxes/crimson_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE),false);
    public static final Item DARK_OAK_STONE_PICKAXE = registerItem("pickaxes/dark_oak_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE),false);
    public static final Item JUNGLE_STONE_PICKAXE = registerItem("pickaxes/jungle_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE),false);
    public static final Item OAK_STONE_PICKAXE = registerItem("pickaxes/oak_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE),false);
    public static final Item MANGROVE_STONE_PICKAXE = registerItem("pickaxes/mangrove_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE),false);
    public static final Item SPRUCE_STONE_PICKAXE = registerItem("pickaxes/spruce_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE),false);
    public static final Item WARPED_STONE_PICKAXE = registerItem("pickaxes/warped_stone_pickaxe", new VariantPickaxeItem(ToolMaterials.STONE),false);

    // Iron
    public static final Item ACACIA_IRON_PICKAXE = registerItem("pickaxes/acacia_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON),false);
    public static final Item BIRCH_IRON_PICKAXE = registerItem("pickaxes/birch_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON),false);
    public static final Item CRIMSON_IRON_PICKAXE = registerItem("pickaxes/crimson_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON),false);
    public static final Item DARK_OAK_IRON_PICKAXE = registerItem("pickaxes/dark_oak_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON),false);
    public static final Item JUNGLE_IRON_PICKAXE = registerItem("pickaxes/jungle_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON),false);
    public static final Item OAK_IRON_PICKAXE = registerItem("pickaxes/oak_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON),false);
    public static final Item MANGROVE_IRON_PICKAXE = registerItem("pickaxes/mangrove_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON),false);
    public static final Item SPRUCE_IRON_PICKAXE = registerItem("pickaxes/spruce_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON),false);
    public static final Item WARPED_IRON_PICKAXE = registerItem("pickaxes/warped_iron_pickaxe", new VariantPickaxeItem(ToolMaterials.IRON),false);
    // Golden
    public static final Item ACACIA_GOLDEN_PICKAXE = registerItem("pickaxes/acacia_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD),false);
    public static final Item BIRCH_GOLDEN_PICKAXE = registerItem("pickaxes/birch_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD),false);
    public static final Item CRIMSON_GOLDEN_PICKAXE = registerItem("pickaxes/crimson_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD),false);
    public static final Item DARK_OAK_GOLDEN_PICKAXE = registerItem("pickaxes/dark_oak_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD),false);
    public static final Item JUNGLE_GOLDEN_PICKAXE = registerItem("pickaxes/jungle_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD),false);
    public static final Item OAK_GOLDEN_PICKAXE = registerItem("pickaxes/oak_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD),false);
    public static final Item MANGROVE_GOLDEN_PICKAXE = registerItem("pickaxes/mangrove_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD),false);
    public static final Item SPRUCE_GOLDEN_PICKAXE = registerItem("pickaxes/spruce_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD),false);
    public static final Item WARPED_GOLDEN_PICKAXE = registerItem("pickaxes/warped_golden_pickaxe", new VariantPickaxeItem(ToolMaterials.GOLD),false);
    // Diamond
    public static final Item ACACIA_DIAMOND_PICKAXE = registerItem("pickaxes/acacia_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND),false);
    public static final Item BIRCH_DIAMOND_PICKAXE = registerItem("pickaxes/birch_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND),false);
    public static final Item CRIMSON_DIAMOND_PICKAXE = registerItem("pickaxes/crimson_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND),false);
    public static final Item DARK_OAK_DIAMOND_PICKAXE = registerItem("pickaxes/dark_oak_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND),false);
    public static final Item JUNGLE_DIAMOND_PICKAXE = registerItem("pickaxes/jungle_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND),false);
    public static final Item OAK_DIAMOND_PICKAXE = registerItem("pickaxes/oak_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND),false);
    public static final Item MANGROVE_DIAMOND_PICKAXE = registerItem("pickaxes/mangrove_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND),false);
    public static final Item SPRUCE_DIAMOND_PICKAXE = registerItem("pickaxes/spruce_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND),false);
    public static final Item WARPED_DIAMOND_PICKAXE = registerItem("pickaxes/warped_diamond_pickaxe", new VariantPickaxeItem(ToolMaterials.DIAMOND),false);
    // Netherite
    public static final Item ACACIA_NETHERITE_PICKAXE = registerItem("pickaxes/acacia_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE),false);
    public static final Item BIRCH_NETHERITE_PICKAXE = registerItem("pickaxes/birch_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE),false);
    public static final Item CRIMSON_NETHERITE_PICKAXE = registerItem("pickaxes/crimson_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE),false);
    public static final Item DARK_OAK_NETHERITE_PICKAXE = registerItem("pickaxes/dark_oak_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE),false);
    public static final Item JUNGLE_NETHERITE_PICKAXE = registerItem("pickaxes/jungle_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE),false);
    public static final Item OAK_NETHERITE_PICKAXE = registerItem("pickaxes/oak_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE),false);
    public static final Item MANGROVE_NETHERITE_PICKAXE = registerItem("pickaxes/mangrove_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE),false);
    public static final Item SPRUCE_NETHERITE_PICKAXE = registerItem("pickaxes/spruce_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE),false);
    public static final Item WARPED_NETHERITE_PICKAXE = registerItem("pickaxes/warped_netherite_pickaxe", new VariantPickaxeItem(ToolMaterials.NETHERITE),false);
    
    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 200);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerPickaxeItems() {}
}