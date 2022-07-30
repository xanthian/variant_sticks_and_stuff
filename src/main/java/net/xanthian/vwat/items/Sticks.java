package net.xanthian.vwat.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vwat.Group;
import net.xanthian.vwat.Init;

public class Sticks extends Item {
    public Sticks(Settings settings) {
        super(settings);
    }

    public static final Item ACACIA_STICK = registerItem("sticks/acacia_stick", new Sticks(new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS)),true);
    public static final Item BIRCH_STICK = registerItem("sticks/birch_stick", new Sticks(new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS)),true);
    public static final Item CRIMSON_STICK = registerItem("sticks/crimson_stick", new Sticks(new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS)),false);
    public static final Item DARK_OAK_STICK = registerItem("sticks/dark_oak_stick", new Sticks(new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS)),true);
    public static final Item JUNGLE_STICK = registerItem("sticks/jungle_stick", new Sticks(new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS)),true);
    public static final Item OAK_STICK = registerItem("sticks/oak_stick", new Sticks(new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS)),true);
    public static final Item MANGROVE_STICK = registerItem("sticks/mangrove_stick", new Sticks(new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS)),true);
    public static final Item SPRUCE_STICK = registerItem("sticks/spruce_stick", new Sticks(new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS)),true);
    public static final Item WARPED_STICK = registerItem("sticks/warped_stick", new Sticks(new FabricItemSettings().group(Group.WEAPONS_AND_TOOLS)),false);

    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 100);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerStickItems(){}
}