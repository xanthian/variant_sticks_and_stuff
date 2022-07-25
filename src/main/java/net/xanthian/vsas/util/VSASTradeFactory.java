package net.xanthian.vsas.util;

import net.minecraft.entity.Entity;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class VSASTradeFactory implements TradeOffers.Factory {
    private final TradeOffer offer;

    VSASTradeFactory(TradeOffer offer) {
        this.offer = offer;
    }

    public TradeOffer create(Entity entity, Random random) {
        return new TradeOffer(this.offer.toNbt());
    }

    @Nullable
    @Override
    public TradeOffer create(Entity entity, net.minecraft.util.math.random.Random random) {
        return null;
    }
}