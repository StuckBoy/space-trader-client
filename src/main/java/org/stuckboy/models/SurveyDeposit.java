package org.stuckboy.models;

import org.stuckboy.models.trade.TradeSymbol;

public class SurveyDeposit {
    private TradeSymbol symbol;

    public TradeSymbol getSymbol() {
        return symbol;
    }

    public void setSymbol(TradeSymbol symbol) {
        this.symbol = symbol;
    }
}
