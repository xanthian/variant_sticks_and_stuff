package net.xanthian.vsas.mixin;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;
import net.xanthian.vsas.config.VsasConfig;
import net.xanthian.vsas.items.VariantFungusOnAStickItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.xanthian.vsas.items.VariantFungusOnAStickItem.STRIDER_FEEDER_INGREDIENT_TAG;

@Mixin(StriderEntity.class)
public abstract class StriderEntityMixin extends PassiveEntity {
    public StriderEntityMixin(EntityType<? extends PigEntity> entityType, World world) {
        super(entityType, world);
    }

    @Redirect(method = "canEntityControl", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    boolean redirectIsOf(ItemStack instance, Item item) {
        if (item == Items.WARPED_FUNGUS_ON_A_STICK) {
            return instance.isOf(item) || instance.getItem() instanceof VariantFungusOnAStickItem;
        }
        return instance.isOf(item);
    }

    @Inject(method = "initGoals", at = @At("TAIL"))
    private void addFeederGoal(CallbackInfo ci) {
        if (VsasConfig.items == true) {
            if (VsasConfig.onastick == true) {
                this.goalSelector.add(4, new TemptGoal(this, 1.2D, Ingredient.fromTag(STRIDER_FEEDER_INGREDIENT_TAG), false));
            }
        }
    }
}