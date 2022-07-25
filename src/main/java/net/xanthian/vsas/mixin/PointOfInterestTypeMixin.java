package net.xanthian.vsas.mixin;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.mob.IllagerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.vsas.blocks.Grindstones;
import net.xanthian.vsas.blocks.VariantGrindstoneBlock;
import net.xanthian.vsas.blocks.VariantPoweredRailBlock;
import net.xanthian.vsas.items.VariantCarrotOnAStickItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.HashSet;
import java.util.Set;


@Mixin(PointOfInterestTypes.class)
public abstract class PointOfInterestTypeMixin{

    private static void appendWeaponsmiths(Args args) {
        Set<BlockState> originalWeaponsmithStates = args.get(1);
        Set<BlockState> addedWeaponsmithStates = ImmutableList.of(
                Grindstones.ACACIA_GRINDSTONE,
                Grindstones.BIRCH_GRINDSTONE,
                Grindstones.CRIMSON_GRINDSTONE,
                Grindstones.DARK_OAK_GRINDSTONE,
                Grindstones.JUNGLE_GRINDSTONE,
                Grindstones.OAK_GRINDSTONE,
                Grindstones.SPRUCE_GRINDSTONE,
                Grindstones.WARPED_GRINDSTONE
        ).stream().flatMap((block) -> {
            return block.getStateManager().getStates().stream();
        }).collect(ImmutableSet.toImmutableSet());

        Set<BlockState> newWeaponsmithStates = new HashSet<>();
        newWeaponsmithStates.addAll(originalWeaponsmithStates);
        newWeaponsmithStates.addAll(addedWeaponsmithStates);
        newWeaponsmithStates = newWeaponsmithStates.stream().collect(ImmutableSet.toImmutableSet());

        // Add new blockStates
        args.set(1, newWeaponsmithStates);

        // Set ticketCount
        args.set(2, 1);
    }
}