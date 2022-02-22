package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;
import net.xanthian.vsas.materials.VariantMaterials;

public class Shovels {

    // Wood
    public static final Item ACACIA_WOODEN_SHOVEL = registerItem("shovels/acacia_wooden_shovel", new VariantShovelItem(VariantMaterials.ACACIA_PLANK),true);
    public static final Item BIRCH_WOODEN_SHOVEL = registerItem("shovels/birch_wooden_shovel", new VariantShovelItem(VariantMaterials.BIRCH_PLANK),true);
    public static final Item CRIMSON_WOODEN_SHOVEL = registerItem("shovels/crimson_wooden_shovel", new VariantShovelItem(VariantMaterials.CRIMSON_PLANK),false);
    public static final Item DARK_OAK_WOODEN_SHOVEL = registerItem("shovels/dark_oak_wooden_shovel", new VariantShovelItem(VariantMaterials.DARK_OAK_PLANK),true);
    public static final Item JUNGLE_WOODEN_SHOVEL = registerItem("shovels/jungle_wooden_shovel", new VariantShovelItem(VariantMaterials.JUNGLE_PLANK),true);
    public static final Item OAK_WOODEN_SHOVEL = registerItem("shovels/oak_wooden_shovel", new VariantShovelItem(VariantMaterials.OAK_PLANK),true);
    public static final Item SPRUCE_WOODEN_SHOVEL = registerItem("shovels/spruce_wooden_shovel", new VariantShovelItem(VariantMaterials.SPRUCE_PLANK),true);
    public static final Item WARPED_WOODEN_SHOVEL = registerItem("shovels/warped_wooden_shovel", new VariantShovelItem(VariantMaterials.WARPED_PLANK),false);
    
    // Stone
    public static final Item ACACIA_STONE_SHOVEL = registerItem("shovels/acacia_stone_shovel", new VariantShovelItem(ToolMaterials.STONE),false);
    public static final Item BIRCH_STONE_SHOVEL = registerItem("shovels/birch_stone_shovel", new VariantShovelItem(ToolMaterials.STONE),false);
    public static final Item CRIMSON_STONE_SHOVEL = registerItem("shovels/crimson_stone_shovel", new VariantShovelItem(ToolMaterials.STONE),false);
    public static final Item DARK_OAK_STONE_SHOVEL = registerItem("shovels/dark_oak_stone_shovel", new VariantShovelItem(ToolMaterials.STONE),false);
    public static final Item JUNGLE_STONE_SHOVEL = registerItem("shovels/jungle_stone_shovel", new VariantShovelItem(ToolMaterials.STONE),false);
    public static final Item OAK_STONE_SHOVEL = registerItem("shovels/oak_stone_shovel", new VariantShovelItem(ToolMaterials.STONE),false);
    public static final Item SPRUCE_STONE_SHOVEL = registerItem("shovels/spruce_stone_shovel", new VariantShovelItem(ToolMaterials.STONE),false);
    public static final Item WARPED_STONE_SHOVEL = registerItem("shovels/warped_stone_shovel", new VariantShovelItem(ToolMaterials.STONE),false);

    // Iron
    public static final Item ACACIA_IRON_SHOVEL = registerItem("shovels/acacia_iron_shovel", new VariantShovelItem(ToolMaterials.IRON),false);
    public static final Item BIRCH_IRON_SHOVEL = registerItem("shovels/birch_iron_shovel", new VariantShovelItem(ToolMaterials.IRON),false);
    public static final Item CRIMSON_IRON_SHOVEL = registerItem("shovels/crimson_iron_shovel", new VariantShovelItem(ToolMaterials.IRON),false);
    public static final Item DARK_OAK_IRON_SHOVEL = registerItem("shovels/dark_oak_iron_shovel", new VariantShovelItem(ToolMaterials.IRON),false);
    public static final Item JUNGLE_IRON_SHOVEL = registerItem("shovels/jungle_iron_shovel", new VariantShovelItem(ToolMaterials.IRON),false);
    public static final Item OAK_IRON_SHOVEL = registerItem("shovels/oak_iron_shovel", new VariantShovelItem(ToolMaterials.IRON),false);
    public static final Item SPRUCE_IRON_SHOVEL = registerItem("shovels/spruce_iron_shovel", new VariantShovelItem(ToolMaterials.IRON),false);
    public static final Item WARPED_IRON_SHOVEL = registerItem("shovels/warped_iron_shovel", new VariantShovelItem(ToolMaterials.IRON),false);
    // Golden
    public static final Item ACACIA_GOLDEN_SHOVEL = registerItem("shovels/acacia_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD),false);
    public static final Item BIRCH_GOLDEN_SHOVEL = registerItem("shovels/birch_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD),false);
    public static final Item CRIMSON_GOLDEN_SHOVEL = registerItem("shovels/crimson_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD),false);
    public static final Item DARK_OAK_GOLDEN_SHOVEL = registerItem("shovels/dark_oak_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD),false);
    public static final Item JUNGLE_GOLDEN_SHOVEL = registerItem("shovels/jungle_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD),false);
    public static final Item OAK_GOLDEN_SHOVEL = registerItem("shovels/oak_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD),false);
    public static final Item SPRUCE_GOLDEN_SHOVEL = registerItem("shovels/spruce_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD),false);
    public static final Item WARPED_GOLDEN_SHOVEL = registerItem("shovels/warped_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD),false);
    // Diamond
    public static final Item ACACIA_DIAMOND_SHOVEL = registerItem("shovels/acacia_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND),false);
    public static final Item BIRCH_DIAMOND_SHOVEL = registerItem("shovels/birch_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND),false);
    public static final Item CRIMSON_DIAMOND_SHOVEL = registerItem("shovels/crimson_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND),false);
    public static final Item DARK_OAK_DIAMOND_SHOVEL = registerItem("shovels/dark_oak_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND),false);
    public static final Item JUNGLE_DIAMOND_SHOVEL = registerItem("shovels/jungle_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND),false);
    public static final Item OAK_DIAMOND_SHOVEL = registerItem("shovels/oak_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND),false);
    public static final Item SPRUCE_DIAMOND_SHOVEL = registerItem("shovels/spruce_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND),false);
    public static final Item WARPED_DIAMOND_SHOVEL = registerItem("shovels/warped_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND),false);
    // Netherite
    public static final Item ACACIA_NETHERITE_SHOVEL = registerItem("shovels/acacia_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE),false);
    public static final Item BIRCH_NETHERITE_SHOVEL = registerItem("shovels/birch_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE),false);
    public static final Item CRIMSON_NETHERITE_SHOVEL = registerItem("shovels/crimson_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE),false);
    public static final Item DARK_OAK_NETHERITE_SHOVEL = registerItem("shovels/dark_oak_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE),false);
    public static final Item JUNGLE_NETHERITE_SHOVEL = registerItem("shovels/jungle_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE),false);
    public static final Item OAK_NETHERITE_SHOVEL = registerItem("shovels/oak_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE),false);
    public static final Item SPRUCE_NETHERITE_SHOVEL = registerItem("shovels/spruce_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE),false);
    public static final Item WARPED_NETHERITE_SHOVEL = registerItem("shovels/warped_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE),false);
    
    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 200);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerShovelItems() {}
}