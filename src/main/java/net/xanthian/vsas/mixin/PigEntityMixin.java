package net.xanthian.vsas.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;

import net.xanthian.vsas.items.itemtypes.VariantCarrotOnAStickItem;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static net.xanthian.vsas.items.itemtypes.VariantCarrotOnAStickItem.PIG_FEEDER_INGREDIENT_TAG;

@Mixin(PigEntity.class)

public abstract class PigEntityMixin extends PassiveEntity {
    public PigEntityMixin(EntityType<? extends PigEntity> entityType, World world) {
        super(entityType, world);
    }

    @WrapOperation(method = "getControllingPassenger", at = @At(value = "INVOKE", target = "Lnet/minecraft/entity/player/PlayerEntity;isHolding(Lnet/minecraft/item/Item;)Z"))
    private boolean vsas$customRodsCanControlPigs(PlayerEntity playerEntity, Item item,  Operation<Boolean> original) {
        return original.call(playerEntity, item) || playerEntity.isHolding((ItemStack stack) -> stack.getItem() instanceof VariantCarrotOnAStickItem);
    }

    @Inject(method = "initGoals", at = @At("TAIL"))
    private void addFeederGoal(CallbackInfo ci) {
        this.goalSelector.add(4, new TemptGoal(this, 1.2, Ingredient.fromTag(PIG_FEEDER_INGREDIENT_TAG), false));
    }
}