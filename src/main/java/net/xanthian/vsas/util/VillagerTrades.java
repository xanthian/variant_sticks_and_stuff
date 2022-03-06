package net.xanthian.vsas.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.xanthian.vsas.items.Sticks;

public class VillagerTrades {

        public static void registerTrades(){
            TradeOfferHelper.registerVillagerOffers(VillagerProfession.FLETCHER, 1, factories -> {
                factories.add(new VSASTradeFactory(new TradeOffer(new ItemStack(Sticks.ACACIA_STICK.asItem(), 32),
                        new ItemStack(Items.EMERALD, 1), 16, 2, 0.15F)));
            });
        }
}
