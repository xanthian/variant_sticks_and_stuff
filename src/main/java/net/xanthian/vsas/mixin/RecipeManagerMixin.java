package net.xanthian.vsas.mixin;

import com.google.gson.JsonElement;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.profiler.Profiler;

import net.xanthian.vsas.Init;
import net.xanthian.vsas.config.VsasConfig;
import net.xanthian.vsas.util.Recipes;

import org.apache.commons.lang3.tuple.Pair;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.*;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin {

    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<Identifier, JsonElement> map, ResourceManager resourceManager, Profiler profiler, CallbackInfo info) {
        for (Pair<String, String[]> woodType : Init.woodTypes) {

            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_stick"), Recipes.createStickRecipeJson(woodType.getLeft(), woodType.getRight()));

            if (VsasConfig.blocks == true) {
                if (VsasConfig.ladders == true) {
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_ladder"), Recipes.createLadderRecipeJson(woodType.getLeft(), woodType.getRight()));
                }
                if (VsasConfig.rails == true) {
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_rail"), Recipes.createRailRecipeJson(woodType.getLeft(), woodType.getRight()));
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_activator_rail"), Recipes.createActivatorRailRecipeJson(woodType.getLeft(), woodType.getRight()));
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_powered_rail"), Recipes.createPoweredRailRecipeJson(woodType.getLeft(), woodType.getRight()));
                }
                if (VsasConfig.torches == true) {
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_torch"), Recipes.createTorchRecipeJson(woodType.getLeft(), woodType.getRight()));
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_redstone_torch"), Recipes.createRedstoneTorchRecipeJson(woodType.getLeft(), woodType.getRight()));
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_soul_torch"), Recipes.createSoulTorchRecipeJson(woodType.getLeft(), woodType.getRight()));
                }
            }

            if (VsasConfig.items == true) {
                if (VsasConfig.onastick == true) {
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_warped_fungus_on_a_stick"), Recipes.createFungusOnAStickRecipeJson(woodType.getLeft(), woodType.getRight()));
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_carrot_on_a_stick"), Recipes.createCarrotOnAStickRecipeJson(woodType.getLeft(), woodType.getRight()));
                }
                if (VsasConfig.weapons == true) {
                    if (VsasConfig.arrows == true) {
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_arrow"), Recipes.createArrowRecipeJson(woodType.getLeft(), woodType.getRight()));
                    }
                    if (VsasConfig.bows == true) {
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_bow"), Recipes.createBowRecipeJson(woodType.getLeft(), woodType.getRight()));
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_crossbow"), Recipes.createCrossbowRecipeJson(woodType.getLeft(), woodType.getRight()));
                    }
                    if (VsasConfig.swords == true) {
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_wooden_sword"), Recipes.createWoodSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_stone_sword"), Recipes.createStoneSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                    }
                }
                if (VsasConfig.fishingrods == true) {
                    map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_fishing_rod"), Recipes.createFishingRodRecipeJson(woodType.getLeft(), woodType.getRight()));
                }
                if (VsasConfig.tools == true) {
                    if (VsasConfig.axes == true) {
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_wooden_axe"), Recipes.createWoodAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_stone_axe"), Recipes.createStoneAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                    }
                    if (VsasConfig.hoes == true) {
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_wooden_hoe"), Recipes.createWoodHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_stone_hoe"), Recipes.createStoneHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                    }
                    if (VsasConfig.pickaxes == true) {
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_wooden_pickaxe"), Recipes.createWoodPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_stone_pickaxe"), Recipes.createStonePickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                    }
                    if (VsasConfig.shovels == true) {
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_wooden_shovel"), Recipes.createWoodShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                        map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_stone_shovel"), Recipes.createStoneShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                    }
                }

                if (!FabricLoader.getInstance().isModLoaded("expert_weapons")) {
                    if (VsasConfig.tools == true) {
                        if (VsasConfig.axes == true) {
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_iron_axe"), Recipes.createIronAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_golden_axe"), Recipes.createGoldenAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_diamond_axe"), Recipes.createDiamondAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_netherite_axe"), Recipes.createNetheriteAxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                        }
                        if (VsasConfig.hoes == true) {
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_iron_hoe"), Recipes.createIronHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_golden_hoe"), Recipes.createGoldenHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_diamond_hoe"), Recipes.createDiamondHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_netherite_hoe"), Recipes.createNetheriteHoeRecipeJson(woodType.getLeft(), woodType.getRight()));
                        }
                        if (VsasConfig.pickaxes == true) {
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_iron_pickaxe"), Recipes.createIronPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_golden_pickaxe"), Recipes.createGoldenPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_diamond_pickaxe"), Recipes.createDiamondPickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_netherite_pickaxe"), Recipes.createNetheritePickaxeRecipeJson(woodType.getLeft(), woodType.getRight()));
                        }
                        if (VsasConfig.shovels == true) {
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_iron_shovel"), Recipes.createIronShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_golden_shovel"), Recipes.createGoldenShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_diamond_shovel"), Recipes.createDiamondShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_netherite_shovel"), Recipes.createNetheriteShovelRecipeJson(woodType.getLeft(), woodType.getRight()));
                        }
                    }

                    if (VsasConfig.weapons == true) {
                        if (VsasConfig.swords == true) {
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_iron_sword"), Recipes.createIronSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_golden_sword"), Recipes.createGoldenSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_diamond_sword"), Recipes.createDiamondSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                            map.put(new Identifier(Init.MOD_ID, woodType.getLeft() + "_netherite_sword"), Recipes.createNetheriteSwordRecipeJson(woodType.getLeft(), woodType.getRight()));
                        }
                    }
                }
            }
        }
    }
}