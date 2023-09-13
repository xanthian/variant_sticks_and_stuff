package net.xanthian.vsas.items;

import com.google.common.collect.Maps;
import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.itemtypes.VariantShovelItem;
import net.xanthian.vsas.materials.VariantMaterials;

import java.util.Map;

public class Shovels {

    public static Map<Identifier, Item> MOD_SHOVELS = Maps.newHashMap();

    // Wood
    public static final Item ACACIA_WOODEN_SHOVEL = registerItem("shovels/acacia_wooden_shovel", new VariantShovelItem(VariantMaterials.ACACIA_PLANK));
    public static final Item BAMBOO_WOODEN_SHOVEL = registerItem("shovels/bamboo_wooden_shovel", new VariantShovelItem(VariantMaterials.BAMBOO_PLANK));
    public static final Item BIRCH_WOODEN_SHOVEL = registerItem("shovels/birch_wooden_shovel", new VariantShovelItem(VariantMaterials.BIRCH_PLANK));
    public static final Item CHERRY_WOODEN_SHOVEL = registerItem("shovels/cherry_wooden_shovel", new VariantShovelItem(VariantMaterials.CHERRY_PLANK));
    public static final Item CRIMSON_WOODEN_SHOVEL = registerItem("shovels/crimson_wooden_shovel", new VariantShovelItem(VariantMaterials.CRIMSON_PLANK));
    public static final Item DARK_OAK_WOODEN_SHOVEL = registerItem("shovels/dark_oak_wooden_shovel", new VariantShovelItem(VariantMaterials.DARK_OAK_PLANK));
    public static final Item JUNGLE_WOODEN_SHOVEL = registerItem("shovels/jungle_wooden_shovel", new VariantShovelItem(VariantMaterials.JUNGLE_PLANK));
    //public static final Item OAK_WOODEN_SHOVEL = registerItem("shovels/oak_wooden_shovel", new VariantShovelItem(VariantMaterials.OAK_PLANK));
    public static final Item MANGROVE_WOODEN_SHOVEL = registerItem("shovels/mangrove_wooden_shovel", new VariantShovelItem(VariantMaterials.MANGROVE_PLANK));
    public static final Item SPRUCE_WOODEN_SHOVEL = registerItem("shovels/spruce_wooden_shovel", new VariantShovelItem(VariantMaterials.SPRUCE_PLANK));
    public static final Item WARPED_WOODEN_SHOVEL = registerItem("shovels/warped_wooden_shovel", new VariantShovelItem(VariantMaterials.WARPED_PLANK));
    // Stone
    public static final Item ACACIA_STONE_SHOVEL = registerItem("shovels/acacia_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    public static final Item BAMBOO_STONE_SHOVEL = registerItem("shovels/bamboo_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    public static final Item BIRCH_STONE_SHOVEL = registerItem("shovels/birch_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    public static final Item CHERRY_STONE_SHOVEL = registerItem("shovels/cherry_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    public static final Item CRIMSON_STONE_SHOVEL = registerItem("shovels/crimson_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    public static final Item DARK_OAK_STONE_SHOVEL = registerItem("shovels/dark_oak_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    public static final Item JUNGLE_STONE_SHOVEL = registerItem("shovels/jungle_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    //public static final Item OAK_STONE_SHOVEL = registerItem("shovels/oak_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    public static final Item MANGROVE_STONE_SHOVEL = registerItem("shovels/mangrove_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    public static final Item SPRUCE_STONE_SHOVEL = registerItem("shovels/spruce_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    public static final Item WARPED_STONE_SHOVEL = registerItem("shovels/warped_stone_shovel", new VariantShovelItem(ToolMaterials.STONE));
    // Iron
    public static final Item ACACIA_IRON_SHOVEL = registerItem("shovels/acacia_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    public static final Item BAMBOO_IRON_SHOVEL = registerItem("shovels/bamboo_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    public static final Item BIRCH_IRON_SHOVEL = registerItem("shovels/birch_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    public static final Item CHERRY_IRON_SHOVEL = registerItem("shovels/cherry_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    public static final Item CRIMSON_IRON_SHOVEL = registerItem("shovels/crimson_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    public static final Item DARK_OAK_IRON_SHOVEL = registerItem("shovels/dark_oak_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    public static final Item JUNGLE_IRON_SHOVEL = registerItem("shovels/jungle_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    //public static final Item OAK_IRON_SHOVEL = registerItem("shovels/oak_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    public static final Item MANGROVE_IRON_SHOVEL = registerItem("shovels/mangrove_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    public static final Item SPRUCE_IRON_SHOVEL = registerItem("shovels/spruce_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    public static final Item WARPED_IRON_SHOVEL = registerItem("shovels/warped_iron_shovel", new VariantShovelItem(ToolMaterials.IRON));
    // Golden
    public static final Item ACACIA_GOLDEN_SHOVEL = registerItem("shovels/acacia_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    public static final Item BAMBOO_GOLDEN_SHOVEL = registerItem("shovels/bamboo_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    public static final Item BIRCH_GOLDEN_SHOVEL = registerItem("shovels/birch_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    public static final Item CHERRY_GOLDEN_SHOVEL = registerItem("shovels/cherry_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    public static final Item CRIMSON_GOLDEN_SHOVEL = registerItem("shovels/crimson_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    public static final Item DARK_OAK_GOLDEN_SHOVEL = registerItem("shovels/dark_oak_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    public static final Item JUNGLE_GOLDEN_SHOVEL = registerItem("shovels/jungle_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    //public static final Item OAK_GOLDEN_SHOVEL = registerItem("shovels/oak_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    public static final Item MANGROVE_GOLDEN_SHOVEL = registerItem("shovels/mangrove_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    public static final Item SPRUCE_GOLDEN_SHOVEL = registerItem("shovels/spruce_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    public static final Item WARPED_GOLDEN_SHOVEL = registerItem("shovels/warped_golden_shovel", new VariantShovelItem(ToolMaterials.GOLD));
    // Diamond
    public static final Item ACACIA_DIAMOND_SHOVEL = registerItem("shovels/acacia_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    public static final Item BAMBOO_DIAMOND_SHOVEL = registerItem("shovels/bamboo_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    public static final Item BIRCH_DIAMOND_SHOVEL = registerItem("shovels/birch_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    public static final Item CHERRY_DIAMOND_SHOVEL = registerItem("shovels/cherry_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    public static final Item CRIMSON_DIAMOND_SHOVEL = registerItem("shovels/crimson_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    public static final Item DARK_OAK_DIAMOND_SHOVEL = registerItem("shovels/dark_oak_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    public static final Item JUNGLE_DIAMOND_SHOVEL = registerItem("shovels/jungle_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    //public static final Item OAK_DIAMOND_SHOVEL = registerItem("shovels/oak_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    public static final Item MANGROVE_DIAMOND_SHOVEL = registerItem("shovels/mangrove_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    public static final Item SPRUCE_DIAMOND_SHOVEL = registerItem("shovels/spruce_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    public static final Item WARPED_DIAMOND_SHOVEL = registerItem("shovels/warped_diamond_shovel", new VariantShovelItem(ToolMaterials.DIAMOND));
    // Netherite
    public static final Item ACACIA_NETHERITE_SHOVEL = registerItem("shovels/acacia_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    public static final Item BAMBOO_NETHERITE_SHOVEL = registerItem("shovels/bamboo_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    public static final Item BIRCH_NETHERITE_SHOVEL = registerItem("shovels/birch_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    public static final Item CHERRY_NETHERITE_SHOVEL = registerItem("shovels/cherry_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    public static final Item CRIMSON_NETHERITE_SHOVEL = registerItem("shovels/crimson_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    public static final Item DARK_OAK_NETHERITE_SHOVEL = registerItem("shovels/dark_oak_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    public static final Item JUNGLE_NETHERITE_SHOVEL = registerItem("shovels/jungle_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    //public static final Item OAK_NETHERITE_SHOVEL = registerItem("shovels/oak_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    public static final Item MANGROVE_NETHERITE_SHOVEL = registerItem("shovels/mangrove_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    public static final Item SPRUCE_NETHERITE_SHOVEL = registerItem("shovels/spruce_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    public static final Item WARPED_NETHERITE_SHOVEL = registerItem("shovels/warped_netherite_shovel", new VariantShovelItem(ToolMaterials.NETHERITE));
    
    private static Item registerItem(String name, Item item) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, name.toLowerCase());
        MOD_SHOVELS.put(identifier, item);
        return Registry.register(Registries.ITEM, new Identifier(Initialise.MOD_ID, name), item);
    }
    public static void registerShovelItems() {}
}