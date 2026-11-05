package org.stuckboy.models;

import org.stuckboy.models.trade.TradeSymbol;

/**
 * The details of required construction materials for a given waypoint under
 * construction.
 */
public class ConstructionMaterial {
    private TradeSymbol tradeSymbol;
    private Integer required;
    private Integer fulfilled;

    public TradeSymbol getTradeSymbol() {
        return tradeSymbol;
    }

    public void setTradeSymbol(TradeSymbol tradeSymbol) {
        this.tradeSymbol = tradeSymbol;
    }

    public Integer getRequired() {
        return required;
    }

    public void setRequired(Integer required) {
        this.required = required;
    }

    public Integer getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(Integer fulfilled) {
        this.fulfilled = fulfilled;
    }
}
