package net.xanthian.vsas.entity.arrows;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.Arrows;

public class DarkOakArrowEntity
        extends PersistentProjectileEntity {

    public DarkOakArrowEntity(EntityType<? extends DarkOakArrowEntity> entityType, World world) {
        super(entityType, world);
    }

    public DarkOakArrowEntity(World world, double x, double y, double z) {
        super(EntityInit.DARK_OAK_ARROW, x, y, z, world);
    }

    public DarkOakArrowEntity(World world, LivingEntity owner) {
        super(EntityInit.DARK_OAK_ARROW, owner, world);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(Arrows.DARK_OAK_ARROW_ITEM);
    }
}