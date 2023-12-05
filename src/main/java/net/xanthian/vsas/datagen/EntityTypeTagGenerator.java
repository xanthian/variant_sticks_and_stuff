package net.xanthian.vsas.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.EntityTypeTags;
import net.xanthian.vsas.entity.EntityInit;

import java.util.concurrent.CompletableFuture;

public class EntityTypeTagGenerator extends FabricTagProvider.EntityTypeTagProvider {
    public EntityTypeTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(EntityTypeTags.ARROWS)
                .add(EntityInit.ACACIA_ARROW)
                .add(EntityInit.BAMBOO_ARROW)
                .add(EntityInit.BIRCH_ARROW)
                .add(EntityInit.CHERRY_ARROW)
                .add(EntityInit.CRIMSON_ARROW)
                .add(EntityInit.DARK_OAK_ARROW)
                .add(EntityInit.JUNGLE_ARROW)
                .add(EntityInit.MANGROVE_ARROW)
                .add(EntityInit.OAK_ARROW)
                .add(EntityInit.WARPED_ARROW);
    }
}