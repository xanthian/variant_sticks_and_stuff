package net.xanthian.vsas.materials;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum VariantMaterials implements ToolMaterial {

    // Wood
    ACACIA_PLANK(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.ofItems(Items.ACACIA_PLANKS)),
    BIRCH_PLANK(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.ofItems(Items.BIRCH_PLANKS)),
    CRIMSON_PLANK(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.ofItems(Items.CRIMSON_PLANKS)),
    DARK_OAK_PLANK(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.ofItems(Items.DARK_OAK_PLANKS)),
    JUNGLE_PLANK(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.ofItems(Items.JUNGLE_PLANKS)),
    OAK_PLANK(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.ofItems(Items.OAK_PLANKS)),
    MANGROVE_PLANK(0, 59, 2.0F, 0.0F, 15, () ->  Ingredient.ofItems(Items.MANGROVE_PLANKS)),
    SPRUCE_PLANK(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.ofItems(Items.SPRUCE_PLANKS)),
    WARPED_PLANK(0, 59, 2.0F, 0.0F, 15, () -> Ingredient.ofItems(Items.WARPED_PLANKS));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier repairIngredient;

    private VariantMaterials(int miningLevel, int itemDurability,
                          float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }
    void Materials(int i, int i1, float v, float v1, int i2, Object o) {
    }
    public int getDurability() {
        return this.itemDurability;
    }
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }
    public float getAttackDamage() {
        return this.attackDamage;
    }
    public int getMiningLevel() {
        return this.miningLevel;
    }
    public int getEnchantability() {
        return this.enchantability;
    }
    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}