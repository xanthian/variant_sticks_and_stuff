package net.xanthian.vsas.mixin;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.BlockState;
import net.minecraft.world.poi.PointOfInterestType;
import net.xanthian.vsas.blocks.Grindstones;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.Slice;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.HashSet;
import java.util.Set;


@Mixin(PointOfInterestType.class)
public abstract class PointOfInterestTypeMixin
{
    @ModifyArgs(
            method = "<clinit>",
            slice = @Slice(from = @At(
                    value = "CONSTANT",
                    args = "stringValue=weaponsmith")
            ),
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/poi/PointOfInterestType;register(Ljava/lang/String;Ljava/util/Set;II)Lnet/minecraft/world/poi/PointOfInterestType;",
                    ordinal = 0
            )
    )
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