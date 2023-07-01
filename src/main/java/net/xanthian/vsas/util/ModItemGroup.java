package net.xanthian.vsas.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.items.Sticks;

import java.util.Comparator;

public class ModItemGroup {

    public static void registerGroup() {
    }

    public static final ItemGroup VARIANT_STICKS_AND_STUFF =
            FabricItemGroup.builder(new Identifier(Initialise.MOD_ID, "variant_sticks_and_stuff"))
                    .displayName(Text.translatable("vsas.group.vsas"))
                    .icon(() -> new ItemStack(Sticks.MANGROVE_STICK))
                    .entries((context, entries) -> {
                        entries.addAll(Registries.ITEM.getIds().stream()
                                .filter(identifier -> identifier.getNamespace().matches(Initialise.MOD_ID))
                                .sorted(Comparator.comparing(Identifier::getPath))
                                .map(Registries.ITEM::get)
                                .map(ItemStack::new)
                                .filter(input -> !input.isEmpty())
                                .toList());
                    })
                    .build();
}