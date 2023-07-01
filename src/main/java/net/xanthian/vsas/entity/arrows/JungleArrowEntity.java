package net.xanthian.vsas.entity.arrows;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import net.xanthian.vsas.entity.EntityInit;
import net.xanthian.vsas.items.Arrows;

public class JungleArrowEntity
        extends PersistentProjectileEntity {

    public JungleArrowEntity(EntityType<? extends JungleArrowEntity> entityType, World world) {
        super((EntityType<? extends PersistentProjectileEntity>)entityType, world);
    }

    public JungleArrowEntity(World world, double x, double y, double z) {
        super(EntityInit.JUNGLE_ARROW, x, y, z, world);
    }

    public JungleArrowEntity(World world, LivingEntity owner) {
        super(EntityInit.JUNGLE_ARROW, owner, world);
    }

    @Override
    protected void initDataTracker() {
        super.initDataTracker();
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(Arrows.JUNGLE_ARROW_ITEM);
    }
}