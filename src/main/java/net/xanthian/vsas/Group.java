package net.xanthian.vsas;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.xanthian.vsas.items.Sticks;

public class Group {

    public static final ItemGroup STICKS_AND_STUFF = FabricItemGroupBuilder.build(new Identifier(Init.MOD_ID, "sticks_and_stuff"),
            () -> new ItemStack(Sticks.ACACIA_STICK));
}