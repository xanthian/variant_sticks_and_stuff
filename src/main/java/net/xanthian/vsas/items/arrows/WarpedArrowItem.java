package net.xanthian.vsas.items.arrows;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.xanthian.vsas.Init;
import net.xanthian.vsas.entity.arrows.WarpedArrowEntity;

public class WarpedArrowItem extends ArrowItem {
    public WarpedArrowItem() {
        super(new FabricItemSettings().group(Init.STICKS_AND_STUFF));
    }
    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new WarpedArrowEntity(world, shooter);
    }
}
