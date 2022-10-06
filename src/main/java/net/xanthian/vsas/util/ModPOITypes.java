package net.xanthian.vsas.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;

import net.xanthian.vsas.blocks.Grindstones;
import net.xanthian.vsas.mixin.PointOfInterestTypesAccessor;

public class ModPOITypes {
    public static void init() {
        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();

        RegistryEntry<PointOfInterestType> weaponsmithEntry = Registry.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.WEAPONSMITH).get();

        PointOfInterestType weaponsmithPoiType = Registry.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.WEAPONSMITH);

        // NOTE: PointOfInterestType.blockStates is accessible by access widener
        List<BlockState> weaponsmithBlockStates = new ArrayList<BlockState>(weaponsmithPoiType.blockStates);

        for (Block block : Grindstones.MOD_GRINDSTONES.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();

            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, weaponsmithEntry);
            }

            weaponsmithBlockStates.addAll(blockStates);
        }

        // NOTE: PointOfInterestType.blockStates is mutable by access widener
        weaponsmithPoiType.blockStates = ImmutableSet.copyOf(weaponsmithBlockStates);
    }
}