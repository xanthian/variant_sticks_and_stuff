package net.xanthian.vsas.util;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.poi.PointOfInterestType;
import net.minecraft.world.poi.PointOfInterestTypes;
import net.xanthian.vsas.blocks.Grindstones;
import net.xanthian.vsas.mixin.PointOfInterestTypesAccessor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ModPOITypes {
    public static void init() {

        Map<BlockState, RegistryEntry<PointOfInterestType>> poiStatesToType = PointOfInterestTypesAccessor
                .getPointOfInterestStatesToType();

        RegistryEntry<PointOfInterestType> weaponsmithEntry = Registries.POINT_OF_INTEREST_TYPE
                .getEntry(PointOfInterestTypes.WEAPONSMITH).get();
        PointOfInterestType weaponsmithPoiType = Registries.POINT_OF_INTEREST_TYPE.get(PointOfInterestTypes.WEAPONSMITH);
        List<BlockState> weaponsmithBlockStates = new ArrayList<BlockState>(weaponsmithPoiType.blockStates);
        for (Block block : Grindstones.MOD_GRINDSTONES.values()) {
            ImmutableList<BlockState> blockStates = block.getStateManager().getStates();
            for (BlockState blockState : blockStates) {
                poiStatesToType.putIfAbsent(blockState, weaponsmithEntry);
            }
            weaponsmithBlockStates.addAll(blockStates);
        }
        weaponsmithPoiType.blockStates = ImmutableSet.copyOf(weaponsmithBlockStates);
    }
}