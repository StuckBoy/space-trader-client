package org.stuckboy.models;

import org.stuckboy.models.trade.TradeSymbol;

public class SiphonYield {
    private TradeSymbol symbol;
    private Integer units;

    public TradeSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(TradeSymbol symbol) {
        this.symbol = symbol;
    }

    public Integer getUnits() {
        return units;
    }

    public void setUnits(Integer units) {
        this.units = units;
    }
}
