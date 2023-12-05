package net.xanthian.vsas.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.xanthian.vsas.items.*;

public class VillagerTrades {

    public static void registerTrades() {

        // Novice Fletcher
        for (Item stick : Sticks.MOD_STICKS.values()) {
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(stick.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });
        }
        for (Item arrow : Arrows.MOD_ARROWS.values()) {
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 1),
                                new ItemStack(arrow.asItem(), 16), 16, 1, 0.05F)));
                    });
        }

        // Fletcher Apprentice
        for (Item bow : Bows.MOD_BOWS.values()) {
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 2),
                                new ItemStack(bow, 1), 12, 5, 0.05F)));
                    });

        }

        // Fletcher Journeyman
        for (Item crossbow : Crossbows.MOD_CROSSBOWS.values()) {
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Items.EMERALD, 3),
                                new ItemStack(crossbow, 1), 12, 10, 0.05F)));
                    });
        }

        // Novice Toolsmith
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.ACACIA_STONE_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.BAMBOO_STONE_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.BIRCH_STONE_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.CHERRY_STONE_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.CRIMSON_STONE_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.DARK_OAK_STONE_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.JUNGLE_STONE_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.MANGROVE_STONE_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.SPRUCE_STONE_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Axes.WARPED_STONE_AXE, 1), 12, 1, 0.2F)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.ACACIA_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.BAMBOO_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.BIRCH_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.CHERRY_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.CRIMSON_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.DARK_OAK_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.JUNGLE_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.MANGROVE_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.SPRUCE_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Shovels.WARPED_STONE_SHOVEL, 1), 12, 1, 0.2F)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.ACACIA_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.BAMBOO_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.BIRCH_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.CHERRY_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.CRIMSON_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.DARK_OAK_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.JUNGLE_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.MANGROVE_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.SPRUCE_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Pickaxes.WARPED_STONE_PICKAXE, 1), 12, 1, 0.2F)));
                });

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.ACACIA_STONE_HOE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.BAMBOO_STONE_HOE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.BIRCH_STONE_HOE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.CHERRY_STONE_HOE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.CRIMSON_STONE_HOE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.DARK_OAK_STONE_HOE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.JUNGLE_STONE_HOE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.MANGROVE_STONE_HOE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.SPRUCE_STONE_HOE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Hoes.WARPED_STONE_HOE, 1), 12, 1, 0.2F)));
                });

        // Journeyman Toolsmith
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.ACACIA_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.BAMBOO_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.BIRCH_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.CHERRY_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.CRIMSON_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.DARK_OAK_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.JUNGLE_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.MANGROVE_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.SPRUCE_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.TOOLSMITH, 3,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(Hoes.WARPED_DIAMOND_HOE, 1), 3, 10, 0.2F)));
                });

        // Novice Weaponsmith
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.ACACIA_IRON_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.BAMBOO_IRON_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.BIRCH_IRON_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.CHERRY_IRON_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.CRIMSON_IRON_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.DARK_OAK_IRON_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.JUNGLE_IRON_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.MANGROVE_IRON_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.SPRUCE_IRON_AXE, 1), 12, 1, 0.2F)));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.WEAPONSMITH, 1,
                factories -> {
                    factories.add((entity, random) -> (new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Axes.WARPED_IRON_AXE, 1), 12, 1, 0.2F)));
                });
    }
}