package org.stuckboy.models.trade.market;

import org.stuckboy.models.trade.ActivityLevel;
import org.stuckboy.models.trade.SupplyLevel;
import org.stuckboy.models.trade.TradeSymbol;

public class MarketTradeGood {

    public TradeSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(TradeSymbol symbol) {
        this.symbol = symbol;
    }

    public TradeType getType() {
        return type;
    }

    public void setType(TradeType type) {
        this.type = type;
    }

    public Integer getTradeVolume() {
        return tradeVolume;
    }

    public void setTradeVolume(Integer tradeVolume) {
        this.tradeVolume = tradeVolume;
    }

    public SupplyLevel getSupply() {
        return supply;
    }

    public void setSupply(SupplyLevel supply) {
        this.supply = supply;
    }

    public ActivityLevel getActivity() {
        return activity;
    }

    public void setActivity(ActivityLevel activity) {
        this.activity = activity;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    public enum TradeType {
        EXPORT,
        IMPORT,
        EXCHANGE
    }

    private TradeSymbol symbol;
    private TradeType type;
    private Integer tradeVolume;
    private SupplyLevel supply;
    private ActivityLevel activity;
    private Integer purchasePrice;
    private Integer sellPrice;
}
