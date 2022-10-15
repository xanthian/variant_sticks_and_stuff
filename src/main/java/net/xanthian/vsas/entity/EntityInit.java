package net.xanthian.vsas.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.xanthian.vsas.Init;
import net.xanthian.vsas.entity.arrows.*;

public class EntityInit {

    public static EntityType<AcaciaArrowEntity> ACACIA_ARROW;
    public static EntityType<BirchArrowEntity> BIRCH_ARROW;
    public static EntityType<CrimsonArrowEntity> CRIMSON_ARROW;
    public static EntityType<DarkOakArrowEntity> DARK_OAK_ARROW;
    public static EntityType<JungleArrowEntity> JUNGLE_ARROW;
    public static EntityType<OakArrowEntity> OAK_ARROW;
    public static EntityType<MangroveArrowEntity> MANGROVE_ARROW;
    public static EntityType<SpruceArrowEntity> SPRUCE_ARROW;
    public static EntityType<WarpedArrowEntity> WARPED_ARROW;
    public static BlockEntityType<CampFireBlockEntity> VARIANT_CAMPFIRE;

    private static <T extends Entity> EntityType<T> register(String item, EntityType<T> entityType) {
        return Registry.register(Registry.ENTITY_TYPE, Init.MOD_ID + ":" + item, entityType);
    }

    private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, factory).dimensions(EntityDimensions.changing(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build();
    }

    public static void init() {
        ACACIA_ARROW = register("acacia_arrow", createArrowEntityType(AcaciaArrowEntity::new));
        BIRCH_ARROW = register("birch_arrow", createArrowEntityType(BirchArrowEntity::new));
        CRIMSON_ARROW = register("crimson_arrow", createArrowEntityType(CrimsonArrowEntity::new));
        DARK_OAK_ARROW = register("dark_oak_arrow", createArrowEntityType(DarkOakArrowEntity::new));
        JUNGLE_ARROW = register("jungle_arrow", createArrowEntityType(JungleArrowEntity::new));
        OAK_ARROW = register("oak_arrow", createArrowEntityType(OakArrowEntity::new));
        MANGROVE_ARROW = register("mangrove_arrow", createArrowEntityType(MangroveArrowEntity::new));
        SPRUCE_ARROW = register("spruce_arrow", createArrowEntityType(SpruceArrowEntity::new));
        WARPED_ARROW = register("warped_arrow", createArrowEntityType(WarpedArrowEntity::new));

        VARIANT_CAMPFIRE = Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Init.MOD_ID, "campfire"),
                FabricBlockEntityTypeBuilder.create(CampFireBlockEntity::new,
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/acacia_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/acacia_soul_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/birch_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/birch_soul_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/crimson_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/crimson_soulcampfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/dark_oak_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/dark_oak_soul_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/jungle_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/jungle_soul_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/oak_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/oak_soul_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/mangrove_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/mangrove_soul_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/spruce_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/spruce_soul_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/warped_campfire")),
                                Registry.BLOCK.get(new Identifier("vsas", "campfires/warped_soul_campfire")))
                        .build());
    }
}