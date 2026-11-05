package org.stuckboy.models.trade.market;

import org.stuckboy.models.trade.ActivityLevel;
import org.stuckboy.models.trade.SupplyLevel;
import org.stuckboy.models.trade.TradeSymbol;

public class MarketTradeGood {
    private TradeSymbol symbol;
    //TODO Trade Good Type
    private Integer tradeVolume;
    private SupplyLevel supply;
    private ActivityLevel activity;
    private Integer purchasePrice;
    private Integer sellPrice;
}
