package net.xanthian.vsas.items.arrows;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import net.xanthian.vsas.entity.arrows.JungleArrowEntity;

public class JungleArrowItem extends ArrowItem {
    public JungleArrowItem() {
        super(new FabricItemSettings());
    }
    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new JungleArrowEntity(world, shooter);
    }
}