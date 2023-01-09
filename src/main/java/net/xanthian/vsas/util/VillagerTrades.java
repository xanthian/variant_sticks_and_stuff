package net.xanthian.vsas.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.xanthian.vsas.config.VsasConfig;
import net.xanthian.vsas.items.*;

public class VillagerTrades {

        public static void registerTrades() {

            // Novice Fletcher
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Sticks.ACACIA_STICK.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Sticks.BIRCH_STICK.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Sticks.CRIMSON_STICK.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Sticks.DARK_OAK_STICK.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Sticks.JUNGLE_STICK.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Sticks.MANGROVE_STICK.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Sticks.OAK_STICK.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Sticks.SPRUCE_STICK.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                    factories -> {
                        factories.add((entity, random) -> (new TradeOffer(
                                new ItemStack(Sticks.WARPED_STICK.asItem(), 32),
                                new ItemStack(Items.EMERALD, 1), 16, 2, 0.05F)));
                    });

            if (VsasConfig.items == true) {
                if (VsasConfig.weapons == true) {
                    if (VsasConfig.arrows == true) {
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 1),
                                            new ItemStack(Arrows.ACACIA_ARROW_ITEM.asItem(), 16), 16, 1, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 1),
                                            new ItemStack(Arrows.BIRCH_ARROW_ITEM, 16), 16, 1, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 1),
                                            new ItemStack(Arrows.CRIMSON_ARROW_ITEM, 16), 16, 1, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 1),
                                            new ItemStack(Arrows.DARK_OAK_ARROW_ITEM, 16), 16, 1, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 1),
                                            new ItemStack(Arrows.JUNGLE_ARROW_ITEM, 16), 16, 1, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 1),
                                            new ItemStack(Arrows.MANGROVE_ARROW_ITEM, 16), 16, 1, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 1),
                                            new ItemStack(Arrows.OAK_ARROW_ITEM, 16), 16, 1, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 1),
                                            new ItemStack(Arrows.SPRUCE_ARROW_ITEM, 16), 16, 1, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 1),
                                            new ItemStack(Arrows.WARPED_ARROW_ITEM, 16), 16, 1, 0.05F)));
                                });
                    }

                    if (VsasConfig.bows == true) {
                        // Fletcher Apprentice
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 2),
                                            new ItemStack(Bows.ACACIA_BOW, 1), 12, 5, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 2),
                                            new ItemStack(Bows.BIRCH_BOW, 1), 12, 5, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 2),
                                            new ItemStack(Bows.CRIMSON_BOW, 1), 12, 5, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 2),
                                            new ItemStack(Bows.DARK_OAK_BOW, 1), 12, 5, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 2),
                                            new ItemStack(Bows.JUNGLE_BOW, 1), 12, 5, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 2),
                                            new ItemStack(Bows.MANGROVE_BOW, 1), 12, 5, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 2),
                                            new ItemStack(Bows.OAK_BOW, 1), 12, 5, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 2),
                                            new ItemStack(Bows.SPRUCE_BOW, 1), 12, 5, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 2,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 2),
                                            new ItemStack(Bows.WARPED_BOW, 1), 12, 5, 0.05F)));
                                });

                        // Fletcher Journeyman
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 3),
                                            new ItemStack(Crossbows.ACACIA_CROSSBOW, 1), 12, 10, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 3),
                                            new ItemStack(Crossbows.BIRCH_CROSSBOW, 1), 12, 10, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 3),
                                            new ItemStack(Crossbows.CRIMSON_CROSSBOW, 1), 12, 10, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 3),
                                            new ItemStack(Crossbows.DARK_OAK_CROSSBOW, 1), 12, 10, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 3),
                                            new ItemStack(Crossbows.JUNGLE_CROSSBOW, 1), 12, 10, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 3),
                                            new ItemStack(Crossbows.MANGROVE_CROSSBOW, 1), 12, 10, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 3),
                                            new ItemStack(Crossbows.OAK_CROSSBOW, 1), 12, 10, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 3),
                                            new ItemStack(Crossbows.SPRUCE_CROSSBOW, 1), 12, 10, 0.05F)));
                                });
                        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 3,
                                factories -> {
                                    factories.add((entity, random) -> (new TradeOffer(
                                            new ItemStack(Items.EMERALD, 3),
                                            new ItemStack(Crossbows.WARPED_CROSSBOW, 1), 12, 10, 0.05F)));
                                });
                    }
                }
                if (VsasConfig.tools == true) {
                    if (VsasConfig.axes == true) {
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
                                            new ItemStack(Axes.BIRCH_STONE_AXE, 1), 12, 1, 0.2F)));
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
                                            new ItemStack(Axes.OAK_STONE_AXE, 1), 12, 1, 0.2F)));
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
                    }

                    if (VsasConfig.shovels == true) {

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
                                            new ItemStack(Shovels.BIRCH_STONE_SHOVEL, 1), 12, 1, 0.2F)));
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
                                            new ItemStack(Shovels.OAK_STONE_SHOVEL, 1), 12, 1, 0.2F)));
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
                    }
                    if (VsasConfig.pickaxes == true) {

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
                                            new ItemStack(Pickaxes.BIRCH_STONE_PICKAXE, 1), 12, 1, 0.2F)));
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
                                            new ItemStack(Pickaxes.OAK_STONE_PICKAXE, 1), 12, 1, 0.2F)));
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
                    }
                    if (VsasConfig.hoes == true) {

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
                                            new ItemStack(Hoes.BIRCH_STONE_HOE, 1), 12, 1, 0.2F)));
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
                                            new ItemStack(Hoes.OAK_STONE_HOE, 1), 12, 1, 0.2F)));
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
                                            new ItemStack(Hoes.BIRCH_DIAMOND_HOE, 1), 3, 10, 0.2F)));
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
                                            new ItemStack(Hoes.OAK_DIAMOND_HOE, 1), 3, 10, 0.2F)));
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
                    }

                    if (VsasConfig.axes == true) {
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
                                            new ItemStack(Axes.BIRCH_IRON_AXE, 1), 12, 1, 0.2F)));
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
                                            new ItemStack(Axes.OAK_IRON_AXE, 1), 12, 1, 0.2F)));
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
            }
        }
}
