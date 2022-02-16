package net.xanthian.vsas.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Group;
import net.xanthian.vsas.Init;

public class Sticks extends Item {
    public Sticks(Settings settings) {
        super(settings);
    }

    public static final Item ACACIA_STICK = registerItem("acacia_stick", new Sticks(new FabricItemSettings().group(Group.STICKS_AND_STUFF)),true);
    public static final Item BIRCH_STICK = registerItem("birch_stick", new Sticks(new FabricItemSettings().group(Group.STICKS_AND_STUFF)),true);
    public static final Item CRIMSON_STICK = registerItem("crimson_stick", new Sticks(new FabricItemSettings().group(Group.STICKS_AND_STUFF)),false);
    public static final Item DARK_OAK_STICK = registerItem("dark_oak_stick", new Sticks(new FabricItemSettings().group(Group.STICKS_AND_STUFF)),true);
    public static final Item JUNGLE_STICK = registerItem("jungle_stick", new Sticks(new FabricItemSettings().group(Group.STICKS_AND_STUFF)),true);
    public static final Item OAK_STICK = registerItem("oak_stick", new Sticks(new FabricItemSettings().group(Group.STICKS_AND_STUFF)),true);
    public static final Item SPRUCE_STICK = registerItem("spruce_stick", new Sticks(new FabricItemSettings().group(Group.STICKS_AND_STUFF)),true);
    public static final Item WARPED_STICK = registerItem("warped_stick", new Sticks(new FabricItemSettings().group(Group.STICKS_AND_STUFF)),false);

    private static Item registerItem(String name, Item item, boolean canBurn) {
        if (canBurn) FuelRegistry.INSTANCE.add(item, 100);
        return Registry.register(Registry.ITEM, new Identifier(Init.MOD_ID, name), item);
    }
    public static void registerStickItems(){}
}