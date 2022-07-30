package net.xanthian.vwat;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.vwat.items.Axes;

public class Group {

    public static final ItemGroup WEAPONS_AND_TOOLS = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "weapons_and_tools"),
            () -> new ItemStack(Axes.BIRCH_WOODEN_AXE));
}