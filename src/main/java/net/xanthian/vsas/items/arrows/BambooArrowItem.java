package net.xanthian.vsas.items.arrows;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.vsas.entity.arrows.BambooArrowEntity;

public class BambooArrowItem extends ArrowItem {
    public BambooArrowItem() {
        super(new FabricItemSettings());
    }
    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new BambooArrowEntity(world, shooter);
    }
}