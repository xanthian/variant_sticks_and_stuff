package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;
import net.xanthian.vsas.materials.VariantMaterials;

public class Swords {

    // Wood
    public static final Item ACACIA_WOODEN_SWORD = registerItem("swords/acacia_wooden_sword", new VariantSwordItem(VariantMaterials.ACACIA_PLANK),true);
    public static final Item BIRCH_WOODEN_SWORD = registerItem("swords/birch_wooden_sword", new VariantSwordItem(VariantMaterials.BIRCH_PLANK),true);
    public static final Item CRIMSON_WOODEN_SWORD = registerItem("swords/crimson_wooden_sword", new VariantSwordItem(VariantMaterials.CRIMSON_PLANK),false);
    public static final Item DARK_OAK_WOODEN_SWORD = registerItem("swords/dark_oak_wooden_sword", new VariantSwordItem(VariantMaterials.DARK_OAK_PLANK),true);
    public static final Item JUNGLE_WOODEN_SWORD = registerItem("swords/jungle_wooden_sword", new VariantSwordItem(VariantMaterials.JUNGLE_PLANK),true);
    public static final Item OAK_WOODEN_SWORD = registerItem("swords/oak_wooden_sword", new VariantSwordItem(VariantMaterials.OAK_PLANK),true);
    public static final Item MANGROVE_WOODEN_SWORD = registerItem("swords/mangrove_wooden_sword", new VariantSwordItem(VariantMaterials.MANGROVE_PLANK),true);
    public static final Item SPRUCE_WOODEN_SWORD = registerItem("swords/spruce_wooden_sword", new VariantSwordItem(VariantMaterials.SPRUCE_PLANK),true);
    public static final Item WARPED_WOODEN_SWORD = registerItem("swords/warped_wooden_sword", new VariantSwordItem(VariantMaterials.WARPED_PLANK),false);
    
    // Stone
    public static final Item ACACIA_STONE_SWORD = registerItem("swords/acacia_stone_sword", new VariantSwordItem(ToolMaterials.STONE),false);
    public static final Item BIRCH_STONE_SWORD = registerItem("swords/birch_stone_sword", new VariantSwordItem(ToolMaterials.STONE),false);
    public static final Item CRIMSON_STONE_SWORD = registerItem("swords/crimson_stone_sword", new VariantSwordItem(ToolMaterials.STONE),false);
    public static final Item DARK_OAK_STONE_SWORD = registerItem("swords/dark_oak_stone_sword", new VariantSwordItem(ToolMaterials.STONE),false);
    public static final Item JUNGLE_STONE_SWORD = registerItem("swords/jungle_stone_sword", new VariantSwordItem(ToolMaterials.STONE),false);
    public static final Item OAK_STONE_SWORD = registerItem("swords/oak_stone_sword", new VariantSwordItem(ToolMaterials.STONE),false);
    public static final Item MANGROVE_STONE_SWORD = registerItem("swords/mangrove_stone_sword", new VariantSwordItem(ToolMaterials.STONE),false);
    public static final Item SPRUCE_STONE_SWORD = registerItem("swords/spruce_stone_sword", new VariantSwordItem(ToolMaterials.STONE),false);
    public static final Item WARPED_STONE_SWORD = registerItem("swords/warped_stone_sword", new VariantSwordItem(ToolMaterials.STONE),false);

    // Iron
    public static final Item ACACIA_IRON_SWORD = registerItem("swords/acacia_iron_sword", new VariantSwordItem(ToolMaterials.IRON),false);
    public static final Item BIRCH_IRON_SWORD = registerItem("swords/birch_iron_sword", new VariantSwordItem(ToolMaterials.IRON),false);
    public static final Item CRIMSON_IRON_SWORD = registerItem("swords/crimson_iron_sword", new VariantSwordItem(ToolMaterials.IRON),false);
    public static final Item DARK_OAK_IRON_SWORD = registerItem("swords/dark_oak_iron_sword", new VariantSwordItem(ToolMaterials.IRON),false);
    public static final Item JUNGLE_IRON_SWORD = registerItem("swords/jungle_iron_sword", new VariantSwordItem(ToolMaterials.IRON),false);
    public static final Item OAK_IRON_SWORD = registerItem("swords/oak_iron_sword", new VariantSwordItem(ToolMaterials.IRON),false);
    public static final Item MANGROVE_IRON_SWORD = registerItem("swords/mangrove_iron_sword", new VariantSwordItem(ToolMaterials.IRON),false);
    public static final Item SPRUCE_IRON_SWORD = registerItem("swords/spruce_iron_sword", new VariantSwordItem(ToolMaterials.IRON),false);
    public static final Item WARPED_IRON_SWORD = registerItem("swords/warped_iron_sword", new VariantSwordItem(ToolMaterials.IRON),false);
    // Golden
    public static final Item ACACIA_GOLDEN_SWORD = registerItem("swords/acacia_golden_sword", new VariantSwordItem(ToolMaterials.GOLD),false);
    public static final Item BIRCH_GOLDEN_SWORD = registerItem("swords/birch_golden_sword", new VariantSwordItem(ToolMaterials.GOLD),false);
    public static final Item CRIMSON_GOLDEN_SWORD = registerItem("swords/crimson_golden_sword", new VariantSwordItem(ToolMaterials.GOLD),false);
    public static final Item DARK_OAK_GOLDEN_SWORD = registerItem("swords/dark_oak_golden_sword", new VariantSwordItem(ToolMaterials.GOLD),false);
    public static final Item JUNGLE_GOLDEN_SWORD = registerItem("swords/jungle_golden_sword", new VariantSwordItem(ToolMaterials.GOLD),false);
    public static final Item OAK_GOLDEN_SWORD = registerItem("swords/oak_golden_sword", new VariantSwordItem(ToolMaterials.GOLD),false);
    public static final Item MANGROVE_GOLDEN_SWORD = registerItem("swords/mangrove_golden_sword", new VariantSwordItem(ToolMaterials.GOLD),false);
    public static final Item SPRUCE_GOLDEN_SWORD = registerItem("swords/spruce_golden_sword", new VariantSwordItem(ToolMaterials.GOLD),false);
    public static final Item WARPED_GOLDEN_SWORD = registerItem("swords/warped_golden_sword", new VariantSwordItem(ToolMaterials.GOLD),false);
    // Diamond
    public static final Item ACACIA_DIAMOND_SWORD = registerItem("swords/acacia_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND),false);
    public static final Item BIRCH_DIAMOND_SWORD = registerItem("swords/birch_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND),false);
    public static final Item CRIMSON_DIAMOND_SWORD = registerItem("swords/crimson_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND),false);
    public static final Item DARK_OAK_DIAMOND_SWORD = registerItem("swords/dark_oak_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND),false);
    public static final Item JUNGLE_DIAMOND_SWORD = registerItem("swords/jungle_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND),false);
    public static final Item OAK_DIAMOND_SWORD = registerItem("swords/oak_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND),false);
    public static final Item MANGROVE_DIAMOND_SWORD = registerItem("swords/mangrove_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND),false);
    public static final Item SPRUCE_DIAMOND_SWORD = registerItem("swords/spruce_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND),false);
    public static final Item WARPED_DIAMOND_SWORD = registerItem("swords/warped_diamond_sword", new VariantSwordItem(ToolMaterials.DIAMOND),false);
    // Netherite
    public static final Item ACACIA_NETHERITE_SWORD = registerItem("swords/acacia_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE),false);
    public static final Item BIRCH_NETHERITE_SWORD = registerItem("swords/birch_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE),false);
    public static final Item CRIMSON_NETHERITE_SWORD = registerItem("swords/crimson_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE),false);
    public static final Item DARK_OAK_NETHERITE_SWORD = registerItem("swords/dark_oak_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE),false);
    public static final Item JUNGLE_NETHERITE_SWORD = registerItem("swords/jungle_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE),false);
    public static final Item OAK_NETHERITE_SWORD = registerItem("swords/oak_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE),false);
    public static final Item MANGROVE_NETHERITE_SWORD = registerItem("swords/mangrove_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE),false);
    public static final Item SPRUCE_NETHERITE_SWORD = registerItem("swords/spruce_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE),false);
    public static final Item WARPED_NETHERITE_SWORD = registerItem("swords/warped_netherite_sword", new VariantSwordItem(ToolMaterials.NETHERITE),false);
    
    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 200);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerSwordItems() {}
}