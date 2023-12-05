package net.xanthian.vsas.entity.arrows;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.Arrows;

public class BambooArrowEntity
        extends PersistentProjectileEntity {

    public BambooArrowEntity(EntityType<? extends BambooArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    public BambooArrowEntity(World world, double x, double y, double z) {
        super(EntityInit.BAMBOO_ARROW, x, y, z, world);
    }

    public BambooArrowEntity(World world, LivingEntity owner) {
        super(EntityInit.BAMBOO_ARROW, owner, world);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(Arrows.BAMBOO_ARROW_ITEM);
    }
}