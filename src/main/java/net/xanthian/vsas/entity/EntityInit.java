package net.xanthian.vsas.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;
import net.xanthian.vsas.entity.arrows.AcaciaArrowEntity;

public class EntityInit {

    public static EntityType<AcaciaArrowEntity> ACACIA_ARROW;


    private static <T extends Entity> EntityType<T> register(String arrow, EntityType<T> entityType) {
        return Registry.register(Registry.ENTITY_TYPE, Init.MOD_ID + ":" + arrow, entityType);

    }

    private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build();
    }

    public static void init() {
        ACACIA_ARROW = register("acacia_arrow", createArrowEntityType(AcaciaArrowEntity::new));
    }
}
