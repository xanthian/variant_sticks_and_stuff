package net.xanthian.vsas.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.xanthian.vsas.Initialise;
import net.xanthian.vsas.entity.arrows.*;

public class EntityInit {

    public static EntityType<AcaciaArrowEntity> ACACIA_ARROW;
    public static EntityType<BambooArrowEntity> BAMBOO_ARROW;
    public static EntityType<BirchArrowEntity> BIRCH_ARROW;
    public static EntityType<CherryArrowEntity> CHERRY_ARROW;
    public static EntityType<CrimsonArrowEntity> CRIMSON_ARROW;
    public static EntityType<DarkOakArrowEntity> DARK_OAK_ARROW;
    public static EntityType<JungleArrowEntity> JUNGLE_ARROW;
    public static EntityType<OakArrowEntity> OAK_ARROW;
    public static EntityType<MangroveArrowEntity> MANGROVE_ARROW;

    public static EntityType<WarpedArrowEntity> WARPED_ARROW;

    private static <T extends Entity> EntityType<T> register(String item, EntityType<T> entityType) {
        return Registry.register(Registries.ENTITY_TYPE, Initialise.MOD_ID + ":" + item, entityType);
    }

    private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, factory).dimensions(EntityDimensions.changing(0.5f,
                0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build();
    }

    public static void init() {
        ACACIA_ARROW = register("acacia_arrow", createArrowEntityType(AcaciaArrowEntity::new));
        BAMBOO_ARROW = register("bamboo_arrow", createArrowEntityType(BambooArrowEntity::new));
        BIRCH_ARROW = register("birch_arrow", createArrowEntityType(BirchArrowEntity::new));
        CHERRY_ARROW = register("cherry_arrow", createArrowEntityType(CherryArrowEntity::new));
        CRIMSON_ARROW = register("crimson_arrow", createArrowEntityType(CrimsonArrowEntity::new));
        DARK_OAK_ARROW = register("dark_oak_arrow", createArrowEntityType(DarkOakArrowEntity::new));
        JUNGLE_ARROW = register("jungle_arrow", createArrowEntityType(JungleArrowEntity::new));
        OAK_ARROW = register("oak_arrow", createArrowEntityType(OakArrowEntity::new));
        MANGROVE_ARROW = register("mangrove_arrow", createArrowEntityType(MangroveArrowEntity::new));

        WARPED_ARROW = register("warped_arrow", createArrowEntityType(WarpedArrowEntity::new));

    }
}