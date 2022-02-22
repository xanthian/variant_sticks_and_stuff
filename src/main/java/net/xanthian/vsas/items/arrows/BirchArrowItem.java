package net.xanthian.vsas.items.arrows;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.vsas.Group;
import net.xanthian.vsas.entity.arrows.AcaciaArrowEntity;
import net.xanthian.vsas.entity.arrows.BirchArrowEntity;

public class BirchArrowItem extends ArrowItem {
    public BirchArrowItem() {
        super(new FabricItemSettings().group(Group.STICKS_AND_STUFF));
    }
    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new BirchArrowEntity(world, shooter);
    }
}
