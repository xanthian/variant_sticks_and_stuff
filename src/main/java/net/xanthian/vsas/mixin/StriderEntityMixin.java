package net.xanthian.vsas.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;
import net.xanthian.vsas.config.VsasConfig;
import net.xanthian.vsas.items.VariantFungusOnAStickItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.xanthian.vsas.items.VariantFungusOnAStickItem.STRIDER_FEEDER_INGREDIENT_TAG;

@Mixin(StriderEntity.class)
public abstract class StriderEntityMixin extends PassiveEntity {
    public StriderEntityMixin(EntityType<? extends PigEntity> entityType, World world) {
        super(entityType, world);
    }

    @WrapOperation(method = "canEntityControl", at = @At(value = "INVOKE", target = "Lnet/minecraft/item/ItemStack;isOf(Lnet/minecraft/item/Item;)Z"))
    private boolean vsas$customRodsCanControlStrider(ItemStack stack, Item item, Operation<Boolean> original) {
        return original.call(stack, item) || stack.getItem() instanceof VariantFungusOnAStickItem;
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